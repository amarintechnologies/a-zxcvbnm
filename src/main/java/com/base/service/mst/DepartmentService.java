
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.DepartmentDM;

public interface DepartmentService {
	/**
	 * To save department details
	 * 
	 * @param deptobj
	 * 
	 */
	public void saveDepartmentDetails(DepartmentDM deptobj);
	
	/**
	 * To get details from department table depends on condition
	 * 
	 * @param compid
	 *            deptname status
	 * 
	 * @return List<DepartmentDM>
	 * 
	 */
	public List<DepartmentDM> getDepartmentList(Long compid, String deptname, String status, String filtertype);
	
	// Unit Test case
	public void updateTest(Long deptid);
	
	/**
	 * Method for return Department Name of DepartmentDM
	 * 
	 * @param deptId
	 */
	public String getDepartmentByDeptId(Long deptId);
}
