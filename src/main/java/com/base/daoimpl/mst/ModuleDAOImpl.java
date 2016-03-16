
package com.base.daoimpl.mst;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.ModuleDAO;
import com.base.domain.mst.ModuleDM;
import com.erputil.util.DateUtils;
@Repository
public class ModuleDAOImpl implements ModuleDAO {
	
	/**	 @Autowired refers that integrating the spring concepts that is using for linking with specified class**/
	/**	 SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	SessionFactory sessionFactory ;
	/**
	        * used to Retrieve data from ModuleDM table based on given parameters.
	        * 
	        * @param  moduleName,status
	        * @return List<ModuleDM>
	        */
	public List<ModuleDM> getModuleList(String moduleName, String status) {
		// TODO Auto-generated method stub
		String sql="select m from ModuleDM m WHERE 1=1 ";
		if(moduleName!=null) {
			sql+=" and lower(m.moduleName) like lower('"+moduleName+"%') ";
		}
		if(status!=null)
		{
			sql+=" and m.moduleStatus = '"+status+"'";
		}
		Query query=sessionFactory.getCurrentSession().createQuery(sql);
		return query.list();
		
		
	}
	public List<ModuleDM> getModuleList(Long companyId) {
		// TODO Auto-generated method stub
		String sql="select m from ModuleDM m WHERE m.moduleId in (select n.moduleid  "
				+ "from ModuleControlDM n where n.companyid = "+companyId+""
				+ " and n.licensedyn='Y' and n.ctrlstatus='Active' and sysdate between n.licensestartdt and n.licenseenddt)";
		Query query=sessionFactory.getCurrentSession().createQuery(sql);
		return query.list();
		
	}

}
