package com.academic.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.AcdBatchGroupDAO;
import com.academic.domain.txn.ClasstimingdtlDM;
import com.academic.service.txn.ClasstimingdtlService;

public class ClasstimingdtlServiceImpl implements ClasstimingdtlService {
	@Autowired
	private com.academic.dao.txn.ClasstimingdtlDAO ClasstimingdtlDAO;
	private Logger logger = Logger.getLogger(ClasstimingdtlServiceImpl.class);

	/** Method for save or update ClasstimingdtlDM **/
	/**
	 * @param classdtlObj
	 *            of ClasstimingdtlDM
	 */
	@Transactional
	public void saveorUpdatemacdbatchDetails(ClasstimingdtlDM classdtlObj) {
		// TODO Auto-generated method stub
		ClasstimingdtlDAO.saveorUpdatemacdbatchDetails(classdtlObj);
	}
	/** Getgetclasstimingdtllist based on batch_id **/
	/**
	 * To get getclasstimingdtllistbased on classtimedtlid and classtimeid
	 * 
	 * @param Long classtimedtlid,Long classtimeid,String refname
	 * 
	 * 
	 * @return list of ClasstimingdtlDM
	 */
	@Transactional
	public List<ClasstimingdtlDM> getclasstimingdtllist(Long classtimedtlid,
			Long classtimeid, String refname,Date starttime,Date endtime) {
		// TODO Auto-generated method stub
		return ClasstimingdtlDAO.getclasstimingdtllist(classtimedtlid, classtimeid, refname, starttime, endtime);
	}

}
