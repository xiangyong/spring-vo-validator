package com.jd.jr.aoplog.springbean;

import com.jd.jr.aoplog.DynamicUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

import java.util.List;


public class AoplogBeanDefinitionParser implements BeanDefinitionParser {

    private static final Logger logger = LoggerFactory.getLogger(AoplogBeanDefinitionParser.class);

    public BeanDefinition parse(Element element, ParserContext parserContext) {

        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(AoplogBean.class);
        String id = element.getAttribute("id");
       // String name = element.getAttribute("class");
        List<Element> propertyList = DomUtils.getChildElementsByTagName(element, "property");
        for (Element propertyElement : propertyList) {
            Attr nameAttr =  propertyElement.getAttributeNode("name");
            String nameValue = nameAttr.getValue();

            Attr valueAttr =  propertyElement.getAttributeNode("value");
            if(valueAttr!=null){
                String valueValue = valueAttr.getValue();
                beanDefinition.getPropertyValues().addPropertyValue(nameValue, valueValue);
            }
            Attr classAttr =  propertyElement.getAttributeNode("class");
            if(classAttr!=null){
                String classValue = classAttr.getValue();
                beanDefinition.getPropertyValues().addPropertyValue(nameValue, classValue);
            }

        }
       // beanDefinition.getPropertyValues().addPropertyValue("name", name);
        parserContext.getRegistry().registerBeanDefinition(id, beanDefinition);
        return beanDefinition;
    }


}
