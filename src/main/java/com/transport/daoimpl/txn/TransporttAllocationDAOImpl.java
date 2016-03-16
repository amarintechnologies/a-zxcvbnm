package com.transport.daoimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.transport.dao.txn.TransporttAllocationDAO;
import com.transport.domain.txn.TransporttAllocationDM;

@Repository
public class TransporttAllocationDAOImpl implements TransporttAllocationDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(TransporttAllocationDAOImpl.class);

	/**
	 * Used to save or update the events data into the database.      
	 * 
	 * @param TransporttAllocationDM
	 *            hostRmAllObj         
	 */
	public void saveOrUpdateTransprtAllc(TransporttAllocationDM hostRmAllObj) {
		sessionFactory.getCurrentSession().saveOrUpdate(hostRmAllObj);
	}

	/**
	 * used to Retrieve data from TransporttAllocationDM based on given
	 * parameters.   
	 * 
	 * @param Long trnsAllcid, Long routeId, Long roomId, Long rootStopId,Long
	 *             batchId, Long studId,String status
	 */	public List<TransporttAllocationDM> getTransprtAllc(Long trnsAllcid,
				Long routeId, Long empId, Long rootStopId, Long batchId,
				Long studId, String status, Date startDt, Date endDt) {
		logger.info("Inside  getTransprtAllc >  " + "rmAllId" + routeId
				+ "hostId " + trnsAllcid);

		StringBuffer sql = new StringBuffer(" select ");

		sql.append(" mt.trnsAllcid as trnsAllcid,mt.routeId as routeId,mt.rootStopId as rootStopId,");
		sql.append(" mt.batchId as batchId,mt.studId as studId,mt.empId as empId,mt.startDt as startDt,mt.endDt as endDt,");
		sql.append(" mt.remarks as remarks,mt.status as status,mt.updatedDt as updatedDt,mt.updatedBy as updatedBy,");
		sql.append(" rt.routename as routename,rst.stopname as stopName");
		sql.append(" from TransporttAllocationDM mt,RouteDM rt, RouteStopsDM rst where 1=1 ");
		sql.append(" and rt.routeid = mt.routeId and rst.rtstopid= mt.rootStopId");
		Query query = null;
		if (trnsAllcid != null) {
			sql.append(" and mt.trnsAllcid=" + trnsAllcid);
		}
		if (routeId != null) {
			sql.append(" and mt.routeId=" + routeId);
		}
		if (empId != null) {
			sql.append(" and mt.empId=" + empId);
		}
		if (rootStopId != null) {
			sql.append(" and mt.rootStopId=" + rootStopId);
		}

		if (batchId != null) {
			sql.append(" and mt.batchId =" + batchId);
		}
		if (studId != null) {
			sql.append(" and mt.studId=" + studId);
		}
		if (status != null) {
			sql.append(" and lower(mt.status) like lower('" + status + "%')");
		}

		sql.append(" order by mt.updatedDt desc");
		logger.info("Inside getTransprtAllc > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(TransporttAllocationDM.class));
		return query.list();
	}


}
