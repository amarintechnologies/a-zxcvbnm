
package com.base.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.ProductCategoryDAO;
import com.base.domain.mst.ProductCategoryDM;
import com.base.domain.mst.ProductCategoryListDM;

@Repository
public class ProductCategoryDAOImpl implements ProductCategoryDAO {
	private Logger logger = Logger.getLogger(ProductCategoryDAOImpl.class);
	@Autowired
	private SessionFactory sessionfactory;
	
	/**
	 * To save or update product category details
	 * 
	 * @param categoryObj
	 *            of ProductCategoryDM
	 * 
	 */
	public void saveorUpdateCategoryDetails(ProductCategoryDM categoryObj) {
		logger.info("Inside saveorUpdateCategoryDetails > " + categoryObj.getCompanyid() + ", "
				+ categoryObj.getCatename());
		sessionfactory.getCurrentSession().saveOrUpdate(categoryObj);
	}
	
	/**
	 * To get details from Product Category table depends on condition if all arguments are null it returns full list
	 * 
	 * @paramLong companyId, String cateName, String status, String parentid,String filtertyp
	 * 
	 * @return list of ProductCategoryDM
	 * 
	 */
	public List<ProductCategoryListDM> getProdCategoryList(Long cateid,Long companyId, String cateName, String status, String parentid,
			String filtertype) {
		logger.info("Inside getProductCategoryList > " +cateid+","+ companyId + ", " + cateName + ", " + status + "," + parentid
				+ "," + filtertype);
		StringBuilder sql = new StringBuilder(" select");
		if (filtertype.equals("P")) {
			sql.append(" new ProductCategoryListDM(cateid,catename)");

		} else {
			sql.append(" p ");
		}
		sql.append(" from ProductCategoryListDM p where 1=1");
		
		if (cateid != null) {
			sql.append(" and p.parentcateid=" + cateid);
		}
		
		if (companyId != null) {
			sql.append(" and p.companyid=" + companyId);
		}
		if (cateName != "" && cateName != null) {
			sql.append(" and lower(p.catename) like lower('" + cateName + "%')");
		}
		if (parentid != "" && parentid != null) {
			sql.append(" and lower(pc.catename) like lower('" + parentid + "%'))");
		}
		if (status != null) {
			sql.append(" and p.catestatus='" + status + "'");
		}
		sql.append(" order by p.lastupdateddt desc");
		logger.info("Inside getProductCategoryList  Query > " + sql);
		Query query = sessionfactory.getCurrentSession().createQuery(sql.toString());
		logger.info("Inside getProductCategoryList  List size > " + query.list().size());
		return query.list();
	}
}