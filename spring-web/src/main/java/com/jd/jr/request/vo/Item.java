package com.jd.jr.request.vo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yangkuan
 * Date: 15-4-18
 * Time: 下午8:57
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    private String skuId;
    private String itemCode;
    private Integer age ;

    int widthd;
        private List<UserVo> userVoList;
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

    public List<UserVo> getUserVoList() {
        return userVoList;
    }

    public void setUserVoList(List<UserVo> userVoList) {
        this.userVoList = userVoList;
    }

    public int getWidthd() {
        return widthd;
    }

    public void setWidthd(int widthd) {
        this.widthd = widthd;
    }
}
