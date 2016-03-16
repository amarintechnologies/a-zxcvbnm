package com.library.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.library.dao.txn.BookRenewalDAO;
import com.library.domain.txn.BookRenewalDM;
import com.library.service.txn.BookRenewalService;

public class BookRenewalServiceImpl implements BookRenewalService {

	@Autowired
	private BookRenewalDAO bookrenewalDAO;
	private Logger logger = Logger.getLogger(BookRenewalServiceImpl.class);

	/**
	 * Used to save or update the BookRenewal data into the database.      
	 * 
	 * @param BookRenewalDM
	 *            bookrenewalobj         
	 */
	@Transactional
	public void saveOrUpdatebookrenewal(BookRenewalDM bookrenewalobj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveOrUpdatebookrenewal > "
				+ "About to save the data ... ");
		bookrenewalDAO.saveOrUpdatebookrenewal(bookrenewalobj);

	}

	/**
	 * used to Retrieve data from t_lib_book_renewal table based on given
	 * parameters.   
	 * 
	 * @param Long renewid,Long issueid,Long bookid,String status);
	 * @return BookRenewalDM List         
	 */
	@Transactional
	public List<BookRenewalDM> getbookrenewalList(Long renewid, Long issueid,
			Long bookid, String status, Long studId) {
		// TODO Auto-generated method stub
		return bookrenewalDAO.getbookrenewalList(renewid, issueid, bookid,
				status, studId);
	}

}
