
package com.base.daoimpl.mst;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.AppScreenFieldsDAO;
import com.base.domain.mst.AppScreenFieldsDM;

@Repository
public class AppScrnFieldDAOImpl implements AppScreenFieldsDAO {

	/**	 @Autowired refers that integrating the spring concepts that is using for linking with specified class**/
	/**	 SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	SessionFactory sessionFactory ;
	/**
	 * get  screen Fields list based on given parameters.
	 * @param fieldCode screenId status
	 * @return List<AppScreenFieldsDM> 
	 */
	public List<AppScreenFieldsDM> getApplicationScreenFieldsList(String fieldCode,Long screenId,String status) {
		// TODO Auto-generated method stub
		String sql="select m from AppScreenFieldsDM m where 1=1 ";
		if(fieldCode!=null) {
		sql+=" and lower(m.fieldCode) like lower('"+fieldCode+"%')" ;
		}
		if(screenId!=null) {
			sql+=" and appScreenId='"+screenId+"' ";
		}
		if(status!=null) {
			sql+=" and status='"+status+"' ";
		}
		Query query=sessionFactory.getCurrentSession().createQuery(sql);
		List<AppScreenFieldsDM> list=query.list();
		for(AppScreenFieldsDM pojo:list){
			Hibernate.initialize(pojo.getAppScreenId());
		}
		
		return list;
	}
	/**
	 * get  screen field ref based on given parameters.
	 * @param screenCode
	 * 
	 */
	public Long getScreenFieldRefidbasedonScreenCode(String screenCode) {
		// TODO Auto-generated method stub
		String sql = "select SCR_FLD_REF from M_BASE_APP_SCRN_FIELDS where screen_id in(select screen_id from M_BASE_APP_SCREENS where screen_code = '"+screenCode+"')";
		Query query=sessionFactory.getCurrentSession().createSQLQuery(sql);
		return Long.valueOf(query.list().get(0).toString());

	}
}
