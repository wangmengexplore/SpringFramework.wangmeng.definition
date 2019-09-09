package com.lx.benefits.bean.entity.voucher;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Voucher implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.voucher_id
     *
     * @mbggenerated
     */
    private Long voucherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.voucher_name
     *
     * @mbggenerated
     */
    private String voucherName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.total_release
     *
     * @mbggenerated
     */
    private Integer totalRelease;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.use_case
     *
     * @mbggenerated
     */
    private Integer useCase;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.use_threshold
     *
     * @mbggenerated
     */
    private BigDecimal useThreshold;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.benefit_content
     *
     * @mbggenerated
     */
    private BigDecimal benefitContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.validate_start_time
     *
     * @mbggenerated
     */
    private Date validateStartTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.validate_end_time
     *
     * @mbggenerated
     */
    private Date validateEndTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.limit_num
     *
     * @mbggenerated
     */
    private Integer limitNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.use_desc
     *
     * @mbggenerated
     */
    private String useDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.is_stop
     *
     * @mbggenerated
     */
    private Byte isStop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voucher.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    private String startTime;

    private String endTime;

    private Integer voucherType;

    private Integer leftAmount;

    private Integer receivedAmount;

    private Integer usedAmount;

    private Integer voucherStatus;
    //每个员工已领取的优惠卷数量
    private Integer num;

    private Long sellerId;

    private String skuIds;

    private Boolean flag;

    private String totalGoodsPrice;
    //各个sku销售总价的占比
    private String goodsProportionPrice;

    private VoucherEmployeeInfo voucherEmployeeInfo;
    //已领取未使用的优惠卷
    private Integer noUsedNum;

    public Integer getNoUsedNum() {
        return noUsedNum;
    }

    public void setNoUsedNum(Integer noUsedNum) {
        this.noUsedNum = noUsedNum;
    }

    public VoucherEmployeeInfo getVoucherEmployeeInfo() {
        return voucherEmployeeInfo;
    }

    public void setVoucherEmployeeInfo(VoucherEmployeeInfo voucherEmployeeInfo) {
        this.voucherEmployeeInfo = voucherEmployeeInfo;
    }

    public String getGoodsProportionPrice() {
        return goodsProportionPrice;
    }

    public void setGoodsProportionPrice(String goodsProportionPrice) {
        this.goodsProportionPrice = goodsProportionPrice;
    }

    public String getTotalGoodsPrice() {
        return totalGoodsPrice;
    }

    public void setTotalGoodsPrice(String totalGoodsPrice) {
        this.totalGoodsPrice = totalGoodsPrice;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getSkuIds() {
        return skuIds;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(Integer voucherType) {
        this.voucherType = voucherType;
    }

    public Integer getLeftAmount() {
        return leftAmount;
    }

    public void setLeftAmount(Integer leftAmount) {
        this.leftAmount = leftAmount;
    }

    public Integer getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(Integer receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public Integer getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(Integer usedAmount) {
        this.usedAmount = usedAmount;
    }

    public Integer getVoucherStatus() {
        return voucherStatus;
    }

    public void setVoucherStatus(Integer voucherStatus) {
        this.voucherStatus = voucherStatus;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table voucher
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.voucher_id
     *
     * @return the value of voucher.voucher_id
     *
     * @mbggenerated
     */
    public Long getVoucherId() {
        return voucherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.voucher_id
     *
     * @param voucherId the value for voucher.voucher_id
     *
     * @mbggenerated
     */
    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.voucher_name
     *
     * @return the value of voucher.voucher_name
     *
     * @mbggenerated
     */
    public String getVoucherName() {
        return voucherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.voucher_name
     *
     * @param voucherName the value for voucher.voucher_name
     *
     * @mbggenerated
     */
    public void setVoucherName(String voucherName) {
        this.voucherName = voucherName == null ? null : voucherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.total_release
     *
     * @return the value of voucher.total_release
     *
     * @mbggenerated
     */
    public Integer getTotalRelease() {
        return totalRelease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.total_release
     *
     * @param totalRelease the value for voucher.total_release
     *
     * @mbggenerated
     */
    public void setTotalRelease(Integer totalRelease) {
        this.totalRelease = totalRelease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.use_case
     *
     * @return the value of voucher.use_case
     *
     * @mbggenerated
     */
    public Integer getUseCase() {
        return useCase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.use_case
     *
     * @param useCase the value for voucher.use_case
     *
     * @mbggenerated
     */
    public void setUseCase(Integer useCase) {
        this.useCase = useCase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.use_threshold
     *
     * @return the value of voucher.use_threshold
     *
     * @mbggenerated
     */
    public BigDecimal getUseThreshold() {
        return useThreshold;
    }

    public void setUseThreshold(BigDecimal useThreshold) {
        this.useThreshold = useThreshold;
    }

    public BigDecimal getBenefitContent() {
        return benefitContent;
    }

    public void setBenefitContent(BigDecimal benefitContent) {
        this.benefitContent = benefitContent;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.use_threshold
     *
     * @param useThreshold the value for voucher.use_threshold
     *
     * @mbggenerated
     */


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.benefit_content
     *
     * @return the value of voucher.benefit_content
     *
     * @mbggenerated
     */


    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.benefit_content
     *
     * @param benefitContent the value for voucher.benefit_content
     *
     * @mbggenerated
     */


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.validate_start_time
     *
     * @return the value of voucher.validate_start_time
     *
     * @mbggenerated
     */
    public Date getValidateStartTime() {
        return validateStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.validate_start_time
     *
     * @param validateStartTime the value for voucher.validate_start_time
     *
     * @mbggenerated
     */
    public void setValidateStartTime(Date validateStartTime) {
        this.validateStartTime = validateStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.validate_end_time
     *
     * @return the value of voucher.validate_end_time
     *
     * @mbggenerated
     */
    public Date getValidateEndTime() {
        return validateEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.validate_end_time
     *
     * @param validateEndTime the value for voucher.validate_end_time
     *
     * @mbggenerated
     */
    public void setValidateEndTime(Date validateEndTime) {
        this.validateEndTime = validateEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.limit_num
     *
     * @return the value of voucher.limit_num
     *
     * @mbggenerated
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.limit_num
     *
     * @param limitNum the value for voucher.limit_num
     *
     * @mbggenerated
     */
    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.use_desc
     *
     * @return the value of voucher.use_desc
     *
     * @mbggenerated
     */
    public String getUseDesc() {
        return useDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.use_desc
     *
     * @param useDesc the value for voucher.use_desc
     *
     * @mbggenerated
     */
    public void setUseDesc(String useDesc) {
        this.useDesc = useDesc == null ? null : useDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.is_stop
     *
     * @return the value of voucher.is_stop
     *
     * @mbggenerated
     */
    public Byte getIsStop() {
        return isStop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.is_stop
     *
     * @param isStop the value for voucher.is_stop
     *
     * @mbggenerated
     */
    public void setIsStop(Byte isStop) {
        this.isStop = isStop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.create_time
     *
     * @return the value of voucher.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.create_time
     *
     * @param createTime the value for voucher.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voucher.update_time
     *
     * @return the value of voucher.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voucher.update_time
     *
     * @param updateTime the value for voucher.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Voucher other = (Voucher) that;
        return (this.getVoucherId() == null ? other.getVoucherId() == null : this.getVoucherId().equals(other.getVoucherId()))
            && (this.getVoucherName() == null ? other.getVoucherName() == null : this.getVoucherName().equals(other.getVoucherName()))
            && (this.getTotalRelease() == null ? other.getTotalRelease() == null : this.getTotalRelease().equals(other.getTotalRelease()))
            && (this.getUseCase() == null ? other.getUseCase() == null : this.getUseCase().equals(other.getUseCase()))
            && (this.getUseThreshold() == null ? other.getUseThreshold() == null : this.getUseThreshold().equals(other.getUseThreshold()))
            && (this.getBenefitContent() == null ? other.getBenefitContent() == null : this.getBenefitContent().equals(other.getBenefitContent()))
            && (this.getValidateStartTime() == null ? other.getValidateStartTime() == null : this.getValidateStartTime().equals(other.getValidateStartTime()))
            && (this.getValidateEndTime() == null ? other.getValidateEndTime() == null : this.getValidateEndTime().equals(other.getValidateEndTime()))
            && (this.getLimitNum() == null ? other.getLimitNum() == null : this.getLimitNum().equals(other.getLimitNum()))
            && (this.getUseDesc() == null ? other.getUseDesc() == null : this.getUseDesc().equals(other.getUseDesc()))
            && (this.getIsStop() == null ? other.getIsStop() == null : this.getIsStop().equals(other.getIsStop()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVoucherId() == null) ? 0 : getVoucherId().hashCode());
        result = prime * result + ((getVoucherName() == null) ? 0 : getVoucherName().hashCode());
        result = prime * result + ((getTotalRelease() == null) ? 0 : getTotalRelease().hashCode());
        result = prime * result + ((getUseCase() == null) ? 0 : getUseCase().hashCode());
        result = prime * result + ((getUseThreshold() == null) ? 0 : getUseThreshold().hashCode());
        result = prime * result + ((getBenefitContent() == null) ? 0 : getBenefitContent().hashCode());
        result = prime * result + ((getValidateStartTime() == null) ? 0 : getValidateStartTime().hashCode());
        result = prime * result + ((getValidateEndTime() == null) ? 0 : getValidateEndTime().hashCode());
        result = prime * result + ((getLimitNum() == null) ? 0 : getLimitNum().hashCode());
        result = prime * result + ((getUseDesc() == null) ? 0 : getUseDesc().hashCode());
        result = prime * result + ((getIsStop() == null) ? 0 : getIsStop().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voucher
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voucherId=").append(voucherId);
        sb.append(", voucherName=").append(voucherName);
        sb.append(", totalRelease=").append(totalRelease);
        sb.append(", useCase=").append(useCase);
        sb.append(", useThreshold=").append(useThreshold);
        sb.append(", benefitContent=").append(benefitContent);
        sb.append(", validateStartTime=").append(validateStartTime);
        sb.append(", validateEndTime=").append(validateEndTime);
        sb.append(", limitNum=").append(limitNum);
        sb.append(", useDesc=").append(useDesc);
        sb.append(", isStop=").append(isStop);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
