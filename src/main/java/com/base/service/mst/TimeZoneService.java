
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.TimeZoneDM;

public interface TimeZoneService {
	/**
	 * Method to return list from TimeZoneDM, based on user's parameter
	 * 
	 * @param String
	 *            timeZoneCode, String timeZoneDesc, String filtertype
	 * @return TimeZoneDM list
	 */
	public List<TimeZoneDM> getTimeZoneList(String timeZoneCode, String timeZoneDesc, String filtertype);
}
