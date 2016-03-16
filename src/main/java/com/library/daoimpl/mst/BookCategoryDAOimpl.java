//class : Book CategoryDAOImpl.java

package com.library.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.dao.mst.BookCategoryDAO;
import com.library.domain.mst.BookCategoryDM;

@Repository
public class BookCategoryDAOimpl implements BookCategoryDAO{

@Autowired
private SessionFactory SessionFactory;
private Logger logger = Logger.getLogger(BookCategoryDAOimpl.class);	

public List<BookCategoryDM> getBookCategoryList(Long bkCategoryid,
			 Long companyId,String categoryName, String status) {
		// TODO Auto-generated method stub
	logger.info("Inside  getBookCategeoryList >  " + "bkCategoryid " + bkCategoryid
			+ "categoryName " + categoryName);
	StringBuffer sql = new StringBuffer(" select ");
	sql.append(" bc.bkCategoryid as bkCategoryid,bc.companyId as companyId,bc.categoryName as categoryName,bc.status as status,bc.lastupdatedDt as lastupdatedDt,bc.lastupdatedBy as lastupdatedBy");
	sql.append(" from BookCategoryDM bc where 1=1");
	Query query = null;
	if (bkCategoryid != null) {
		sql.append(" and bc.bkCategoryid =" + bkCategoryid);
	}
	if (companyId != null) {
		sql.append(" and bc.companyId =" + companyId);
	}
	if (categoryName != null && categoryName.trim().length() > 0) {
		sql.append(" and lower(bc.categoryName)like lower('" + categoryName
				+ "%')");
	}
	
	if (status != null && status.trim().length() > 0) {
		sql.append(" and lower(bc.status)like lower('" + status + "%')");
	}
	
	sql.append(" order by bc.lastupdatedDt desc");
	logger.info("Inside getCityList > Query > " + sql);
	query = SessionFactory
			.getCurrentSession()
			.createQuery(sql.toString())
			.setResultTransformer(
					Transformers.aliasToBean(BookCategoryDM.class));
	return query.list();
}
	

	public void SaveOrUpdate(BookCategoryDM obj) {
		// TODO Auto-generated method stub
		SessionFactory.getCurrentSession().saveOrUpdate(obj);
	}
	
}
