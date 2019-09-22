package com.lx.benefits.bean.dto.admin.operation;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 广告位 表 basis_advert
 * 
 * @author ruoyi
 * @date 2019-01-30
 */
@Data
public class AdvertResDto{
	
	/** 自增id */
	private Long id;
	/** 广告名称 */
	private String advertName;
	/** 广告位置 */
	private Integer position;
	/** 开始时间 */
	private Date beginTime;
	/** 到期时间 */
	private Date endTime;
	/** 广告图片 */
	private String advertImage;
	/** 广告链接 */
	private String advertLink;
	/** 状态 状态 0-无效 1-有效 */
	private Integer status;
	/** 创建时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createdTime;

}