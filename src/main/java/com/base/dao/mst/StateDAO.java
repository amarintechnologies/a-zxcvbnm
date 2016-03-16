
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.StateDM;

public interface StateDAO {
	/**
	 * Used to save or update the State data into the database.      
	 * 
	 * @param StateDM stateObj
	 *                    
	 */
	public void saveOrUpdateState(StateDM stateObj);
	
	/**
	 * used to Retrieve data from M_Base_State table based on given parameters.   
	 * 
	 * @param String stateName
	 * @param String status
	 * @param Long countryId
	 * @param Long companyId   
	 * @param String filtertype      
	 * @return StateDM List         
	 */
	public List<StateDM> getStateList(String stateName, String status, Long countryId, Long companyId, String filtertype);
}