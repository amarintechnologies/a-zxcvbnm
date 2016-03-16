
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.DepartmentDM;

public interface DepartmentDAO {
	/**
	 * To save department details
	 * 
	 * @param DepartmentDM
	 *            deptobj
	 * 
	 */
	public void saveDepartmentDetails(DepartmentDM deptobj);
	
	/**
	 * To get details from department table depends on condition if all arguments are null it returns full list
	 * 
	 * @param Long
	 *            compid, String deptname, String status, String filtertype
	 * 
	 * @return DepartmentDM list
	 * 
	 */
	public List<DepartmentDM> getDepartmentList(Long compid, String deptname, String status, String filtertype);
	
	// Unit test case
	public void updateTest(Long deptid);
	
	/**
	 * Method for return Department Name of DepartmentDM
	 * 
	 * @param deptId
	 */
	public String getDepartmentByDeptId(Long deptId);
}
