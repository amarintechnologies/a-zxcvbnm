package com.hostel.dao.txn;

import java.util.List;
import com.hostel.domain.txn.HtlFeeCollectionBatchDM;

public interface HtlFeeCollectionBatchDAO {
	/** Method for save or update HtlFeeCollectionBatchDM **/
	/**
	 * @param feecollectionbatchObj
	 *            of HtlFeeCollectionBatchDM
	 */
	public void saveorUpdatehtlfeecollectionbatch(
			HtlFeeCollectionBatchDM feecollectionbatchObj);

	/** Get getFeecollectionbatchlist based on feecolbatchid **/
	/**
	 * @param Long
	 *            feecolbatchid, Long feecolid, Long courseid, Long batchid,
	 *            String status
	 * 
	 * @return list of HtlFeeCollectionBatchDM
	 */
	public List<HtlFeeCollectionBatchDM> getHtlFeecollectionbatchlist(
			Long feecolbatchid, Long feecolid, Long courseid, Long batchid,
			String status);
}
