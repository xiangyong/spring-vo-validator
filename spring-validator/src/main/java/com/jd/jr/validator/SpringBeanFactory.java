package com.jd.jr.validator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: yangkuan
 * Date: 15-4-12
 * Time: 下午10:26
 * To change this template use File | Settings | File Templates.
 */
public class SpringBeanFactory {
    private static ApplicationContext context;

    /**
     * 在应用程序启动时配置spring框架
     *
     * @param filePath
     */
    public static void init(String filePath) {

        if (context == null) {
            context = new ClassPathXmlApplicationContext(filePath);
        }
    }
    public static ApplicationContext getContext(){
        return context;
    }

    /**
     * 方法用于获取业务对象。
     *
     * @param beanName
     * @return
     */
    public static Object getBusinessOjbect(String beanName) {
        return context.getBean(beanName);
    }
    /**
     * 在应用程序关闭时，清空spring框架配置信息。
     */
    public static void clear() {
        if (context != null) {
            context = null;
        }
    }
}
