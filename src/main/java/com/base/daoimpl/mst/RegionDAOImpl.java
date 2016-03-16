
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.RegionDAO;
import com.base.domain.mst.RegionDM;

@Repository
public class RegionDAOImpl implements RegionDAO {
	/** @Autowired refers that integrating the spring concepts that is using for linking with specified class **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(RegionDAOImpl.class);
	@Value("${GET_REGION_LIST}")
	private String stringSql;
	
	/**
	 * Used to save or update the RegionDM data into the database.         
	 * 
	 * @param regionObj
	 *                    
	 */
	public void saveOrUpdateRegion(RegionDM regionObj) {
		logger.info("Inside saveOrUpdateRegion > " + regionObj.getCompanyid() + ", " + regionObj.getRegionName());
		sessionFactory.getCurrentSession().saveOrUpdate(regionObj);
	}
	
	/**
	 * used to Retrieve data from RegionDM table based on given parameters.         
	 * 
	 * @param String
	 *            regionName, String status, Long countryId, Long companyId, String filtertype         
	 * @return List<RegionDM>         
	 */
	@SuppressWarnings("unchecked")
	public List<RegionDM> getRegionList(String regionName, String status, Long countryId, Long companyId,
			String filtertype) {
		logger.info("Inside getRegionList > " + regionName + ", " + status + ", " + countryId + "," + companyId + ","
				+ filtertype);
		StringBuffer sql = new StringBuffer("select  ");
		if (filtertype.equals("P")) {
			sql.append(" new RegionDM(regionId,regionName) from RegionDM r where 1=1");
		} else {
			sql.append(" r.regionId as regionId, r.regionName as regionName, r.countryId as countryId, ");
			sql.append("r.status as status, r.lastUpdatedDt as lastUpdatedDt, r.lastUpdatedBy as lastUpdatedBy, ");
			sql.append("c.countryName as countryname");
			sql.append(" from RegionDM r, CountryDM c where r.countryId = c.countryID");
		}
		
		if (regionName != null && regionName.trim().length() > 0) {
			sql.append(" and lower(r.regionName) like lower( '" + regionName + "%')");
		}
		if (status != null) {
			sql.append(" and r.status = '" + status + "'");
		}
		if (countryId != null && countryId != 0L) {
			sql.append(" and r.countryId= " + countryId);
		}
		if (companyId != null) {
			sql.append(" and r.companyid= " + companyId);
		}
		sql.append(" order by r.lastUpdatedDt desc");
		Query query;
		if (filtertype.equals("P")) {
			query = sessionFactory.getCurrentSession().createQuery(sql.toString());
		} else {
			query = sessionFactory.getCurrentSession().createQuery(sql.toString())
					.setResultTransformer(Transformers.aliasToBean(RegionDM.class));
		}
		logger.info("getRegionList SQL> " + query);
		return query.list();
	}
}
