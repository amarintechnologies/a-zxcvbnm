
package com.base.dao.mst;

import java.util.List;

import com.base.domain.mst.CountryDM;

public interface CountryDAO {
	/**
	 * Method for return list of CountryDM based on user's input
	 * 
	 * @param Long
	 *            countryid,String countryCode, String countryName, String status, String filtertype
	 * @return CountryDM List
	 */
	public List<CountryDM> getCountryList(Long countryid,Long timeZoneId,String countryCode, String countryName, String status,
			String filtertype);
	
	/**
	 * Method for return ISD Code of CountryDM
	 * 
	 * @param Long
	 *            countryId
	 * @return ISDCode List
	 */
	public String getISDCodebyCountryId(Long countryId);
}
