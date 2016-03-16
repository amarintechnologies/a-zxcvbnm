package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.CommentsDAO;
import com.academic.domain.txn.CommentsDM;
import com.academic.service.txn.CommentsService;
import com.base.domain.mst.MediaDM;


public class CommentsServiceImpl implements CommentsService{
	@Autowired
	private CommentsDAO commentsDao;
	private Logger logger = Logger.getLogger(CommentsServiceImpl.class);
	/**
	 * Used to save or update the Comments data into the database.              
	 */
	@Transactional
	public void saveOrUpdateComments(CommentsDM commentsObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveOrUpdateState > " + "About to save the data ... ");
		commentsDao.saveOrUpdateComments(commentsObj);
	}
	@Transactional
	public List<CommentsDM> getCommnetsList(Long commentsId, Long studentId,
			String commentTitle, String status, String filterType) {
		// TODO Auto-generated method stub
		logger.info("Inside getStateList > " + "About to get State list for " + commentsId + ", " + commentsId + ", "
				+ commentTitle + "," + studentId);
		return commentsDao.getCommnetsList(commentsId, studentId, commentTitle, status, filterType);
	}
}
	
	