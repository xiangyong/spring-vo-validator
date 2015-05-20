package com.jd.jr.validator.vo;

/**
 * Created with IntelliJ IDEA.
 * User: yangkuan
 * Date: 15-4-11
 * Time: 下午11:26
 * To change this template use File | Settings | File Templates.
 */
public class ItemFullVo {
    private String skuId;
    private String itemCode;
private Integer age ;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}
