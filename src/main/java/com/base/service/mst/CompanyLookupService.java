
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.CompanyLookupDM;

public interface CompanyLookupService {
	/**
	 * Method for save or update CompanyLookupDM
	 * 
	 * @param baseCompanyObj
	 *            of CompanyLookupDM
	 */
	public void saveorUpdateCompanyLookupDetails(CompanyLookupDM baseCompanyObj);
	
	/**
	 * To getcompanylook up details based on below params
	 * 
	 * @param Long
	 *            companyid, Long moduleId, String status,String lookUpCode
	 * @return List of CompanyLookupDM
	 */
	public List<CompanyLookupDM> getCompanyLookUpByLookUp(Long companyid, Long moduleId, String status,
			String lookUpCode);
	
	/**
	 * To getCompanyLookupList up details based on below parameters
	 * 
	 * @param Long
	 *            companyId, String lookUpname, Long lookupId, String status,String filterType
	 * @return List of CompanyLookupDM
	 */
	public List<CompanyLookupDM> getCompanyLookupList(Long companyId, String lookUpname, Long lookupId, String status,
			Long moduleId, String filterType);
}
