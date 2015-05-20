package com.jd.jr.validator.inteceptor;

import com.jd.jr.validator.service.CheckService;
import com.jd.jr.validator.springbean.ValidatorBean;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import sun.security.validator.ValidatorException;

import java.util.Arrays;

@Aspect
@Component
public class ValidatorInteceptor {
    private static final Logger logger = LoggerFactory.getLogger(ValidatorInteceptor.class);
    @Autowired
    CheckService checkService;

    @Before(value = "execution(* *(..)) && @annotation(validator)", argNames = "pjp,validator")
    public Object doValidator(final JoinPoint pjp, ParaValidator validator) throws Throwable {
        long t1 = System.currentTimeMillis();
        boolean result = true;
        String[] validatorNames = validator.validatorNames();
        logger.info("切面方式验证参数开始,validatorId={}", Arrays.toString(validatorNames));
        try {
            check(validatorNames, pjp);
        } catch (Exception e) {
            if (e instanceof ValidatorException) {
                logger.error("参数验证通知抛出异常:{}", ((ValidatorException)e).getMessage());
            }else{
                logger.error("参数验证通知抛出异常", e);
            }
            throw e;
        } finally {
            logger.info("切面方式验证参数结束,validatorId=" + Arrays.toString(validatorNames) + ",参数验证时间{}", System.currentTimeMillis() - t1);
        }
        return result;
    }

    public void check(String[] validatorNames, JoinPoint pjp) throws Exception {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring-config.xml");
     /*   ApplicationContext applicationContext = SpringBeanFactory.getContext();*/
        if (validatorNames == null || validatorNames.length == 0) {
            return;
        } else {
            Object[] args = pjp.getArgs();//方法里所有的参数
            StringBuffer checkMsgTip = new StringBuffer("");
            for (String validatorName : validatorNames) {//遍历不同的验证validator
                try {
                    Object validatorObject = applicationContext.getBean(validatorName);
                    ValidatorBean validatorBean = (ValidatorBean) validatorObject;
                    if (args != null && args.length > 0) {
                        for (Object arg : args) {
                            if (arg == null) {
                                continue;
                            } else {
                                String argClassName = arg.getClass().getName();
                                if (argClassName.equals(validatorBean.getName())) {
                                    String message = checkService.check(arg, validatorBean);
                                    if(!message.equals("")){
                                        checkMsgTip.append(message+"\n");
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    logger.error("切面方式验证参数,寻找验证的bean:" + validatorName + "不存在");
                }
            }
            if (!checkMsgTip.toString().equals("")) {
               // throw new ValidatorException(checkMsgTip.toString());
                logger.info(checkMsgTip.toString());
            }

        }

    }
}
