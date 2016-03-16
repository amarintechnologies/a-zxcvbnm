
package com.base.daoimpl.rpt;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.rpt.AuditRecordsDAO;
import com.base.domain.txn.AuditRecordsDM;

@Repository
public class AuditRecordsDAOImpl implements AuditRecordsDAO {
	private Logger logger = Logger.getLogger(AuditRecordsDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * get audit records based table name , companyId ,columnName and oldValue in AuditRecordsDM
	 * 
	 * @param String tableName, Long companyId, String columnName,
			  String oldValue, String pkValue
	 * @return List of AuditRecordsDM
	 */
	public List<AuditRecordsDM> getMBaseAuditRecordsByTableName(Long screenId,String tableName, Long companyId, String columnName,
			String oldValue, String pkValue) {
		logger.info("Inside AuditRecordsDAOImpl getAuditRecordsDMByTableName > "
				+ "About to get AuditRecords. list for "+screenId+"," + companyId + ", " + columnName + ", " + oldValue);
		try {
			StringBuffer sql = new StringBuffer();
			Long newlong = -1L;
			Date date = null;
			Date date1 = null;
			try {
				newlong = Long.valueOf(oldValue);
			}
			catch (Exception e) {
				newlong = -1L;
				logger.info("Convert String number" + e);
			}
			try {
				date = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(oldValue);
				System.out.println("date format" + date);
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				logger.info("Date Conversion Error Convert String to date --> " + e);
			}
			try {
				date1 = new SimpleDateFormat("yyyy-MMM-dd", Locale.ENGLISH).parse(oldValue);
			}
			catch (Exception e) {
				logger.info("Convert String date" + e);
			}
			sql.append("select ar from AuditRecordsDM ar  where ar.tableName='" + tableName + "' and ar.companyId="
					+ companyId);
			if (screenId != null) {
				sql.append(" and a.screenid = " + screenId);
			}
			if (columnName != null && columnName.toString().length() > 0) {
				sql.append(" and ar.columnName='" + columnName + "'");
			}
			if (oldValue != null && oldValue.toString().length() > 0) {
				sql.append("and lower(ar.oldCvalue) like lower('" + oldValue + "%') or ar.oldNvalue=" + newlong);
			}
			if (date != null) {
				sql.append("or ar.oldDtvalue='" + oldValue + "'");
			}
			if (date1 != null) {
				sql.append("or ar.oldDtvalue='" + oldValue + "'");
			}
			if (pkValue != null) {
				sql.append(" and ar.pkValue='" + pkValue + "'");
			}
			sql.append(" order by ar.updatedDt desc ");
			logger.info("getMBaseAuditRecordsByTableName()-- Exec Query ----->" + sql);
			Query query = sessionFactory.getCurrentSession().createQuery(sql.toString());
			return query.list();
		}
		catch (Exception e) {
			logger.info("Error on getMBaseAuditRecordsByTableName()--->" + e);
			return null;
		}
	}
	
	/**
	 * Execute the procedure to store the date in server Session
	 * 
	 * @param companyId
	 * @param userId
	 * @param userName
	 * @param clientIp
	 */
	public void executeStoredProcedure(Long companyId, Long userId, String userName, String clientIp) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession()
				.createSQLQuery("call pkg_base_context.pr_set_erpctx (:companyId, :userId,:userName,:clientIp)")
				.setParameter("companyId", companyId).setParameter("userId", userId).setParameter("userName", userName)
				.setParameter("clientIp", clientIp);
		query.executeUpdate();
	}
	
	/**
	 * remove the session data in database
	 */
	public void closetheSessiondata() {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createSQLQuery("call pkg_base_context.pr_clear_erpctx ()");
		query.executeUpdate();
	}
}
