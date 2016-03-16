package com.hostel.daoimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.domain.txn.EventsDM;
import com.erputil.util.DateUtils;
import com.hostel.dao.mst.HostalRoomAllocationDAO;
import com.hostel.dm.mst.HostalRoomAllocationDM;

@Repository
public class HostalRoomAllocationDAOImpl implements HostalRoomAllocationDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(HostalRoomAllocationDAOImpl.class);

	public void saveOrUpdateHostalRmAll(HostalRoomAllocationDM hostRmAllObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(hostRmAllObj);
	}

	public List<HostalRoomAllocationDM> getHostalRmAlList(Long rmAllId,
			Long hostId, Long roomId, Long batchId, Long studId, String status,
			String filterType, Date startDt, Date endDt) {
		// TODO Auto-generated method stub
		logger.info("Inside  getHostalRmAlList >  " + "rmAllId" + rmAllId
				+ "hostId " + hostId);
		Query query = null;
		StringBuffer sql = new StringBuffer("select ");
		if (filterType.equals("P")) {
			sql.append(" mt.rmAllId as rmAllId,mt.hostId as hostId,mt.roomId as roomId,mt.batchId as batchId,mt.studId as studId from HostalRoomAllocationDM mt where 1=1 ");
		} else {
			sql.append(" mt.rmAllId as rmAllId,mt.hostId as hostId,mt.roomId as roomId,mt.batchId as batchId,mt.studId as studId,mt.startDt as startDt,mt.endDt as endDt,mt.remarks as remarks,mt.status as status,mt.updatedDt as updatedDt,mt.updatedBy as updatedBy,");
			sql.append("st.firstName as studentName,ht.hostel_name as hostalName,bt.batch_name as batchName,rm.room_no as roomNo");
			sql.append(" from HostalRoomAllocationDM mt,StudentDM st,AcdbatchDM bt,hostelDM ht,roomDM rm where 1=1 and st.studentId=mt.studId and ht.hostel_id=mt.hostId and rm.room_id=mt.roomId and bt.batch_id=mt.batchId");

		}
		if (rmAllId != null) {
			sql.append(" and mt.rmAllId=" + rmAllId);
		}
		if (hostId != null) {
			sql.append(" and mt.hostId=" + hostId);
		}
		if (roomId != null) {
			sql.append(" and mt.roomId=" + roomId);
		}
		if (startDt != null && endDt != null) {

			sql.append(" and mt.startDt between '"
					+ DateUtils.datetostringsimp(startDt) + "' and '"
					+ DateUtils.datetostringsimp(endDt) + "'");
		}

		/*
		 * if (examDate != null) { sql.append(" and mt.examDate=" + examDate); }
		 */

		if (batchId != null) {
			sql.append(" and mt.batchId =" + batchId);
		}
		if (studId != null) {
			sql.append(" and mt.studId=" + studId);
		}
		if (status != null) {
			sql.append(" and lower(mt.status) like lower('" + status + "%')");
		}

		sql.append(" order by mt.updatedDt desc");
		logger.info("Inside getEventsList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(HostalRoomAllocationDM.class));
		return query.list();

	}

}
