
package com.base.serviceimpl.txn;

import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.txn.HolidayDAO;
import com.base.domain.txn.HolidaysDM;
import com.base.service.txn.HolidayService;

public class HolidaysServiceImpl implements HolidayService {
	@Autowired
	private HolidayDAO HolidaysDAO;
	private Logger logger = Logger.getLogger(HolidaysServiceImpl.class);
	
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
	 * 
	 * @return List<HolidaysDM>
	 */
	@Transactional
	@Cacheable(value = "Holiday")
	public List<HolidaysDM> getHolidaysList(Long holidayId, String holidayName, Long branchId, String holidayStatus,
			Long companyId, Date holidayDt, String filtertype) {
		logger.info("Inside getHolidaysList > " + "About to get Holiday. list for " + holidayId + "," + holidayName
				+ ", " + branchId + ", " + holidayStatus + "," + companyId + "," + holidayDt);
		return HolidaysDAO.getHolidaysList(holidayId, holidayName, branchId, holidayStatus, companyId, holidayDt,
				filtertype);
	}
	
	/**
	 * To save HolidaysDM table details
	 * 
	 * @param HolidaysDM
	 *            holidayObj
	 * 
	 */
	@Transactional
	@CacheEvict(value = "Holiday", allEntries = true)
	public void saveAndUpdate(HolidaysDM holidayObj) {
		logger.info("Inside saveAndUpdate > " + "About to save the data ... ");
		HolidaysDAO.saveAndUpdate(holidayObj);
	}
}
