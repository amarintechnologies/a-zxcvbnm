
package com.base.serviceimpl.mst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.AppScreenDAO;
import com.base.domain.mst.AppScreensDM;
import com.base.domain.mst.AppScreensMenuDM;
import com.base.service.mst.AppScreensService;


public class AppScreensServiceImpl implements AppScreensService {

	@Autowired
	private AppScreenDAO appscreensdao;
	/**
	 * to get the MBaseAppScreen List   based on status active and show get list order by parent id null
	 * 
	 * 
	 * @return List<AppScreensMenuDM>
	 *  @param roleId
	 *   @param companyId
	 *    @param branchId
	 *
	 * @return List<MBaseAppScreens>
	 */
@Transactional
@Cacheable(value="gcatAppScreens")
	public List<AppScreensMenuDM> getMBaseAppscreenList(Long roleId,Long companyId,Long branchId) {
		// TODO Auto-generated method stub
		return appscreensdao.getMBaseAppscreenList(roleId,companyId,branchId);
	}
/**
 * to get the targetclass from MBaseAppscreen based on screencode
 * @param screenCode
 * @return String 
 */
@Transactional
	public String getTargetClassBasedOnScreenCode(String screenCode) {
		// TODO Auto-generated method stub
		return appscreensdao.getTargetClassBasedOnScreenCode(screenCode);
	}
/**
 * get App screen list based on user id in  MBaseUserFav
 * @param userId
 * @return List<MBaseAppScreens> 
 */
@Transactional
public List<AppScreensDM> getMBaseAppScreenListByUserId(Long userId) {
	// TODO Auto-generated method stub
	return appscreensdao.getMBaseAppScreenListByUserId(userId);
}
/**
 * get App screen list based on given parameters.
 * @param screencode moduleId status roleid companyid branchid
 * @return List<MBaseAppScreens> 
 */
@Transactional
@Cacheable(value="gcatAppScreens")
public List<AppScreensDM> getAppscreenList(String screencode,Long moduleId, String status,Long branchid,Long roleid,Long companyid) {
	// TODO Auto-generated method stub
	return appscreensdao.getAppscreenList(screencode,moduleId, status,branchid,roleid,companyid);
}
@Transactional
@CacheEvict(value="gcatAppScreens",allEntries=true)
public void updateHelpDocumentDetails(String documents, String screenName,
		Long moduleId) {
	// TODO Auto-generated method stub
	appscreensdao.updateHelpDocumentDetails(documents, screenName, moduleId);
	
}

	
	
}
