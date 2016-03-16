package com.hostel.daoimpl.txn;

import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.erputil.util.DateUtils;
import com.hostel.dao.txn.HtlFeeCollectionDAO;
import com.hostel.domain.txn.HtlFeeCollectionDM;

@Repository
public class HtlFeeCollectionDAOImpl implements HtlFeeCollectionDAO {

	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(HtlFeeCollectionDAOImpl.class);

	/**
	 *     * Used to save or update the HtlFeeCollection data into the database.
	 *      * @param objfeescol         
	 */
	public void saveorUpdateHtlfeeCollection(HtlFeeCollectionDM objfeescol) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(objfeescol);

	}

	/**
	 *  * used to Retrieve data from HtlFeeCollectionDM table based on given
	 * 
	 * @param Long
	 *            feecolid, Date startdate, Date enddate, Date duedate, String
	 *            duedateduedateduedateduedate    
	 * 
	 * @return List<HtlFeeCollectionDM>         
	 */
	public List<HtlFeeCollectionDM> getHtlfeecollection(Long feecolid,
			Date startdate, Date enddate, Date duedate, String status) {

		logger.info("Inside  getHtlfeecollection >  " + "feecolid " + feecolid
				+ "startdate " + startdate + " enddate" + enddate + "duedate"
				+ duedate + "duedate" + duedate);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" h.feecolid as feecolid,h.startdate as startdate,h.enddate as enddate,h.duedate as duedate,");
		sql.append(" h.remarks as remarks,h.status as status,h.lastupdateddt as lastupdateddt,h.lastupdatedby as lastupdatedby");
		sql.append(" from HtlFeeCollectionDM h where 1=1 ");

		Query query = null;
		if (feecolid != null) {
			sql.append(" and h.feecolid =" + feecolid);
		}

		if (startdate != null) {
			sql.append(" and h.startdate='" + DateUtils.datetostringsimp(startdate)
					+ "'");
		}
		if (enddate != null) {
			sql.append(" and h.enddate='" + DateUtils.datetostringsimp(enddate)
					+ "'");
		}

		if (duedate != null) {
			sql.append(" and h.duedate='" + DateUtils.datetostringsimp(duedate)
					+ "'");
		}
		if (status != null) {
			sql.append(" and h.status = '" + status + "'");
		}
		sql.append(" order by h.lastupdateddt desc");
		logger.info("Inside getHtlfeecollection > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(HtlFeeCollectionDM.class));
		return query.list();
	}
}
