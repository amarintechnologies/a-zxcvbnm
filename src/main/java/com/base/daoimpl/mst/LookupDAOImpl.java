
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.LookupDAO;
import com.base.domain.mst.LookupDM;

@Repository
public class LookupDAOImpl implements LookupDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(LookupDAOImpl.class);
	
	/**
	 * Method for save or update LookupDM details
	 * 
	 * @param lookupObj
	 *            of LookupDM
	 */
	public void saveAndUpdateDetails(LookupDM lookupObj) {
		logger.info("Inside saveAndUpdateDetails > ");
		sessionFactory.getCurrentSession().saveOrUpdate(lookupObj);
	}
	
	/**
	 * Return List from LookupDAO, based on user's input
	 * 
	 * @param String
	 *            moduleId, String lookUpcode, String lookUpdesc,String status,String filterType
	 * @return LookupDM List
	 * 
	 */
	public List<LookupDM> getLookupList(Long moduleId, String lookUpcode, String lookUpdesc, String status,
			String filterType) {
		StringBuilder sql = new StringBuilder("select ");
		if (filterType.equals("P")) {
			sql.append(" l.lookupid as lookupid, l.lookupcode as lookupcode  from LookupDM l where 1=1 ");
		} else if (filterType.equals("D")) {
			sql.append(" l.lookupid as lookupid, l.lookupcode as lookupcode,l.lookupdesc as lookupdesc  from LookupDM l where 1=1 ");
		} else {
			sql.append(" l.lookupid as lookupid, l.lookupcode as lookupcode, ");
			sql.append(" l.lookupdesc as lookupdesc, l.lookupstatus as lookupstatus, l.lastupdateddt as lastupdateddt,");
			sql.append(" l.lastupdateddt as lastupdateddt, l.lastupdatedby as lastupdatedby, l.moduleId as moduleId ");
			sql.append(" from LookupDM l, ModuleDM m where 1=1 ");
			sql.append(" and l.moduleId = m.moduleId");
		}
		Query query = null;
		if (moduleId != null && moduleId != 0) {
			sql.append(" and l.moduleId =" + moduleId);
		}
		if (lookUpcode != "" && lookUpcode != null) {
			sql.append(" and lower(l.lookupcode) like lower('" + lookUpcode + "%')");
		}
		if (lookUpdesc != null && lookUpdesc !="0L") {
			sql.append(" and l.lookUpdesc =" + lookUpdesc);
		}		
		
		if (status != null) {
			sql.append(" and l.lookupstatus = '" + status + "'");
			;
		}
		sql.append(" order by l.lastupdateddt desc");
		logger.info(" Inside getLookupList > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(LookupDM.class));
		return query.list();
	}
}
