

package com.base.serviceimpl.rpt;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.rpt.LoggerDAO;
import com.base.domain.txn.LoggerDM;
import com.base.service.rpt.LoggerService;

public class LoggerServiceImpl implements LoggerService {
	@Autowired
	private LoggerDAO loggerdao;
	private Logger logger = Logger.getLogger(LoggerServiceImpl.class);

	/**
	 * To return data from TBaseLogger based on user's input
	 * 
	 * @param String logRef, String logDes,String errorCode, String logType, String filtertype
	 * @return List of LoggerDM
	 */

	@Transactional
	@Cacheable(value = "Logger")
	public List<LoggerDM> getLoggerList(Long companyId,String logRef, String logDes,
			String errorCode, String logType, String filtertype) {
		logger.info("Inside getLoggerList > " + "About to get Logger list for "+companyId+","
				+ logRef + ", " + logDes + ", " + errorCode + "," + logType);
		return loggerdao.getLoggerList(companyId,logRef, logDes, errorCode, logType,
				filtertype);
	}

}