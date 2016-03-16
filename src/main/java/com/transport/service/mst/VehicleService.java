package com.transport.service.mst;

import java.util.List;

import com.transport.domain.mst.VehicleDM;

public interface VehicleService {
	/**
	 *     * Used to save or update the vehicle data into the database.    
	 *  * @param objvehicle         
	 */
	public void saveOrUpdateroute(VehicleDM objvehicle);

	/**
	 *  * used to Retrieve data from VehicleDM table based on given
	 * 
	 * Long vehiclid,Long routeid,String vehicleno,String status); 
	 * 
	 * @return List<VehicleDM>         
	 */

	public List<VehicleDM> getvehilelist(Long vehiclid, Long routeid,
			String vehicleno, String status);

	public void updateavailableseats(Long vehiclid, Long routeid,
			Long availableseats);
}
