package com.academic.dao.txn;

import java.util.List;

import com.academic.domain.txn.WeightageConfigDM;

public interface WeightageConfigDAO {
	/**
	 * Used to save or update the WeightageConfigDM data into the database.    
	 *  
	 * 
	 * @param WeightageConfigDM
	 *            objweightageConfigDM         
	 */
	public void saveOrUpdateWeightageConfig(WeightageConfigDM objweightageConfigDM);

	/**
	 * used to Retrieve data from WeightageConfigDM based on given parameters.
	 *   
	 * 
	 * @param Long weightage_id,
			Long batchId, String status 
	 * @return WeightageConfigDM List         
	 */
	public List<WeightageConfigDM> getWeightageConfigList(Long weightage_id,
			Long batchId, String status);
}
