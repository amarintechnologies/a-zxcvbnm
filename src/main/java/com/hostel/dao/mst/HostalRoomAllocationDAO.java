package com.hostel.dao.mst;

import java.util.Date;
import java.util.List;

import com.academic.domain.txn.EventsDM;
import com.hostel.dm.mst.HostalRoomAllocationDM;

public interface HostalRoomAllocationDAO {
	/**
	 * Used to save or update the events data into the database.      
	 * 
	 * @param HostalRoomAllocationDM hostRmAllObj
	 *                    
	 */
	public void saveOrUpdateHostalRmAll(HostalRoomAllocationDM hostRmAllObj);

	/**
	 * used to Retrieve data from t_acd_events table based on given parameters.   
	 * 
	 * @param Long rmAllId, Long hostId, Long roomId,Long batchId,Long studId,String status,String filterType
	 */
	public List<HostalRoomAllocationDM> getHostalRmAlList(Long rmAllId, Long hostId, Long roomId,Long batchId,Long studId,String status,String filterType,Date startDt,Date endDt);
}
