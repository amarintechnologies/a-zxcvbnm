package com.academic.daoimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.TimetableDtlDAO;
import com.academic.domain.txn.TimetableDtlDM;

@Repository
public class TimetableDtlDAOImpl implements TimetableDtlDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(TimetableDtlDAOImpl.class);

	/**
	 * Used to save or update the Grading data into the database.      
	 * 
	 * @param TimetableDtlDM
	 *            timedtlobj         
	 */
	public void saveOrUpdatetimetableDtl(TimetableDtlDM timedtlobj) {
		sessionfactory.getCurrentSession().saveOrUpdate(timedtlobj);

	}

	/**
	 * used to Retrieve data from t_acd_timetable_dtl table based on given
	 * parameters.   
	 * 
	 * @param Long ttabledtlid, Long timetableid, Date workdate, Long subjectId,
	 *             Long employeeId, Long roomId    
	 * @return TimetableDtlDM List         
	 */
	public List<TimetableDtlDM> gettimeTableDtlList(Long ttabledtlid,
			Long timetableid, Date workdate, Long subjectId, Long employeeId,
			Long roomId, String holidayyn) {
		logger.info("Inside  gettimeTableDtlList >  " + "ttabledtlid "
				+ ttabledtlid + "timetableid " + timetableid + " workdate"
				+ workdate + "subjectId" + subjectId + "employeeId"
				+ employeeId + "roomId" + roomId);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" t.ttabledtlid as ttabledtlid,t.timetableid as timetableid,t.workdate as workdate,t.starttime as starttime,");
		sql.append(" t.endtime as endtime,t.subjectId as subjectId,t.employeeId as employeeId,t.roomId as roomId,t.holidayyn as holidayyn,");
		sql.append(" t.lastupdateddt as lastupdateddt,t.lastupdatedby as lastupdatedby,");
		sql.append(" s.subjectName as subjectName,e.firstname as firstname,r.roomName as roomName");
		sql.append(" from TimetableDtlDM t ,AcdSubjectDM s, EmployeeDM e,RoomsDM r where 1=1");
		sql.append(" and s.subjectId = t.subjectId and e.employeeid = t.employeeId and r.roomId = t.roomId ");

		Query query = null;
		if (ttabledtlid != null) {
			sql.append(" and t.ttabledtlid =" + ttabledtlid);
		}
		if (timetableid != null) {
			sql.append(" and t.timetableid =" + timetableid);
		}
		if (subjectId != null) {
			sql.append(" and t.subjectId =" + subjectId);
		}
		if (employeeId != null) {
			sql.append(" and t.employeeId =" + employeeId);
		}
		if (holidayyn != null && holidayyn.trim().length() > 0) {
			sql.append(" and lower(t.holidayyn)like lower('" + holidayyn
					+ "%')");
		}

		sql.append(" order by t.lastupdateddt desc");
		logger.info("Inside gettimeTableDtlList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(TimetableDtlDM.class));
		return query.list();
	}
}
