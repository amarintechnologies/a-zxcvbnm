
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.StaticCodesDAO;
import com.base.domain.mst.StaticCodesDM;
import com.base.service.mst.StaticCodesService;
import com.erputil.domain.StatusDM;

public class StaticCodesServiceImpl implements StaticCodesService {
	@Autowired
	private StaticCodesDAO staticCodesDAO;
	private Logger logger = Logger.getLogger(StaticCodesServiceImpl.class);
	/**
	 * Used to save or update the StaticCodes data into the database.         
	 * @param StaticCodesDM stateObj         
	 */

	@Transactional
	@CacheEvict(value = "StaticCodes", allEntries = true)
	public void saveOrUpdateStaticCodes(StaticCodesDM staticObj) {
		logger.info("Inside saveOrUpdateStaticCodes > " + "About to save the data ... ");
		staticCodesDAO.saveOrUpdateStaticCodes(staticObj);
		
	}
	/**
	 * used to Retrieve data from M_BASE_STATIC_CODES table based on given parameters.         *        
	 * 
	 * @param String tblname,String colName,
			String staticKey, String staticValue, Long orderBy          
	 * @return StatusDM List        
	 */
	@Transactional
	@Cacheable(value = "StaticCodes")
	public List<StatusDM> getStaticCodesList(String tblname,String colName,
			String staticKey, String staticValue, Long orderBy) {
		// TODO Auto-generated method stub
		logger.info("Inside getStaticCodesList > " + "About to get StaticCodes list for " + colName + ", " + staticKey + ", "
				+ staticValue + "," + orderBy);
		return staticCodesDAO.getStaticCodesList(tblname,colName, staticKey, staticValue, orderBy);
	}
}
