package com.base.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.MediaDAO;
import com.base.domain.mst.MediaDM;
import com.base.domain.mst.StateDM;

@Repository
public class MediaDAOImpl implements MediaDAO{
	/** @Autowired refers that integrating the spring concepts that is using for linking with specified class **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(MediaDAOImpl.class);
	/**
	 * Method for save or update MediaDM
	 * 
	 * @param mediaObj
	 *            of mediaObj
	 */
	public void saveOrUpdateMaedia(MediaDM mediaObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(mediaObj);
	}
	public List<MediaDM> getMediaList(Long mediaId, Long studentId,
			String mediaType, String mediaName, String status,String filterType) {
		// TODO Auto-generated method stub
		logger.info("Inside  getMediaList >  " + "mediaId " + mediaId
				+ "studentId " + studentId);
		Query query = null;
		StringBuffer sql = new StringBuffer("select ");
		if (filterType.equals("P")) {
			sql.append(" mt.mediaId as mediaId,mt.mediaName as mediaName from MediaDM mt where 1=1");
		} else {
			
		sql.append(" mt.mediaId as mediaId,mt.studentId as studentId,mt.mediaType as mediaType,mt.mediaName as mediaName,mt.mediaAttchment as mediaAttchment,mt.remarks as remarks,mt.status as status,mt.updatedDt as updatedDt,mt.updatedBy as updatedBy,");
		sql.append("st.firstName as studentName");
		sql.append(" from MediaDM mt,StudentDM st where 1=1 and st.studentId=mt.studentId");
		}
	
	
		if (studentId != null) {
			sql.append(" and mt.studentId=" + studentId);
		}
		
		if (status != null) {
			sql.append(" and lower(mt.status) like lower('" + status + "%')");
		}
		
		sql.append(" order by mt.updatedDt desc");
		logger.info("Inside getMediaList > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(MediaDM.class));
		return query.list();
	}
	
}

	

