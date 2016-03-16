
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.CurrencyDAO;
import com.base.domain.mst.CurrencyDM;

@Repository
public class CurrencyDAOImpl implements CurrencyDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(CurrencyDAOImpl.class);
	
	/**
	 * Return List of CurrencyDM, based on user's input
	 * 
	 * @param String currencyCode
	 * @param String currencyName
	 * @param String status
	 * @param String filtertype
	 * @return CurrencyDM List
	 * 
	 */
	public List<CurrencyDM> getCurrencyList(Long currencyId, String currencyCode, String currencyName, String status,
			String filtertype) {
		logger.info("Inside getCurrencyList >  " + currencyId + ", " + currencyCode + "," + currencyName + "," + status
				+ "," + filtertype);
		Query query = null;
		StringBuffer sql = new StringBuffer(" select");
		if (filtertype.equals("P")) {
			sql.append(" new CurrencyDM(ccyid,ccycode,ccyname)");
		} else {
			sql.append(" c");
		}
		sql.append(" from CurrencyDM c where 1=1");
		if (currencyId != null) {
			sql.append(" and c.ccyid = '" + currencyId + "'");
		}
		if (currencyCode != "" && currencyCode != null) {
			sql.append(" and lower(c.ccycode) like lower('" + currencyCode + "%')");
		}
		if (currencyName != "" && currencyName != null) {
			sql.append(" and lower(c.ccyname) like lower('" + currencyName + "%')");
		}
		if (status != null) {
			sql.append(" and c.ccystatus =  '" + status + "'");
		}
		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getCurrencyList > Query > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString());
		return query.list();
	}
}
