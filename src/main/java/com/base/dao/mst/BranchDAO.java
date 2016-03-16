
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.BranchDM;

public interface BranchDAO {
	/**
	 *         * Used to save or update the MBaseBranch data into the database.         * @param branchObj         
	 */
	public void saveOrUpdateBranch(BranchDM branchObj);
	
	/**
	 * * used to Retrieve data from MBaseBranch table based on given parameters.         
	 * 
	 * @param Long
	 *            branchId
	 * @param String
	 *            branchName
	 * @param Long
	 *            countryId
	 * @param String
	 *            status
	 * @param Long
	 *            companyId
	 * @param String
	 *            filterType * @return List<BranchDM>         
	 */
	public List<BranchDM> getBranchList(Long branchId, String branchName, Long countryId, String status,
			Long companyId, String filterType);
	
	/**
	 * Method for return ISD Code of BranchDM
	 * 
	 * @param countryId
	 */
	public String getBranchbyCountryId(Long countryId);
}
