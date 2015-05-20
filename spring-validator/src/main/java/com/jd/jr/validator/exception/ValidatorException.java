package com.jd.jr.validator.exception;

/**
 * User: yangkuan@jd.com
 * Date: 15-4-15
 * Time: 上午11:38
 */
public class ValidatorException extends Exception {
    private String message;


    public ValidatorException(String message) {
         this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
