
package com.base.serviceimpl.txn;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.txn.AuditConfigDAO;
import com.base.domain.txn.AuditConfigDM;
import com.base.service.txn.AuditConfigService;

public class AuditConfigServiceImpl implements AuditConfigService {
	@Autowired
	private AuditConfigDAO configDao;
	private Logger logger = Logger.getLogger(AuditConfigServiceImpl.class);
	
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
	@Transactional
	public List<AuditConfigDM> getColumnNameByTableName(Long screenid,String tableName, Long companyId, Long configId) {
		logger.info("Company ID : " + companyId + " | Status : " + tableName + "configId" + configId + " > "
				+ "Inside getColumnNameByTableName");
		return configDao.getColumnNameByTableName(screenid,tableName, companyId, configId);
	}
	
	/**
	 * Method for save or update AuditConfigDM details
	 * 
	 * @param AuditConfigDM
	 *            AuditConfigObj
	 */
	@Transactional
	public void saveAndUpdateDetails(AuditConfigDM baseAuditConfigObj) {
		logger.info("Inside saveAndUpdateCitydetails > " + "About to save the data ... ");
		configDao.saveAndUpdateDetails(baseAuditConfigObj);
	}
}
