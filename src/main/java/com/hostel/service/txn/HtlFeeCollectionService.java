package com.hostel.service.txn;

import java.util.Date;
import java.util.List;
import com.hostel.domain.txn.HtlFeeCollectionDM;

public interface HtlFeeCollectionService {
	/**
	 *     * Used to save or update the HtlFeeCollection data into the database.
	 *      * @param objfeescol         
	 */
	public void saveorUpdateHtlfeeCollection(HtlFeeCollectionDM objfeescol);

	/**
	 *  * used to Retrieve data from HtlFeeCollectionDM table based on given
	 * 
	 * @param Long
	 *            feecolid, Date startdate, Date enddate, Date duedate, String
	 *            status    
	 * 
	 * @return List<HtlFeeCollectionDM>         
	 */
	public List<HtlFeeCollectionDM> getHtlfeecollection(Long feecolid,
			Date startdate, Date enddate, Date duedate, String status);
}
