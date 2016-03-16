package com.library.daoimpl.txn;

import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.library.dao.txn.BookIssueDAO;
import com.library.domain.txn.BookIssueDM;

@Repository
public class BookIssueDAOImpl implements BookIssueDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(BookIssueDAOImpl.class);

	/**
	 * Used to save or update the BookIssue data into the database.      
	 * 
	 * @param BookIssueDM
	 *            bookissueobj         
	 */
	public void saveOrUpdatebookissue(BookIssueDM bookissueobj) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(bookissueobj);

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
	public List<BookIssueDM> getbookissueList(Long issueId, Long bookId,
			Date issueDt, Long companyId, Long studentId, Date returnDt,
			Date returnedDt, Long issuedBy, String status) {
		// TODO Auto-generated method stub
		logger.info("Inside  getbookissueList >  " + "issueId " + issueId
				+ "bookId " + bookId + " issueDt" + issueDt + "companyId"
				+ companyId + "studentId" + studentId + "returnDt" + "returnDt"
				+ "returnedDt" + returnedDt + "issuedBy" + issuedBy + "status"
				+ status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" b.issueId as issueId,b.bookId as bookId,b.issueDt as issueDt,b.companyId as companyId,b.studentId as studentId,b.returnDt as returnDt,");
		sql.append(" b.returnedDt as returnedDt,b.issuedBy as issuedBy,b.issueRmrks as issueRmrks,b.returnRmrks as returnRmrks,b.lateDays as lateDays,");
		sql.append(" b.lateFees as lateFees,b.feePaid as feePaid,b.paidDt as paidDt,b.pymtRef as pymtRef,b.status as status,b.lastupdatetdt as lastupdatetdt,b.lastupdatedby as lastupdatedby,");
		sql.append(" p.book_title as book_title,s.firstName as firstName");
		sql.append(" from BookIssueDM b, BooksDM p,StudentDM s where 1=1 ");
		sql.append(" and p.book_id = b.bookId and s.studentId = b.studentId ");

		Query query = null;
		if (issueId != null) {
			sql.append(" and b.issueId =" + issueId);
		}
		if (bookId != null) {
			sql.append(" and b.bookId =" + bookId);
		}
		if (studentId != null) {
			sql.append(" and b.studentId =" + studentId);

		}
		if (companyId != null) {
			sql.append(" and b.companyId =" + companyId);
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(b.status)like lower('" + status + "%')");
		}
		sql.append(" order by b.lastupdatetdt desc");
		logger.info("Inside getbookissueList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BookIssueDM.class));
		return query.list();
	}
}
