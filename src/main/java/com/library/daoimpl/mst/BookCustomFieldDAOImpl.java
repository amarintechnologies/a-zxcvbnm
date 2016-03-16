package com.library.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.dao.mst.BookCustomFieldsDAO;
import com.library.domain.mst.BookCustomFieldsDM;
import com.library.domain.mst.BooksDM;

@Repository
public class BookCustomFieldDAOImpl implements BookCustomFieldsDAO {
	@Autowired
	private SessionFactory SessionFactory;
	private Logger logger = Logger.getLogger(BookCustomFieldDAOImpl.class);

	public void SaveOrUpdate(BookCustomFieldsDM bookCussobj) {
		SessionFactory.getCurrentSession().saveOrUpdate(bookCussobj);

	}

	public List<BookCustomFieldsDM> getBookCustomListList(Long bkcfld_valid,
			Long book_id, Long field_id, String status) {

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.bkcfld_valid as bkcfld_valid,c.book_id as book_id,c.field_id as field_id,"
				+ " c.column_name as column_name,c.column_tvalue as column_tvalue,c.column_dvalue as column_dvalue,"
				+ " c.column_nvalue as column_nvalue,c.status as status,c.last_updated_dt as last_updated_dt,"
				+ " c.last_updated_by as last_updated_by");

		sql.append(" from BookCustomFieldsDM c, BooksDM bs where 1=1  and bs.book_id = c.book_id");
		Query query = null;
		if (book_id != null) {
			sql.append(" and c.book_id=" + book_id);
		}

		if (bkcfld_valid != null) {
			sql.append(" and c.bkcfld_valid=" + bkcfld_valid);
		}

		if (field_id != null && field_id != 0L) {
			sql.append("and c.field_id=" + field_id);
		}
		if (status != null) {
			sql.append(" and c.status='" + status + "'");
		}

		// sql.append(" order by c. desc");
		logger.info("Inside getBookCustomListList > Query > " + sql);
		query = SessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BookCustomFieldsDM.class));
		return query.list();
	}

	public void deleteBooksCutomfd(Long bfld) {
		logger.info("Inside deleteBooksCutomfd >>>>>>>>>>>>>>>>>>>>>>>");

		String sql = "delete from BookCustomFieldsDM b where b.book_id ="
				+ bfld + " ";
		SessionFactory.getCurrentSession().createQuery(sql).executeUpdate();
	}

}
