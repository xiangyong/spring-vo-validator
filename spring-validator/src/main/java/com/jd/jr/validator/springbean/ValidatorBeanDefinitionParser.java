package com.jd.jr.validator.springbean;

import com.jd.jr.validator.DynamicUtil;
import com.jd.jr.validator.constraintvalidators.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class ValidatorBeanDefinitionParser implements BeanDefinitionParser {

    private static final Logger logger = LoggerFactory.getLogger(ValidatorBeanDefinitionParser.class);
    static Map<String, String> classNameMap = null;

    static {
        classNameMap = new HashMap<String, String>();
         Properties props = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream in = loader.getResourceAsStream("com/jd/jr/validator/resources/validator.properties");
        try {
            props.load(in);
            Enumeration en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                classNameMap.put(key, (String)props.get(key));
            }
        } catch (IOException e) {
            logger.error("加载验证服务类映射报错:",e.getMessage());
        }

    }

    private Map<String,List<Validator>> filedValidatorListMap = new HashMap<String, List<Validator>>();

    public BeanDefinition parse(Element element, ParserContext parserContext) {

        String id = element.getAttribute("id");
        String className = element.getAttribute("validatorClass");
        List<Element> propertyList = DomUtils.getChildElementsByTagName(element, "property");
        for (Element propertyElement : propertyList) {
            NamedNodeMap propertyNamedNodeMap = propertyElement.getAttributes();
            String propertyName = propertyNamedNodeMap.item(0).getNodeValue();//被验证的属性名字
            List<Validator> validatorList = new ArrayList<Validator>();
            List<Element> validatorElementList = DomUtils.getChildElements(propertyElement);
            for (Element validatorElement : validatorElementList) {
                String validatorName = validatorElement.getNodeName();
                validatorName = validatorName.replace("validator:", "");//验证类型，如Max
                String validatorClassName = classNameMap.get(validatorName);;//验证类型的实现类，如MaxValidator
                Validator targetObject = DynamicUtil.classNameNewInstance(validatorClassName);
                NamedNodeMap validatorNamedNodeMap = validatorElement.getAttributes();
                for (int i = 0; i < validatorNamedNodeMap.getLength(); i++) {
                    Node validatorNode = validatorNamedNodeMap.item(i);
                    DynamicUtil.dynamicWrapperData(targetObject, validatorNode.getNodeName(), validatorNode.getNodeValue());
                }

                DynamicUtil.dynamicWrapperData(targetObject, "validatorField", propertyName);
                DynamicUtil.dynamicWrapperData(targetObject, "validatorType", validatorName);
                validatorList.add(targetObject);
            }
            filedValidatorListMap.put(propertyName,validatorList);
        }

        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(ValidatorBean.class);
        beanDefinition.getPropertyValues().addPropertyValue("name", className);
        beanDefinition.getPropertyValues().addPropertyValue("filedValidatorListMap", filedValidatorListMap);
        parserContext.getRegistry().registerBeanDefinition(id, beanDefinition);

        return beanDefinition;
    }


}
