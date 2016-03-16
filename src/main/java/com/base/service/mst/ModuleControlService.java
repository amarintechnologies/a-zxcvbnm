
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.ModuleDM;
import com.base.domain.mst.ModuleControlDM;

public interface ModuleControlService {
	
	/**
	 * To get ModuleControlDM list based on moduleCode,moduleName and status
	 * 
	 * @param Long
	 *            moduleCode,String strStatus , Long companyId
	 * 
	 * @return ModuleControlDM list
	 */
	public List<ModuleControlDM> getModuleControlList(Long moduleCode, String strStatus, Long companyId);
	
	/** Method for get Active List of Module **/
	/**
	 * @return ModuleDM list
	 */
	public List<ModuleDM> getModuleList();
}
