package com.base.daoimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.StudentCategoryDAO;
import com.base.domain.mst.StudentCategoryDM;
import com.base.domain.mst.StudentDM;

@Repository
public class StudentCategoryDAOImpl implements StudentCategoryDAO {

	/**
	 * @Autowired refers that integrating the spring concepts that is using for
	 *            linking with specified class
	 **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(StudentCategoryDAOImpl.class);

	/**
	 * Method for save or update StudentCategoryDM
	 * 
	 * @param studCatObj
	 *            of studCatObj
	 */
	public void updateStudentCategoryDetails(StudentCategoryDM studCatObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(studCatObj);
	}

	public List<StudentCategoryDM> getStudentCategoryList(Long studCid,
			String categoryName, Long companyId, String status) {
		// TODO Auto-generated method stub
		logger.info("Inside  getStudentCategoryList >  " + "studCid " + studCid
				+ "categoryName " + categoryName);
		StringBuffer sql = new StringBuffer(" select");
		sql.append(" ct.studCid as studCid,ct.categoryName as categoryName,ct.companyId as companyId,ct.status as status,ct.updatedDt as updatedDt,ct.updatedBy as updatedBy");
		sql.append(" from StudentCategoryDM ct where 1=1");
		Query query = null;
		if (studCid != null) {
			sql.append(" and ct.studCid =" + studCid);
		}
		if (categoryName != null && categoryName.trim().length() > 0) {
			sql.append(" and lower(ct.categoryName)like lower('" + categoryName
					+ "%')");
		}
		if (companyId != null) {
			sql.append(" and ct.companyId =" + companyId);
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(ct.status)like lower('" + status + "%')");
		}
		
		sql.append(" order by ct.updatedDt desc");
		logger.info("Inside getCityList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(StudentCategoryDM.class));
		return query.list();
	}

}
