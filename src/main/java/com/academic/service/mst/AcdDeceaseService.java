package com.academic.service.mst;

import java.util.List;

import com.academic.domain.mst.AcdDeceaseDM;



public interface AcdDeceaseService {
	/**
	 * Method for return BatchSubDM list based on user's parameters
	 * 
	 * @param brandName
	 *            ,status
	 * @return AcdDeceaseDM List
	 */
	public List<AcdDeceaseDM> getAcdDeceaseList(Long deceaseid,String deceasename,Long companyId,String status);
	/**
	 * Method for save and update AcdDeceaseDM data
	 * 
	 * @param obj
	 */
	public void saveOrUpdate(AcdDeceaseDM obj);

}
