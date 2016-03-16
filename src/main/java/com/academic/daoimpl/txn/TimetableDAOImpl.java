package com.academic.daoimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.TimetableDAO;
import com.academic.daoimpl.mst.GradingDAOImpl;
import com.academic.domain.mst.GradingDM;
import com.academic.domain.txn.TimetableDM;
import com.erputil.util.DateUtils;

@Repository
public class TimetableDAOImpl implements TimetableDAO {

	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(TimetableDAOImpl.class);

	/**
	 * Used to save or update the Timetable data into the database.      
	 * 
	 * @param TimetableDM
	 *            timetableobj         
	 */
	public void saveOrUpdateTimetable(TimetableDM timetableobj) {
		sessionfactory.getCurrentSession().saveOrUpdate(timetableobj);

	}

	/**
	 * used to Retrieve data from t_acd_timetable table based on given
	 * parameters.   
	 * 
	 * @param Long timetableId, Long companyId, String batchname, String
	 *             timingname, Date startDate, Date endDate, String status
	 * @return TimetableDM List         
	 */
	public List<TimetableDM> getTimetableList(Long timetableId, Long companyId,
			String batchname, String timingname, Date startDate, Date endDate,
			String status, Long courseid, Long batchId, Long classtimeId) {
		logger.info("Inside  getTimetableList >  " + "timetableId "
				+ timetableId + "companyId " + companyId + " batchname"
				+ batchname + "timingname" + timingname + "startDate"
				+ startDate + "endDate" + "status" + status);

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" t.timetableId as timetableId,t.companyId as companyId,t.batchId as batchId,t.classtimeId as classtimeId,");
		sql.append(" t.startDate as startDate,t.endDate as endDate,t.remarks as remarks,t.status as status,");
		sql.append(" t.lastupdateddt as lastupdateddt,t.lastupdatedby as lastupdatedby,t.courseid as courseid,");
		sql.append(" b.batch_name as batchname,c.timingname as timingname,a.course_name as coursename ");
		sql.append(" from TimetableDM t, AcdbatchDM b ,ClasstimingDM c, AcdCourseDM a where 1=1 ");
		sql.append(" and b.batch_id = t.batchId and c.classtimeid = t.classtimeId and a.course_id =t. courseid");
		Query query = null;
		if (timetableId != null) {
			sql.append(" and t.timetableId =" + timetableId);
		}
		if (companyId != null) {
			sql.append(" and t.companyId =" + companyId);
		}
		if (batchId != null) {
			sql.append(" and t.batchId =" + batchId);
		}
		if (courseid != null) {
			sql.append(" and t.courseid =" + courseid);
		}
		if (startDate != null && endDate != null) {

			sql.append(" and t.startDate between '"
					+ DateUtils.datetostringsimp(startDate) + "' and '"
					+ DateUtils.datetostringsimp(endDate) + "'");
		}
		if (classtimeId != null) {
			sql.append(" and t.classtimeId =" + classtimeId);
		}

		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(t.status)like lower('" + status + "%')");
		}
		sql.append(" order by t.lastupdateddt desc");
		logger.info("Inside getTimetableList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(TimetableDM.class));
		return query.list();
	}

}
