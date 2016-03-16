package com.hostel.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.EventsDAO;
import com.academic.serviceimpl.txn.EventsServiceImpl;
import com.hostel.dao.mst.roomDAO;
import com.hostel.dm.mst.roomDM;
import com.hostel.service.mst.roomService;

public class roomServiceimpl implements roomService {
	@Autowired
	private roomDAO roomsdao;
	private Logger logger = Logger.getLogger(roomServiceimpl.class);

	/**
	 * Used to save or update the Comments data into the database.              
	 */
	@Transactional
	public void saveorupdateDetails(roomDM Obj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveOrUpdateState > "
				+ "About to save the data ... ");
		roomsdao.saveorupdateDetails(Obj);
	}

	@Transactional
	public List<roomDM> getroomList(Long room_id, Long hostel_id,
			Long company_id, String room_type, String status) {
		// TODO Auto-generated method stub
		return roomsdao.getroomList(room_id, hostel_id, company_id, room_type,
				status);
	}

	@Transactional
	public void updatefreebeds(Long room_id, Long free_beds) {
		// TODO Auto-generated method stub
		roomsdao.updatefreebeds(room_id, free_beds);

	}

}
