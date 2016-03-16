package com.hostel.serviceimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.EventsDAO;
import com.academic.serviceimpl.txn.EventsServiceImpl;
import com.hostel.dao.mst.HostalRoomAllocationDAO;
import com.hostel.dm.mst.HostalRoomAllocationDM;
import com.hostel.service.mst.HostalRoomAllocationService;

public class HostalRoomAllocationServiceImpl implements
		HostalRoomAllocationService {
	@Autowired
	private HostalRoomAllocationDAO hostalRmAlloDAO;
	private Logger logger = Logger.getLogger(EventsServiceImpl.class);

	/**
	 * Used to save or update the Comments data into the database.              
	 */
	@Transactional
	public void saveOrUpdateHostalRmAll(HostalRoomAllocationDM hostRmAllObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveOrUpdateState > "
				+ "About to save the data ... ");
		hostalRmAlloDAO.saveOrUpdateHostalRmAll(hostRmAllObj);
	}

	@Transactional
	public List<HostalRoomAllocationDM> getHostalRmAlList(Long rmAllId,
			Long hostId, Long roomId, Long batchId, Long studId, String status,
			String filterType, Date startDt, Date endDt) {

		// TODO Auto-generated method stub
		return hostalRmAlloDAO.getHostalRmAlList(rmAllId, hostId, roomId,
				batchId, studId, status, filterType, startDt, endDt);

	}

}
