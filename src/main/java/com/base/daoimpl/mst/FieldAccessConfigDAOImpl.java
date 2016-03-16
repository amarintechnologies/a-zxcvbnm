
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.FieldAccessConfigDAO;
import com.base.domain.mst.FieldAccessConfigDM;

@Repository
public class FieldAccessConfigDAOImpl implements FieldAccessConfigDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(FieldAccessConfigDAOImpl.class);
	
	/**
	 * Method for save and update FieldAccessConfigDM Data
	 * 
	 * @param accessobj
	 *            of FieldAccessConfigDM
	 */
	public void saveFieldAccessConfigDetails(FieldAccessConfigDM accessobj) {
		sessionfactory.getCurrentSession().saveOrUpdate(accessobj);
	}
	
	/**
	 * Method for return FieldAccessConfigDM list based on user's parameters
	 * 
	 * @param Long
	 *            screenid,String screenFldRef,Long companyId,Long branchId,Long roleid,String status
	 * 
	 * @return List of FieldAccessConfigDM
	 */
	public List<FieldAccessConfigDM> getFieldAccessConfigList(Long screenid, String screenFldRef, Long companyId,
			Long branchId, Long roleid, String status) {
		logger.info("Inside getFieldAccessConfigList > " + screenFldRef + "," + companyId + ", " + branchId + ", "
				+ roleid + "," + companyId + "," + status);
		StringBuffer sql = new StringBuffer(" select");
		sql.append(" f.configId as configId, f.screenFldRef as screenFldRef, f.companyid as companyid , f.branchid as branchid,");
		sql.append(" f.roleId as roleId, f.viewYN as viewYN, f.status as status, f.lastUpdatedDate as lastUpdatedDate, f.lastUpdatedBy as lastUpdatedBy, ");
		sql.append(" asf.fieldDescription as screeFieldDesc, br.branchName as branchName, rn.roleName as roleName ");
		sql.append(" from  FieldAccessConfigDM f, AppScreenFieldsDM asf, BranchDM br, RoleDM rn where 1=1 ");
		sql.append(" and asf.screenFieldId=f.screenFldRef and br.branchId=f.branchid and rn.roleId=f.roleId ");
		Query query = null;
		if (screenFldRef != "" && screenFldRef != null) {
			sql.append(" and lower(f.screenFldRef) like lower('" + screenFldRef + "')");
		}
		if (screenid != null) {
			sql.append(" and asf.appScreenId=" + screenid);
		}
		if (companyId != null && companyId != 0L) {
			sql.append(" and f.companyid=" + companyId);
		}
		if (branchId != null) {
			sql.append(" and f.branchid =" + branchId);
		}
		if (roleid != null) {
			sql.append(" and f.roleId=" + roleid);
		}
		if (status != null) {
			sql.append(" and f.status='" + status + "'");
		}
		logger.info("Inside getFieldAccessConfigList>" + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(FieldAccessConfigDM.class));
		return query.list();
	}
}
