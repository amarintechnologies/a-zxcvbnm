package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.BatchSubDAO;
import com.academic.domain.txn.BatchSubDM;
import com.academic.service.txn.BatchSubServ;

public class BatchSubServimpl implements BatchSubServ {
	@Autowired
	private BatchSubDAO batchsubdao;
	private Logger logger = Logger.getLogger(BatchSubServimpl.class);

	@Transactional
	public List<BatchSubDM> getBatchSubList(Long batchid, Long subjectid,
			String classpweek, String examyn, String status) {
		return batchsubdao.getBatchSubList(batchid, subjectid, classpweek,
				examyn, status);
	}

	@Transactional
	public void saveOrUpdate(BatchSubDM obj) {
		batchsubdao.saveOrUpdate(obj);
	}

	@Transactional
	public List<BatchSubDM> getBatchSubListNoPK(Long batchid,
			String classpweek, String examyn, String status) {
		return batchsubdao.getBatchSubListNoPK(batchid, classpweek, examyn,
				status);
	}

	@Transactional
	public void deleteBatchSub(Long batchSubjectId) {
		batchsubdao.deleteBatchSub(batchSubjectId);

	}

}
