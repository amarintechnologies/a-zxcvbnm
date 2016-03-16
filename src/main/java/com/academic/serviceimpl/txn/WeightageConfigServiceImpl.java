package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.WeightageConfigDAO;
import com.academic.domain.txn.WeightageConfigDM;
import com.academic.service.txn.WeightageConfigService;

public class WeightageConfigServiceImpl implements WeightageConfigService {
	@Autowired
	private WeightageConfigDAO weightageConfigDAO;
	private Logger logger = Logger.getLogger(WeightageConfigServiceImpl.class);

	/**
	 * Used to save or update the WeightageConfigDM data into the database.    
	 *  
	 * 
	 * @param WeightageConfigDM
	 *            objweightageConfigDM         
	 */
	@Transactional
	public void saveOrUpdateWeightageConfig(
			WeightageConfigDM objweightageConfigDM) {
		weightageConfigDAO.saveOrUpdateWeightageConfig(objweightageConfigDM);
	}

	/**
	 * used to Retrieve data from WeightageConfigDM based on given parameters.
	 *   
	 * 
	 * @param Long weightage_id, Long batchId, String status 
	 * @return WeightageConfigDM List         
	 */
	@Transactional
	public List<WeightageConfigDM> getWeightageConfigList(Long weightage_id,
			Long batchId, String status) {
		return weightageConfigDAO.getWeightageConfigList(weightage_id, batchId,
				status);

	}

}
