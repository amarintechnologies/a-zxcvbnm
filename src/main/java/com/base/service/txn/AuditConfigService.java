
package com.base.service.txn;

import java.util.List;
import com.base.domain.txn.AuditConfigDM;

public interface AuditConfigService {
	/**
	 * Method for save or update AuditConfigDM details
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
	 * @param Long
	 *            companyId
	 * @param Long
	 *            configId
	 * @return List<AuditConfigDM>
	 */
	public List<AuditConfigDM> getColumnNameByTableName(Long screenid,String tableName, Long companyId, Long configId);
}
