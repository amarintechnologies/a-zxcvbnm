
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.CurrencyDM;

public interface CurrencyService {
	/**
	 * Method for return list from CurrencyDM,based on user's parameter
	 * 
	 * @param String currencyCode
	 * @param String currencyName
	 * @param String status
	 * @param String filtertype
	 * @return CurrencyDM List
	 */
	public List<CurrencyDM> getCurrencyList(Long currencyId, String currencyCode, String currencyName, String status,
			String filtertype);
}
