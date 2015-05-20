package com.jd.jr.validator.constraintvalidators.impl;

import com.jd.jr.validator.constraintvalidators.Validator;
import com.jd.jr.validator.constraintvalidators.ValidatorImpl;

/**
 * User: yangkuan@jd.com
 * Date: 15-4-7
 * Time: 下午9:03
 */
public class NotNullValidator  extends ValidatorImpl implements Validator {

    @Override
    public boolean isValid(Object object) {
        if(object instanceof String){
            int length = ((String) object).length();
            return length>0;
        }
        return object != null;
    }
}
