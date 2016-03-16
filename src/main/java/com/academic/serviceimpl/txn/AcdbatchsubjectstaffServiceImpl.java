package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.AcdbatchsubjectstaffDAO;
import com.academic.domain.txn.AcdbatchsubjectstaffDM;
import com.academic.service.txn.AcdbatchsubjectstaffService;

public class AcdbatchsubjectstaffServiceImpl implements
		AcdbatchsubjectstaffService {
	@Autowired
	private AcdbatchsubjectstaffDAO acdbatchsubjectstaffDAO;
	private Logger logger = Logger
			.getLogger(AcdbatchsubjectstaffServiceImpl.class);

	@Transactional
	public void saveorUpdatemacdbatchDetails(
			AcdbatchsubjectstaffDM acdbatchstaffObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAndUpdate > " + "About to save the data ... ");
		acdbatchsubjectstaffDAO.saveorUpdatemacdbatchDetails(acdbatchstaffObj);
		;

	}

	/** Get getacdbatchsubjectstaffList based on batchsubjectid **/
	/**
	 * To get getacdbatchsubjectstaffList based on batchsubjectid and
	 * batchsubject name
	 * 
	 * @param Long
	 *            batchsubjectid,Long batchid,Long subjectid,String status);
	 * 
	 * @return list of acdbatchsubjectstaffDM
	 */

	@Transactional
	public List<AcdbatchsubjectstaffDM> getacdbatchsubjectstaffList(
			Long batchsubjectid, Long batchid, Long subjectid, String status,
			Long deptId, Long empId) {
		// TODO Auto-generated method stub
		return acdbatchsubjectstaffDAO.getacdbatchsubjectstaffList(
				batchsubjectid, batchid, subjectid, status, deptId, empId);
	}
}
