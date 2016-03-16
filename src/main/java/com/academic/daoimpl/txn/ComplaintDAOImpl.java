package com.academic.daoimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.ComplaintDAO;
import com.academic.domain.mst.AcdCourseDM;
import com.academic.domain.txn.ComplaintDM;

@Repository
public class ComplaintDAOImpl implements ComplaintDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(AcdbatchDAOImpl.class);

	/**
	 *     * Used to save or update the Complaint data into the database.    
	 *  * @param objcomplaint         
	 */
	public void saveOrUpdatecomplaint(ComplaintDM objcomplaint) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(objcomplaint);

	}

	/**
	 *  * used to Retrieve data from AcdCourseDM table based on given
	 * 
	 * @param Long
	 *            complaintId, Long companyId, Long complnedby, Date complneddt,
	 *            String status    
	 * 
	 * @return List<ComplaintDM>         
	 */
	public List<ComplaintDM> getcomplaintList(Long complaintId, Long companyId,
			Long complnedby, Date complneddt, String status) {
		// TODO Auto-generated method stub
		logger.info("Inside  getcomplaintList >  " + "complaintId "
				+ complaintId + "companyId " + companyId + " complnedby"
				+ complnedby + "complneddt" + complneddt + "status" + status);

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.complaintId as complaintId,c.companyId as companyId,c.complnedby as complnedby,c.complnedagnst as complnedagnst,c.complneddt as complneddt,");
		sql.append(" c.complaintype as complaintype,c.title as title,c.remarks as remarks,c.assignedto as assignedto,c.jury as jury,");
		sql.append(" c.traildt as traildt,c.eventnote as eventnote,c.status as status,c.lastupdateddt as lastupdateddt,c.lastupdatedby as lastupdatedby,");
		sql.append(" s.firstName as firstName,e.firstname as firstname");
		sql.append(" from ComplaintDM c, StudentDM s,EmployeeDM e where 1=1 ");
		sql.append(" and s.studentId = c.complnedby and e.employeeid = c.assignedto ");
		Query query = null;
		if (complaintId != null) {
			sql.append(" and c.complaintId =" + complaintId);
		}
		if (complnedby != null) {
			sql.append(" and c.complnedby =" + complnedby);
		}
		if (companyId != null) {
			sql.append(" and c.companyId =" + companyId);
		}
		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getcomplaintList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(ComplaintDM.class));
		return query.list();

	}
}
