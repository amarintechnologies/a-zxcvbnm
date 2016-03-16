
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.CityDM;

public interface CityService {
	/**
	 * Method for save and update CityDM Details
	 * 
	 * @param cityObj
	 */
	public void saveAndUpdateCitydetails(CityDM cityObj);
	
	/**
	 * Method for return CityDM based on user's parameters
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
	 * @return List<CityDM>
	 */
	public List<CityDM> getCityList(Long cityid, String cityName, Long stateId, String status, Long companyId,
			String filtertype);
}
