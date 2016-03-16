
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.EmployeeDAO;
import com.base.domain.mst.EmployeeDM;
import com.base.service.mst.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeedao;
	private Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	/**
	 * Used to save or update the EmployeeDM data into the database.         
	 * 
	 * @param EmployeeDM
	 *            employeeObjsaveOrUpdateEmploye
	 */
	@Transactional
	public void saveOrUpdateEmploye(EmployeeDM employeeObj) {
		logger.info("Inside saveOrUpdateEmploye > " + employeeObj);
		employeedao.saveOrUpdateEmploye(employeeObj);
	}

	/**
	 * This Method returns EmployeeDM details based on user's input
	 * 
	 * @param empname
	 *            empcode department status companyId employeeId userId branchId
	 *            filtertype
	 * @return List<EmployeeDM>
	 */
	@Transactional
	public List<EmployeeDM> getEmployeeList(String empname, String empcode,
			Long department, String status, Long companyId, Long employeeId,
			Long userId, Long branchId, Long countryId, String filtertype) {
		logger.info("Inside getEmployeeList > " + empname + "," + empcode + ","
				+ department + "," + status + "," + companyId + ","
				+ employeeId + "," + userId + "," + branchId + "," + filtertype);
		return employeedao.getEmployeeList(empname, empcode, department,
				status, companyId, employeeId, userId, branchId, countryId,
				filtertype);
	}

	@Transactional
	public List<EmployeeDM> getEmployeeList(Long employeeid, String status,
			Long companyId) {
		logger.info("Inside getEmployeeList > " + employeeid + "," + status
				+ "," + companyId);
		return employeedao.getEmployeeList(employeeid, status, companyId);
	}

	/**
	 * This Method updates User Status based on userId
	 * 
	 * @Param Long userId
	 */
	@Transactional
	public void updateUserStatus(Long userId) {
		logger.info("Inside updateUserStatus > " + userId);
		employeedao.updateUserStatus(userId);
	}

	/**
	 * This Method used to check approved manager.
	 * 
	 * @Param Long employeeId
	 * @return int
	 */
	@Transactional
	public int checkApprovedManager(Long employeeId) {
		logger.info("Inside checkApprovedManager > " + employeeId);
		return employeedao.checkApprovedManager(employeeId);
	}

	/**
	 * This Method used for get approve manager based on login employee.
	 * 
	 * @Param Long LoginEmployeeId
	 * @return Long
	 */
	@Transactional
	public Long getApproveManager(Long LoginEmployeeId) {
		logger.info("Inside getApproveManager > " + LoginEmployeeId);
		return employeedao.getApproveManager(LoginEmployeeId);
	}

	/**
	 * This Method used for update Employee details based on employeeObj.
	 * 
	 * @Param EmployeeDM employeeObj
	 */
	@Transactional
	public void updateEmployeedetails(EmployeeDM employeeObj) {
		employeedao.updateEmployeedetails(employeeObj);
	}

	@Transactional
	public List<EmployeeDM> getStafflistByGradeHirarchy(Long gradeid) {
		return employeedao.getStafflistByGradeHirarchy(gradeid);
	}

	@Transactional
	public List<EmployeeDM> getEmployeeList(String empcode, Long department,
			String status, Long companyId, Long userId, Long branchid,
			Long countryId, String filtertype) {
		// TODO Auto-generated method stub
		return employeedao.getEmployeeList(empcode, department, status,
				companyId, userId, branchid, countryId, filtertype);
	}

	@Transactional
	public List<EmployeeDM> getPayPeriodList(Long payperiodId, Long branchid) {
		// TODO Auto-generated method stub
		return employeedao.getPayPeriodList(payperiodId, branchid);
	}
}
