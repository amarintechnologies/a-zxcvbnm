
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.CompanyDAO;
import com.base.domain.mst.CompanyDM;
import com.base.service.mst.CompanyService;

public class CompanyServiceImpl implements CompanyService {
	/** @Autowired refers that integrating the spring concepts that is using for linking with specified class **/
	@Autowired
	private CompanyDAO mbasecmpnydao;
	private Logger logger = Logger.getLogger(CompanyServiceImpl.class);
	
	/**
	 * Method for save or update CompanyDM
	 * 
	 * @param companyObj
	 *            of CompanyDM
	 */
	@Transactional
	@CacheEvict(value = "company", allEntries = true)
	public void saveorUpdateCompanyDetails(CompanyDM companyObj) {
		logger.info("Inside saveorUpdateCompanyDetails > " + "About to save the data ... ");
		mbasecmpnydao.saveorUpdateCompanyDetails(companyObj);
	}
	
	/**
	 * Method for return the CompanyDM list by company name and status
	 * 
	 * @param String
	 *            companyName, String status, Long companyId
	 * 
	 * @return list of CompanyDM
	 */
	@Transactional
	@Cacheable(value = "company")
	public List<CompanyDM> getCompanyList(String companyName, String status, Long companyId) {
		logger.info("Inside getCompanyList > " + "About to get CompanyDM. list for " + companyName + ", " + status
				+ "," + companyId);
		return mbasecmpnydao.getCompanyList(companyName, status, companyId);
	}
}
