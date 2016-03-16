
package com.base.dao.txn;

import java.util.Date;
import java.util.List;
import com.base.domain.txn.HolidaysDM;

public interface HolidayDAO {
	/**
	 * Method for return HolidayDM list based on user's parameters
	 * 
	 * @param Long
	 *            holidayId
	 * @param String
	 *            holidayName
	 * @param Long
	 *            branchId
	 * @param String
	 *            holidayStatus
	 * @param Long
	 *            companyId
	 * @param Date
	 *            holidayDt
	 * @param String
	 *            filtertype
	 * @return List<HolidaysDM>
	 */
	public List<HolidaysDM> getHolidaysList(Long holidayId, String holidayName, Long branchId, String holidayStatus,
			Long companyId, Date holidayDt, String filtertype);
	
	/**
	 * Method for saveandupdate Holiday's data
	 * 
	 * @param HolidaysDM
	 *            holidayObj
	 */
	public void saveAndUpdate(HolidaysDM holidayObj);
}
