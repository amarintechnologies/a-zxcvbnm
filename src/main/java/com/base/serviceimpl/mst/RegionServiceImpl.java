
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.RegionDAO;
import com.base.domain.mst.RegionDM;
import com.base.service.mst.RegionService;

public class RegionServiceImpl implements RegionService {
	private Logger logger = Logger.getLogger(RegionServiceImpl.class);
	@Autowired
	private RegionDAO regiondao;
	
	/**
	 * Used to save or update the RegionDM data into the database.         
	 * 
	 * @param regionObj
	 *                    
	 */
	@Transactional
	@CacheEvict(value = "mBaseRegion", allEntries = true)
	public void saveOrUpdateRegion(RegionDM regionObj) {
		logger.info("Inside saveOrUpdateRegion > ");
		regiondao.saveOrUpdateRegion(regionObj);
	}
	
	/**
	 * used to Retrieve data from MBaseRegion table based on given parameters.         
	 * 
	 * @param String
	 *            regionName, String status, Long countryId, Long companyId, String filtertype         
	 * @return List<MBaseRegion>         
	 */
	@Transactional
	@Cacheable(value = "mBaseRegion")
	public List<RegionDM> getRegionList(String regionName, String status, Long countryId, Long companyId,
			String filtertype) {
		logger.info("Inside getRegionList > " + regionName + "," + status + "," + countryId + "," + companyId + ","
				+ filtertype);
		return regiondao.getRegionList(regionName, status, countryId, companyId, filtertype);
	}
}
