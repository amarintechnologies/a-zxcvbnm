package com.academic.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.mst.AcdDeceaseDAO;
import com.academic.domain.mst.AcdDeceaseDM;


@Repository
public class AcdDeceaseDAOimpl implements AcdDeceaseDAO {
	
	/**
	 * @Autowired refers that integrating the spring concepts that is using for
	 *            linking with specified class
	 **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(AcdDeceaseDAOimpl.class);
	
	/**
	 * This is implementation of AcdDeceaseDAO saveOrUpdate method. Used to save
	 * and update AcdDeceaseDM data in database
	 * f
	 * @param obj
	 *            of AcdDeceaseDM
	 */
public List<AcdDeceaseDM> getAcdDeceaseList(Long deceaseid,String deceasename,Long companyId,String status)
{

//TODO Auto-generated method stub
		logger.info("Inside  getAcdDeceaseList >  " + "deceaseid " + deceaseid
				+ "deceasename " + deceasename);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" ad.deceaseid as deceaseid,ad.deceasename as deceasename,ad.companyId as companyId,ad.status as status,ad.updatedDt as updatedDt,ad.updatedBy as updatedBy");
		sql.append(" from AcdDeceaseDM ad where 1=1");
		Query query = null;
		if (deceaseid != null) {
			sql.append(" and ad.deceaseid =" + deceaseid);
		}
		if (deceasename != null && deceasename.trim().length() > 0) {
			sql.append(" and lower(ad.deceasename)like lower('" + deceasename
					+ "%')");
		}
		if (companyId != null) {
			sql.append(" and ad.companyId =" + companyId);
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(ad.status)like lower('" + status + "%')");
		}
		
		sql.append(" order by ad.updatedDt desc");
		logger.info("Inside getCityList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(AcdDeceaseDM.class));
		return query.list();
	}

	public void saveOrUpdate(AcdDeceaseDM obj) {
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
		
	}
}
