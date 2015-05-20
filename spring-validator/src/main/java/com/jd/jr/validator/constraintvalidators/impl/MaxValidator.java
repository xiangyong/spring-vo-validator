package com.jd.jr.validator.constraintvalidators.impl;

import com.jd.jr.validator.constraintvalidators.Validator;
import com.jd.jr.validator.constraintvalidators.ValidatorImpl;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * User: yangkuan@jd.com
 * Date: 15-4-7
 * Time: 下午9:04
 */
public class MaxValidator extends ValidatorImpl implements Validator {
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    Integer value;

    @Override
    public boolean isValid(Object object) {
        //null values are valid
        if ( object == null ) {
            return true;
        }
        if(object instanceof String){
            int length = ((String) object).length();
           if(length==0){
               return true;
           }
        }
        try{
            if ( object instanceof BigDecimal) {
                return ( ( BigDecimal ) object ).compareTo( BigDecimal.valueOf( value ) ) != 1;
            }
            else if ( object instanceof BigInteger) {
                return ( ( BigInteger ) object ).compareTo( BigInteger.valueOf( value ) ) != 1;
            }
            else  if ( object instanceof Long) {
                return ( ( Long ) object ).compareTo( Long.valueOf( value ) ) != 1;
            }
            else  if ( object instanceof Integer) {
                return ( ( Integer ) object ).compareTo( value) != 1;
            }else if ( object instanceof String) {
                return ( new Integer((String)object) ).compareTo( value) != 1;
            }
        }catch (Exception e){
            this.setMessage(this.getMessage()+"验证大小时，输入的不是数字。");
            return false;
        }
        return true;
    }
}
