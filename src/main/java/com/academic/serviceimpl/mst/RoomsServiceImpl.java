package com.academic.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.mst.GradingDAO;
import com.academic.dao.mst.RoomsDAO;
import com.academic.domain.mst.RoomsDM;
import com.academic.service.mst.RoomsService;

public class RoomsServiceImpl implements RoomsService {
	@Autowired
	private RoomsDAO roomsDAO;
	private Logger logger = Logger.getLogger(GradingServiceImpl.class);

	/**
	 * Method for save or update RoomsDM details
	 * 
	 * @param objroomsDM
	 *            of RoomsDM
	 */
	@Transactional
	public void saveAndUpdateRooms(RoomsDM objroomsDM) {
		roomsDAO.saveAndUpdateRooms(objroomsDM);
	}

	/**
	 * Method to return list from RoomsDM, based on user's parameters
	 * 
	 * @param Long
	 *            roomId, Long buildingId, String roomName, Long seatCapacity,
	 *            String status
	 * @return RoomsDM List
	 */
	@Transactional
	public List<RoomsDM> getRoomsList(Long roomId, Long buildingId,
			String roomName, Long seatCapacity, String status) {
		return roomsDAO.getRoomsList(roomId, buildingId, roomName,
				seatCapacity, status);
	}
}
