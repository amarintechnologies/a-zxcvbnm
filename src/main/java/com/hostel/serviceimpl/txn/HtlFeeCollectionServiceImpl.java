package com.hostel.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hostel.dao.txn.HtlFeeCollectionDAO;
import com.hostel.domain.txn.HtlFeeCollectionDM;
import com.hostel.service.txn.HtlFeeCollectionService;

public class HtlFeeCollectionServiceImpl implements HtlFeeCollectionService {
	@Autowired
	private HtlFeeCollectionDAO htlFeeCollectionDAO;
	private Logger logger = Logger.getLogger(HtlFeeCollectionServiceImpl.class);

	/**
	 *     * Used to save or update the HtlFeeCollection data into the database.
	 *      * @param objfeescol         
	 */
	@Transactional
	public void saveorUpdateHtlfeeCollection(HtlFeeCollectionDM objfeescol) {
		// TODO Auto-generated method stub
		htlFeeCollectionDAO.saveorUpdateHtlfeeCollection(objfeescol);

	}

	/**
	 *  * used to Retrieve data from HtlFeeCollectionDM table based on given
	 * 
	 * @param Long
	 *            feecolid, Date startdate, Date enddate, Date duedate, String
	 *            status    
	 * 
	 * @return List<HtlFeeCollectionDM>         
	 */
	@Transactional
	public List<HtlFeeCollectionDM> getHtlfeecollection(Long feecolid,
			Date startdate, Date enddate, Date duedate, String status) {
		// TODO Auto-generated method stub
		return htlFeeCollectionDAO.getHtlfeecollection(feecolid, startdate,
				enddate, duedate, status);
	}

}
