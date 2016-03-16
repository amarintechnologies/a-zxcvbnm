
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.ProductDAO;
import com.base.domain.mst.ProductDM;

@Repository
public class ProductDAOImpl implements ProductDAO {
	private Logger logger = Logger.getLogger(ProductDAOImpl.class);
	@Autowired
	private SessionFactory sessionfactory;
	@Value("${GET_PRODUCT_LIST}")
	private String queryString;
	
	/**
	 * To save or update product details
	 * 
	 * @param productObj
	 *            of ProductDM
	 * 
	 */
	public void saveorUpdateProductDetails(ProductDM productObj) {
		logger.info("Inside Product Details > " + productObj.getCompanyid() + ", " + productObj.getProdname() + ","
				+ productObj.getParentprodName() + "," + productObj.getProdstatus());
		sessionfactory.getCurrentSession().saveOrUpdate(productObj);
	}
	
	/**
	 * To get details from company devices table depends on condition if all arguments are null it returns full list
	 * 
	 * 
	 * @param Long
	 *            companyId, Long prodId,Long branchid, String prodName, String status, Long cateId prodId prodName
	 *            status cateId
	 * 
	 * @return productlist of ProductDM
	 * 
	 * 
	 */
	public List<ProductDM> getProductList(Long companyId, Long prodId, Long branchId, String prodName, String status,
			Long cateId,String uom,  String filtertype) {
		logger.info("Inside getProductList > " + companyId + ", " + prodId + "," + branchId + "," + prodName + ","
				+ status + "," + cateId);
		StringBuffer sql = new StringBuffer(" select ");
		if (filtertype.equals("P")) {
			sql.append("p.prodid as prodid,p.prodname as prodname, p.uom as uom");
			sql.append(" from ProductDM p where  1=1");
		} else {
			sql.append(" p.prodid as prodid,p.cateid as cateid,p.companyid as companyid,p.parentprodid as parentprodid,");
			sql.append(" p.prodname as prodname,p.proddesc as proddesc,p.prodimg as prodimg,p.productcode as productcode,");
			sql.append(" p.brandname as brandname,p.proddoc as proddoc,p.price as price,p.shortdesc as shortdesc,");
			sql.append(" p.uom as uom,p.ccyid as ccyid,p.visualizeryn as visualizeryn,p.branchid as branchid,");
			sql.append(" p.view360yn as view360yn,p.prodstatus as prodstatus,p.visualizeryn as visualizeryn,p.lastupdateddt as lastupdateddt,p.createddt as createddt,p.createdby as createdby,");
			sql.append(" p.lastupdatedby as lastupdatedby,ct.catename as cateName,c.ccyname as ccyName,pp.prodname as parentprodName,b.branchName as branchName");
			sql.append(" from ProductDM p,CurrencyDM c,ProductCategoryDM  ct,ProductDM pp,BranchDM b where 1=1 ");
			sql.append(" and c.ccyid=p.ccyid and ct.cateid = p.cateid and p.prodid = pp.prodid and p.branchid=b.branchId ");
		}
		Query query = null;
		if (companyId != null) {
			sql.append(" and p.companyid=" + companyId);
		}
		if (branchId != null && branchId != 0L) {
			sql.append("and p.branchid=" + branchId);
		}
		if (prodId != null && prodId != 0L) {
			sql.append(" and p.prodid=" + prodId);
		}
		if (prodName != null && prodName.trim().length() > 0) {
			sql.append(" and lower(p.prodname) like lower('" + prodName + "%')");
		}
		if (status != null) {
			sql.append(" and p.prodstatus='" + status + "'");
		}
		if (cateId != null && cateId != 0L) {
			sql.append(" and p.cateid=" + cateId);
		}
		sql.append(" order by p.lastupdateddt desc");
		logger.info("Inside getProductList  Query > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(ProductDM.class));
		query.setMaxResults(10);
		return query.list();
	}
}
