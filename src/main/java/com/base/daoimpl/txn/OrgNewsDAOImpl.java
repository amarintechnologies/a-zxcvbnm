
package com.base.daoimpl.txn;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.txn.OrgNewsDAO;
import com.base.domain.txn.OrgNewsDM;

@Repository
public class OrgNewsDAOImpl implements OrgNewsDAO {
	Logger logger = Logger.getLogger(OrgNewsDAOImpl.class);
	@Autowired
	private SessionFactory sessionfactory;
	
	/**
	 * to save or update the Org News list in database
	 * 
	 * @param newsObj
	 *            of Org NewsDM
	 */
	public void saveAndUpdateNews(OrgNewsDM newsObj) {
		logger.info("Inside saveAndUpdateNews Details > " + newsObj.getCompanyId() + ", " + newsObj.getNewsDesc());
		sessionfactory.getCurrentSession().saveOrUpdate(newsObj);
	}
	
	/**
	 * getting the OrgNews value based on parameter reference in OrgNewsDM
	 * 
	 * Return values from OrgNewsDM based on user's input
	 * 
	 * @param Long
	 *            newsId String newsTitle,String newsDesc,String newsStatus,Long companyId,Long branchId,Long deptId
	 *            list
	 * 
	 */
	public List<OrgNewsDM> getNewsList(Long newsId, String newsTitle, String newsDesc, String newsStatus, 
			Long companyId, Long branchId, Long deptId) {
		StringBuffer sql = new StringBuffer();
		sql.append("select o.newsId as newsId, o.newsTitle as newsTitle, o.newsDesc as newsDesc, ");
		sql.append(" o.validFrom as validFrom, o.validTo as validTo, o.branchId as branchId, ");
		sql.append(" o.deptId as deptId, o.newsStatus as newsStatus, o.lastUpdatedDate as lastUpdatedDate, ");
		sql.append(" o.lastUpdatedBy as lastUpdatedBy, b.branchName as branchName, d.deptname as departmentName ");
		sql.append(" from OrgNewsDM o,BranchDM b, DepartmentDM d where 1=1");
		sql.append(" and b.branchId=o.branchId and d.deptid=o.deptId");
		Query query = null;
		if (newsId != null && newsId != 0) {
			sql.append(" and o.newsId=" + newsId);  
		}
		if (newsTitle != null && newsTitle.trim().length() > 0) {
			sql.append(" and lower(o.newsTitle) like lower('" + newsTitle + "%')");
		}
		if (newsDesc != null && newsDesc.trim().length() > 0) {
			sql.append(" and lower(o.newsDesc) like lower('" + newsDesc + "%')");
		}
		if (newsStatus != null && newsStatus.trim().length() > 0) {
			sql.append(" and o.newsStatus='" + newsStatus + "'");
		}
		if (companyId != null) {
			sql.append(" and o.companyId=" + companyId);
		}
		if (branchId != null && branchId != 0) {
			sql.append(" and o.branchId=" + branchId);
		}
		if (deptId != null && deptId != 0) {
			sql.append(" and o.deptId=" + deptId);
		}
		sql.append(" order by o.lastUpdatedDate desc");
		logger.info("Query getNewsList > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(OrgNewsDM.class));
		return query.list();
	}
}
