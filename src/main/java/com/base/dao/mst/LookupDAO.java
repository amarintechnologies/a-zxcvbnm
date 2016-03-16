
package com.base.dao.mst;

import java.util.List;
import org.hibernate.Query;
import com.base.domain.mst.LookupDM;

public interface LookupDAO {
	/**
	 * Method for save or update LookupDM details
	 * 
	 * @param lookupObj
	 *            of LookupDM
	 */
	public void saveAndUpdateDetails(LookupDM lookupObj);
	
	/**
	 * Method to return list from LookUpDM, based on user's parameters
	 * 
	 * @param String
	 *            moduleId,String lookUpcode,String lookUpdesc,String status,String filterType
	 * @return lookUpDM List
	 */
	public List<LookupDM> getLookupList(Long moduleId, String lookUpcode, String lookUpdesc, String status,
			String filterType);
}
