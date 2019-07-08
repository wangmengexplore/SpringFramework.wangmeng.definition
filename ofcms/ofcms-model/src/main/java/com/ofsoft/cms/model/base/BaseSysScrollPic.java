package com.ofsoft.cms.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysScrollPic<M extends BaseSysScrollPic<M>> extends Model<M> implements IBean {

	public M setScrollPicId(Integer scrollPicId) {
		set("scroll_pic_id", scrollPicId);
		return (M)this;
	}

	public Integer getScrollPicId() {
		return getInt("scroll_pic_id");
	}

	public M setScrollPicName(String scrollPicName) {
		set("scroll_pic_name", scrollPicName);
		return (M)this;
	}

	public String getScrollPicName() {
		return getStr("scroll_pic_name");
	}

	public M setImgUrl(String imgUrl) {
		set("img_url", imgUrl);
		return (M)this;
	}

	public String getImgUrl() {
		return getStr("img_url");
	}

	public M setJumpType(String jumpType) {
		set("jump_type", jumpType);
		return (M)this;
	}

	public String getJumpType() {
		return getStr("jump_type");
	}

	public M setJumpUrl(String jumpUrl) {
		set("jump_url", jumpUrl);
		return (M)this;
	}

	public String getJumpUrl() {
		return getStr("jump_url");
	}

	public M setStatus(String status) {
		set("status", status);
		return (M)this;
	}

	public String getStatus() {
		return getStr("status");
	}

	public M setAdminName(String adminName) {
		set("admin_name", adminName);
		return (M)this;
	}

	public String getAdminName() {
		return getStr("admin_name");
	}

	public M setRequestTime(java.util.Date requestTime) {
		set("request_time", requestTime);
		return (M)this;
	}

	public java.util.Date getRequestTime() {
		return get("request_time");
	}

	public M setUseDate(java.util.Date useDate) {
		set("use_date", useDate);
		return (M)this;
	}

	public java.util.Date getUseDate() {
		return get("use_date");
	}

	public M setStopDate(java.util.Date stopDate) {
		set("stop_date", stopDate);
		return (M)this;
	}

	public java.util.Date getStopDate() {
		return get("stop_date");
	}

	public M setSortOrder(String sortOrder) {
		set("sort_order", sortOrder);
		return (M)this;
	}

	public String getSortOrder() {
		return getStr("sort_order");
	}

	public M setRemark(String remark) {
		set("remark", remark);
		return (M)this;
	}

	public String getRemark() {
		return getStr("remark");
	}

}
