 

package com.base.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.CountryDAO;
import com.base.domain.mst.CountryDM;
import com.base.domain.mst.TimeZoneDM;

@Repository
public class CountryDAOImpl implements CountryDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(CountryDAOImpl.class);
	
	/**
	 * Return List from CountryDM, based on user's input
	 * 
	 * @param Long
	 *            countryid String countryCode, String countryName, String status, String filtertype
	 * @return CountryDM List
	 */
	@SuppressWarnings("unchecked")
	public List<CountryDM> getCountryList(Long countryid,Long timeZoneId, String countryCode, String countryName, String status,
			String filtertype) {
		logger.info("Inside getCountryList >  " + countryid + "," + countryCode + ", " + countryName + "," + status
				+ "," + filtertype);
		Query query = null;
		StringBuffer sql = new StringBuffer("select ");
		if (filtertype.equals("P")) {
			sql.append(" c.countryID as countryID, c.countryName as countryName, c.countryCode as countryCode");
			sql.append(" from CountryDM c where 1=1");
		} else if (filtertype.equals("T")) {
			sql.append(" c.countryID as countryID, c.countryName as countryName, c.countryCode as countryCode,c.timeZoneId as timeZoneId");
			sql.append(" from CountryDM c where 1=1");
		} else {
			sql.append(" c.countryID as countryID, c.countryName as countryName, c.countryCode as countryCode,");
			sql.append(" c.isdcode as isdcode, c.primaryLang as primaryLang,");
			sql.append(" c.countyStats as countyStats, c.lastupdateddt as lastupdateddt,");
			sql.append(" c.lastUpdateBy as lastUpdateBy, c.timeZoneId as timeZoneId, c.daylightsave as daylightsave, ");
			sql.append(" cl.clockadjust as clockAdjust, cl.timezonedesc as timeZoneDesc, cl.timezonecode as timezonename");
			sql.append(" from CountryDM c, TimeZoneDM cl  where cl.timezoneid = c.timeZoneId ");
		}
		
		
		if (countryid != null) {
			sql.append(" and c.countryID = '" + countryid + "'");
		}
		if (timeZoneId != null) {
			sql.append(" and c.timezoneid = "+timeZoneId);
		}
		
		if (countryCode != "" && countryCode != null) {
			sql.append(" and lower(c.countryCode) like lower('" + countryCode + "%')");
		}
		if (countryName != "" && countryName != null) {
			sql.append(" and lower(c.countryName) like lower('" + countryName + "%')");
		}
		if (status != null) {
			sql.append(" and c.countyStats =  '" + status + "'");
		}
		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getCountryList > Query > " + sql);
		 query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(CountryDM.class));
		return query.list();
	}
	
	/**
	 * Method for return list of getISDCodebyCountryId from CountryDM based on countryId
	 * 
	 * @param Long
	 *            countryId
	 * @return String isdcode
	 */
	public String getISDCodebyCountryId(Long countryId) {
		logger.info("Inside getISDCodebyCountryId " + countryId);
		String sql = "select c.isdcode from CountryDM c where c.countryID=" + countryId;
		logger.info("Inside getISDCodebyCountryId > Query > " + sql);
		Query query = sessionfactory.getCurrentSession().createQuery(sql);
		return String.valueOf(query.list().get(0)).toString();
	}
}