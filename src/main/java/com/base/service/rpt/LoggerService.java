
package com.base.service.rpt;

import java.util.List;

import com.base.domain.txn.LoggerDM;

public interface LoggerService {

	/**
	 * Method for return list from LoggerDM, based on user's parameter
	 * 
	 * @param String
	 *            logRef,logDes,errorCode,logType
	 * @return List of LoggerDM
	 */
	public List<LoggerDM> getLoggerList(Long companyId,String logRef, String logDes,
			String errorCode, String logType, String filtertype);

}