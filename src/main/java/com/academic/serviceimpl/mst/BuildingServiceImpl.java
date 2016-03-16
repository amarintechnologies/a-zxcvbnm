package com.academic.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.mst.ApplicantDAO;
import com.academic.dao.mst.BuildingDAO;
import com.academic.domain.mst.BuildingDM;
import com.academic.service.mst.BuildingService;

public class BuildingServiceImpl implements BuildingService {
	@Autowired
	private BuildingDAO buildingDAO;
	private Logger logger = Logger.getLogger(ApplicantServiceImpl.class);

	/**
	 *     * Used to save or update the BuildingDM data into the database.    
	 *  * @param objBuildingDM         
	 */
	@Transactional
	public void saveOrUpdateBuilding(BuildingDM objBuildingDM) {
		buildingDAO.saveOrUpdateBuilding(objBuildingDM);
	}

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
	@Transactional
	public List<BuildingDM> getBuildingList(Long buildingId, Long companyId,
			String buildingName, Long noOfRooms, String status) {
		return buildingDAO.getBuildingList(buildingId, companyId, buildingName,
				noOfRooms, status);
	}
}
