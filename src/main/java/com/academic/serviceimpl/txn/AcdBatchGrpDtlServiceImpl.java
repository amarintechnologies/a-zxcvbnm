package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.AcdBatchGrpDtlDAO;
import com.academic.domain.txn.AcdBatchGroupDtlDM;
import com.academic.service.txn.AcdBatchGrpDtlService;

public class AcdBatchGrpDtlServiceImpl implements AcdBatchGrpDtlService {
	@Autowired
	private AcdBatchGrpDtlDAO acdBatchGrpDtlDAO;
	private Logger logger = Logger.getLogger(AcdBatchGrpDtlServiceImpl.class);

	/**
	 *     * Used to save or update the AcdBatchGroupDtlDM data into the
	 * database.      * @param objAcdSubj         
	 */
	@Transactional
	public void saveAcdBatchGrpDtl(AcdBatchGroupDtlDM objAcdSubj) {
		acdBatchGrpDtlDAO.saveAcdBatchGrpDtl(objAcdSubj);
	}

	/**
	 *  used to Retrieve data from AcdBatchGroupDtlDM table based on given
	 * parameters.          
	 * 
	 * @param  Long batchGrpdtlId, Long batchGrpid, Long batchId, String
	 *         batchGrpDtlStatus     @return List<AcdBatchGroupDtlDM>         
	 */
	@Transactional
	public List<AcdBatchGroupDtlDM> getAcdBatchGrpDtlList(Long batchGrpdtlId,
			Long batchGrpid, Long batchId, String batchGrpDtlStatus) {
		return acdBatchGrpDtlDAO.getAcdBatchGrpDtlList(batchGrpdtlId,
				batchGrpid, batchId, batchGrpDtlStatus);
	}

	@Transactional
	public void deleteBtchGrpDtl(Long grpId) {
		acdBatchGrpDtlDAO.deleteBtchGrpDtl(grpId);
	}

}
