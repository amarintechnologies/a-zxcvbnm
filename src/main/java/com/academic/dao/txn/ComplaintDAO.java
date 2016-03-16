package com.academic.dao.txn;

import java.util.Date;
import java.util.List;
import com.academic.domain.txn.ComplaintDM;

public interface ComplaintDAO {
	/**
	 *     * Used to save or update the Complaint data into the database.    
	 *  * @param objcomplaint         
	 */
	public void saveOrUpdatecomplaint(ComplaintDM objcomplaint);

	/**
	 *  * used to Retrieve data from AcdCourseDM table based on given
	 * 
	 * @param Long
	 *            complaintId, Long companyId, Long complnedby, Date complneddt,
	 *            String status    
	 * 
	 * @return List<ComplaintDM>         
	 */

	public List<ComplaintDM> getcomplaintList(Long complaintId, Long companyId,
			Long complnedby, Date complneddt, String status);
}
