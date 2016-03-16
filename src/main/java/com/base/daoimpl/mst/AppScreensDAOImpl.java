
package com.base.daoimpl.mst;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.AppScreenDAO;
import com.base.domain.mst.AppScreensDM;
import com.base.domain.mst.AppScreensMenuDM;





@Repository
public class AppScreensDAOImpl  implements AppScreenDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
	/**
	 * to get the MBaseAppScreen List   based on status active and show get list order by parent id null
	 * 
	 * 
	 * @return List<AppScreensDM>
	 *  @param roleId
	 *   @param companyId
	 *    @param branchId
	 * @return List<AppScreensMenuDM>
	 */
	public List<AppScreensMenuDM> getMBaseAppscreenList(Long roleId,Long companyId,Long branchId) {
		// TODO Auto-generated method stub

		String sql="SELECT m FROM AppScreensMenuDM m " 
				+ " WHERE m.companyId = "+companyId+" AND m.branchId = "+branchId+" AND m.roleId = "+roleId;
				
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		
		return query.list();
	}
	/**
	 * to get the targetclass from MBaseAppscreen based on screencode and status is Active
	 * @param screenCode
	 * @return String 
	 */
	public String getTargetClassBasedOnScreenCode(String screenCode) {
		// TODO Auto-generated method stub
		try{
		String sql="select ap.targetClass from AppScreensDM ap where ap.screencode='"+screenCode+"' and ap.status='Active'";
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		return query.list().get(0).toString();
		}
		catch(Exception e)
		{
			return "";
		}
	}
	/**
	 * get App screen list based on given parameters.
	 * @param screencode moduleId status roleid companyid branchid
	 * @return List<AppScreensDM> 
	 */
	public List<AppScreensDM> getAppscreenList(String screencode,Long moduleId,String status,Long branchid,Long roleid,Long companyid) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM m_base_app_screens WHERE screen_id IN (SELECT screen_id FROM m_base_app_scrn_fields WHERE scr_fld_ref IN (SELECT scr_fld_ref FROM m_base_access_config WHERE branch_id="+branchid+" AND role_id ="+roleid+" AND company_id = "+companyid+"))";

		if(screencode!=null) {
			sql+=" and SCREEN_CODE like '"+screencode+"%' ";
		}
		if(moduleId!=null) {
			sql+=" and MODULE_ID="+moduleId;
		}
		if(status!=null) {
			sql+=" and SCREEN_STATUS='"+status+"' ";
		}
		Query query=sessionfactory.getCurrentSession().createSQLQuery(sql).addEntity(AppScreensDM.class);
		
		List<AppScreensDM> list=query.list();
		for(AppScreensDM pojo:list){
			Hibernate.initialize(pojo.getModuleId());
			Hibernate.initialize(pojo.getParentId());
		}
		
		return query.list();
	}
	/**
	 * get App screen list based on user id in  MBaseUserFav
	 * @param userId
	 * @return List<AppScreensDM> 
	 */
	public List<AppScreensDM> getMBaseAppScreenListByUserId(Long userId) {
		// TODO Auto-generated method stub
		
		String sql="select ap from AppScreensDM ap where ap.screenId in (select  uf.screenId from UserFavDM  uf where uf.userId="+userId +")";
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		
		return query.list();
	}

	/**
	 * update the document details
	 * @param screenName
	 * @param moduleId
	 * @param documents
	 */
	public void updateHelpDocumentDetails(String documents,String screenName, Long moduleId) {
		// TODO Auto-generated method stub
		String sql="update AppScreensDM ap set ap.helpDco='"+documents+"' where ap.screendesc='"+screenName+"' and ap.moduleId="+moduleId;
		sessionfactory.getCurrentSession().createQuery(sql).executeUpdate();
	}
	
	

}
