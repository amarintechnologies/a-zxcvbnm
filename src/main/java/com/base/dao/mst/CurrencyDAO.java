package com.base.dao.mst;

import java.util.List;

import com.base.domain.mst.CurrencyDM;


public interface CurrencyDAO {

	/**
	 * Method for return list of Currency based on user's input
	 * @param String currencyCode
	 * @param String currencyName 
	 * @param String status
	 * @param String filtertype
	 * return currencyDM list
	 */
	public List<CurrencyDM> getCurrencyList(Long currencyId, String currencyCode, String currencyName, String status,
			String filtertype);
}