package com.jd.jr.aoplog;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class DynamicUtil {
    public static <T> T classNameNewInstance(String className) {
        try {
            T genericObj = (T) Class.forName(className).newInstance();
            return genericObj;
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }

    public static <E, R> void dynamicWrapperData(E wrapperDataSource, String paraFieldName, R dataSource) {
        Field field = getClassField(wrapperDataSource.getClass(), paraFieldName);
        Type type = field.getType();
        Number para = null;
        if (dataSource.getClass().equals(String.class)) {

            para = toNumber(type, dataSource.toString());
        }
        field.setAccessible(true);
        try {
            if (para != null) {

                field.set(wrapperDataSource, para);

            } else {
                field.set(wrapperDataSource, dataSource);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public static Field getClassField(Class aClazz, String paraFieldName) {
        Field[] declaredFields = aClazz.getDeclaredFields();//使用getDeclaredField直接抛出异常（不知道最新版本jdk改进了没有？）,所以循环吧
        for (Field field : declaredFields) {
            if (field.getName().equals(paraFieldName)) {
                return field;
            }
        }
        Class superclass = aClazz.getSuperclass();
        if (superclass != null) {// 递归一下
            return getClassField(superclass, paraFieldName);
        }
        return null;
    }

    public static void getClassAllField(Class aClazz,List<Field> fieldList) {
        Field[] declaredFields = aClazz.getDeclaredFields();
        for (Field field : declaredFields) {
            fieldList.add(field);
        }
        Class superclass = aClazz.getSuperclass();
        if (superclass != null) {// 递归一下
             getClassAllField(superclass, fieldList);
        }
     }


    private static Number toNumber(Type targetType, String value) {
        String valueEscape = "";
        for (int z = 0; z < value.length(); z++) {
            String one = value.substring(z, z + 1);
            if (one.matches("^[a-zA-Z0-9_]+$")) {//只保留字母和数字
                valueEscape = valueEscape + one;
            }
        }
        value = valueEscape;
        // Byte
        if (targetType.equals(Byte.class)) {
            return new Byte(value);
        }

        // Short
        if (targetType.equals(Short.class)) {
            return new Short(value);
        }

        // Integer
        if (targetType.equals(Integer.class)) {
            return new Integer(value.trim());
        }

        // Long
        if (targetType.equals(Long.class)) {
            return new Long(value);
        }

        // Float
        if (targetType.equals(Float.class)) {
            return new Float(value);
        }

        // Double
        if (targetType.equals(Double.class)) {
            return new Double(value);
        }

        // BigDecimal
        if (targetType.equals(BigDecimal.class)) {
            return new BigDecimal(value);
        }

        // BigInteger
        if (targetType.equals(BigInteger.class)) {
            return new BigInteger(value);
        }
        return null;
    }
}
