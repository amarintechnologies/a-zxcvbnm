
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.CompanyLookupDAO;
import com.base.domain.mst.CompanyLookupDM;

@Repository
public class CompanyLookupDAOImpl implements CompanyLookupDAO {
	/** @Autowired refers that integrating the spring concepts that is using for linking with specified class **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(CompanyLookupDAOImpl.class);
	@Value("${GET_COMPANY_LOOKUP_LIST}")
	private String strString;
	
	/**
	 * Method for save or update CompanyLookupDM
	 * 
	 * @param baseCompanyObj
	 *            of CompanyLookupDM
	 */
	public void saveorUpdateCompanyLookupDetails(CompanyLookupDM baseCompanyObj) {
		logger.info("Inside saveorUpdateCompanyLookupDetails > " + baseCompanyObj.getCompanyid() + ", "
				+ baseCompanyObj.getLookupname());
		sessionFactory.getCurrentSession().saveOrUpdate(baseCompanyObj);
	}
	
	/**
	 * To search details on CompanyLookupDM table
	 * 
	 * @param Long
	 *            companyId, String lookUpname, Long lookupId, String status, String filterType
	 * 
	 * @return CompanyLookupDM list
	 * 
	 */
	public List<CompanyLookupDM> getCompanyLookupList(Long companyId, String lookUpname, Long lookupId, String status,
			Long moduleId, String filterType) {
		logger.info("Inside getCompanyLookupList > " + companyId + ", " + lookUpname + "," + lookupId + "," + status
				+ "," + filterType);
		StringBuilder sql = new StringBuilder("select");
		if (filterType.equals("P")) {
			sql.append(" c.cmplookupid as cmplookupid,c.lookupname as lookupname ");
			sql.append(" from CompanyLookupDM c where 1=1 ");
		} else {
			sql.append(" c.cmplookupid as cmplookupid, c.lookupid as lookupid, l.lookupdesc as lookupDesc, ");
			sql.append(" c.moduleid as moduleid, c.lookupname as lookupname, c.lookupstatus as lookupstatus,");
			sql.append(" c.lastupdateddt as lastupdateddt, c.lastupdatedby as lastupdatedby, ");
			sql.append(" l.lookupcode as lookupCode, m.moduleCode as moduleCode, m.moduleName as moduleName ");
			sql.append(" from CompanyLookupDM c, LookupDM l, ModuleDM m where 1=1 ");
			sql.append(" and c.lookupid = l.lookupid and l.moduleId = m.moduleId ");
			sql.append(" and c.moduleid = m.moduleId");
		}
	
		Query query = null;
		if (companyId != null) {
			sql.append(" and c.companyid=" + companyId);
		}
		if (lookUpname != null && lookUpname.trim().length() > 0) {
			sql.append(" and lower(c.lookupname) like lower('" + lookUpname + "%')");
		}
		if (lookupId != null && lookupId != 0) {
			sql.append(" and c.lookupid =" + lookupId);
		}
		if (moduleId != null && moduleId != 0) {
			sql.append(" and c.moduleid =" + moduleId);
		}		
		if (status != null) {
			sql.append(" and c.lookupstatus = '" + status + "'");
		}
		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getCompanyLookupList > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(CompanyLookupDM.class));
		return query.list();
	}
	
	/**
	 * To get company look up details based on below params
	 * 
	 * @param Long
	 *            companyId, Long moduleId, String status,String lookUpCode
	 * @return List of CompanyLookupDM
	 */
	public List<CompanyLookupDM> getCompanyLookUpByLookUp(Long companyId, Long moduleId, String status,
			String lookUpCode) {
		logger.info("Inside getCompanyLookUpByLookUp > " + companyId + ", " + moduleId + ", " + status);

		StringBuilder sql = new StringBuilder(strString);
		Query query = null;
		if (companyId != null) {
			sql.append(" and c.companyid=" + companyId);
		}
		if (lookUpCode != null && lookUpCode.toString().length() > 0 && status != null
				&& status.toString().length() > 0) {
			sql.append(" and c.lookupid in (select l.lookupid from LookupDM l where l.lookupcode='" + lookUpCode
					+ "' and l.lookupstatus='" + status + "')");
		}
		if (moduleId != null) {
			sql.append(" and c.moduleid=" + moduleId);
		}
		if (status != null) {
			sql.append(" and c.lookupstatus = '" + status + "'");
		}
		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getCompanyLookUpByLookUp > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString());
		return query.list();
	}
}
