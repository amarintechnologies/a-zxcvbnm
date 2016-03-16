
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.LookupDM;

public interface LookupService {
	/**
	 * Method for save or update LookupDM details
	 * 
	 * @param LookupObj
	 *            of LookupDM
	 */
	public void saveAndUpdateDetails(LookupDM lookupObj);
	
	/**
	 * Method for return LookupDM list based on user's parameter
	 * 
	 * @param String
	 *            moduleId, String lookUpcode, String lookUpdesc, String status, String filterType
	 */
	public List<LookupDM> getLookupList(Long moduleId, String lookUpcode, String lookUpdesc, String status,
			String filterType);
}
