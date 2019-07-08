package com.ofsoft.cms.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysHelpInfo<M extends BaseSysHelpInfo<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}

	public Integer getId() {
		return getInt("id");
	}

	public M setTitle(String title) {
		set("title", title);
		return (M)this;
	}

	public String getTitle() {
		return getStr("title");
	}

	public M setContnet(String contnet) {
		set("contnet", contnet);
		return (M)this;
	}

	public String getContnet() {
		return getStr("contnet");
	}

	public M setType(String type) {
		set("type", type);
		return (M)this;
	}

	public String getType() {
		return getStr("type");
	}

	public M setAddTime(java.util.Date addTime) {
		set("add_time", addTime);
		return (M)this;
	}

	public java.util.Date getAddTime() {
		return get("add_time");
	}

	public M setAddPerson(String addPerson) {
		set("add_person", addPerson);
		return (M)this;
	}

	public String getAddPerson() {
		return getStr("add_person");
	}

	public M setHaveNum(java.math.BigDecimal haveNum) {
		set("have_num", haveNum);
		return (M)this;
	}

	public java.math.BigDecimal getHaveNum() {
		return get("have_num");
	}

	public M setNoNum(java.math.BigDecimal noNum) {
		set("no_num", noNum);
		return (M)this;
	}

	public java.math.BigDecimal getNoNum() {
		return get("no_num");
	}

	public M setStatus(String status) {
		set("status", status);
		return (M)this;
	}

	public String getStatus() {
		return getStr("status");
	}

	public M setRemark(String remark) {
		set("remark", remark);
		return (M)this;
	}

	public String getRemark() {
		return getStr("remark");
	}

}