
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.ModuleControlDM;
import com.base.domain.mst.ModuleDM;

public interface ModuleControlDAO {
	/**
	 * To get ModuleControl list based on moduleCode,moduleName and status from M_BASE_MODULE_CTRL
	 * 
	 * @param Long
	 *            moduleCode,String strStatus , Long companyId
	 * 
	 * @return ModuleControlDM list
	 */
	public List<ModuleControlDM> getModuleControlList(Long moduleCode, String strStatus, Long companyId);
	
	/** Method for get Active List of Module  from M_BASE_MODULE**/
	/**
	 * @return ModuleDM list
	 */
	public List<ModuleDM> getModuleList();
}
