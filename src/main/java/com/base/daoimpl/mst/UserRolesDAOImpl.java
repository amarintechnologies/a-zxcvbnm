
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.UserRolesDAO;
import com.base.domain.mst.UserRolesDM;

@Repository
public class UserRolesDAOImpl implements UserRolesDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(UserRolesDAOImpl.class);
	
	/**
	 * get role id based on user Id and companyId in UserRolesDM
	 * 
	 * @param Long
	 *            userId,Long companyId
	 * @return Long roleId
	 */
	public Long getRoleIdByUserId(Long userId, Long companyId) {
		String sql = "select role_id from m_base_user_roles where company_id=" + companyId + " and user_id=" + userId;
		Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
		return Long.valueOf(query.list().get(0).toString());
	}
	
	/**
	 * Used to save or update the UserRolesDM data into the database.         
	 * 
	 * @param RoleObj
	 *                    
	 */
	public void saveOrUpdateUserRole(UserRolesDM RoleObj) {
		sessionFactory.getCurrentSession().saveOrUpdate(RoleObj);
	}
	
	/**
	 * This Method returns UserRolesDM details based on user's input
	 * 
	 * @param Long
	 *            roleId, Long userId, String status, Long companyId, Long Userroleid, String filtertype
	 * @return List UserRolesDM
	 */
	public List<UserRolesDM> getRoleList(Long roleId, Long userId, String status, Long companyId, Long Userroleid,
			String filtertype) {
		Query query = null;
		StringBuffer sql = new StringBuffer(" select");
		if (filtertype.equals("P")) {
			sql.append(" new UserRolesDM(userroleid) ");
		} else {
			sql.append(" u.userroleid as userroleid,u.roleId as roleId,u.userId as userId,");
			sql.append(" u.companyId as companyId,u.status as status,u.lastUpdatedDt as lastUpdatedDt,");
			sql.append(" u.lastUpdatedBy as lastUpdatedBy,r.roleName as roleName,c.loginid as loginid");
		}
		sql.append(" from UserRolesDM u, RoleDM r,UserDM c where 1=1 ");
		sql.append(" and u.roleId = r.roleId ");
		sql.append(" and u.userId = c.userid");
		if (roleId != null) {
			sql.append(" and u.roleId =" + roleId);
		}
		if (userId != null) {
			sql.append(" and u.userId=" + userId);
		}
		if (status != null) {
			sql.append(" and u.status='" + status + "'");
		}
		if (companyId != null) {
			sql.append(" and u.companyId=" + companyId);
		}
		sql.append(" order by u.lastUpdatedDt  desc");
		logger.debug("getRoleList() sql >>" + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(UserRolesDM.class));
		return query.list();
	}
	
	/**
	 * Method for delete User Role
	 * 
	 * @param Long
	 *            userId
	 * 
	 */
	public void deleteUserRole(Long userId) {
		logger.info("Inside deleteUser > delete from UserRolesDM m where m.userId = " + userId);
		Query query = sessionFactory.getCurrentSession().createQuery(
				"delete from UserRolesDM m where m.userId = " + userId);
		query.executeUpdate();
	}
}
