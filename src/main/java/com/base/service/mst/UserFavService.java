
package com.base.service.mst;

import java.util.List;

import com.base.domain.mst.UserFavDM;

public interface UserFavService {
	/**
	 * Method for save or update UserFavDM
	 * @param favourObj
	 */
	public void saveorUpdateUserFavouitiesDetails(UserFavDM favourObj);

	/**
	 * Delete User Favourites list based on parameters. 
	 * @param usefavId
	 */
	public void deleteUserfavourites(Long usefavId);

	/**
	 * get User Favourites list based on parameters. 
	 * @param Long userId
	 * @param Long screenId	 
	 * @param String filtertype
	 * @return List<UserFavDM>
	 */
	public List<UserFavDM> getUserFavouritesList(Long userId, Long screenId,
			String filtertype);
}
