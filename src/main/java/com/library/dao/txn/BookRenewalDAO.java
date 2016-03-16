package com.library.dao.txn;

import java.util.List;

import com.library.domain.txn.BookRenewalDM;

public interface BookRenewalDAO {
	/**
	 * Used to save or update the BookRenewal data into the database.      
	 * 
	 * @param BookRenewalDM
	 *            bookrenewalobj         
	 */
	public void saveOrUpdatebookrenewal(BookRenewalDM bookrenewalobj);

	/**
	 * used to Retrieve data from t_lib_book_renewal table based on given
	 * parameters.   
	 * 
	 * @param Long renewid,Long issueid,Long bookid,String status);
	 * @return BookRenewalDM List         
	 */
	public List<BookRenewalDM> getbookrenewalList(Long renewid, Long issueid,
			Long bookid, String status, Long studId);
}
