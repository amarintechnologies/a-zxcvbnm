package com.base.service.mst;

import java.util.List;

import com.base.domain.mst.MediaDM;

public interface MediaService {
	/**
	 * Used to save or update the Media data into the database.      
	 * 
	 * @param MediaDM mediaObj
	 *                    
	 */
	
	public void saveOrUpdateMaedia(MediaDM mediaObj);

	/**
	 * used to Retrieve data from t_acd_media table based on given parameters.   
	 * 
	 * @param Long mediaId
	 * @param Long studentId, 
	 *  Long mediaType, Long mediaName, Long status       
	 */
	public List<MediaDM> getMediaList(Long mediaId, Long studentId, String mediaType, String mediaName, String status,String filterType);
}
