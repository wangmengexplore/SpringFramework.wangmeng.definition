package com.jsh.service.materials;

import com.jsh.base.BaseIService;
import com.jsh.util.JshException;
import com.jsh.model.po.DepotHead;
import com.jsh.model.po.UserBusiness;
import com.jsh.util.PageUtil;

public interface DepotHeadIService extends BaseIService<DepotHead>
{
	/*
	 * 获取MaxId
	 */
	void find(PageUtil<DepotHead> depotHead,String maxid)throws JshException;
	
	void findAllMoney(PageUtil<DepotHead> depotHead, Integer supplierId, String type, String subType, String mode)throws JshException;

	public void batchSetStatus(Boolean status,String depotHeadIDs);

	public void findInDetail(PageUtil pageUtil,String beginTime,String endTime, String type, Long pid,String dids,Long oId)throws JshException;

	public void findInOutMaterialCount(PageUtil pageUtil,String beginTime,String endTime, String type, Long pid,String dids,Long oId)throws JshException;

	public void findMaterialsListByHeaderId(PageUtil pageUtil,Long headerId)throws JshException;

	public void findStatementAccount(PageUtil pageUtil,String beginTime,String endTime, Long organId, String supType)throws JshException;

	public void getHeaderIdByMaterial(PageUtil pageUtil,String materialParam,String depotIds)throws JshException;
}
