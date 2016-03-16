
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.ParameterDM;

public interface ParameterService {
	/** Method for update ParameterDM **/
	/**
	 * @param paramObjof
	 *            ParameterDM
	 */
	public void updateDetails(ParameterDM paramObj);
	
	/**
	 * getting the parameter value based on parameter reference in ParameterDM
	 * 
	 * @param String
	 *            paramRef Long companyId String moduleCode
	 * @return String
	 */
	public String getParameterValue(String paramRef, Long companyId, Long moduleCode);
	
	/**
	 * To search details on ParameterDM table
	 * 
	 * @param Long
	 *            paramId String paramRef String status Long companyId
	 * 
	 * @return list of ParameterDM
	 * 
	 */
	public List<ParameterDM> getParameterList(Long moduleCode, Long paramId, String paramRef, String status, Long companyId);
}
