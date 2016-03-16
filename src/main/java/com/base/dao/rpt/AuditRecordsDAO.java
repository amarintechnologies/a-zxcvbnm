
package com.base.dao.rpt;

import java.util.List;

import com.base.domain.txn.AuditRecordsDM;




public interface AuditRecordsDAO {
	/**
	 * get audit records based table name , companyId ,columnName and oldValue in MBaseAuditRecords
	 * @param tableName ,companyId,columnName , oldValue and pkValue
	 * @return List<MBaseAuditRecords>
	 */
	public List<AuditRecordsDM>  getMBaseAuditRecordsByTableName(Long screenId,String tableName,Long companyId,String columnName,String oldValue,String pkValue);
   /**
    * Execute the procedure to store the date in server Session
    * @param companyId
    * @param userId
    * @param userName
    * @param clientIp
    */
	public void executeStoredProcedure(Long companyId,Long userId,String userName,String clientIp);
	
	/**
	 * remove the session data in database
	 */
	
	public void closetheSessiondata();
	
}
