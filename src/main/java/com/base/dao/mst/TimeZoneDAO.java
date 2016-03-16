
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.TimeZoneDM;

public interface TimeZoneDAO {
	/**
	 * Method to return list from TimeZoneDM based on user's input
	 * 
	 * @param String
	 *            timeZoneCode, String timeZoneDesc, String filtertype
	 * @return List<TimeZoneDM>
	 */
	public List<TimeZoneDM> getTimeZoneList(String timeZoneCode, String timeZoneDesc, String filtertype);
}
