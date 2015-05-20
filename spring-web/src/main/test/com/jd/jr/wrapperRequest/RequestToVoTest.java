package com.jd.jr.wrapperRequest;


import com.jd.jr.request.vo.Item;
import com.jd.jr.request.vo.UserVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class) //
@ContextConfiguration({"/spring-config.xml"}) //
public class RequestToVoTest {
    private static final Logger logger = LoggerFactory.getLogger(RequestToVoTest.class);

    @Test
    public   void test() throws Exception {
        MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
        mockHttpServletRequest.setParameter("address","1");
        mockHttpServletRequest.setParameter("age","1");
        mockHttpServletRequest.setParameter("name","132sfsdf");
        mockHttpServletRequest.setParameter("name", "teset");

        logger.info(mockHttpServletRequest.getParameter("name"));
        logger.info(Arrays.toString(mockHttpServletRequest.getParameterValues("name")));
        Enumeration<String>  parameterNames = mockHttpServletRequest.getParameterNames();
        while(parameterNames.hasMoreElements()){
            logger.info(parameterNames.nextElement());
        }

        List<UserVo> userVoList = new ArrayList<UserVo>();
        Item item = new Item();
        item.setAge(1000);
        item.setUserVoList(userVoList);
        if(userVoList instanceof  Collection)    {
            logger.info("true");
        }
        List<Field> fieldList  = new ArrayList<Field>();
        getClassAllField(item.getClass(),fieldList);
    }
    public static void getClassAllField(Class aClazz,List<Field> fieldList) {
        Field[] declaredFields = aClazz.getDeclaredFields();
        for (Field field : declaredFields) {
            fieldList.add(field);
            Type genericType =       field.getGenericType() ;
            if(genericType instanceof ParameterizedTypeImpl){
                ParameterizedTypeImpl parameterizedType = (ParameterizedTypeImpl)  genericType;
                Class rawType = parameterizedType.getRawType();
                Type ownerType =parameterizedType.getOwnerType();
                Type[] actualType = parameterizedType.getActualTypeArguments();
                logger.info(rawType.toString()+"--" +Arrays.toString(actualType));
            } else{
            logger.info(field.getType().toString()+"--"+genericType.toString()+"--"
                    +field.getGenericType());
            }
        }
        Class superclass = aClazz.getSuperclass();
        if (superclass != null) {// 递归一下
            getClassAllField(superclass, fieldList);
        }

    }

}
