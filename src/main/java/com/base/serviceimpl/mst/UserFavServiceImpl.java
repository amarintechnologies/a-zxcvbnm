
package com.base.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.UserFavsDAO;
import com.base.domain.mst.UserFavDM;
import com.base.service.mst.UserFavService;

public class UserFavServiceImpl implements UserFavService {
	@Autowired
	private UserFavsDAO userfavDao;
	private Logger logger = Logger.getLogger(UserFavServiceImpl.class);

	/**
	 * get User Favourites list based on parameters.
	 * @param Long userId
	 * @param Long screenId
	 * @param String filtertype
	 * @return List<UserFavDM>
	 */
	@Transactional
    @Cacheable(value = "UserFavouities")
	public List<UserFavDM> getUserFavouritesList(Long userId, Long screenId,
			String filtertype) {
		logger.info("Inside getUserFavouritesList > "
				+ "About to get UserFavouities list for " + userId + ", "
				+ screenId);
			return userfavDao.getUserFavouritesList(userId, screenId, filtertype);
	}

	/**
	 * Delete User Favourites list based on parameters.
	 * @param usefavId
	 */
	@Transactional
	@CacheEvict(value = "UserFavouities", allEntries = true)
	public void deleteUserfavourites(Long usefavId) {
		logger.info("Inside deleteUserfavourites > "
				+ "About to get State list for " + usefavId);
		userfavDao.deleteUserfavourites(usefavId);
	}

	/**
	 * Method for save or update MBaseUserFavourities 
	 * @param favourObj
	 */
	@Transactional
	@CacheEvict(value = "UserFavouities", allEntries = true)
	public void saveorUpdateUserFavouitiesDetails(UserFavDM favourObj) {
		logger.info("Inside saveorUpdateUserFavouitiesDetails > "
				+ "About to save the data ... ");
		userfavDao.saveorUpdateUserFavouitiesDetails(favourObj);
	}
}
