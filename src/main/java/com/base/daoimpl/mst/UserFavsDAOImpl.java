
package com.base.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.UserFavsDAO;
import com.base.domain.mst.UserFavDM;

@Repository
public class UserFavsDAOImpl implements UserFavsDAO {
	
	/**
	 * @Autowired refers that integrating the spring concepts that is using for
	 *            linking with specified class
	 **/
	/** SessionFactory refers that maintains the session until it gets expired **/

	@Autowired
	SessionFactory sessionFactory;
	// intialize the locker
	private Logger logger = Logger.getLogger(UserFavsDAOImpl.class);

	/**
	 * Method for save or update UserFavourities
	 * @param favourObj
	 */
	public void saveorUpdateUserFavouitiesDetails(UserFavDM favourObj) {
		logger.info("Inside saveorUpdateUserFavouitiesDetails> "
				+ favourObj.getUserId());
		sessionFactory.getCurrentSession().saveOrUpdate(favourObj);
	}

	/**
	 * get User Favourites list based on parameters.
	 * @param Long  userId   
	 * @param Long  screenId
	 * @param String filtertype          
	 * @return List<UserFavDM>
	 */
	public List<UserFavDM> getUserFavouritesList(Long userId, Long screenId,
			String filtertype) {
		logger.info("Inside getUserFavouritesList > " + userId + ", "
				+ screenId);
		StringBuffer sql = new StringBuffer(" select ");
		if (filtertype.equals("P")) {
			sql.append(" new UserFavDM(userfavId) ");
		} else {
			{
				sql.append(" uf.userfavId as userfavId,uf.userId as userId,uf.screenId as screenId,");
				sql.append(" uf.lastUpdatedDt as lastUpdatedDt,uf.lastUpdatedBy as lastUpdatedBy,");
				sql.append(" u.loginid as userName,a.screendesc as screenName");
				sql.append(" from UserDM u, AppScreensDM a , UserFavDM uf where 1=1");
				sql.append(" and uf.userId =u.userid and uf.screenId =a. screenId");
			}
		}

		if (userId != null) {
			sql.append(" and uf.userId =" + userId);
		}
		if (screenId != null) {
			sql.append(" and uf.screenId =" + screenId);
		}
		logger.debug("getUserFavouritesList() ----> Sql --->"+sql);
		Query query = sessionFactory.getCurrentSession().createQuery(
				sql.toString()).setResultTransformer(Transformers.aliasToBean(UserFavDM.class));

		return query.list();
	
	}

	/**
	 * Delete User Favourites list based on parameters.
	 * @param usefavId
	 */
	public void deleteUserfavourites(Long usefavId) {
		logger.info("Inside getStateList > " + usefavId);

		Query query = sessionFactory.getCurrentSession().createQuery(
				"delete from UserFavDM m where m.userfavId = " + usefavId);
		query.executeUpdate();

	}

}
