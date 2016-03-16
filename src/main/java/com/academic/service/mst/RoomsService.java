package com.academic.service.mst;

import java.util.List;

import com.academic.domain.mst.RoomsDM;

public interface RoomsService {
	/**
	 * Method for save or update RoomsDM details
	 * 
	 * @param objroomsDM
	 *            of RoomsDM
	 */
	public void saveAndUpdateRooms(RoomsDM objroomsDM);

	/**
	 * Method to return list from RoomsDM, based on user's parameters
	 * 
	 * @param Long roomId, Long buildingId,
			String roomName, Long seatCapacity, String status
	 * @return RoomsDM List
	 */
	public List<RoomsDM> getRoomsList(Long roomId, Long buildingId,
			String roomName, Long seatCapacity, String status);
}
