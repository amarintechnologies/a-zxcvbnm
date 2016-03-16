package com.hostel.dao.mst;

import java.util.List;

import com.base.domain.mst.StudentContactsDM;
import com.hostel.dm.mst.hostelDM;

public interface hostelDAO {
	/** Method for save or update hostelDM**/
	/**
	 * @param studCatObj of hostelDM
	 */
	public void saveorupdateDetails(hostelDM Obj);
	/** Get gethostelList  based on hostel_id**/
	/**
	 * To get gethostelList  based on hostel_id and  Name
	 * 
	 * @param Long hostel_id,Long company_id,String hostel_type,String status

	 * 
	 * @return list of hostelDM
	 */
	public List<hostelDM> gethostelList(Long hostel_id,Long company_id,String hostel_type,String status,String hostel_name);
}
