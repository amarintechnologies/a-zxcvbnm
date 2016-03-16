package com.academic.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.AcdbatchsubjectstaffDAO;
import com.academic.domain.txn.AcdbatchsubjectstaffDM;

@Repository
public class AcdbatchsubjectstaffDAOImpl implements AcdbatchsubjectstaffDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(AcdbatchsubjectstaffDAOImpl.class);

	/** Method for save or update AcdbatchsubjectstaffDM **/
	/**
	 * @param acdbatchstaffObj
	 *            of AcdbatchsubjectstaffDM
	 */

	public void saveorUpdatemacdbatchDetails(
			AcdbatchsubjectstaffDM acdbatchstaffObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(acdbatchstaffObj);
	}

	/** Get getacdbatchsubjectstaffList based on batchsubjectid **/
	/**
	 * To get getacdbatchsubjectstaffList based on batchsubjectid and
	 * batchsubject name
	 * 
	 * @param Long
	 *            batchsubjectid,Long batchid,Long subjectid,String status);
	 * 
	 * @return list of acdbatchsubjectstaffDM
	 */
	public List<AcdbatchsubjectstaffDM> getacdbatchsubjectstaffList(
			Long batchsubjectid, Long batchid, Long subjectid, String status,
			Long deptId, Long empId) {
		// TODO Auto-generated method stub
		logger.info("Inside  getmacdbatchList >  " + "batchsubjectid "
				+ batchsubjectid + "batchid " + batchid + " subjectid"
				+ subjectid + " status" + status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" m.batchsubjectid as batchsubjectid,m.batchid as batchid,m.subjectid as subjectid,m.deptid as deptid,m.empid as empid,m.status as status,");
		sql.append(" m.lastupdateddt as lastupdateddt,m.lastupdatedby as lastupdatedby,s.subjectName as subjectName,d.deptname as deptName,e.firstname as empName,b.batch_name as batchName");
		sql.append(" from AcdbatchsubjectstaffDM m,AcdSubjectDM s,DepartmentDM d,EmployeeDM e,AcdbatchDM b where 1=1");
		sql.append(" and m.subjectid = s.subjectId and m.deptid=d.deptid and m.empid=e.employeeid and m.batchid=b.batch_id ");
		Query query = null;

		if (batchid != null) {
			sql.append(" and m.batchid =" + batchid);
		}
		if (deptId != null) {
			sql.append(" and m.deptid =" + deptId);
		}
		if (empId != null) {
			sql.append(" and m. empid =" + empId);
		}
		if (subjectid != null) {
			sql.append(" and m. subjectid =" + subjectid);
		}

		// if (subjectName != null && subjectName.trim().length() > 0) {
		// sql.append(" and lower(m.batch_name)like lower('" + subjectName
		// + "%')");
		// }
		if (status != null) {
			sql.append(" and lower(m.status)like lower('" + status + "%')");
		}
		sql.append(" order by m.lastupdateddt desc");
		logger.info("Inside getmacdbatchList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(AcdbatchsubjectstaffDM.class));
		return query.list();
	}

}
