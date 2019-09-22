package com.lx.benefits.bean.dto.admin.customized;


import lombok.Data;

import java.util.List;

@Data
public class EnterprNoticeReqDto {
    /**
     * 定制模块id,自增主键ID
     */
    private Long id;
    /**
     * 所属企业客户id
     */
    private Long enterprId;

    private Integer isLoginRemind;

    private String loginAttach;

    private List<String> loginAttachs;

    private Integer isUserRemind;

    private String userAttach;

    private List<String> userAttachs;

    private Integer isDeleted;

    private Integer created;

    private Integer updated;
    
    private Integer isBirthdayEmailRemind;
    
    private String emailTitle;
    
    private String emailContent;

}