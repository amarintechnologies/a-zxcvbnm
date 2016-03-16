package com.academic.service.txn;

import java.util.List;

import com.academic.domain.txn.AcdBatchGroupDtlDM;

public interface AcdBatchGrpDtlService {

	/**
	 *     * Used to save or update the AcdBatchGroupDtlDM data into the
	 * database.      * @param objAcdSubj         
	 */
	public void saveAcdBatchGrpDtl(AcdBatchGroupDtlDM objAcdSubj);

	/**
	 *  used to Retrieve data from AcdBatchGroupDtlDM table based on given
	 * parameters.          
	 * 
	 * @param  Long batchGrpdtlId, Long batchGrpid, Long batchId, String
	 *         batchGrpDtlStatus     @return List<AcdBatchGroupDtlDM>         
	 */

	public List<AcdBatchGroupDtlDM> getAcdBatchGrpDtlList(Long batchGrpdtlId,
			Long batchGrpid, Long batchId, String batchGrpDtlStatus);

	public void deleteBtchGrpDtl(Long grpId);
}
