
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.CompanyLookupDM;

public interface CompanyLookupDAO {
	/**
	 * Method for save or update CompanyLookupDM
	 * 
	 * @param baseCompanyObj
	 *            of CompanyLookupDM
	 */
	public void saveorUpdateCompanyLookupDetails(CompanyLookupDM baseCompanyObj);
	
	/**
	 * To search details on CompanyLookupDM table
	 * 
	 * @param Long
	 *            companyId, String lookUpname,Long lookupId, String status, String filterType
	 * 
	 * @return list of CompanyLookupDM
	 * 
	 */
	public List<CompanyLookupDM> getCompanyLookupList(Long companyId, String lookUpname, Long lookupId, String status,
			Long moduleId, String filterType);
	
	/**
	 * To get company look up details based on below params
	 * 
	 * @param Long
	 *            companyid, Long moduleId, String status, String lookUpCode
	 * 
	 * @return List of CompanyLookUpByLookUp
	 */
	public List<CompanyLookupDM> getCompanyLookUpByLookUp(Long companyid, Long moduleId, String status,
			String lookUpCode);
}
