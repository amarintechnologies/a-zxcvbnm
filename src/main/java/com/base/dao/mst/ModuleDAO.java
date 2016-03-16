
package com.base.dao.mst;

import java.util.List;

import com.base.domain.mst.ModuleDM;


public interface ModuleDAO {
	
	 /**
	        * used to Retrieve data from MBaseModule table based on given parameters.
	        * 
	        * @param  moduleName,status
	        * @return List<MBaseModule>
	        */
 public List<ModuleDM> getModuleList(String moduleName,String status);
 
 public List<ModuleDM> getModuleList(Long companyId);


}
