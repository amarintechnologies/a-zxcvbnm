package com.academic.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.AcdbatchworkdayDAO;
import com.academic.domain.txn.AcdbatchsubjectstaffDM;
import com.academic.domain.txn.AcdbatchworkdaysDM;

@Repository
public class AcdbatchworkdayDAOImpl implements AcdbatchworkdayDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(AcdbatchworkdayDAOImpl.class);
	/** Method for save or update AcdbatchworkdaysDM **/
	/**
	 * @param acdbatchworkdayObj
	 *            of AcdbatchworkdaysDM
	 */
	public void saveorUpdateacdbatchworkdayDetails(
			AcdbatchworkdaysDM acdbatchworkdayObj) {
		sessionFactory.getCurrentSession().saveOrUpdate(acdbatchworkdayObj);
		
	}
	/** Get getacdbatchworkdayList based on workdayid **/
	/**
	 * To get getacdbatchworkdayList based on workdayid and batchname name
	 * 
	 * @param Long workdayid,Long batchid,String batchname,String status;
	 * 
	 * @return list of AcdbatchworkdaysDM
	 */
	public List<AcdbatchworkdaysDM> getacdbatchworkdayList(Long workdayid,
			Long batchid, String batchname, String status) {
		logger.info("Inside  getacdbatchworkdayList >  " + "workdayid " + workdayid
				+ "batchid " + batchid + " batchname" + batchname
				+ " status" +  status);
		StringBuffer sql = new StringBuffer("select ");
		sql.append(" m.workdayid as workdayid,m.batchid as batchid,m.sundayyn as sundayyn,m.mondayyn as mondayyn,m.tuesdayyn as tuesdayyn,m.wedbesdayyn as wedbesdayyn,");
		sql.append(" m.thursdayyn as thursdayyn,m.fridayyn as fridayyn,m.saturdayYn as saturdayYn, m.status as status,m.lastupdatesdt as lastupdatesdt,m.lastupdatesby as lastupdatesby"
				+ ",s.batch_name as batchname");
		sql.append(" from AcdbatchworkdaysDM m,AcdbatchDM s where 1=1");
		sql.append(" and m.batchid = s.batch_id");
		Query query = null;
		if (workdayid != null) {
			sql.append(" and m.workdayid =" + workdayid);
		}
		if (batchid != null) {
			sql.append(" and m.batchid =" + batchid);
		}
		
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(m.status)like lower('" + status
					+ "%')");
		}
		sql.append(" order by m.lastupdatesdt desc");
		logger.info("Inside getacdbatchworkdayList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(AcdbatchworkdaysDM.class));
		return query.list();
	}


	



	
}
