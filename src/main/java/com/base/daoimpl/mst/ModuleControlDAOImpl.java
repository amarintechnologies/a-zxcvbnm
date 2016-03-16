
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.ModuleControlDAO;
import com.base.domain.mst.ModuleControlDM;
import com.base.domain.mst.ModuleDM;

@Repository
public class ModuleControlDAOImpl implements ModuleControlDAO {
	/** @Autowired refers that integrating the spring concepts that is using for linking with specified class **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(ModuleControlDAOImpl.class);
	
	/**
	 * To get ModuleControlDM list based on moduleCode,moduleName and status
	 * 
	 * @param Long
	 *            moduleCode,String strStatus , Long companyId
	 * 
	 * @return ModuleControlDM list
	 */
	public List<ModuleControlDM> getModuleControlList(Long moduleCode, String strStatus, Long companyId) {
		logger.info("Inside getmodulectrlList >  " + moduleCode + ", " + strStatus + "," + companyId);
		StringBuilder sql = new StringBuilder();
		sql.append("select m.modulecontrolid as modulecontrolid,m.moduleid as moduleid, d.moduleName as moduleName, ");
		sql.append("m.licenseenddt as licenseenddt,m.companyid as companyid,m.ctrlstatus as ctrlstatus,m.lastupdateddt as lastupdateddt,");
		sql.append("m.lastupdatedby as lastupdatedby,m.licensedyn as licensedyn,m.licensestartdt as licensestartdt,");
		sql.append("d.moduleCode as moduleCode from ModuleControlDM m,ModuleDM d where 1=1");
		sql.append("and d.moduleId=m.moduleid ");
		Query query = null;
		if (companyId != null) {
			sql.append(" and m.companyid=" + companyId);
		}
		if (moduleCode != null && moduleCode != 0) {
			sql.append(" and m.moduleid =" + moduleCode);
		}
		if (strStatus != null) {
			sql.append(" and m.ctrlstatus = '" + strStatus + "'");
		}
		sql.append(" order by m.lastupdateddt desc");
		logger.info("Inside getModulectrlList > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(ModuleControlDM.class));
		return query.list();
	}
	
	/** Method for get Active List of Module **/
	/**
	 * @return ModuleDM list
	 */
	public List<ModuleDM> getModuleList() {
		String sql = "select c from ModuleDM c where c.moduleStatus = 'Active'";
		Query query = sessionFactory.getCurrentSession().createQuery(sql);
		return query.list();
	}
}
