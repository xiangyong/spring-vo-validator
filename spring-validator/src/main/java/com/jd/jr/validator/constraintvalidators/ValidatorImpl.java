package com.jd.jr.validator.constraintvalidators;

/**
 * User: yangkuan@jd.com
 * Date: 15-4-8
 * Time: 上午11:00
 */
public class ValidatorImpl {
    private String message;//提示信息
    private String validatorType;//验证类型，如NotNull
    private String validatorField;//参数名字
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValidatorType() {
        return validatorType;
    }

    public void setValidatorType(String validatorType) {
        this.validatorType = validatorType;
    }

    public String getValidatorField() {
        return validatorField;
    }

    public void setValidatorField(String validatorField) {
        this.validatorField = validatorField;
    }
}
