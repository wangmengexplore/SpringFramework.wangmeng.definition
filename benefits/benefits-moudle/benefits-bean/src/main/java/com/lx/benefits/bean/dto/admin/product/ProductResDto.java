package com.lx.benefits.bean.dto.admin.product;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lx.benefits.bean.entity.product.SkuEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 商品基本 【spu】表 product
 * 
 * @author ruoyi
 * @date 2019-02-12
 */
@Data
public class ProductResDto {

	/** spu编码 */
	private Long spuCode;
	/** 品牌id */
	private Long brandId;
	/** 品牌名称 */
	private String brandName;
	/** 一级分类id */
	private Long categoryId;
	/** 一级分类名称 */
	private String categoryName;
	/** 二级分类id */
	private Long categoryId2;
	/** 二级分类名称 */
	private String categoryName2;
	/** 三级分类id */
	private Long categoryId3;
	/** 三级分类名称 */
	private String categoryName3;
	/** 商品类型 1虚拟商品，0实物商品，默认为0 */
	private Integer goodsType;
	/** 是否跨境 1:跨境0非跨境 */
	private Integer isCross;
	/** 颜色 */
	private String color;
	/** 库存 */
	private Integer stock;
	/** 供应商id */
	private Long supplierId;
	/** 供应商名称*/
	private String supplierName;
	/** 商品名称 */
	private String goodsName;
	/** 英文名称 */
	private String goodsNameEn;
	/** 商品描述 */
	private String goodsBody;
	/** 商品主图 */
	private String goodsImage;
	private List<String> goodsImageList;
	/** 规格序列化 */
	private String goodsSpecname;
	/** 产地id*/
	private Long placeOriginId;
	/** 产地 */
	private String placeOrigin;
	/** 折扣 */
	private BigDecimal goodsDiscount;
	/** 原厂货号 */
	private String itemNumber;
	/** 季节id */
	private Long seasonId;
	/** 季节 */
	private String season;
	/** 商品状态 商品状态 0下架，1正常，10违规（禁售） */
	private Integer goodsState;
	/** 运费 费 0为免运费 */
	private BigDecimal goodsFreight;
	/** 创建时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createdTime;
	/** 更新时间 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updatedTime;
	/** 长度 */
	private BigDecimal length;
	/** 宽度 */
	private BigDecimal width;
	/** 高度 */
	private BigDecimal height;
	/** 性别 */
	private Integer sex;
	/** 国别*/
	private String countrySize;
	/** 改价生效开始时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date gjValidStarttime;
	/** 改价生效结束时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date gjValidEndtime;
	/**改价折扣*/
	private BigDecimal gjDiscount;
	/**是否一直生效 0：否  1：是*/
	private Integer isEffect;
	private Long topicId;
	/**专题名称*/
	private String topicName;

	private List<SkuEntity> skuEntityList;

	/** 商品列表页展示价格 */
	private BigDecimal goodsPrice;
	private BigDecimal goodsMarkprice;
	private BigDecimal goodsCostprice;
	/**
	 * 介绍
	 */
	private String introduction;

}
