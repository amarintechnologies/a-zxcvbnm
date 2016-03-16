

package com.base.dao.rpt;

import java.util.List;

import com.base.domain.txn.LoggerDM;

public interface LoggerDAO {

	/**
	 * Method for return list of TBaseLogger based on user's input
	 * 
	 * @param String
	 *            logRef,logDes,errorCode,logType
	 *  return List of LoggerDM
	 */
	public List<LoggerDM> getLoggerList(Long companyId,String logRef, String logDes,
			String errorCode, String logType, String filtertype);

}