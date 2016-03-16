package com.library.service.txn;

import java.util.Date;
import java.util.List;
import com.library.domain.txn.BookIssueDM;

public interface BookIssueService {
	/**
	 * Used to save or update the BookIssue data into the database.      
	 * 
	 * @param BookIssueDM
	 *            bookissueobj         
	 */
	public void saveOrUpdatebookissue(BookIssueDM bookissueobj);

	/**
	 * used to Retrieve data from t_lib_book_issue table based on given
	 * parameters.   
	 * 
	 * @param Long issueId, Long bookId, Date issueDt, Long companyId, Long
	 *             studentId, Date returnDt, Date returnedDt, Long issuedBy,
	 *             String status
	 * @return BookIssueDM List         
	 */
	public List<BookIssueDM> getbookissueList(Long issueId, Long bookId,
			Date issueDt, Long companyId, Long studentId, Date returnDt,
			Date returnedDt, Long issuedBy, String status);
}
