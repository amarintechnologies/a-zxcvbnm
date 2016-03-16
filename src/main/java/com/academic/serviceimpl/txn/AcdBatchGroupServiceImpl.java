package com.academic.serviceimpl.txn;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.AcdBatchGroupDAO;
import com.academic.domain.txn.AcdBatchGroupDM;
import com.academic.service.txn.AcdBatchGroupService;



public class AcdBatchGroupServiceImpl implements AcdBatchGroupService {
	@Autowired
	private AcdBatchGroupDAO acdSubjectDAO;
	private Logger logger = Logger.getLogger(AcdBatchGroupServiceImpl.class);

	/**
	 *     * Used to save or update the AcdBatchGroup data into the database.
	 *      * @param objAcdBtch         
	 */
	@Transactional
	public void saveAcdBatchGroup(AcdBatchGroupDM objAcdBtch) {
		acdSubjectDAO.saveAcdBatchGroup(objAcdBtch);
	}

	/**
	 *  * used to Retrieve data from AcdBatchGroupDM table based on given
	 * 
	 * Long batchGrpid, Long companyId, String groupName, String
	 * batchGrpstatus       
	 * 
	 * @return List<AcdBatchGroupDM>         
	 */
	@Transactional
	public List<AcdBatchGroupDM> getAcdBatchGroupList(Long batchGrpid,
			Long companyId, String groupName, String batchGrpstatus) {
		return acdSubjectDAO.getAcdBatchGroupList(batchGrpid, companyId,
				groupName, batchGrpstatus);
	}
}
