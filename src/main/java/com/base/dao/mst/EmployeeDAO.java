
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.EmployeeDM;

public interface EmployeeDAO {
	/**
	 * Used to save or update the EmployeeDM data into the database.         
	 * 
	 * @param EmployeeDM
	 *            employeeObj         
	 */
	public void saveOrUpdateEmploye(EmployeeDM employeeObj);
	
	/**
	 * This Method returns EmployeeDM details based on user's input
	 * 
	 * @param String
	 *            empname, String empcode, Long department, String status, Long companyId, Long employeeId, Long userId,
	 *            Long branchid, String filtertype
	 * @return List<EmployeeDM>
	 */
	public List<EmployeeDM> getEmployeeList(String empname, String empcode, Long department, String status,
			Long companyId, Long employeeId, Long userId, Long branchid, Long countryId, String filtertype);
	
	public List<EmployeeDM> getEmployeeList(Long employeeid,String status,
			Long companyId);
	
	/**
	 * This Method updates User Status based on userId
	 * 
	 * @Param Long userId
	 */
	public void updateUserStatus(Long userId);
	

	/**
	 * This Method updates Employeedetails based on EmployeeDM employeeObj
	 * 
	 * @Param EmployeeDM employeeObj
	 */
	
	public void updateEmployeedetails(EmployeeDM employeeObj);
	
	/**
	 * This Method used to check approved manager.
	 * 
	 * @Param Long employeeId
	 * 
	 */
	public int checkApprovedManager(Long employeeId);
	
	/**
	 * This Method used for get approve manager based on login employee.
	 * 
	 * @Param Long LoginEmployeeId
	 * 
	 */
	public Long getApproveManager(Long LoginEmployeeId);
	public List<EmployeeDM> getStafflistByGradeHirarchy(Long gradeid);
	public List<EmployeeDM> getEmployeeList(String empcode, Long department, String status,
			Long companyId,Long userId, Long branchid, Long countryId, String filtertype);
	
	public List<EmployeeDM> getPayPeriodList(Long payperiodId,Long branchid);
	
}
