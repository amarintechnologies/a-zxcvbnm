package com.transport.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.transport.dao.mst.VehicleDAO;
import com.transport.domain.mst.VehicleDM;

@Repository
public class VehicleDAOImpl implements VehicleDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(VehicleDAOImpl.class);

	/**
	 *     * Used to save or update the vehicle data into the database.    
	 *  * @param objvehicle         
	 */

	public void saveOrUpdateroute(VehicleDM objvehicle) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(objvehicle);
	}

	/**
	 *  * used to Retrieve data from VehicleDM table based on given
	 * 
	 * Long vehiclid,Long routeid,String vehicleno,String status); 
	 * 
	 * @return List<VehicleDM>         
	 */
	public List<VehicleDM> getvehilelist(Long vehiclid, Long routeid,
			String vehicleno, String status) {

		logger.info("Inside  getvehilelist >  " + "vehiclid " + vehiclid
				+ "routeid " + routeid + " vehicleno" + vehicleno + "status"
				+ status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.vehiclid as vehiclid,c.companyid as companyid,c.vehicleno as vehicleno,c.routeid as routeid,c.noofseats as noofseats,");
		sql.append(" c.status as status,c.lastupdateddt as lastupdateddt,c.lastupdatedby as lastupdatedby,c.availableseats as availableseats,r.routename as routename");
		sql.append(" from VehicleDM c,RouteDM r where 1=1");
		sql.append(" and c.routeid = r.routeid ");
		Query query = null;
		if (vehiclid != null) {
			sql.append(" and c.vehiclid =" + vehiclid);
		}

		if (routeid != null) {
			sql.append(" and c.routeid =" + routeid);
		}
		if (vehicleno != null && vehicleno.trim().length() > 0) {
			sql.append(" and lower(c.vehicleno)like lower('" + vehicleno
					+ "%')");
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(c.status)like lower('" + status + "%')");
		}
		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getvehilelist > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(VehicleDM.class));
		return query.list();
	}

	public void updateavailableseats(Long vehiclid, Long routeid,
			Long availableseats) {

		String query = "update VehicleDM u set  u.availableseats="
				+ availableseats + " where u.vehiclid=" + vehiclid
				+ " and u.routeid =" + routeid;
		sessionfactory.getCurrentSession().createQuery(query).executeUpdate();
	}

}
