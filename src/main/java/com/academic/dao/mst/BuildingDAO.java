package com.academic.dao.mst;

import java.util.Date;
import java.util.List;

import com.academic.domain.mst.BuildingDM;

public interface BuildingDAO {
	/**
	 *     * Used to save or update the BuildingDM data into the database.    
	 *  * @param objBuildingDM         
	 */
	public void saveOrUpdateBuilding(BuildingDM objBuildingDM);

	/**
	 *  * used to Retrieve data from ApplicantDM table based on given
	 * parameters.
	 * 
	 * @paramLong buildingId, Long companyId, String buildingName, String
	 *            lastName, Long batchId, Date dob, String nationality, Long
	 *            noOfRooms, String status
	 * 
	 *                @return List<BuildingDM>         
	 */
	public List<BuildingDM> getBuildingList(Long buildingId, Long companyId,
			String buildingName, Long noOfRooms, String status);
}
