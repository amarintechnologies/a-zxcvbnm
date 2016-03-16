package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.AcdBatchGroupDAO;
import com.academic.dao.txn.ClasstimingDAO;
import com.academic.domain.txn.ClasstimingDM;
import com.academic.service.txn.ClasstimingService;

public class ClasstimingServiceImpl implements ClasstimingService{
	@Autowired
	private ClasstimingDAO ClasstimingDAO;
	private Logger logger = Logger.getLogger(ClasstimingServiceImpl.class);

	/** Method for save or update ClasstimingDM **/
	/**
	 * @param classtimingObj
	 *            of ClasstimingDM
	 */
	@Transactional
	public void saveorUpdatemacdbatchDetails(ClasstimingDM classtimingObj) {
		// TODO Auto-generated method stub
		ClasstimingDAO.saveorUpdatemacdbatchDetails(classtimingObj);
	}

	/** Get getclasstiminglist  based on batch_id **/
	/**
	 * To  getclasstiminglist based on classtimeid and batchGrpid
	 * 
	 * @param Long classtimeid,Long batchid,String status
	 * 
	 * @return list of ClasstimingDM
	 */
	@Transactional
	public List<ClasstimingDM> getclasstiminglist(Long courseid,Long classtimeid, Long batchid,String timingname, String status,Long companyid) {
		// TODO Auto-generated method stub
		
		return ClasstimingDAO.getclasstiminglist(courseid,classtimeid, batchid,timingname, status,companyid);
	}

}
