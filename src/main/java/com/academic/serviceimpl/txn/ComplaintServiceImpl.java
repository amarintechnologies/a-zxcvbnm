package com.academic.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.ComplaintDAO;
import com.academic.domain.txn.ComplaintDM;
import com.academic.service.txn.ComplaintService;

public class ComplaintServiceImpl implements ComplaintService {
	@Autowired
	private ComplaintDAO complaintDAO;
	private Logger logger = Logger.getLogger(ComplaintServiceImpl.class);

	/**
	 *     * Used to save or update the Complaint data into the database.    
	 *  * @param objcomplaint         
	 */
	@Transactional
	public void saveOrUpdatecomplaint(ComplaintDM objcomplaint) {
		// TODO Auto-generated method stub
		complaintDAO.saveOrUpdatecomplaint(objcomplaint);

	}

	/**
	 *  * used to Retrieve data from AcdCourseDM table based on given
	 * 
	 * @param Long
	 *            complaintId, Long companyId, Long complnedby, Date complneddt,
	 *            String status    
	 * 
	 * @return List<ComplaintDM>         
	 */
	@Transactional
	public List<ComplaintDM> getcomplaintList(Long complaintId, Long companyId,
			Long complnedby, Date complneddt, String status) {
		// TODO Auto-generated method stub
		return complaintDAO.getcomplaintList(complaintId, companyId,
				complnedby, complneddt, status);
	}

}
