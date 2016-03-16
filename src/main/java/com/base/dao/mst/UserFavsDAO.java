
package com.base.dao.mst;

import java.util.List;

import com.base.domain.mst.UserFavDM;

public interface UserFavsDAO {
	/**
	 * Method for save or update UserFavourities
	 * @param favourObj
	 */
	public void saveorUpdateUserFavouitiesDetails(UserFavDM favourObj);

	/**
	 * Delete User Favourites list based on parameters.
	 * @param Long usefavId
	 */
	public void deleteUserfavourites(Long usefavId);

	/**
	 * get User Favourites list based on parameters.
	 * @param Long userId	 
	 * @param Long ScreenId
	 * @param String filtertype
	 * @return List<UserFavDM>
	 */
	public List<UserFavDM> getUserFavouritesList(Long userId, Long screenId,
			String filtertype);

}
