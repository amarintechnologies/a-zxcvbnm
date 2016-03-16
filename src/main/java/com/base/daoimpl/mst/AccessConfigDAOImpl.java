
package com.base.daoimpl.mst;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.AccessConfigDAO;
import com.base.domain.mst.AccessConfigDM;

@Repository
public class AccessConfigDAOImpl implements AccessConfigDAO {
	@Autowired
	private SessionFactory sessionfactory;
	@Autowired
	private DataSource dataSource;
	@Value("${GET_ACCESS_CONFIG_LIST}")
	private String queryStr;
	private Logger logger = Logger.getLogger(AccessConfigDAOImpl.class);
	
	// logger.info("MBaseAccessConfigDAOImpl App called");
	/**
	 * To save access config table details
	 * 
	 * @param accessobj
	 * 
	 */
	public void saveAccessConfigDetails(AccessConfigDM accessobj) {
		try {
			if (accessobj.getConfigId() != null) {
				sessionfactory.getCurrentSession().saveOrUpdate(accessobj);
			} else {
				String sql = "update AccessConfigDM a set a.publicYN='" + accessobj.getPublicYN() + "',a.viewYN='"
						+ accessobj.getViewYN() + "',a.createYN='" + accessobj.getCreateYN() + "',a.reviewYN='"
						+ accessobj.getReviewYN() + "',a.recLVL='" + accessobj.getRecLVL() + "' where a.scrID="
						+ accessobj.getScrID() + " and a.companyid=" + accessobj.getCompanyid() + " and a.branchid ="
						+ accessobj.getBranchid() + " and a.roleId=" + accessobj.getRoleId();
				logger.debug("saveAccessConfigDetails()-- updated Query--->" + sql);
				int result = sessionfactory.getCurrentSession().createQuery(sql).executeUpdate();
				logger.debug("Rows affected : " + result);
			}
			logger.info("Scucessfully saved");
		}
		catch (Exception e) {
			logger.error("Error on saving record-->" + e);
		}
	}
	
	/**
	 * To get details from access config table depends on condition if all arguments are null it returns entire list
	 * 
	 * @param   scrID
	 *            configId companyId branchId roleid status
	 * 
	 * @return list
	 * 
	 */
	public List<AccessConfigDM> getAccessConfigList(Long scrID, Long configId, Long companyId, Long branchId,
			Long roleid, String status) {
		StringBuilder sql = new StringBuilder("select m from AccessConfigDM m where 1=1 ");
		if (scrID != null) {
			sql.append("and m.scrID = " + scrID + "");
		}
		if (configId != null) {
			sql.append("and m.configId = " + configId + "");
		}
		if (companyId != null) {
			sql.append("and m.companyid =" + companyId);
		}
		if (branchId != null) {
			sql.append("and m.branchid =" + branchId);
		}
		if (roleid != null) {
			sql.append("and m.roleId =" + roleid);
		}
		if (status != null) {
			sql.append("and m.status = '" + status + "'");
		}
		sql.append("order by m.lastUpdatedDate desc");
		logger.debug("getAccessConfigList() Exec Query --->"+sql);
		return sessionfactory.getCurrentSession().createQuery(sql.toString()).list();
	}
	
	/**
	 * To check the user authorization based on role returns Y or N
	 * 
	 * @param appscode
	 *            configcode roleid
	 * 
	 * @return string
	 * 
	 */
	public String checkUserAuthorization(String appscode, String configcode, Long roleid) {
		Connection conn = null;
		CallableStatement stmt = null;
		try {
			conn = dataSource.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.prepareCall("{ ? = call FN_GET_ACCESS_FLAG(?,?,?) }");
			stmt.registerOutParameter(1, Types.VARCHAR);
			stmt.setString(2, appscode);
			stmt.setString(3, configcode);
			stmt.setLong(4, roleid);
			stmt.execute();
			logger.info("oreacle procedure return value :" + stmt.getString(1));
			return stmt.getString(1);
		}
		catch (SQLException e) {
			logger.info("SQLException on fn_checkUserUserAuthorization(), Error on Excecuting the oracle procedure "
					+ "FN_GET_ACCESS_FLAG() -->" + e);
			return "N";
		}
		finally {
			try {
				stmt.close();
				conn.close();
			}
			catch (SQLException e) {
				logger.info("fn_checkUserUserAuthorization(), Error on Excecuting the oracle procedure "
						+ "FN_GET_ACCESS_FLAG() -->" + e);
				return "N";
			}
		}
	}
	
