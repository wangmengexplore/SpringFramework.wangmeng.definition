package com.jsh.dao.asset;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jsh.util.JshException;
import com.jsh.model.po.Asset;
import com.jsh.util.PageUtil;
import com.jsh.util.SearchConditionUtil;

public class ReportDAO extends HibernateDaoSupport implements ReportIDAO
{
    @SuppressWarnings("unchecked")
    @Override
    public void find(PageUtil<Asset> pageUtil,String reportType,String reportName) throws JshException
    {
        Query query = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("select count(" + reportType +") as dataSum, " + reportName + " from Asset asset where 1=1 " + SearchConditionUtil.getCondition(pageUtil.getAdvSearch()));
        pageUtil.setTotalCount(query.list().size());
        pageUtil.setPageList(query.list());
    }
}
