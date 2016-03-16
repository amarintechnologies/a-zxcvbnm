
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.BranchDAO;
import com.base.domain.mst.BranchDM;
import com.base.service.mst.BranchService;

public class BranchServiceImpl implements BranchService {
	private Logger logger = Logger.getLogger(BranchServiceImpl.class);
	@Autowired
	private BranchDAO branchdao;
	
	/**
	 *         * Used to save or update the MBaseBranch data into the database.         * @param branchObj         
	 */
	@Transactional
	@CacheEvict(value = "mBaseBranch", allEntries = true)
	public void saveOrUpdateBranch(BranchDM branchObj) {
		logger.info("Inside saveOrUpdateBranch > " + "About to save the data ... ");
		branchdao.saveOrUpdateBranch(branchObj);
	}
	
	/**
	 *         * used to Retrieve data from MBaseBranch table based on given parameters.         *          * @param 
	 * branchId branchName countryId status companyId filterType        * @return List<MBaseBranch>         
	 */
	@Transactional
	@Cacheable(value = "mBaseBranch")
	public List<BranchDM> getBranchList(Long branchId, String branchName, Long countryId, String status,
			Long companyId, String filterType) {
		logger.info("Inside ServiceImpl getBranchList >>" + branchId + "," + branchName + "," + countryId + ","
				+ status + "," + companyId + "," + filterType);
		return branchdao.getBranchList(branchId, branchName, countryId, status, companyId, filterType);
	}
	
	/**
	 * Method for return Branch Name of BranchDM based on user's input i.e countryId
	 * 
	 * @param Long
	 *            countryId
	 */
	@Transactional
	public String getBranchbyCountryId(Long countryId) {
		logger.info("Inside getBranchbyCountryId " + countryId);
		return branchdao.getBranchbyCountryId(countryId);
	}
}
