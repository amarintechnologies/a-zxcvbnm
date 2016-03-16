
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.LookupDAO;
import com.base.domain.mst.LookupDM;
import com.base.service.mst.LookupService;

public class LookupServiceImpl implements LookupService {
	@Autowired
	private LookupDAO mbaselookupdao;
	private Logger logger = Logger.getLogger(LookupServiceImpl.class);
	
	/**
	 * Method for save or update LookupDM details
	 * 
	 * @param lookupObj
	 *            of lookupDM
	 */
	@Transactional
	@CacheEvict(value = "Lookup", allEntries = true)
	public void saveAndUpdateDetails(LookupDM lookupObj) {
		logger.info("Inside saveAndUpdateDetails > " + "About to save the data ... ");
		mbaselookupdao.saveAndUpdateDetails(lookupObj);
	}
	
	/**
	 * To return data from LookUpDM based on user's input
	 * 
	 * @param String
	 *            moduleId, String lookUpcode, String lookUpdesc,String status, String filterType
	 * @return LookupDM List
	 */
	@Transactional
	@Cacheable(value = "Lookup")
	public List<LookupDM> getLookupList(Long moduleId, String lookUpcode, String lookUpdesc, String status,
			String filterType) {
		logger.info("Inside getLookupList > " + "About to get lookUpDM. list for " + lookUpcode + ", " + lookUpdesc
				+ "," + status);
		return mbaselookupdao.getLookupList(moduleId, lookUpcode, lookUpdesc, status, filterType);
	}
}
