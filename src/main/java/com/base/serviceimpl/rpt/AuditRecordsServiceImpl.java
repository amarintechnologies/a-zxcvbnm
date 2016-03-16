
package com.base.serviceimpl.rpt;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.rpt.AuditRecordsDAO;
import com.base.domain.txn.AuditRecordsDM;
import com.base.service.rpt.AuditRecordsService;

public class AuditRecordsServiceImpl implements AuditRecordsService {
	Logger logger = Logger.getLogger(AuditRecordsServiceImpl.class);
	@Autowired
	private AuditRecordsDAO auditRecordsDao;
	
	/**
	 * get audit records based table name , companyId ,columnName and oldValue in AuditRecordsDM
	 * 
	 * @param String
	 *            tableName, Long companyId, String columnName, String oldValue, String pkValue
	 * @return List of AuditRecordsDM
	 */
	@Transactional
	public List<AuditRecordsDM> getAuditRecordsDMByTableName(Long screenId,String tableName, Long companyId, String columnName,
			String oldValue, String pkValue) {
		logger.info("Inside AuditRecordsServiceImpl getAuditRecordsDMByTableName > "
				+ "About to get AuditRecords. list for " + companyId + ", " + columnName + ", " + oldValue);
		// TODO Auto-generated method stub
		return auditRecordsDao.getMBaseAuditRecordsByTableName(screenId,tableName, companyId, columnName, oldValue, pkValue);
	}
	
	/**
	 * Execute the procedure to store the date in server Session
	 * 
	 * @param companyId
	 * @param userId
	 * @param userName
	 * @param clientIp
	 */
	@Transactional
	public void executeStoredProcedure(Long companyId, Long userId, String userName, String clientIp) {
		logger.info("Inside executeStoredProcedure > " + "About to save and update the data ... ");
		// TODO Auto-generated method stub
		auditRecordsDao.executeStoredProcedure(companyId, userId, userName, clientIp);
	}
	
	/**
	 * remove the session data in database
	 */
	@Transactional
	public void closetheSessiondata() {
		// TODO Auto-generated method stub
		auditRecordsDao.closetheSessiondata();
	}
}
