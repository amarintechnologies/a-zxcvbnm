package com.academic.daoimpl.mst;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.mst.RoomsDAO;
import com.academic.domain.mst.BuildingDM;
import com.academic.domain.mst.GradingDtlDM;
import com.academic.domain.mst.RoomsDM;

@Repository
public class RoomsDAOImpl implements RoomsDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(RoomsDAOImpl.class);

	/**
	 * Method for save or update RoomsDM details
	 * 
	 * @param objroomsDM
	 *            of RoomsDM
	 */
	public void saveAndUpdateRooms(RoomsDM objroomsDM) {
		sessionfactory.getCurrentSession().saveOrUpdate(objroomsDM);
	}

	/**
	 * Method to return list from RoomsDM, based on user's parameters
	 * 
	 * @param Long
	 *            roomId, Long buildingId, String roomName, Long seatCapacity,
	 *            String status
	 * @return RoomsDM List
	 */
	public List<RoomsDM> getRoomsList(Long roomId, Long buildingId,
			String roomName, Long seatCapacity, String status) {

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" g.roomId as roomId,g.buildingId as buildingId,g.roomName as roomName ,g.seatCapacity as seatCapacity,");
		sql.append(" g.remarks as remarks,g.remarks as remarks,g.status as status,g.lastUpdatedDt as lastUpdatedDt,g.lastUpdatedBy "
				+ " as lastUpdatedBy");
		sql.append(" from RoomsDM g , BuildingDM b where 1=1 ");
		sql.append(" and g.buildingId =b.buildingId");

		Query query = null;
		if (roomId != null) {
			sql.append(" and g.roomId =" + roomId);
		}
		if (buildingId != null) {
			sql.append(" and g.buildingId =" + buildingId);
		}
		if (roomName != null && roomName.trim().length() > 0) {
			sql.append(" and lower(g.roomName)like lower('" + roomName + "%')");
		}
		if (seatCapacity != null) {
			sql.append(" and g.seatCapacity =" + seatCapacity);
		}

		if (status != null) {
			sql.append(" and g.status='" + status + "'");
		}
		sql.append(" order by g.lastUpdatedDt desc");
		logger.info("Inside getRoomsList > Query > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(RoomsDM.class));
		return query.list();
	}
}
