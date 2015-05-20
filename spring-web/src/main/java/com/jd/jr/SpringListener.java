package com.jd.jr;


import com.jd.jr.validator.SpringBeanFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created with IntelliJ IDEA.
 * User: yangkuan
 * Date: 15-4-12
 * Time: 下午10:23
 * To change this template use File | Settings | File Templates.
 */
public class SpringListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        String relativePath = sce.getServletContext().getInitParameter(
                "contextConfigLocation");
        String realPath = sce.getServletContext().getRealPath(relativePath);
        SpringBeanFactory.init(realPath);
    }
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        SpringBeanFactory.clear();
    }
}