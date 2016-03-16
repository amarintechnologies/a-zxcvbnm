
package com.base.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.ParameterDAO;
import com.base.domain.mst.ParameterDM;

@Repository
public class ParameterDAOImpl implements ParameterDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(ParameterDAOImpl.class);
	
	/**
	 * getting the parameter value based on parameter reference in ParameterDM
	 * 
	 * @param String
	 *            paramRef, Long companyId, String moduleCode
	 * @return String
	 */
	public String getParameterValue(String paramRef, Long companyId, Long moduleCode) {
		logger.info("Inside getParameterList > " + companyId + ", " + paramRef + "," + moduleCode);
		StringBuffer sql = new StringBuffer(" select c.paramValue from ParameterDM c where 1=1");
		if (companyId != null) {
			sql.append(" and c.companyId=" + companyId);
		}
		if (paramRef != null) {
			sql.append(" and c.paramRef= '" + paramRef + "'");
		}
		if (moduleCode != null) {
			sql.append(" and c.moduleCode='" + moduleCode + "'");
		}
		logger.info(" getParameterValue SQL > " + sql);
		Query query = sessionFactory.getCurrentSession().createQuery(sql.toString());
		return query.list().get(0).toString();
	}
	
	/**
	 * To search details on ParameterDM table
	 * 
	 * @param Long
	 *            paramId String paramRef String status Long companyId
	 * 
	 * @return list of ParameterDM
	 * 
	 */
	public List<ParameterDM> getParameterList(Long moduleCode,Long paramId, String paramRef, String status, Long companyId) {
		logger.info("Inside getParameterList > "+moduleCode+"," + paramId + "," + companyId + ", " + paramRef + ", " + status);
		StringBuffer sql = new StringBuffer("select c from ParameterDM c where 1=1");
		Query query = null;
		if (moduleCode != null) {
			sql.append(" and c.moduleCode='" + moduleCode + "'");
		}
		if (paramId != null) {
			sql.append("and c.paramId=" + paramId);
		}
		if (paramRef != "" && paramRef != null) {
			sql.append(" and lower(c.paramRef) like lower('" + paramRef + "%')");
		}
		if (status != null) {
			sql.append(" and c.paramStatus = '" + status + "'");
		}
		sql.append(" and c.companyId = " + companyId + " and c.showYn = 'Y' order by c.lastUpdatedDt desc");
		logger.info(" getParameterList SQL > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString());
		return query.list();
	}
	
	/** Method for update ParameterDM **/
	/**
	 * @param paramObj
	 *            of ParameterDM
	 */
	public void updateDetails(ParameterDM paramObj) {
		logger.info("Inside Parameter Details > " + paramObj.getCompanyId() + ", " + paramObj.getParamRef());
		sessionFactory.getCurrentSession().update(paramObj);
	}
}