	/**
	 * To get details of OnOff Status from access config table depends on condition if all arguments are null it returns
	 * entire list
	 * 
	 * @param companyId
	 *            branchId RoleId screenCode
	 * 
	 * @return list
	 * 
	 */
	public String getOnOFFStatusbasedonScreenCodeandCompanyIdansBranchIdandRoleId(Long companyId, Long branchId,
			Long RoleId, String screenCode) {
		// TODO Auto-generated method stub
		try {
			String sql = "select c.on_off from m_base_access_config c where c.role_id= " + RoleId
					+ " and c.company_id=" + companyId + " and c.scr_fld_ref in"
					+ "(select b.scr_fld_ref from m_base_app_scrn_fields b where b.screen_id in"
					+ "(select a.screen_id from m_base_app_screens a where a.screen_code='" + screenCode + "'))";
			Query query = sessionfactory.getCurrentSession().createSQLQuery(sql);
			return String.valueOf(query.list().get(0).toString());
		}
		catch (Exception e) {
			// e.printStackTrace();
			return "N";
		}
	}
	
	/**
	 * To delete the specify records from access config table depends on condition
	 * 
	 * @param companyId
	 *            branchId roleId
	 * 
	 * 
	 */
	public void updateaccessconfigoldrecords(Long companyId, Long branchId, Long roleId) {
		// TODO Auto-generated method stub
		String sql = "update  AccessConfigDM c set c.status='InActive' where c.companyid = " + companyId
				+ " and c.branchid = " + branchId + " and c.roleId = " + roleId + "";
		sessionfactory.getCurrentSession().createQuery(sql).executeUpdate();
	}
	
	public void saveScreenAccessDetail(AccessConfigDM accessobj) {
		// TODO Auto-generated method stub
		try {
			sessionfactory.getCurrentSession().save(accessobj);
			logger.info("Scucessfully saved");
		}
		catch (Exception e) {
			logger.error("Error on saving record-->" + e);
		}
	}
	
	public List<AccessConfigDM> saveScreenAccessDetail(Long companyId, Long branchId, Long roleId, String pubYN,
			String viewYN, String createYN, String reviewYN, String appYN, String recLVL, String status) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder(queryStr);
		if (companyId != null) {
			sql.append("and m.companyid =" + companyId);
		}
		if (branchId != null) {
			sql.append("and m.branchid =" + branchId);
		}
		if (roleId != null) {
			sql.append("and m.roleId =" + roleId);
		}
		if (pubYN != null) {
			sql.append("and m.publicYN = '" + pubYN + "'");
		}
		if (viewYN != null) {
			sql.append("and m.viewYN = '" + viewYN + "'");
		}
		if (createYN != null) {
			sql.append("and m.createYN = '" + createYN + "'");
		}
		if (reviewYN != null) {
			sql.append("and m.reviewYN = '" + reviewYN + "'");
		}
		if (appYN != null) {
			sql.append("and m.approYN = '" + appYN + "'");
		}
		if (recLVL != null) {
			sql.append("and m.recLVL = '" + recLVL + "'");
		}
		if (status != null) {
			sql.append("and m.status = '" + status + "'");
		}
		sql.append("order by m.lastUpdatedDate desc");
		return sessionfactory.getCurrentSession().createQuery(sql.toString()).list();
	}
}
