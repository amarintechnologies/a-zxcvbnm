package com.hostel.dao.mst;

import java.util.List;

import com.hostel.dm.mst.hostelDM;
import com.hostel.dm.mst.roomDM;

public interface roomDAO {
	/** Method for save or update roomDM **/
	/**
	 * @param Obj
	 *            of roomDM
	 */
	public void saveorupdateDetails(roomDM Obj);

	/** Get getroomList based on room_id **/
	/**
	 * To get getroomList based on room_id and Name
	 * 
	 * @param Long
	 *            Obj,Long hostel_id,Long company_id,String room_type,String
	 *            status
	 * 
	 * 
	 * @return list of roomDM
	 */
	public List<roomDM> getroomList(Long room_id, Long hostel_id,
			Long company_id, String room_type, String status);

	public void updatefreebeds(Long room_id, Long free_beds);
}
