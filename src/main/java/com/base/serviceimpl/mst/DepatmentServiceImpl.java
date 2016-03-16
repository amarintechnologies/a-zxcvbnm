
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.DepartmentDAO;
import com.base.domain.mst.DepartmentDM;
import com.base.service.mst.DepartmentService;

public class DepatmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDAO deptDAO;
	private Logger logger = Logger.getLogger(DepatmentServiceImpl.class);

	/**
	 * To save and update PFbalanceDM details.
	 * 
	 * @param PFbalanceDM
	 *            obj
	 */

	@Transactional
	@CacheEvict(value = "department", allEntries = true)
	public void saveDepartmentDetails(DepartmentDM deptobj) {
		logger.info("Inside saveDepartmentDetails > "
				+ "About to save the data ... ");
		deptDAO.saveDepartmentDetails(deptobj);
	}

	/**
	 * To return data from DepartmentDM based on user's input
	 * 
	 * @param Long
	 *            compid, String deptname, String status, String filtertype
	 */

	@Transactional
	@Cacheable(value = "department")
	public List<DepartmentDM> getDepartmentList(Long compid, String deptname,
			String status, String filtertype) {
		logger.info("Inside getDepartmentList > "
				+ "About to get Dept. list for " + compid + ", " + deptname
				+ ", " + status);
		return deptDAO.getDepartmentList(compid, deptname, status, filtertype);
	}

	// Unit test case
	@Transactional
	public void updateTest(Long deptid) {
		logger.info("Inside updateTest > " + "Executing test case for "
				+ deptid);
		deptDAO.updateTest(deptid);
	}

	/**
	 * Method for return Department Name of DepartmentDM
	 * 
	 * @param deptId
	 */
	public String getDepartmentByDeptId(Long deptId) {
		logger.info("Inside getDepartmentByDeptId > " + deptId);
		return deptDAO.getDepartmentByDeptId(deptId);
	}
}
