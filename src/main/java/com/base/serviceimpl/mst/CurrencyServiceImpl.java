
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.CurrencyDAO;
import com.base.domain.mst.CurrencyDM;
import com.base.service.mst.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {
	@Autowired
	private CurrencyDAO currencydao;
	private Logger logger = Logger.getLogger(CurrencyServiceImpl.class);
	
	/**
	 * To return List from Currency based on user's input
	 * 
	 * @param String currencyCode
	 * @param String currencyName
	 * @param String status
	 * @param Long currencyId
	 * @param String filtertype
	 * @return CurrencyDM List
	 */
	@Transactional
	@Cacheable(value = "Currency")
	public List<CurrencyDM> getCurrencyList(Long currencyId, String currencyCode, String currencyName, String status,
			String filtertype) {
		logger.info("Inside getCurrencyList > " + "About to get Currency for " + currencyId + ", " + currencyCode
				+ ", " + currencyName + "," + status);
		return currencydao.getCurrencyList(currencyId, currencyCode, currencyName, status, filtertype);
	}
}
