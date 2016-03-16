
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.ModuleDM;

public interface ModuleService {

	/**
	        * used to Retrieve data from ModuleDM table based on given parameters.
	        * 
	        * @param  moduleName,status
	        * @return List<ModuleDM>
	        */
 public List<ModuleDM> getModuleList(String moduleName,String status);
 
 public List<ModuleDM> getModuleList(Long companyId);
}
