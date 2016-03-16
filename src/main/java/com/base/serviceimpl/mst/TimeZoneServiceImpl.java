
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.TimeZoneDAO;
import com.base.domain.mst.TimeZoneDM;
import com.base.service.mst.TimeZoneService;

public class TimeZoneServiceImpl implements TimeZoneService {
	@Autowired
	private TimeZoneDAO timezonedao;
	private Logger logger = Logger.getLogger(TimeZoneServiceImpl.class);
	
	/**
	 * To return list from TimeZoneDM, based on user's input
	 * 
	 * @param String
	 *            timeZoneCode, String timeZoneDesc, String filtertype
	 * @return TimeZoneDM List
	 */
	@Transactional
	@Cacheable(value = "mBaseTimeZone")
	public List<TimeZoneDM> getTimeZoneList(String timeZoneCode, String timeZoneDesc, String filtertype) {
		logger.info("Inside getTimeZoneList > " + timeZoneCode + ", " + timeZoneDesc);
		return timezonedao.getTimeZoneList(timeZoneCode, timeZoneDesc, filtertype);
	}
}