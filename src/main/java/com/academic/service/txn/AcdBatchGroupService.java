package com.academic.service.txn;


import java.util.List;

import com.academic.domain.txn.AcdBatchGroupDM;


public interface AcdBatchGroupService {
	/**
	 *     * Used to save or update the AcdBatchGroup data into the database.
	 *      * @param objAcdBtch         
	 */
	public void saveAcdBatchGroup(AcdBatchGroupDM objAcdBtch);

	/**
	 *  * used to Retrieve data from AcdSubjectDM table based on given
	 * 
	 * Long batchGrpid, Long companyId, String groupName, String
	 * batchGrpstatus       
	 * 
	 * @return List<AcdBatchGroupDM>         
	 */

	public List<AcdBatchGroupDM> getAcdBatchGroupList(Long batchGrpid,
			Long companyId, String groupName, String batchGrpstatus);
}
