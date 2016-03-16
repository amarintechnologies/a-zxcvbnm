
package com.base.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.CountryDAO;
import com.base.domain.mst.CountryDM;
import com.base.service.mst.CountryService;

public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryDAO countrydao;
	private Logger logger = Logger.getLogger(CountryServiceImpl.class);
	
	/**
	 * To return data from CountryDM based on user's input
	 * 
	 * @param Long
	 *            countryid,String countryCode, String countryName, String status, String filtertype
	 */
	@Transactional
	@Cacheable(value = "Country")
	public List<CountryDM> getCountryList(Long countryid,Long timeZoneId, String countryCode, String countryName, String status,
			String filtertype) {
		logger.info("Inside getCountryList >  " + countryid + "," +timeZoneId+","+ countryCode + ", " + countryName + "," + status
				+ "," + filtertype);
		return countrydao.getCountryList(countryid, timeZoneId,countryCode, countryName, status, filtertype);
	}
	
	/**
	 * Method for return ISD Code of CountryDM based on user's input i.e countryId
	 * 
	 * @param Long
	 *            countryId
	 * @return String isdcode
	 */
	@Transactional
	@Cacheable(value = "countryisdcode")
	public String getISDCodebyCountryId(Long countryId) {
		logger.info("Inside getISDCodebyCountryId " + countryId);
		return countrydao.getISDCodebyCountryId(countryId);
	}
}
