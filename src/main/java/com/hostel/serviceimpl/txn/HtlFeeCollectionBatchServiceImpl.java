package com.hostel.serviceimpl.txn;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.hostel.dao.txn.HtlFeeCollectionBatchDAO;
import com.hostel.domain.txn.HtlFeeCollectionBatchDM;
import com.hostel.service.txn.HtlFeeCollectionBatchService;

public class HtlFeeCollectionBatchServiceImpl implements
		HtlFeeCollectionBatchService {
	@Autowired
	private HtlFeeCollectionBatchDAO htlFeeCollectionBatchDAO;
	private Logger logger = Logger
			.getLogger(HtlFeeCollectionBatchServiceImpl.class);

	@Transactional
	public void saveorUpdatehtlfeecollectionbatch(
			HtlFeeCollectionBatchDM feecollectionbatchObj) {
		// TODO Auto-generated method stub
		htlFeeCollectionBatchDAO
				.saveorUpdatehtlfeecollectionbatch(feecollectionbatchObj);

	}

	@Transactional
	public List<HtlFeeCollectionBatchDM> getHtlFeecollectionbatchlist(
			Long feecolbatchid, Long feecolid, Long courseid, Long batchid,
			String status) {
		// TODO Auto-generated method stub
		return htlFeeCollectionBatchDAO.getHtlFeecollectionbatchlist(
				feecolbatchid, feecolid, courseid, batchid, status);
	}

}
