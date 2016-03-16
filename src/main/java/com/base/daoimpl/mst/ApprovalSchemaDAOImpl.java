
package com.base.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.ApprovalSchemaDAO;
import com.base.domain.mst.ApprovalSchemaDM;
@Repository
public class ApprovalSchemaDAOImpl implements ApprovalSchemaDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(ApprovalSchemaDAOImpl.class);
	
	/**
	 * Method for save or update ApprovalSchemaDM
	 * 
	 * @param apprSchmobj
	 *            of ApprovalSchemaDM
	 */
	public void saveOrUpdate(ApprovalSchemaDM apprSchmobj) {
		logger.info("Inside saveOrUpdate > " + apprSchmobj.getCompanyid());
		sessionfactory.getCurrentSession().saveOrUpdate(apprSchmobj);
	}
	
	/** Method for return the ApprovalSchemaDM list by company name and status **/
	/**
	 * 
	 * @param Long
	 *            companyID, Long brandId, Long roleId,String apprStatus
	 * 
	 * @return list of ApprovalSchemaDM
	 */
	@SuppressWarnings("unchecked")
	public List<ApprovalSchemaDM> getApprovalSchemaList(Long screenId,Long companyID, Long brandId, Long roleId,String apprStatus) {
		logger.info("Inside getApprovalSchemaList >  "+screenId+","+ companyID + ", " + brandId + "," + roleId+","+apprStatus);
		StringBuffer sql = new StringBuffer("select");
		{
		sql.append(" a.apprSchmId as apprSchmId, a.companyid as companyid, a.screenId as screenId,");
		sql.append(" a.branchId as branchId, a.roleId as roleId, a.apprLevel as apprLevel,");
		sql.append(" a.apprLimit as apprLimit, a.apprStatus as apprStatus, a.lastUpdatedDate as lastUpdatedDate,");
		sql.append(" a.lastUpdatedBy as lastUpdatedBy, b.branchName as branchName, r.roleName as roleName, ");
		sql.append(" app.screendesc as screenName ");
		sql.append(" from ApprovalSchemaDM a, BranchDM b, RoleDM r, AppScreensDM app where 1=1");
		sql.append(" and b.branchId = a.branchId and r.roleId =a.roleId and app.screenId = a.screenId ");
		}
		Query query = null;
		if (screenId != null) {
			sql.append(" and a.screenId = " + screenId);
		}
		if (companyID != null) {
			sql.append(" and a.companyid = " + companyID);
		}
		if (brandId != null ) {
			sql.append(" and a.branchId = " + brandId);
		}
		if (roleId != null) {
			sql.append(" and a.roleId = " + roleId);
		}
		if (apprStatus != null) {
			sql.append(" and a.apprStatus = '" + apprStatus + "'");
		}
		
		
		sql.append(" order by a.lastUpdatedDate desc");
		logger.info("Inside getApprovalSchemaList > Query > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(ApprovalSchemaDM.class));
		return query.list();
	}
}
