
package com.base.serviceimpl.mst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.ModuleDAO;
import com.base.domain.mst.ModuleDM;
import com.base.service.mst.ModuleService;



public class ModuleServiceImpl implements ModuleService {
	
	@Autowired
	private ModuleDAO moduledao;
	
	/**
	        * Used to save or update the MBaseModule data into the database.
	        * @param moduleName,status
	        * return List<MBaseModule>
	        */
	@Transactional
	public List<ModuleDM> getModuleList(String moduleName, String status) {
		// TODO Auto-generated method stub
		return moduledao.getModuleList(moduleName, status);
	}
	@Transactional
	public List<ModuleDM> getModuleList(Long companyId) {
		// TODO Auto-generated method stub
		return moduledao.getModuleList(companyId);
	}

}
