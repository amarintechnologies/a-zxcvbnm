package com.library.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.domain.mst.CurrencyDM;
import com.library.dao.mst.BooksDAO;
import com.library.domain.mst.BooksDM;

@Repository
public class BooksDAOImpl implements BooksDAO {
	@Autowired
	private SessionFactory SessionFactory;
	private Logger logger = Logger.getLogger(BooksDAOImpl.class);

	public List<BooksDM> getBooksList(Long book_id, Long company_id,
			Long category_id, String book_title, String book_slno, String status) {

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.book_id as book_id,c.company_id as company_id,c.book_title as book_title,"
				+ " c.category_id as category_id,c.book_slno as book_slno,c.isbn_no as isbn_no,"
				+ " c.auther as auther,c.book_desc as book_desc,c.book_price as book_price,c.ccy_id  as ccy_id,c.status as status,"
				+ "c.last_updated_dt as last_updated_dt,c.last_updated_by as last_updated_by,bc.categoryName as bookCat ");

		sql.append(" from BooksDM c ,BookCategoryDM bc where 1=1 and bc.bkCategoryid = c.category_id ");
		Query query = null;
		if (book_id != null) {
			sql.append(" and c.book_id=" + book_id);
		}

		if (company_id != null) {
			sql.append(" and c.company_id=" + company_id);
		}

		if (category_id != null && category_id != 0L) {
			sql.append("and c.category_id=" + category_id);
		}

		if (book_title != null && book_title.trim().length() > 0) {
			sql.append(" and lower(c.book_title) like lower('" + book_title
					+ "%')");
		}
		if (book_slno != null && book_slno.trim().length() > 0) {
			sql.append(" and lower(c.book_slno) like lower('" + book_slno
					+ "%')");
		}

		if (status != null) {
			sql.append(" and c.status='" + status + "'");
		}

		sql.append(" order by c.last_updated_dt desc");
		logger.info("Inside getBooksList > Query > " + sql);
		query = SessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(BooksDM.class));
		return query.list();
	}

	public void SaveOrUpdate(BooksDM booksobj) {
		logger.info("Inside SaveOrUpdate > Query > ");

		SessionFactory.getCurrentSession().saveOrUpdate(booksobj);

	}

}
