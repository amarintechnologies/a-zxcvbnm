package com.academic.service.txn;

import java.util.List;

import com.academic.domain.txn.AcdbatchDM;

public interface AcdbatchService {
	/** Method for save or update m_acd_batchDM **/
	/**
	 * @param macdbatchObj
	 *            of m_acd_batchDM
	 */
	public void saveorUpdatemacdbatchDetails(AcdbatchDM macdbatchObj);

	/** Get macdbatch List based on batch_id **/
	/**
	 * To get macdbatch list based on batch_id and batch_name
	 * 
	 * @param Long
	 *            batch_id,Long course_id,String batch_name,String batch_status
	 * 
	 * 
	 * @return list of m_acd_batchDM
	 */
	public List<AcdbatchDM> getmacdbatchList(Long batch_id, Long course_id,
			String batch_name, String batch_status, String batchYear,
			Long companyid);
}
