
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.BranchDM;

public interface BranchService {
	/**
	 *         * Used to save or update the BranchDM data into the database.         * @param branchObj         
	 */
	public void saveOrUpdateBranch(BranchDM branchObj);
	
	/**
	 *         * used to Retrieve data from BranchDM table based on given parameters.         *          * @param 
	 * branchId branchName countryId status companyId  filterType       * @return List<BranchDM>         
	 */
	public List<BranchDM> getBranchList(Long branchId, String branchName, Long countryId, String status,
			Long companyId, String filterType);
	
	/**
	 * Method for return Branch Name of BranchDM based on user's input i.e countryId
	 * 
	 * @param Long
	 *            countryId
	 */
	public String getBranchbyCountryId(Long countryId);
}
