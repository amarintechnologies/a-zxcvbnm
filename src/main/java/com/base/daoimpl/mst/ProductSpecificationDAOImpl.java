
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.ProductSpecificationDAO;
import com.base.domain.mst.ProductSpecificationDM;

@Repository
public class ProductSpecificationDAOImpl implements ProductSpecificationDAO {
	private Logger logger = Logger.getLogger(ProductSpecificationDAOImpl.class);
	@Autowired
	private SessionFactory sessionfactory;
	@Value("${GET_PRODUCT_SPECIFICATION_LIST}")
	private String queryString;
	@Value("${DELETE_PRODUCT_SPECIFICATION_DETAIL}")
	private String deletesql;
	
	/** Method for save or update ProductSpecification **/
	/**
	 * @param specObj
	 *            of ProductSpecificationDM
	 */
	public void saveorUpdateProdSpecDetails(ProductSpecificationDM specObj) {
		logger.info("Inside Product Details > " + specObj.getSpeccode() + "," + specObj.getSpecdesc() + ","
				+ specObj.getSpecstatus());
		sessionfactory.getCurrentSession().saveOrUpdate(specObj);
	}
	
	/**
	 * To get details from ProductSpecification table depends on condition if all arguments are null it returns full
	 * list
	 * 
	 * @param Long
	 *            prodId,Long companyId,String status
	 * 
	 * @return SpecList of ProductSpecificationDM
	 * 
	 */
	public List<ProductSpecificationDM> getSpecList(Long prodId, Long companyId, String status) {
		logger.info("Inside getProductSpeciList > " + prodId + ", " + companyId + ", " + status + "," + status);
		StringBuilder sql = new StringBuilder(queryString);
		List<ProductSpecificationDM> specList = null;
		if (prodId != null) {
			sql.append(" and m.prodid=" + prodId);
		}
		if (companyId != null) {
			sql.append(" and m.prodid in (select d.prodid from ProductDM d where d.companyid = " + companyId + ")");
		}
		if (status != null) {
			sql.append(" and m.specstatus='" + status + "'");
		}
		sql.append(" order by m.lastupdateddt desc");
		logger.info("Inside getProductSpecificationList  Query > " + sql);
		Query query = sessionfactory.getCurrentSession().createQuery(sql.toString());
		specList = query.list();
		return specList;
	}
	
	/**
	 * Delete Product Specification list based on parameters.
	 * 
	 * @param specId
	 * @return List<ProductSpecification>
	 */
	public void deleteProductSpecification(Long specId) {
		String sql = deletesql;
		Query query = sessionfactory.getCurrentSession().createQuery(sql);
		query.setParameter("specid", specId);
		query.executeUpdate();
	}
}