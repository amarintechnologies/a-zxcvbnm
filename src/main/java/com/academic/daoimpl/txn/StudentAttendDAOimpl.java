package com.academic.daoimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.StudentAttendDAO;
import com.academic.domain.txn.BatchSubDM;
import com.academic.domain.txn.StudentAttendenceDM;

@Repository
public class StudentAttendDAOimpl implements StudentAttendDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(StudentAttendDAOimpl.class);

	public List<StudentAttendenceDM> getStudentAttendenceList(Long companyid,
			Long timetableid, Long batchid, Long courseid, Long attendanceid,
			Date workdate) {
		// TODO Auto-generated method stub
		logger.info("Inside getBatchSubList >  " + companyid + ","
				+ timetableid + ", " + batchid);
		StringBuffer sql = new StringBuffer(" Select ");
		sql.append(" sa.attendanceid as attendanceid,sa.companyid as companyid,sa.timetableid as timetableid,sa.batchid as batchid,");

		sql.append("sa.lastupdateddt as lastupdateddt,sa.lastupdatedby as lastupdatedby,sa.courseid as courseid,");
		sql.append("ab.batch_name as batch_name,sa.workdate as workdate,co.course_name as course_name ");
		sql.append(" from StudentAttendenceDM sa,AcdbatchDM ab,AcdCourseDM co,TimetableDM ti where 1=1 ");
		sql.append(" and ab.batch_id = sa.batchid and co.course_id=sa.courseid and sa.timetableid=ti.timetableId ");

		Query query = null;
		if (companyid != null) {
			sql.append(" and sa.batchid=" + companyid);
		}
		if (timetableid != null) {
			sql.append(" and sa.timetableid=" + timetableid);
		}

		if (batchid != null) {
			sql.append(" and sa.batchid=" + batchid);
		}
		if (attendanceid != null) {
			sql.append(" and sa.attendanceid=" + attendanceid);
		}

		if (courseid != null) {
			sql.append(" and sa.courseid=" + courseid);
		}

		sql.append(" order by sa.lastupdateddt desc");
		logger.info("Inside getBatchSubList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(StudentAttendenceDM.class));
		return query.list();
	}

	public void saveOrUpdate(StudentAttendenceDM obj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAssetBrandDetails > " + obj.getCompanyid()
				+ ", " + obj.getCompanyid());
		sessionfactory.getCurrentSession().saveOrUpdate(obj);
	}

	public void updatetime(Long attendanceid, Long timetableid) {
		String query = "update StudentAttendenceDM u set  u.timetableid="
				+ timetableid + " where u.attendanceid=" + attendanceid;
		sessionfactory.getCurrentSession().createQuery(query).executeUpdate();
	}

}
