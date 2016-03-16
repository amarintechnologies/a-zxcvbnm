package com.transport.dao.txn;

import java.util.Date;
import java.util.List;

import com.transport.domain.txn.TransporttAllocationDM;

public interface TransporttAllocationDAO {

	/**
	 * Used to save or update the events data into the database.      
	 * 
	 * @param TransporttAllocationDM
	 *            hostRmAllObj         
	 */
	public void saveOrUpdateTransprtAllc(TransporttAllocationDM hostRmAllObj);

	/**
	 * used to Retrieve data from TransporttAllocationDM based on given
	 * parameters.   
	 * 
	 * @param Long trnsAllcid, Long routeId, Long roomId, Long rootStopId,Long
	 *             batchId, Long studId,String status
	 */
	public List<TransporttAllocationDM> getTransprtAllc(Long trnsAllcid,
			Long routeId, Long empId, Long rootStopId, Long batchId,
			Long studId, String status,Date startDt,Date endDt);

}
