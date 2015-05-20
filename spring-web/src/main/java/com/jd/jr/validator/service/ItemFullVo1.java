package com.jd.jr.validator.service;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: yangkuan
 * Date: 15-4-11
 * Time: 下午11:26
 * To change this template use File | Settings | File Templates.
 */
public class ItemFullVo1 {
    private Long id;

    /* 商品ID */
    private String skuId;

    /* 商品编号 */
    private String itemCode;

    /* 商品名称 */
    private String itemName;

    /* 商户ID */
    private String merchantId;

    /* 商户名称 */
    private String merchantName;

    /* 店铺ID */
    private String shopId;

    /* 店铺名称 */
    private String shopName;

    /* 险种编码 */
    private String insuranceCode;

    /* 险种名称 */
    private String insuranceName;

    /* 保险类型 */
    private String insuranceType;

    /* 保险类型名称 */
    private String insuranceTypeName;

    /* 广告语 */
    private String adWord;

    /* 商品单价 */
    private BigDecimal amount;

    /* 起购金额 */
    private BigDecimal minAmount;

    /* 限购金额 */
    private BigDecimal maxAmount;

    /* 购买手续费 */
    private BigDecimal buyFee;

    /* 限购份数 */
    private Integer maxNum;

    /* 累计售出金额 */
    private BigDecimal grandSaleAmount;

    /* 最低收益率 */
    private BigDecimal annualYield;

    /* 保障期间 */
    private String period;

    /* 犹豫期 */
    private String coolingOffPeriod;

    /* 风险级别 */
    private String riskLevel;

    /* 风险级别名称 */
    private String riskLevelName;

    /* 收益人 */
    private String beneficiary;

    /* 销售开始日期 */
    private String saleBeginDate;

    /* 销售截止日期 */
    private String saleEndDate;

    /* 保险生效日期方式 */
    private String isCustomEffective;

    /* 保险生效数据内容 */
    private String customEffectiveData;

    /* 收益方式 */
    private String revenueWay;

    /* 收益方式名称 */
    private String revenueWayName;

    /* 购买币种 */
    private String currencyType;

    /* 历史收益率 */
    private String historyBenefit;

    /* 历史结算利率 */
    private String historyBenefitData;

    /* 预期阶段收益 */
    private String insPeriodBenefit;

    /* 理财期限类型 */
    private String insPeriodType;

    /* 理财期限内容 */
    private String insPeriodValue;

    /* 可购买区域 */
    private String canBuyArea;

    /* 商品logo */
    private String itemLogo;

    /* 产品详情 */
    private String itemDetail;

    /* 收益演示 */
    private String revenueDemo;

    /* 保险责任 */
    private String insResponsibility;

    /* 投保告知 */
    private String insNotice;

    /* 重要告知与声明 */
    private String insStatements;

    /* 健康告知 */
    private String insHealthInformed;

    /* 保单确认告知 */
    private String insConfirmInformed;

    /* 保险简介 */
    private String insIntroduce;

    /* 商品活动页 */
    private String activityPage;

    /* 退保费用说明 */
    private String refundFeeIntro;

    /* 是否支持部分领取 */
    private Integer isSupportPartRefund;

    /* 最小部分领取金额 */
    private BigDecimal minPartRefund;

    /* 是否支持保单追加 */
    private Integer isSupportInsAppend;

    /* 是否支持预约退保（领取） */
    private Integer isSupportReserveRefund;

    /* 是否支持无犹豫期 */
    private Integer isSupportNoCoolingOff;

    /* 商品可展示的平台 */
    private String sourceType;

    /* 商品权重 */
    private Integer itemWeight;

    /* 商品状态 */
    private Integer itemStatus;

    private String pin;

    private String createTime;

    private String updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceTypeName() {
        return insuranceTypeName;
    }

    public void setInsuranceTypeName(String insuranceTypeName) {
        this.insuranceTypeName = insuranceTypeName;
    }

    public String getAdWord() {
        return adWord;
    }

