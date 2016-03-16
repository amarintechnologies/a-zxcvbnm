
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.FieldAccessConfigDAO;
import com.base.domain.mst.FieldAccessConfigDM;
import com.base.service.mst.FieldAccessConfigService;

public class FieldAccessConfigServiceImpl implements FieldAccessConfigService {
	@Autowired
	private FieldAccessConfigDAO fieldAcsConfObj;
	private Logger logger = Logger.getLogger(FieldAccessConfigServiceImpl.class);
	
	/**
	 * Method for save and update FieldAccessConfigDM Data
	 * 
	 * @param accessobj
	 *            of FieldAccessConfigDM
	 */
	@Transactional
	public void saveFieldAccessConfigDetails(FieldAccessConfigDM accessobj) {
		logger.info("Inside saveFieldAccessConfigDetails > " + "About to save the data ... ");
		fieldAcsConfObj.saveFieldAccessConfigDetails(accessobj);
	}
	
	/**
	 * Method for return FieldAccessConfigDM list based on user's parameters
	 * 
	 * @param Long
	 *            screenid,String screenFldRef,Long companyId,Long branchId,Long roleid,String status
	 * 
	 * @return List of FieldAccessConfigDM
	 */
	@Transactional
	public List<FieldAccessConfigDM> getFieldAccessConfigList(Long screenid, String screenFldRef, Long companyId,
			Long branchId, Long roleid, String status) {
		logger.info("Inside getFieldAccessConfigList > " + "About to get FieldAccessConfig. list for " + screenFldRef
				+ ", " + companyId + "," + branchId + "," + roleid + "," + status);
		return fieldAcsConfObj.getFieldAccessConfigList(screenid, screenFldRef, companyId, branchId, roleid, status);
	}
}
