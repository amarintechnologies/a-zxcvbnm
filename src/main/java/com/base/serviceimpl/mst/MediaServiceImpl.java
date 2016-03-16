package com.base.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.MediaDAO;
import com.base.dao.mst.StateDAO;
import com.base.domain.mst.MediaDM;
import com.base.service.mst.MediaService;

public class MediaServiceImpl implements MediaService {
	@Autowired
	private MediaDAO mediadao;
	private Logger logger = Logger.getLogger(MediaServiceImpl.class);
	
	/**
	 * Used to save or update the media data into the database.         @param StateDM stateObj         
	 */
	@Transactional
	public void saveOrUpdateMaedia(MediaDM mediaObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveOrUpdateState > " + "About to save the data ... ");
		mediadao.saveOrUpdateMaedia(mediaObj);
		
	}
	/**
	 *         * used to Retrieve data from M_Base_State table based on given parameters.         *        
	 * 
	 * @param String stateName
	 * @param String status
	 * @param Long countryId
	 * @param Long companyId
 	 * @param String filtertype             
	 * @return StateDM List        
	 */
	@Transactional
	public List<MediaDM> getMediaList(Long mediaId, Long studentId,
			String mediaType, String mediaName, String status, String filterType) {
		// TODO Auto-generated method stub
		logger.info("Inside getStateList > " + "About to get State list for " + mediaId + ", " + studentId + ", "
				+ mediaType + "," + mediaName);
		return mediadao.getMediaList(mediaId, studentId, mediaType, mediaName, status, filterType);
	}

}
