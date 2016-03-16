

package com.base.dao.mst;

import java.util.List;

import com.base.domain.mst.AppScreensDM;
import com.base.domain.mst.AppScreensMenuDM;



public interface AppScreenDAO {
	/**
	 * to get the MBaseAppScreen List  
	 * @return List<AppScreensMenuDM>
	 *  @param roleId
	 *   @param companyId
	 *    @param branchId
	 */
	public List<AppScreensMenuDM> getMBaseAppscreenList(Long roleId,Long companyId,Long branchId);
	
	/**
	 * to get the targetclass from MBaseAppscreen based on screencode
	 * @param screenCode
	 * @return String 
	 */
	public String getTargetClassBasedOnScreenCode(String screenCode);
	/**
	 * get App screen list based on user id in  MBaseUserFav
	 * @param userId
	 * @return List<MBaseAppScreens> 
	 */
	public List<AppScreensDM> getMBaseAppScreenListByUserId(Long userId);
	/**
	 * get App screen list based on given parameters.
	 * @param screencode moduleId status roleid companyid branchid
	 * @return List<MBaseAppScreens> 
	 */
	public List<AppScreensDM> getAppscreenList(String screencode,Long moduleId,String status,Long branchid,Long roleid,Long companyid);

	/**
	 * update the document details
	 * @param screenName
	 * @param moduleId
	 * @param documents
	 */
	public void updateHelpDocumentDetails(String documents,String screenName,Long moduleId);
}
