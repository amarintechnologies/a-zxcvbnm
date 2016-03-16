
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.CompanyDM;

public interface CompanyService {
	/** Method for save or update CompanyDM **/
	/**
	 * @param companyObj
	 *            of CompanyDM
	 */
	public void saveorUpdateCompanyDetails(CompanyDM companyObj);
	
	/** Method for return the CompanyDM list by company name and status **/
	/**
	 * 
	 * @param String
	 *            companyName, String status,Long companyId
	 * 
	 * @return list of CompanyDM
	 */
	public List<CompanyDM> getCompanyList(String companyName, String status, Long companyId);
}
