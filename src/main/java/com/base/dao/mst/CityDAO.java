
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.CityDM;

public interface CityDAO {
	/**
	 * Method for SaveandUpdate City's Details
	 * 
	 * @param CityDM
	 *            cityObj
	 */
	public void saveAndUpdateCitydetails(CityDM cityObj);

	/**
	 * To return data from City based on user's input
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
	 * 
	 * @return List
	 */

	public List<CityDM> getCityList(Long cityid, String cityName, Long stateId,
			String status, Long companyId, String filtertype);
}
