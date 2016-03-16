
package com.base.dao.mst;

import java.util.List;

import com.base.domain.mst.ParameterDM;

public interface ParameterDAO {
	/** Method for update Parameter **/
	/**
	 * @param paramObj
	 *            of ParameterDM
	 */
	public void updateDetails(ParameterDM paramObj);
	
	/**
	 * get the Parameter value based parameter reference and companyId in Parameter
	 * 
	 * @param String
	 *            paramRef Long companyId String moduleCode
	 * 
	 * @return string
	 * 
	 */
	public String getParameterValue(String paramRef, Long companyId, Long moduleCode);
	
	/**
	 * To search details on Parameter table
	 * 
	 * @param Long
	 *            paramId String paramRef String status Long companyId 
	 * 
	 * @return list of ParameterDM
	 * 
	 */
	public List<ParameterDM> getParameterList(Long moduleCode,Long paramId, String paramRef, String status, Long companyId);
}
