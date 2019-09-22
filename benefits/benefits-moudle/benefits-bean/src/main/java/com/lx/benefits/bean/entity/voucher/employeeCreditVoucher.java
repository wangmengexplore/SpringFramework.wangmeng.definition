package com.lx.benefits.bean.entity.voucher;

import java.io.Serializable;
import java.util.Date;

public class employeeCreditVoucher implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_credit_voucher.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_credit_voucher.employee_id
     *
     * @mbggenerated
     */
    private Long employeeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_credit_voucher.campaign_id
     *
     * @mbggenerated
     */
    private Byte campaignId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_credit_voucher.voucher_id
     *
     * @mbggenerated
     */
    private Long voucherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_credit_voucher.no_used_num
     *
     * @mbggenerated
     */
    private Byte noUsedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_credit_voucher.received_num
     *
     * @mbggenerated
     */
    private Byte receivedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_credit_voucher.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_credit_voucher.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table employee_credit_voucher
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_credit_voucher.id
     *
     * @return the value of employee_credit_voucher.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_credit_voucher.id
     *
     * @param id the value for employee_credit_voucher.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_credit_voucher.employee_id
     *
     * @return the value of employee_credit_voucher.employee_id
     *
     * @mbggenerated
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_credit_voucher.employee_id
     *
     * @param employeeId the value for employee_credit_voucher.employee_id
     *
     * @mbggenerated
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_credit_voucher.campaign_id
     *
     * @return the value of employee_credit_voucher.campaign_id
     *
     * @mbggenerated
     */
    public Byte getCampaignId() {
        return campaignId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_credit_voucher.campaign_id
     *
     * @param campaignId the value for employee_credit_voucher.campaign_id
     *
     * @mbggenerated
     */
    public void setCampaignId(Byte campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_credit_voucher.voucher_id
     *
     * @return the value of employee_credit_voucher.voucher_id
     *
     * @mbggenerated
     */
    public Long getVoucherId() {
        return voucherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_credit_voucher.voucher_id
     *
     * @param voucherId the value for employee_credit_voucher.voucher_id
     *
     * @mbggenerated
     */
    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_credit_voucher.no_used_num
     *
     * @return the value of employee_credit_voucher.no_used_num
     *
     * @mbggenerated
     */
    public Byte getNoUsedNum() {
        return noUsedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_credit_voucher.no_used_num
     *
     * @param noUsedNum the value for employee_credit_voucher.no_used_num
     *
     * @mbggenerated
     */
    public void setNoUsedNum(Byte noUsedNum) {
        this.noUsedNum = noUsedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_credit_voucher.received_num
     *
     * @return the value of employee_credit_voucher.received_num
     *
     * @mbggenerated
     */
    public Byte getReceivedNum() {
        return receivedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_credit_voucher.received_num
     *
     * @param receivedNum the value for employee_credit_voucher.received_num
     *
     * @mbggenerated
     */
    public void setReceivedNum(Byte receivedNum) {
        this.receivedNum = receivedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_credit_voucher.create_time
     *
     * @return the value of employee_credit_voucher.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_credit_voucher.create_time
     *
     * @param createTime the value for employee_credit_voucher.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_credit_voucher.update_time
     *
     * @return the value of employee_credit_voucher.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_credit_voucher.update_time
     *
     * @param updateTime the value for employee_credit_voucher.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_credit_voucher
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
        employeeCreditVoucher other = (employeeCreditVoucher) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getCampaignId() == null ? other.getCampaignId() == null : this.getCampaignId().equals(other.getCampaignId()))
            && (this.getVoucherId() == null ? other.getVoucherId() == null : this.getVoucherId().equals(other.getVoucherId()))
            && (this.getNoUsedNum() == null ? other.getNoUsedNum() == null : this.getNoUsedNum().equals(other.getNoUsedNum()))
            && (this.getReceivedNum() == null ? other.getReceivedNum() == null : this.getReceivedNum().equals(other.getReceivedNum()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_credit_voucher
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        result = prime * result + ((getVoucherId() == null) ? 0 : getVoucherId().hashCode());
        result = prime * result + ((getNoUsedNum() == null) ? 0 : getNoUsedNum().hashCode());
        result = prime * result + ((getReceivedNum() == null) ? 0 : getReceivedNum().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_credit_voucher
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", campaignId=").append(campaignId);
        sb.append(", voucherId=").append(voucherId);
        sb.append(", noUsedNum=").append(noUsedNum);
        sb.append(", receivedNum=").append(receivedNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}