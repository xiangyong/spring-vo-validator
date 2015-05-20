package com.jd.jr.validator.service;

import com.jd.jr.validator.DynamicUtil;
import com.jd.jr.validator.constraintvalidators.Validator;
import com.jd.jr.validator.constraintvalidators.ValidatorImpl;
import com.jd.jr.validator.springbean.ValidatorBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User: yangkuan@jd.com
 * Date: 15-4-8
 * Time: 下午10:21
 */
public class CheckService {

    private static final Logger logger = LoggerFactory.getLogger(CheckService.class);
    public <T> String check(T t,ValidatorBean nameValidator) throws IllegalAccessException {
        long t1 = System.currentTimeMillis();
        logger.info("参数验证开始-----------------------");
        Map<String,List<Validator>> filedValidatorListMap = nameValidator.getFiledValidatorListMap();
        List<Field> fieldList = new ArrayList<Field>();
        DynamicUtil.getClassAllField(t.getClass(), fieldList);
        StringBuffer checkMsgTip = new StringBuffer("");
        for (Field field : fieldList) {
            String fieldName =  field.getName();
            field.setAccessible(true);
            List<Validator> validatorList = filedValidatorListMap.get(fieldName);
            if(validatorList!=null){
                for (Validator validator : validatorList){
                    ValidatorImpl validator1 = (ValidatorImpl) validator;
                    boolean checkResult = validator.isValid(field.get(t));
                    if(!checkResult){
                        logger.info(nameValidator.getName()+":"+"field="+validator1.getValidatorField()+",value="+field.get(t)+",validatorType="+validator1.getValidatorType()+"结果:"+checkResult+",消息"+((ValidatorImpl)validator).getMessage());
                        checkMsgTip.append(((ValidatorImpl)validator).getMessage()+"\n");
                    }
                }
            }
        }
        logger.info("参数验证结束---------------------------时间{}", System.currentTimeMillis() - t1);
        return checkMsgTip.toString();
    }
}
