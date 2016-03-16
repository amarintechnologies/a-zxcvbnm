
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.CompanyDM;

public interface CompanyDAO {
	/** Method for save or update CompanyDM **/
	/**
	 * @param companyObj of CompanyDM
	 */
	public void saveorUpdateCompanyDetails(CompanyDM companyObj);
	
	/** Get Company List based on company id **/
	/**
	 * To get Company list based on company id and Active status
	 * 
	 * @param String companyName, String status, Long companyId
	 * 
	 * @return list of CompanyDM
	 */
	public List<CompanyDM> getCompanyList(String companyName, String status, Long companyId);
}
