
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.ApprovalSchemaDAO;
import com.base.domain.mst.ApprovalSchemaDM;
import com.base.service.mst.ApprovalSchemaService;

public class ApprovalSchemaServiceImpl implements ApprovalSchemaService {
	/** @Autowired refers that integrating the spring concepts that is using for linking with specified class **/
	@Autowired
	private ApprovalSchemaDAO apprvSchemaDaoObj;
	private Logger logger = Logger.getLogger(ApprovalSchemaServiceImpl.class);
	
	/**
	 * Method for save or update ApprovalSchemaDM
	 * 
	 * @param apprSchmobj
	 *            of ApprovalSchemaDM
	 */
	@Transactional
	@CacheEvict(value = "apprSchema", allEntries = true)
	public void saveOrUpdate(ApprovalSchemaDM apprSchmobj) {
		logger.info("Inside saveOrUpdate > ");
		apprvSchemaDaoObj.saveOrUpdate(apprSchmobj);
	}
	
	/**
	 * Method for return the ApprovalSchemaDM list based on given parameter
	 * 
	 * @param Long
	 *            companyID, Long brandId, Long roleId,String apprStatus
	 * 
	 * @return list of ApprovalSchemaDM
	 */
	@Transactional
	@Cacheable(value = "apprSchema")
	public List<ApprovalSchemaDM> getApprovalSchemaList(Long screenId,Long companyID, Long brandId, Long roleId,String apprStatus) {
		logger.info("Inside getApprovalSchemaList > " + "About to get ApprovalSchemaDM. list for " + companyID + ", "
				+ brandId + "," + roleId+"," +apprStatus);
		return apprvSchemaDaoObj.getApprovalSchemaList(screenId,companyID, brandId, roleId,apprStatus);
	}
}
