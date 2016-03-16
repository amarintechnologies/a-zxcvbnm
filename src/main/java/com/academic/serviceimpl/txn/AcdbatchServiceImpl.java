package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.AcdbatchDAO;
import com.academic.domain.txn.AcdbatchDM;
import com.academic.service.txn.AcdbatchService;

public class AcdbatchServiceImpl implements AcdbatchService {
	@Autowired
	private AcdbatchDAO macdbatchDAO;
	private Logger logger = Logger.getLogger(AcdbatchServiceImpl.class);

	/**
	 * To save m_acd_batchDM details
	 * 
	 * @param m_acd_batchDM
	 *            macdbatchObj
	 * 
	 */
	@Transactional
	public void saveorUpdatemacdbatchDetails(AcdbatchDM macdbatchObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAndUpdate > " + "About to save the data ... ");
		macdbatchDAO.saveorUpdatemacdbatchDetails(macdbatchObj);
	}

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
	@Transactional
	public List<AcdbatchDM> getmacdbatchList(Long batch_id, Long course_id,
			String batch_name, String batch_status, String batchYear,Long companyid) {
		// TODO Auto-generated method stub
		return macdbatchDAO.getmacdbatchList(batch_id, course_id, batch_name,
				batch_status,  batchYear,companyid);
	}
}
