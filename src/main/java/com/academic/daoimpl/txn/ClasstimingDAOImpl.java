package com.academic.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.ClasstimingDAO;
import com.academic.domain.txn.AcdbatchDM;
import com.academic.domain.txn.ClasstimingDM;

@Repository
public class ClasstimingDAOImpl implements ClasstimingDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(ClasstimingDAOImpl.class);

	/** Method for save or update ClasstimingDM **/
	/**
	 * @param classtimingObj
	 *            of ClasstimingDM
	 */
	public void saveorUpdatemacdbatchDetails(ClasstimingDM classtimingObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(classtimingObj);
	}
	/** Get getclasstiminglist  based on batch_id **/
	/**
	 * To  getclasstiminglist based on classtimeid and batchGrpid
	 * 
	 * @param Long classtimeid,Long batchid,String status
	 * 
	 * @return list of ClasstimingDM
	 */
	public List<ClasstimingDM> getclasstiminglist(Long courseid,Long classtimeid, Long batchid,String timingname, String status,Long companyid) {
		// TODO Auto-generated method stub
		logger.info("Inside  getclasstiminglist >  "+"courseid"+ courseid + "classtimeid " + classtimeid+ " batchid" + batchid
				+ "status" + status+"companyid"+companyid);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" m.classtimeid as classtimeid,m.companyid as companyid,m.timingname as timingname,m.batchid as batchid,m.courseid as courseid,");
		sql.append(" m.remarks as remarks,m.status as status,m.lastupdateddt as lastupdateddt,m.lastupdatedby as lastupdatedby,c.batch_name as batch_name,h.course_name as course_name");
		sql.append(" from ClasstimingDM m,AcdbatchDM c,AcdCourseDM h where 1=1");
		sql.append(" and m.batchid=c.batch_id and m.courseid=h.course_id");
		Query query = null;
		
		if (courseid != null) {
			sql.append(" and m.courseid =" + courseid);
		}
		
		
		if (classtimeid != null) {
			sql.append(" and m.classtimeid =" + classtimeid);
		}
		if (batchid != null) {
			sql.append(" and m.batchid =" + batchid);
		}
		if (timingname != null && timingname.trim().length() > 0) {
			sql.append(" and lower(m.timingname)like lower('" + timingname
					+ "%')");
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(m.status)like lower('" + status
					+ "%')");
		}
		
		
		if (companyid != null) {
			sql.append(" and m.companyid =" + companyid);
		}
		sql.append(" order by m.lastupdateddt desc");
		logger.info("Inside getclasstiminglist > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(ClasstimingDM.class));
		return query.list();
	}
}

		


