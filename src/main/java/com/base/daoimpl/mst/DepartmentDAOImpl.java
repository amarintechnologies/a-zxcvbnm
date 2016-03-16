
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.DepartmentDAO;
import com.base.domain.mst.BranchDM;
import com.base.domain.mst.DepartmentDM;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Value("${GET_DEPT_LIST}")
	private String queryStr;
	private Logger logger = Logger.getLogger(DepartmentDAOImpl.class);
	
	/**
	 * To save department details
	 * 
	 * @param DepartmentDM
	 *            deptobj
	 * 
	 */
	public void saveDepartmentDetails(DepartmentDM deptobj) {
		logger.info("Inside saveDepartmentDetails > " + deptobj.getCompanyid() + ", " + deptobj.getDeptname());
		sessionFactory.getCurrentSession().saveOrUpdate(deptobj);
	}
	
	/**
	 * To get details from department table depends on condition if all arguments are null it returns full list
	 * 
	 * @param Long
	 *            compid, String deptname, String status, String filtertype
	 * 
	 * @return DepartmentDM list
	 * 
	 */
	public List<DepartmentDM> getDepartmentList(Long compid, String deptname, String status, String filtertype) {
		Query query = null;
		logger.info("Inside getDepartmentList > " + compid + ", " + deptname + ", " + status);
		StringBuilder sql = new StringBuilder("select ");
		if (filtertype.equals("P")) {
			sql.append(" new DepartmentDM(deptid,deptname) ");
		} else {
			sql.append(" m ");
		}
		sql.append(" FROM DepartmentDM m WHERE 1=1 ");
		if (deptname != null && deptname.trim().length() > 0) {
			sql.append(" and lower(m.deptname) like lower('" + deptname + "%')");
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and m.deptstatus =  '" + status + "'");
		}
		if (compid != null) {
			sql.append(" and m.companyid = " + compid);
		}
		sql.append(" order by m.lastupdateddt desc");
		logger.info("Inside getDepartmentList > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString());
		return query.list();
	}
	
	public void updateTest(Long deptid) {
		logger.info("Inside updateTest ");
		sessionFactory.getCurrentSession()
				.createQuery("update DepartmentDM m set m.deptname='Testing done' where m.deptid=" + deptid)
				.executeUpdate();
	}
	
	/**
	 * Method for return Department Name of DepartmentDM
	 * 
	 * @param deptId
	 */
	public String getDepartmentByDeptId(Long deptId) {
		logger.info("Inside getDepartmentByDeptId > " + deptId);
		String sql = "select m.deptname from DepartmentDM m where m.deptid =" + deptId;
		logger.info("Inside getDepartmentByDeptId > Query > " + sql);
		Query query = sessionFactory.getCurrentSession().createQuery(sql)
				.setResultTransformer(Transformers.aliasToBean(DepartmentDM.class));
		return String.valueOf(query.list().get(0)).toString();
	}
}
