package com.jd.jr.validator.constraintvalidators;

/**
 * User: yangkuan@jd.com
 * Date: 15-4-7
 * Time: 下午9:02
 */
public interface Validator<T> {
    /**
     *
     * @param t  参数值
     * @return
     */
    public boolean isValid(T t);
}
