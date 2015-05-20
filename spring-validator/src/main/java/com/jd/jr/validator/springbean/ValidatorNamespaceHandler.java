package com.jd.jr.validator.springbean;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


public class ValidatorNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("validator", new ValidatorBeanDefinitionParser());
    }
}
