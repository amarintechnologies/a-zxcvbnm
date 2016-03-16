package com.academic.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.StudentAttendDtlDAO;
import com.academic.domain.txn.StudentAttendDtlDM;
import com.base.daoimpl.mst.StudentDAOImpl;
import com.base.domain.mst.StudentDM;

@Repository
public class StudentAttendDtlDAOImpl implements StudentAttendDtlDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(StudentAttendDtlDAOImpl.class);

	/**
	 * Method for save or update StudentAttendDtlDM
	 * 
	 * @param studObj
	 *            of studObj
	 */
	public void saveStudentDetails(StudentAttendDtlDM studObj) {
		sessionFactory.getCurrentSession().saveOrUpdate(studObj);
	}

	public List<StudentAttendDtlDM> getStudentattdtlList(Long studentid,
			Long attendanceid, Long timetableDtlid, Long subjectid,
			String presentyn) {
		StringBuffer sql = new StringBuffer(" select ");
		sql.append("st.attendancedtlid as attendancedtlid,st.attendanceid as attendanceid,st.timetableDtlid as timetableDtlid,st.subjectid as subjectid,st.studentid as studentid,st.presentyn as presentyn,st.lastupdateddt as lastupdateddt,st.lastupdatedby as lastupdatedby,");
		sql.append("s.subjectName as subjectname, m.firstName as firstName,st.teacherid as teacherid,e.firstname as teachername,st.time as time");
		sql.append(" from StudentAttendDtlDM st,AcdSubjectDM s,StudentDM m,EmployeeDM e,TimetableDtlDM t,StudentAttendenceDM std where 1=1");
		sql.append("and st.subjectid=s.subjectId and st.studentid=m.studentId and t.ttabledtlid=st.timetableDtlid and e.employeeid = st.teacherid and std.attendanceid=st.attendanceid");
		Query query = null;
		if (studentid != null) {
			sql.append(" and st.studentid =" + studentid);
		}
		if (attendanceid != null) {
			sql.append(" and st.attendanceid =" + attendanceid);
		}
		if (timetableDtlid != null) {
			sql.append(" and st.timetableDtlid =" + timetableDtlid);
		}
		if (presentyn != null) {
			sql.append(" and st.presentyn='" + presentyn + "'");
		}
		if (subjectid != null) {
			sql.append(" and st.subjectid =" + subjectid);
		}
		// sql.append("order by st.lastupdateddt desc");
		logger.info("Inside getCityList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(StudentAttendDtlDM.class));
		return query.list();
	}

	public void updatestatus(Long attendancedtlid, String presentyn) {
		String query = "update StudentAttendDtlDM u set  u.presentyn='"
				+ presentyn + "' where u.attendancedtlid=" + attendancedtlid;
		sessionFactory.getCurrentSession().createQuery(query).executeUpdate();
	}

}
