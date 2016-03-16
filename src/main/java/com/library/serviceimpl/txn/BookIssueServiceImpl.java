package com.library.serviceimpl.txn;

import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.library.dao.txn.BookIssueDAO;
import com.library.domain.txn.BookIssueDM;
import com.library.service.txn.BookIssueService;

public class BookIssueServiceImpl implements BookIssueService {
	@Autowired
	private BookIssueDAO bookIssueDAO;
	private Logger logger = Logger.getLogger(BookIssueServiceImpl.class);

	/**
	 * Used to save or update the BookIssue data into the database.      
	 * 
	 * @param BookIssueDM
	 *            bookissueobj         
	 */
	@Transactional
	public void saveOrUpdatebookissue(BookIssueDM bookissueobj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveOrUpdatebookissue > "
				+ "About to save the data ... ");
		bookIssueDAO.saveOrUpdatebookissue(bookissueobj);

	}

	/**
	 * used to Retrieve data from t_lib_book_issue table based on given
	 * parameters.   
	 * 
	 * @param Long issueId, Long bookId, Date issueDt, Long companyId, Long
	 *             studentId, Date returnDt, Date returnedDt, Long issuedBy,
	 *             String status
	 * @return BookIssueDM List         
	 */
	@Transactional
	public List<BookIssueDM> getbookissueList(Long issueId, Long bookId,
			Date issueDt, Long companyId, Long studentId, Date returnDt,
			Date returnedDt, Long issuedBy, String status) {
		// TODO Auto-generated method stub
		return bookIssueDAO.getbookissueList(issueId, bookId, issueDt,
				companyId, studentId, returnDt, returnedDt, issuedBy, status);
	}
}
