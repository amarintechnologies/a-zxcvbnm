
package com.base.service.mst;

import java.util.List;

import com.base.domain.mst.CountryDM;

public interface CountryService {
	/**
	 * Method for return list from CountryDM, based on user's parameter
	 * 
	 * @param Long
	 *            countryid,String countryCode, String countryName, String status, String filtertype
	 */
	public List<CountryDM> getCountryList(Long countryid,Long timeZoneId, String countryCode, String countryName, String status,
			String filtertype);
	
	/**
	 * Method for return ISD Code of CountryDM based on user's input i.e countryId
	 * 
	 * @param Long
	 *            countryId
	 */
	public String getISDCodebyCountryId(Long countryId);
}
