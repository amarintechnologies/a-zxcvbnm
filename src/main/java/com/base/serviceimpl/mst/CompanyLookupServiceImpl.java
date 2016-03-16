
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.CompanyLookupDAO;
import com.base.domain.mst.CompanyLookupDM;
import com.base.service.mst.CompanyLookupService;

public class CompanyLookupServiceImpl implements CompanyLookupService {
	@Autowired
	private CompanyLookupDAO mbasecmpnylookupdao;
	private Logger logger = Logger.getLogger(CompanyLookupServiceImpl.class);
	
	/**
	 * Method for save or update CompanyLookupDM
	 * 
	 * @param companyLookupObj
	 *            of CompanyLookupDM
	 */
	@Transactional
	@CacheEvict(value = "CompanyLookup", allEntries = true)
	public void saveorUpdateCompanyLookupDetails(CompanyLookupDM companyLookupObj) {
		logger.info("Inside saveorUpdateCompanyLookupDetails > " + "About to save the data ... ");
		mbasecmpnylookupdao.saveorUpdateCompanyLookupDetails(companyLookupObj);
	}
	
	/**
	 * To search details on CompanyLookupDM table
	 * 
	 * @param Long
	 *            companyId, String lookUpname, Long lookupId, String status, String filterType
	 * 
	 * @return list of CompanyLookupDM
	 */
	@Transactional
	@Cacheable(value = "CompanyLookup")
	public List<CompanyLookupDM> getCompanyLookupList(Long companyId, String lookUpname, Long lookupId, String status,
			Long moduleId, String filterType) {
		logger.info("Inside getCompanyLookupList > " + companyId + "," + lookUpname + "," + lookupId + "," + status
				+ "'" + filterType);
		return mbasecmpnylookupdao.getCompanyLookupList(companyId, lookUpname, lookupId, status, moduleId, filterType);
	}
	
	/**
	 * Method return company look up details based on below parameters
	 * 
	 * @param Long
	 *            companyid, Long moduleId, String status, String lookUpCode
	 * @return List of CompanyLookupDM
	 */
	@Transactional
	public List<CompanyLookupDM> getCompanyLookUpByLookUp(Long companyid, Long moduleid, String status,
			String lookUpCode) {
		logger.info("Inside getCompanyLookUpByLookUp > " + companyid + "," + moduleid + "," + status + "," + lookUpCode);
		return mbasecmpnylookupdao.getCompanyLookUpByLookUp(companyid, moduleid, status, lookUpCode);
	}
}
