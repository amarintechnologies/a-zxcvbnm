
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.CityDAO;
import com.base.domain.mst.CityDM;
import com.base.domain.mst.StateDM;

@Repository
public class CityDAOImpl implements CityDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(CityDAOImpl.class);
	
	/**
	 * To saveAndUpdate details
	 * 
	 * @param CityDM
	 *            cityobj
	 * 
	 */
	public void saveAndUpdateCitydetails(CityDM cityObj) {
		logger.info("Inside saveAndUpdate > " + cityObj.getCompanyid() + ", " + cityObj.getCityname());
		sessionfactory.getCurrentSession().saveOrUpdate(cityObj);
	}
	
	/**
	 * To return data from City based on user's input
	 * 
	 * @param Long
	 *            cityid
	 * @param String
	 *            cityName
	 * @param Long
	 *            stateId
	 * @param String
	 *            status
	 * @param Long
	 *            companyId
	 * @param String
	 *            filtertype
	 * @return List
	 */
	public List<CityDM> getCityList(Long cityid, String cityName, Long stateId, String status, Long companyId,
			String filtertype) {
		logger.info("Inside getCityList > " + cityid + "," + cityName + ", " + stateId + "," + status + "," + companyId
				+ "," + filtertype);
		Query query = null;
		StringBuffer sql = new StringBuffer("select");
		if (filtertype.equals("P")) {
			sql.append(" c.cityid as cityid ,c.cityname as cityname from CityDM c where 1 = 1 ");
		} else {
			sql.append(" c.cityid as cityid,c.cityname as cityname,c.tier as tier,c.status as status,c.companyid as companyid,");
			sql.append(" c.lastupdateddt as lastupdateddt,c.lastupdatedby as lastupdatedby,c.countryid as countryid");
			sql.append(",c.regionId as regionId,c.stateId as stateId,c.timezoneid as timezoneid,");
			sql.append(" s.stateName as statename,r.regionName as regionname,n.countryName as countryname,t.timezonedesc as timezonedesc,t.timezonecode as timezonename");
			
			sql.append("  from CityDM c,StateDM s,RegionDM r,CountryDM n,TimeZoneDM t where 1=1 and c.stateId=s.stateId ");
			sql.append(" and r.regionId=c.regionId and n.countryID=c.countryid and t.timezoneid=c.timezoneid");
		}
		if (cityid != null ) {
			sql.append(" and c.cityid = " + cityid);
		}
		if (cityName != "" && cityName != null) {
			sql.append(" and lower(c.cityname) like lower('" + cityName + "%')");
		}
		if (stateId != null && stateId !=0 ) {
			sql.append(" and c.stateId = " + stateId);
		}
		if (status != null) {
			sql.append(" and c.status = '" + status + "'");
		}
		if (companyId != null) {
			sql.append(" and c.companyid = " + companyId);
		}
		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getCitytList > Query > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(CityDM.class));
		return query.list();
	}
}
