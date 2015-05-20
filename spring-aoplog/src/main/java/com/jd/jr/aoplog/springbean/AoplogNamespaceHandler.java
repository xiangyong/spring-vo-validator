package com.jd.jr.aoplog.springbean;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


public class AoplogNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("aoplog", new AoplogBeanDefinitionParser());
    }
}
