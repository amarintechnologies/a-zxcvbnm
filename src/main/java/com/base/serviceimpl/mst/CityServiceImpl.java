
package com.base.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.CityDAO;
import com.base.domain.mst.CityDM;
import com.base.service.mst.CityService;

public class CityServiceImpl implements CityService {
	@Autowired
	private CityDAO citydao;
	private Logger logger = Logger.getLogger(CityServiceImpl.class);
	
	/**
	 * To save and update CityDM details.
	 * 
	 * @param CityDM
	 *            cityObj
	 */
	@Transactional
	@CacheEvict(value = "City", allEntries = true)
	public void saveAndUpdateCitydetails(CityDM cityObj) {
		logger.info("Inside saveAndUpdateCitydetails > " + "About to save the data ... ");
		citydao.saveAndUpdateCitydetails(cityObj);
	}
	
	/**
	 * Method for return CityDM list based on user's parameters
	 * 
	 * @param Long
	 *            cityid
	 * @param String
	 *            cityName
	 * @param Long
	 *            stateId
	 * @param String
	 *            status
	 * @param Long
	 *            companyId
	 * @param String 
	 *            filtertype
	 * @return CityDM List
	 */
	@Transactional
	@Cacheable(value = "City")
	public List<CityDM> getCityList(Long cityid, String cityName, Long stateId, String status, Long companyId,
			String filtertype) {
		logger.info("Company ID : " + companyId + " | Status : " + status + " > " + "Inside getList");
		return citydao.getCityList(cityid, cityName, stateId, status, companyId, filtertype);
	}
	
	@Transactional
	public List<CityDM> getCityList() {
		logger.info("Inside getCityList >" + citydao);
		return null;
	}
}
