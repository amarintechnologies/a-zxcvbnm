
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.EmployeeDAO;
import com.base.domain.mst.EmployeeDM;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(EmployeeDAOImpl.class);
	
	/**
	 * To save or update employee details
	 * 
	 * @param EmployeeDM
	 *            employeeObj
	 * 
	 */
	public void saveOrUpdateEmploye(EmployeeDM employeeObj) {
		logger.info("Inside saveOrUpdateEmploye > " + employeeObj.getEmployeeid());
		sessionfactory.getCurrentSession().saveOrUpdate(employeeObj);
	}
	
	/**
	 * To get details from employee table depends on condition if all arguments are null it returns full list
	 * 
	 * @param String
	 *            empname, String empcode, Long department, String status, Long companyId, Long employeeId, Long userId,
	 *            Long branchid, String filtertype
	 * @return list EmployeeDM
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<EmployeeDM> getEmployeeList(String empname,String empcode, Long department, String status,
			Long companyId, Long employeeId, Long userId, Long branchid, Long countryId, String filtertype) {
		logger.info("Inside getEmployeeList > " + empname + "," + empcode + "," + department + "," + status + ","
				+ companyId + "," + employeeId + "," + userId + "," + branchid + "," + countryId + "," + filtertype);
		StringBuffer sql = new StringBuffer("select ");
		if (filtertype.equals("P")) {
			sql.append(" m.employeeid as employeeid, m.employeecode as employeecode, m.firstname as firstname, m.lastname as lastname");
		} else {
			sql.append(" m.employeeid as employeeid, m.employeecode as employeecode, m.firstname as firstname,");
			sql.append(" m.lastname as lastname, m.companyid as companyid, m.userId as userId,");
			sql.append(" m.primaryphone as primaryphone, m.primaryemail as primaryemail, m.dob as dob,");
			sql.append(" m.gender as gender, d.deptid as deptid, b.branchId as branchid, m.doj as doj,");
			sql.append(" m.rmemployeeid as rmemployeeid, d.deptname as deptname, m.empstatus as empstatus,");
			sql.append(" d.lastupdateddt as lastupdateddt, m.lastupdatedby as lastupdatedby,");
			sql.append(" b.branchName as branchName, m.loginAccess as loginAccess, m.empphoto as empphoto,");
			sql.append(" c.countryID as countryid,c.countryName as companyname");
		}
		sql.append(" from EmployeeDM m, DepartmentDM d, BranchDM b, CountryDM c WHERE m.deptid = d.deptid AND m.branchid = b.branchId AND m.countryid = c.countryID");
		if (empname != null && empname.trim().length() > 0) {
			sql.append(" and lower(m.firstname) like lower('" + empname + "%')");
		}
		if (empcode != null && empcode.trim().length() > 0) {
			sql.append(" and lower(m.employeecode) like lower('" + empcode + "%')");
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and m.empstatus = '" + status + "'");
		}
		if (department != null && department != 0L) {
			sql.append(" and m.deptid = " + department);
		}
		if (companyId != null) {
			sql.append(" and m.companyid = " + companyId);
		}
		if (employeeId != null) {
			sql.append(" and lower(m.employeeid) like lower('" + employeeId +"%')");
		}
		if (userId != null) {
			sql.append(" and m.userId = " + userId);
		}
		if (branchid != null) {
			sql.append(" and m.branchid = " + branchid);
		}
		if (countryId != null) {
			sql.append(" and m.countryID = " + countryId);
		}
		sql.append("  order by m.lastupdateddt  desc");
		logger.info("Inside getEmployeeList > SQL " + sql);
		Query query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(EmployeeDM.class));
		return query.list();
	}
	
	
	public List<EmployeeDM> getEmployeeList(Long employeeid,String status,
			Long companyId){
		StringBuffer sql=new StringBuffer("select e from EmployeeDM e where e.employeeid in(select a.employeeId from ");
				sql.append("AccountsDM a where a.companyId="+companyId+" and a.acctstatus = '"+ status+ "')");
				logger.info("Inside getEmployeeList > SQL " + sql);
		Query query = sessionfactory.getCurrentSession().createQuery(sql.toString());
		return query.list();
	}
	/**
	 * This Method used to Update user Status.
	 * 
	 * @Param Long userId
	 */
	public void updateUserStatus(Long userId) {
		logger.info("Inside getEmployeeList > " + userId);
		String sql = "update UserDM u set u.userstatus = 'Inactive' where u.userid = " + userId;
		logger.info("Inside updateUserStatus > Query > " + sql);
		sessionfactory.getCurrentSession().createSQLQuery(sql).executeUpdate();
	}
	
	/**
	 * This Method updates Employeedetails based on EmployeeDM employeeObj
	 * 
	 * @Param EmployeeDM employeeObj
	 */
	
	public void updateEmployeedetails(EmployeeDM employeeObj) {
		String sql = "update EmployeeDM e set e.employeeid=" + employeeObj.getEmployeeid() + ",e.firstname='" + employeeObj.getFirstname() + "',e.lastname='"
				+ employeeObj.getLastname() + "',e.primaryphone='" + employeeObj.getPrimaryphone()
				+ "',e.primaryemail='" + employeeObj.getPrimaryemail() + "',e.companyid=" + employeeObj.getCompanyid()
				+ ",e.dob ='" + employeeObj.getDob() + "',e.deptid="
				+ employeeObj.getDeptid() + " where e.employeeid=" + employeeObj.getEmployeeid();
		logger.debug("updateEmployeedetails()-- updated Query--->" + sql);
		int result = sessionfactory.getCurrentSession().createQuery(sql).executeUpdate();
		logger.debug("Rows affected : " + result);
	}
	
	/**
	 * This Method used to check approved manager.
	 * 
	 * @Param employeeId return Integer
	 * @return int
	 */
	public int checkApprovedManager(Long employeeId) {
		logger.info("Inside getEmployeeList > " + employeeId);
		String sql = "SELECT count(*) FROM EmployeeDM where  rmemployeeid = " + employeeId;
		Query query = sessionfactory.getCurrentSession().createQuery(sql);
		return Integer.valueOf(query.list().get(0).toString());
	}
	
	/**
	 * This Method used for get approve manager based on login employee.
	 * 
	 * @Param Long LoginEmployeeId
	 * @return Long
	 */
	public Long getApproveManager(Long LoginEmployeeId) {
		logger.info("Inside getEmployeeList > " + LoginEmployeeId);
		String sql = "select e.employeeid from EmployeeDM e where e.employeeid = " + LoginEmployeeId;
		logger.info("Inside getApproveManager > Query > " + sql);
		Query query = sessionfactory.getCurrentSession().createSQLQuery(sql);
		return Long.valueOf(query.list().get(0).toString());
	}
	
	public List<EmployeeDM> getStafflistByGradeHirarchy(Long gradeid) {
		// TODO Auto-generated method stub
		String sql = "	SELECT e1 FROM EmployeeDM e1 WHERE e1.employeeid IN (SELECT dtl.employeeid"
				+ " FROM EmployeeDtlsDM dtl WHERE dtl.gradeid IN(SELECT g.gradeId FROM GradeDM g"
				+ " WHERE g.gradeHirarchy>(SELECT g1.gradeHirarchy FROM GradeDM g1"
				+ " WHERE g1.gradeId =(select dtl1.gradeid from  EmployeeDtlsDM dtl1 where dtl1.employeeid="+gradeid+"))))";
		Query query = sessionfactory.getCurrentSession().createQuery(sql);
		return query.list();
	}
	
	public List<EmployeeDM> getEmployeeList(String empcode, Long department, String status,
			Long companyId,Long userId, Long branchid, Long countryId, String filtertype)
			{
		String sql="SELECT e FROM EmployeeDM e where e.employeeid IN(select ed.employeeid from EmployeeDtlsDM ed"
				+ " WHERE ed.employeestatusid NOT IN(SELECT es.empstatusid FROM EmploymentStatusDM es WHERE es.empstatuscode='TER'"
				+ "AND es.status='Active'))";
		Query query = sessionfactory.getCurrentSession().createQuery(sql);
		return query.list();
			}
	public List<EmployeeDM> getPayPeriodList(Long payperiodId,Long branchid)
			{
		String sql="SELECT e FROM EmployeeDM e WHERE e.branchid="+branchid+" and e.employeeid IN (SELECT ed.employeeid FROM EmployeeDtlsDM ed WHERE "
				+ "ed.payperiodid="+payperiodId+" and ed.employeestatusid NOT IN (SELECT es.empstatusid FROM EmploymentStatusDM es "
				+ "WHERE es.empstatuscode='TER'))";

		Query query = sessionfactory.getCurrentSession().createQuery(sql);
		return query.list();
			}
}
