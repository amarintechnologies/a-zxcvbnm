
package com.base.service.mst;

import java.util.List;

import com.base.domain.mst.SlnoGenDM;

public interface SlnoGenService {
	/**
	 * To get serial number generation list based on user's input
	 * 
	 * @param Long
	 *            SlnoId, Long companyid, String refkey, Long branchId, Long moduleId, String slnoGenLvl
	 * 
	 * @return List of SlnoGenDM
	 */
	public List<SlnoGenDM> getSlnoGenerationList(Long SlnoId, Long companyid, String refkey, Long branchId,
			String slnoGenLvl,String filtertype);
	
	/**
	 * To saveOrUpdate details
	 * 
	 * @param SlnoGenDM
	 *            slnoObj
	 * 
	 */
	public void saveorupadateSlnoGeneration(SlnoGenDM slnoObj);
	
	/**
	 * To get sequence number
	 * 
	 * @param Long
	 *            companyid,Long branchid,Long moduleid,String refkey
	 * 
	 * @return String sequence
	 * 
	 */
	public List<SlnoGenDM> getSequenceNumber(Long companyid, Long branchid, String refkey);
	
	/**
	 * To update sequence number
	 * 
	 * @param Long
	 *            companyid,Long branchid,Long moduleid,String refkey
	 * 
	 */
	public void updateNextSequenceNumber(Long companyid, Long branchid, String refkey);
}
