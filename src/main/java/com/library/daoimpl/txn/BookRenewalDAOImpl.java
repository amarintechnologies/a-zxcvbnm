package com.library.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.dao.txn.BookRenewalDAO;
import com.library.domain.txn.BookIssueDM;
import com.library.domain.txn.BookRenewalDM;

@Repository
public class BookRenewalDAOImpl implements BookRenewalDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(BookRenewalDAOImpl.class);

	/**
	 * Used to save or update the BookRenewal data into the database.      
	 * 
	 * @param BookRenewalDM
	 *            bookrenewalobj         
	 */

	public void saveOrUpdatebookrenewal(BookRenewalDM bookrenewalobj) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(bookrenewalobj);
	}

	/**
	 * used to Retrieve data from t_lib_book_renewal table based on given
	 * parameters.   
	 * 
	 * @param Long renewid,Long issueid,Long bookid,String status);
	 * @return BookRenewalDM List         
	 */
	public List<BookRenewalDM> getbookrenewalList(Long renewid, Long issueid,
			Long bookid, String status, Long studId) {
		// TODO Auto-generated method stub
		logger.info("Inside  getbookrenewalList >  " + "renewid " + renewid
				+ "issueid " + issueid + " bookid" + bookid + "status" + status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" b.renewid as renewid,b.issueid as issueid,b.bookid as bookid,b.renewdate as renewdate,b.returndate as returndate,b.renewdby as renewdby,");
		sql.append(" b.renewdremarks as renewdremarks,b.status as status,b.lastupdateddt as lastupdateddt,b.lastupdatedby as lastupdatedby,c.book_title as book_title,");
		sql.append(" s.firstName as firstName");
		sql.append(" from BookRenewalDM b,BooksDM c,StudentDM s , BookIssueDM bk where 1=1 ");
		sql.append(" and b.bookid = c.book_id and bk.studentId = s.studentId and bk.issueId=b.issueid");

		Query query = null;
		if (renewid != null) {
			sql.append(" and b.renewid =" + renewid);
		}
		if (issueid != null) {
			sql.append(" and b.issueid = " + issueid);

		}

		if (studId != null) {
			sql.append(" and b.issueid in (select i.issueId from BookIssueDM i where i.studentId ="
					+ studId + ")");
		}
		if (bookid != null) {
			sql.append(" and b.bookid =" + bookid);
		}
		if (status != null) {
			sql.append(" and .status='" + status + "'");
		}
		sql.append(" order by b.lastupdateddt desc");
		logger.info("Inside getbookrenewalList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BookRenewalDM.class));
		return query.list();
	}
}
