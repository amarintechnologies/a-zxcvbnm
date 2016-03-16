package com.academic.service.txn;

import java.util.List;

import com.academic.domain.txn.CommentsDM;
import com.base.domain.mst.MediaDM;

public interface CommentsService {
	/**
	 * Used to save or update the Comments data into the database.      
	 * 
	 * @param CommentsDM commentsObj
	 *                    
	 */
	
	public void saveOrUpdateComments(CommentsDM commentsObj);

	/**
	 * used to Retrieve data from t_acd_media table based on given parameters.   
	 * 
	 * @param Long CommentsId, Long StudentId, String commentTitle, String status,String filterTyp     
	 */
	public List<CommentsDM> getCommnetsList(Long commentsId, Long studentId, String commentTitle, String status,String filterType);
}
