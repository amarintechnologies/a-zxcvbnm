
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.RoleDAO;
import com.base.domain.mst.RoleDM;

@Repository
public class RoleDAOImpl implements RoleDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(RoleDAOImpl.class);

	/**
	 * Return List of RoleDM, based on user's input
	 * 
	 * @param String
	 *            roleName
	 * @param String
	 *            status
	 * @param Long
	 *            companyId
	 * @param String
	 *            filtertype
	 * @return RoleDM List
	 * 
	 */
	public void saveOrUpdateRole(RoleDM RoleObj) {
		sessionfactory.getCurrentSession().saveOrUpdate(RoleObj);
	}

	public List<RoleDM> getRoleList(String rolename, String status,
			Long companyId, String filtertype) {
		logger.info("Inside getRoleList >  " + rolename + ", " + status + ","
				+ companyId + "," + filtertype);
		Query query = null;
		StringBuffer sql = new StringBuffer(" select ");
		if (filtertype.equals("P")) {
			sql.append(" new RoleDM(roleId,roleName) ");
		} else {
			sql.append(" m ");
		}
		sql.append(" from RoleDM  m WHERE 1=1");
		if (rolename != null && rolename.trim().length() > 0) {
			sql.append(" and lower(m.roleName) like lower('" + rolename + "%')");
		}

		if (status != null) {
			sql.append(" and m.roleStatus ='" + status + "'");
		}
		if (companyId != null) {
			sql.append(" and m.companyid =" + companyId);
		}
		sql.append("  order by m.lastUpdatedDt  desc");
		logger.info("Inside getRoletList > Query > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString());
		return query.list();
	}
}
