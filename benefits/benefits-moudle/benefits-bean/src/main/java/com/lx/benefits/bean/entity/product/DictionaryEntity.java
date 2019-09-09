package com.lx.benefits.bean.entity.product;

import lombok.Data;

import java.util.Date;

/**
 * 商品产地表 basis_place_origin
 * 
 * @author ruoyi
 * @date 2019-01-30
 */
@Data
public class DictionaryEntity {
	
	/** 自增id */
	private Long id;
	/** 中文名 */
	private String name;
	/** 英文名 */
	private String nameEn;
	/** 排序 */
	private Integer sort;
	/** 状态 状态 0-无效 1-有效 */
	private Integer status;
	/** 创建人 */
	private String createdUser;
	/** 创建时间 */
	private Date createdTime;
	/** 更新人 */
	private String updateUser;
	/** 更新时间 */
	private Date updatedTime;

	private Integer type;

}
