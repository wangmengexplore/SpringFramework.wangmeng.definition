package com.lx.benefits.bean.entity.entercreditinfo;


import com.lx.benefits.bean.entity.Entity;

import java.math.BigDecimal;

/**
 * 企业积分相关
 *
 * @author luojie
 */
public class EnterprCreditInfo extends Entity {
    /**
     * 企业积分id,自增主键ID
     */
    private Long creditId;

    /**
     * 积分所属企业客户id
     */
    private Long enterprId;

    /**
     * 积分类型{1: 普通积分; 2: 认可激励积分}
     */
    private Byte creditType;

    /**
     * 积分状态{1: 正常可用;}
     */
    private Boolean status;

    /**
     * 企业可用积分
     */
    private BigDecimal validCredit;

    /**
     * 企业未生效积分
     */
    private BigDecimal invalidCredit;

    /**
     * 企业锁定积分
     */
    private BigDecimal lockCredit;


    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    public Long getEnterprId() {
        return enterprId;
    }

    public void setEnterprId(Long enterprId) {
        this.enterprId = enterprId;
    }

    public Byte getCreditType() {
        return creditType;
    }

    public void setCreditType(Byte creditType) {
        this.creditType = creditType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public BigDecimal getValidCredit() {
        return validCredit;
    }

    public void setValidCredit(BigDecimal validCredit) {
        this.validCredit = validCredit;
    }

    public BigDecimal getInvalidCredit() {
        return invalidCredit;
    }

    public void setInvalidCredit(BigDecimal invalidCredit) {
        this.invalidCredit = invalidCredit;
    }

    public BigDecimal getLockCredit() {
        return lockCredit;
    }

    public void setLockCredit(BigDecimal lockCredit) {
        this.lockCredit = lockCredit;
    }
}