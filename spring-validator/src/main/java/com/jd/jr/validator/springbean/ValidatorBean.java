package com.jd.jr.validator.springbean;

import com.jd.jr.validator.constraintvalidators.Validator;

import java.util.List;
import java.util.Map;

public class ValidatorBean {
    private String name;
    private Map<String,List<Validator>> filedValidatorListMap;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, List<Validator>> getFiledValidatorListMap() {
        return filedValidatorListMap;
    }

    public void setFiledValidatorListMap(Map<String, List<Validator>> filedValidatorListMap) {
        this.filedValidatorListMap = filedValidatorListMap;
    }
}
