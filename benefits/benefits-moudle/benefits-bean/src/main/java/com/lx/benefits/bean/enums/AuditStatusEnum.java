package com.lx.benefits.bean.enums;

/**
 * @author unknow on 2018-12-15 19:20.
 */
public enum AuditStatusEnum {
    CREATED(1, "待审核"),
    UNPAID(3, "已拒绝"),
    COMPLETE(2, "已完成");

    private Integer value;
    private String desc;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    AuditStatusEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    /**
     * 根据value获取AuditStatusEnum
     *
     * @param value value
     * @return AuditStatusEnum
     */
    public static AuditStatusEnum getAuditStatusEnum(Integer value) {
        if (null == value || value < 1) {
            return null;
        }
        for (AuditStatusEnum auditStatusEnum : AuditStatusEnum.values()) {
            if (auditStatusEnum.getValue().equals(value)) {
                return auditStatusEnum;
            }
        }
        return null;
    }

    /**
     * 根据code获取AuditStatusEnum
     *
     * @param code code
     * @return AuditStatusEnum
     */
    public static AuditStatusEnum getAuditStatusEnum(String code) {
        if (null == code || code.isEmpty()) {
            return null;
        }
        for (AuditStatusEnum auditStatusEnum : AuditStatusEnum.values()) {
            if (auditStatusEnum.name().equals(code)) {
                return auditStatusEnum;
            }
        }
        return null;
    }

    /**
     * 验证是否为合法有效的value
     *
     * @param value value
     * @return boolean   {true: 合法的; 不合法的}
     */
    public static boolean isVaildValue(Integer value) {
        return null != getAuditStatusEnum(value);
    }

    /**
     * 验证是否为合法有效的value
     *
     * @param code code
     * @return boolean   {true: 合法的; 不合法的}
     */
    public static boolean isVaildCode(String code) {
        return null != getAuditStatusEnum(code);
    }
}
