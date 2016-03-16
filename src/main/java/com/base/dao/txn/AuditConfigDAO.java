
package com.base.dao.txn;

import java.util.List;

import com.base.domain.txn.AuditConfigDM;

public interface AuditConfigDAO {
	/**
	 * Method for save or update AuditConfig details
	 * 
	 * @param AuditConfigDM
	 *            baseAuditConfigObj
	 */
	public void saveAndUpdateDetails(AuditConfigDM baseAuditConfigObj);
	
	/**
	 * get column names based on table name and company id
	 * 
	 * @param String
	 *            tableName
	 * @param String
	 *            companyId
	 * @param Long
	 *            configId
	 * @return List<MBaseAuditConfig>
	 */
	public List<AuditConfigDM> getColumnNameByTableName(Long screenid,String tableName, Long companyId, Long configId);
}
