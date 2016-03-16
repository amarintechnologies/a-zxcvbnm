package com.transport.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.transport.dao.mst.VehicleDAO;
import com.transport.domain.mst.VehicleDM;
import com.transport.service.mst.VehicleService;

public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private VehicleDAO VehicleDAO;
	private Logger logger = Logger.getLogger(VehicleServiceImpl.class);

	/**
	 *     * Used to save or update the vehicle data into the database.    
	 *  * @param objvehicle         
	 */
	@Transactional
	public void saveOrUpdateroute(VehicleDM objvehicle) {
		// TODO Auto-generated method stub
		VehicleDAO.saveOrUpdateroute(objvehicle);
	}

	/**
	 *  * used to Retrieve data from VehicleDM table based on given
	 * 
	 * Long vehiclid,Long routeid,String vehicleno,String status); 
	 * 
	 * @return List<VehicleDM>         
	 */
	@Transactional
	public List<VehicleDM> getvehilelist(Long vehiclid, Long routeid,
			String vehicleno, String status) {
		return VehicleDAO.getvehilelist(vehiclid, routeid, vehicleno, status);
	}

	@Transactional
	public void updateavailableseats(Long vehiclid, Long routeid,
			Long availableseats) {
		// TODO Auto-generated method stub
		VehicleDAO.updateavailableseats(vehiclid, routeid, availableseats);

	}
}