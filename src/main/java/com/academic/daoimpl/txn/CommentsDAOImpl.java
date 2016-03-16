package com.academic.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.CommentsDAO;
import com.academic.domain.txn.CommentsDM;
import com.base.domain.mst.MediaDM;
@Repository
public class CommentsDAOImpl implements CommentsDAO{
	/** @Autowired refers that integrating the spring concepts that is using for linking with specified class **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(CommentsDAOImpl.class);
	/**
	 * Method for save or update CommentsDM
	 * 
	 * @param commentsObj
	 *            of commentsObj
	 */
	public void saveOrUpdateComments(CommentsDM commentsObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(commentsObj);
	}
	public List<CommentsDM> getCommnetsList(Long commentsId, Long studentId,
			String commentTitle, String status, String filterType) {
		// TODO Auto-generated method stub
		
		logger.info("Inside  getMediaList >  " + "CommentsId" + commentsId
				+ "studentId " + studentId);
		Query query = null;
		StringBuffer sql = new StringBuffer("select ");
		if (filterType.equals("P")) {
			sql.append("  mt.commentsId as commentsId,mt.studentId as studentId from CommentsDM mt where 1=1 ");
		} else {
			
		sql.append(" mt.commentsId as commentsId,mt.studentId as studentId,mt.commentTitle as commentTitle,mt.remarks as remarks,mt.status as status,mt.updatedDt as updatedDt,mt.updatedBy as updatedBy,");
		sql.append("st.firstName as studentName");
		sql.append(" from CommentsDM mt,StudentDM st where 1=1 and st.studentId=mt.studentId ");
		}
		if (commentsId != null) {
			sql.append(" and mt.commentsId=" + commentsId);
		}
		if (studentId != null) {
			sql.append(" and mt.studentId=" + studentId);
		}
		if (commentTitle != "" && commentTitle != null){
			sql.append(" and lower(mt.commentTitle) like lower('" + commentTitle + "%')");
		}
		if (status != null) {
			sql.append(" and lower(mt.status) like lower('" + status + "%')");
		}
		
		sql.append(" order by mt.updatedDt desc");
		logger.info("Inside getCommentsList > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString()).setResultTransformer(Transformers.aliasToBean(CommentsDM.class));
		return query.list();
	}
	
}

	
