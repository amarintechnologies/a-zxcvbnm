
package com.base.serviceimpl.mst;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.SlnoGenDAO;
import com.base.domain.mst.SlnoGenDM;
import com.base.service.mst.SlnoGenService;

public class SlnoGenServiceImpl implements SlnoGenService {
	Logger logger = Logger.getLogger(SlnoGenServiceImpl.class);
	@Autowired
	private SlnoGenDAO slnoDao;
	
	/**
	 * To get serial number generation list based on user's input
	 * 
	 * @param Long
	 *            SlnoId, Long companyid, String refkey, Long branchId, Long moduleId, String slnoGenLvl
	 * 
	 * @return List of SlnoGenDM
	 */
	@Transactional
	@Cacheable(value = "SlnoGen")
	public List<SlnoGenDM> getSlnoGenerationList(Long SlnoId, Long companyid, String refkey, Long branchId,
			String slnoGenLvl,String filtertype) {
		logger.info("Inside ServiceImpl getSlnoGenerationList > " + "About to get SlnoGeneraion. list for " + companyid
				+ ", " + refkey + ", ");
		return slnoDao.getSlnoGenerationList(SlnoId, companyid, refkey, branchId, slnoGenLvl, filtertype);
	}
	
	/**
	 * To saveOrUpdate details
	 * 
	 * @param SlnoGenDM
	 *            slnoObj
	 * 
	 */
	@Transactional
	@CacheEvict(value = "SlnoGen", allEntries = true)
	public void saveorupadateSlnoGeneration(SlnoGenDM slnoObj) {
		logger.info("Inside upadateSlnoGeneration > " + " SlnoGenDM.. ");
		// TODO Auto-generated method stub
		slnoDao.saveorupadateSlnoGeneration(slnoObj);
	}
	
	/**
	 * To get sequence number
	 * 
	 * @param Long
	 *            companyid,Long branchid,Long moduleid,String refkey
	 * 
	 * @return String sequence
	 * 
	 */
	@Transactional
	public List<SlnoGenDM> getSequenceNumber(Long companyid, Long branchid,String refkey) {
		// TODO Auto-generated method stub
		return slnoDao.getSequenceNumber(companyid, branchid, refkey);
	}
	
	/**
	 * To update sequence number
	 * 
	 * @param Long
	 *            companyid,Long branchid,Long moduleid,String refkey
	 * 
	 */
	@Transactional
	public void updateNextSequenceNumber(Long companyid, Long branchid,  String refkey) {
		// TODO Auto-generated method stub
		slnoDao.updateNextSequenceNumber(companyid, branchid, refkey);
	}
}
