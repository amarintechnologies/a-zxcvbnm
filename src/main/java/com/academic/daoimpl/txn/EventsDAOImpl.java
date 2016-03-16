package com.academic.daoimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.EventsDAO;
import com.academic.domain.txn.BatchExamStudentDM;
import com.academic.domain.txn.EventsDM;
@Repository
public class EventsDAOImpl implements EventsDAO {
	@Autowired
	SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(EventsDAOImpl.class);
	public void saveOrUpdateEvents(EventsDM eventsObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(eventsObj);
		
	}

	public List<EventsDM> getEventsList(Long eventId, Long compId, Long empId,
			Long studId, Date eventDt, String eventType, String status,
			String filterType) {
		// TODO Auto-generated method stub
		logger.info("Inside  getEventsList >  " + "eventId" + eventId
				+ "compId " + compId);
		Query query = null;
		StringBuffer sql = new StringBuffer("select ");
		if (filterType.equals("P")) {
			sql.append(" mt.eventId as eventId,mt.compId as compId,mt.empId as empId,mt.studId as studId from EventsDM mt where 1=1 ");
		}else {
			sql.append(" mt.eventId as eventId,mt.compId as compId,mt.empId as empId,mt.studId as studId,mt.eventDt as eventDt,mt.eventType as eventType,mt.eventNote as eventNote,mt.status as status,mt.updatedDt as updatedDt,mt.updatedBy as updatedBy,");
			sql.append("st.firstName as studentName,et.firstname as empName");
			sql.append(" from EventsDM mt,StudentDM st,EmployeeDM et where 1=1 and st.studentId=mt.studId and et.employeeid=mt.empId");
			 	}
			 if (eventId != null) {
					sql.append(" and mt.eventId=" + eventId);
				}
				if (compId != null) {
					sql.append(" and mt.compId=" + compId);
				}
				if (empId != null) {
					sql.append(" and mt.empId=" + empId);
				}
				/*if (examDate != null) {
					sql.append(" and mt.examDate=" + examDate);
				}*/
				if (studId != null) {
					sql.append(" and mt.studId =" + studId);
				}
				if (eventDt != null) {
					sql.append(" and mt.eventDt=" + eventDt);
				}
				if (eventType != null) {
					sql.append(" and lower(mt.eventType) like lower('" + eventType + "%')");
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
								Transformers.aliasToBean(EventsDM.class));
				return query.list();
			
			 
	}
}
