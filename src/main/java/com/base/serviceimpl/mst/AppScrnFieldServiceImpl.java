
package com.base.serviceimpl.mst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.AppScreenFieldsDAO;
import com.base.domain.mst.AppScreenFieldsDM;
import com.base.service.mst.AppScreenFieldService;



public class AppScrnFieldServiceImpl implements AppScreenFieldService {

	@Autowired
	private AppScreenFieldsDAO appScrnFieldDao;
	/**
	 * get  screen Fields list based on given parameters.
	 * @param fieldCode screenId status
	 * @return List<MBaseAppScreenFields> 
	 */
	@Transactional
	@Cacheable(value="gcatScreenFields")
	public List<AppScreenFieldsDM> getApplicationScreenFieldsList(String fieldCode,Long screenId, String status) {
		// TODO Auto-generated method stub
		return appScrnFieldDao.getApplicationScreenFieldsList(fieldCode,screenId,status);
	}
	/**
	 * get  screen field ref based on given parameters.
	 * @param screenCode
	 * 
	 */
	@Transactional
	public Long getScreenFieldRefidbasedonScreenCode(String screenCode) {
		// TODO Auto-generated method stub
		return appScrnFieldDao.getScreenFieldRefidbasedonScreenCode(screenCode);
	}
}