    public void setAdWord(String adWord) {
        this.adWord = adWord;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public BigDecimal getBuyFee() {
        return buyFee;
    }

    public void setBuyFee(BigDecimal buyFee) {
        this.buyFee = buyFee;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public BigDecimal getGrandSaleAmount() {
        return grandSaleAmount;
    }

    public void setGrandSaleAmount(BigDecimal grandSaleAmount) {
        this.grandSaleAmount = grandSaleAmount;
    }

    public BigDecimal getAnnualYield() {
        return annualYield;
    }

    public void setAnnualYield(BigDecimal annualYield) {
        this.annualYield = annualYield;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getCoolingOffPeriod() {
        return coolingOffPeriod;
    }

    public void setCoolingOffPeriod(String coolingOffPeriod) {
        this.coolingOffPeriod = coolingOffPeriod;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getRiskLevelName() {
        return riskLevelName;
    }

    public void setRiskLevelName(String riskLevelName) {
        this.riskLevelName = riskLevelName;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getSaleBeginDate() {
        return saleBeginDate;
    }

    public void setSaleBeginDate(String saleBeginDate) {
        this.saleBeginDate = saleBeginDate;
    }

    public String getSaleEndDate() {
        return saleEndDate;
    }

    public void setSaleEndDate(String saleEndDate) {
        this.saleEndDate = saleEndDate;
    }

    public String getIsCustomEffective() {
        return isCustomEffective;
    }

    public void setIsCustomEffective(String isCustomEffective) {
        this.isCustomEffective = isCustomEffective;
    }

    public String getCustomEffectiveData() {
        return customEffectiveData;
    }

    public void setCustomEffectiveData(String customEffectiveData) {
        this.customEffectiveData = customEffectiveData;
    }

    public String getRevenueWay() {
        return revenueWay;
    }

    public void setRevenueWay(String revenueWay) {
        this.revenueWay = revenueWay;
    }

    public String getRevenueWayName() {
        return revenueWayName;
    }

    public void setRevenueWayName(String revenueWayName) {
        this.revenueWayName = revenueWayName;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public String getHistoryBenefit() {
        return historyBenefit;
    }

    public void setHistoryBenefit(String historyBenefit) {
        this.historyBenefit = historyBenefit;
    }

    public String getHistoryBenefitData() {
        return historyBenefitData;
    }

    public void setHistoryBenefitData(String historyBenefitData) {
        this.historyBenefitData = historyBenefitData;
    }

    public String getInsPeriodBenefit() {
        return insPeriodBenefit;
    }

    public void setInsPeriodBenefit(String insPeriodBenefit) {
        this.insPeriodBenefit = insPeriodBenefit;
    }

    public String getInsPeriodType() {
        return insPeriodType;
    }

    public void setInsPeriodType(String insPeriodType) {
        this.insPeriodType = insPeriodType;
    }

    public String getInsPeriodValue() {
        return insPeriodValue;
    }

    public void setInsPeriodValue(String insPeriodValue) {
        this.insPeriodValue = insPeriodValue;
    }

    public String getCanBuyArea() {
        return canBuyArea;
    }

    public void setCanBuyArea(String canBuyArea) {
        this.canBuyArea = canBuyArea;
    }

    public String getItemLogo() {
        return itemLogo;
    }

    public void setItemLogo(String itemLogo) {
        this.itemLogo = itemLogo;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }

    public String getRevenueDemo() {
        return revenueDemo;
    }

    public void setRevenueDemo(String revenueDemo) {
        this.revenueDemo = revenueDemo;
    }

    public String getInsResponsibility() {
        return insResponsibility;
    }

    public void setInsResponsibility(String insResponsibility) {
        this.insResponsibility = insResponsibility;
    }

    public String getInsNotice() {
        return insNotice;
    }

    public void setInsNotice(String insNotice) {
        this.insNotice = insNotice;
    }

    public String getInsStatements() {
        return insStatements;
    }

    public void setInsStatements(String insStatements) {
        this.insStatements = insStatements;
    }

    public String getInsHealthInformed() {
        return insHealthInformed;
    }

    public void setInsHealthInformed(String insHealthInformed) {
        this.insHealthInformed = insHealthInformed;
    }

    public String getInsConfirmInformed() {
        return insConfirmInformed;
    }

    public void setInsConfirmInformed(String insConfirmInformed) {
        this.insConfirmInformed = insConfirmInformed;
    }

    public String getInsIntroduce() {
        return insIntroduce;
    }

    public void setInsIntroduce(String insIntroduce) {
        this.insIntroduce = insIntroduce;
    }

    public String getActivityPage() {
        return activityPage;
    }

    public void setActivityPage(String activityPage) {
        this.activityPage = activityPage;
    }

    public String getRefundFeeIntro() {
        return refundFeeIntro;
    }

    public void setRefundFeeIntro(String refundFeeIntro) {
        this.refundFeeIntro = refundFeeIntro;
    }

    public Integer getIsSupportPartRefund() {
        return isSupportPartRefund;
    }

    public void setIsSupportPartRefund(Integer isSupportPartRefund) {
        this.isSupportPartRefund = isSupportPartRefund;
    }

    public BigDecimal getMinPartRefund() {
        return minPartRefund;
    }

    public void setMinPartRefund(BigDecimal minPartRefund) {
        this.minPartRefund = minPartRefund;
    }

    public Integer getIsSupportInsAppend() {
        return isSupportInsAppend;
    }

    public void setIsSupportInsAppend(Integer isSupportInsAppend) {
        this.isSupportInsAppend = isSupportInsAppend;
    }

    public Integer getIsSupportReserveRefund() {
        return isSupportReserveRefund;
    }

    public void setIsSupportReserveRefund(Integer isSupportReserveRefund) {
        this.isSupportReserveRefund = isSupportReserveRefund;
    }
    public Integer getIsSupportNoCoolingOff() {
        return isSupportNoCoolingOff;
    }

    public void setIsSupportNoCoolingOff(Integer isSupportNoCoolingOff) {
        this.isSupportNoCoolingOff = isSupportNoCoolingOff;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Integer itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
