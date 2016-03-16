package com.library.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.dao.mst.BookTagsDAO;
import com.library.domain.mst.BookTagsDM;

@Repository
public class BookTagsDAOImpl implements BookTagsDAO {
	@Autowired
	private SessionFactory SessionFactory;
	private Logger logger = Logger.getLogger(BookTagsDAOImpl.class);
	/** Method for save or update BookTagsDM **/
	/**
	 * @param tagobj
	 *            of BookTagsDM
	 */

	public void SaveOrUpdate(BookTagsDM tagobj) {
		SessionFactory.getCurrentSession().saveOrUpdate(tagobj);
		
	}
	/** Get getBookCategeoryList based on bookCatgid **/
	/**
	 * To get BookTagsDM based on bksrch_tagid
	 * 
	 * @param Long bksrch_tagid,Long book_id,String search_tag
	 * 
	 * 
	 * @return list of BookTagsDM
	 */
	public List<BookTagsDM> getBookTagsList(Long bksrch_tagid, Long book_id,
			String search_tag) {
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.bksrch_tagid as bksrch_tagid,c.book_id as book_id,c.search_tag as search_tag,b.book_title as bookName ");

		sql.append(" from BookTagsDM c ,BooksDM b where 1=1 and b.book_id = c.book_id ");
		Query query = null;
		if (book_id != null) {
			sql.append(" and c.book_id=" + book_id);
		}

		if (bksrch_tagid != null) {
			sql.append(" and c.bksrch_tagid=" + bksrch_tagid);
		}

		if (search_tag != null && search_tag.trim().length() > 0) {
			sql.append(" and lower(c.search_tag)like lower('" + search_tag
					+ "%')");
		}

		sql.append(" order by c.bksrch_tagid desc");
		logger.info("Inside getBookTagsList > Query > " + sql);
		query = SessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BookTagsDM.class));
		return query.list();
	}

}


