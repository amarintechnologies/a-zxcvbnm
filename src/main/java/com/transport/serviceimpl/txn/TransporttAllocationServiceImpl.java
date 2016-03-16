package com.transport.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.transport.dao.txn.FeeColloectionDAO;
import com.transport.dao.txn.TransporttAllocationDAO;
import com.transport.domain.txn.TransporttAllocationDM;
import com.transport.service.txn.TransporttAllocationService;

public class TransporttAllocationServiceImpl implements
		TransporttAllocationService {
	@Autowired
	private TransporttAllocationDAO transporttAllocationDAO;
	private Logger logger = Logger
			.getLogger(TransporttAllocationServiceImpl.class);

	/**
	 * Used to save or update the events data into the database.      
	 * 
	 * @param TransporttAllocationDM
	 *            hostRmAllObj         
	 */
	@Transactional
	public void saveOrUpdateTransprtAllc(TransporttAllocationDM hostRmAllObj) {
		transporttAllocationDAO.saveOrUpdateTransprtAllc(hostRmAllObj);
	}

	/**
	 * used to Retrieve data from TransporttAllocationDM based on given
	 * parameters.   
	 * 
	 * @param Long trnsAllcid, Long routeId, Long roomId, Long rootStopId,Long
	 *             batchId, Long studId,String status
	 */
	@Transactional
	public List<TransporttAllocationDM> getTransprtAllc(Long trnsAllcid,
			Long routeId, Long empId, Long rootStopId, Long batchId,
			Long studId, String status, Date startDt, Date endDt) {

		return transporttAllocationDAO.getTransprtAllc(trnsAllcid, routeId,
				empId, rootStopId, batchId, studId, status, startDt, endDt);
	}

}
