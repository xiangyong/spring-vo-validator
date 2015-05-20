package com.jd.jr.validator.constraintvalidators.impl;

import com.jd.jr.validator.constraintvalidators.Validator;
import com.jd.jr.validator.constraintvalidators.ValidatorImpl;

/**
 * User: yangkuan@jd.com
 * Date: 15-4-7
 * Time: 下午9:04
 */
public class SizeValidator  extends ValidatorImpl implements Validator {
    private Integer max;
    private Integer min;

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    @Override
    public boolean isValid(Object o) {
        if ( o == null ) {
            return true;
        }
        if(o instanceof String){
            int length = ((String) o).length();
            return length >= min && length <= max;
        }
        return true;
    }
}
