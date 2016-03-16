
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.TimeZoneDAO;
import com.base.domain.mst.TimeZoneDM;

@Repository
public class TimeZoneDAOImpl implements TimeZoneDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(TimeZoneDAOImpl.class);
	
	/**
	 * Return list from TimeZoneDM based on user's input
	 * 
	 * @param String
	 *            timeZoneCode, String timeZoneDesc
	 * @return TimeZoneDM List
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<TimeZoneDM> getTimeZoneList(String timeZoneCode, String timeZoneDesc, String filtertype) {
		logger.info("Inside getTimeZoneList >  " + timeZoneCode + ", " + timeZoneDesc + "," + filtertype);
		StringBuffer sql = new StringBuffer("select ");
		if (filtertype.equals("P")) {
			sql.append(" c.timezoneid as timezoneid, c.timezonecode as timezonecode,c.timezonedesc as timezonedesc ");
		} else {
			sql.append(" c.timezoneid as timezoneid, c.timezonecode as timezonecode, ");
			sql.append(" c.timezonedesc as timezonedesc, c.clockadjust as clockadjust");
		}
		sql.append(" from TimeZoneDM c where 1=1");
		if (timeZoneCode != "" && timeZoneCode != null) {
			sql.append(" and lower(c.timezonecode) like lower('" + timeZoneCode + "%')");
		}
		if (timeZoneDesc != "" && timeZoneDesc != null) {
			sql.append(" and lower(c.timezonedesc) like lower('" + timeZoneDesc + "%')");
		}
		sql.append("  order by c.timezonecode asc");
		logger.info("Inside getTimeZoneList > SQL " + sql);
		Query query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(TimeZoneDM.class));
		logger.info("Inside getTimeZoneList >  " + query);
		return query.list();
	}
}
