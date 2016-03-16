package com.academic.daoimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.mst.BuildingDAO;
import com.academic.domain.mst.BuildingDM;

@Repository
public class BuildingDAOImpl implements BuildingDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(BuildingDAOImpl.class);

	/**
	 *     * Used to save or update the BuildingDM data into the database.    
	 *  * @param objBuildingDM         
	 */
	public void saveOrUpdateBuilding(BuildingDM objBuildingDM) {
		sessionFactory.getCurrentSession().saveOrUpdate(objBuildingDM);
	}

	/**
	 *  * used to Retrieve data from ApplicantDM table based on given
	 * parameters.
	 * 
	 * @paramLong Long buildingId, Long companyId, String buildingName, Long
	 *            noOfRooms, String status
	 * 
	 *                @return List<BuildingDM>         
	 */
	public List<BuildingDM> getBuildingList(Long buildingId, Long companyId,
			String buildingName, Long noOfRooms, String status) {

		StringBuffer sql = new StringBuffer(" select ");

		sql.append(" c from BuildingDM c where 1=1");
		Query query = null;

		if (buildingId != null) {
			sql.append(" and c.buildingId=" + buildingId);
		}
		if (companyId != null) {
			sql.append(" and c.companyId=" + companyId);
		}

		if (buildingName != null && buildingName.trim().length() > 0) {
			sql.append(" and lower(c.buildingName) like lower('" + buildingName
					+ "%')");
		}

		if (status != null) {
			sql.append(" and c.status = '" + status + "'");
		}

		sql.append(" order by c.lastUpdatedDt desc");
		logger.info("Inside getBuildingList > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString());
		return query.list();
	}
}
