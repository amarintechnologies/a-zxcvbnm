
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.ProductCategoryDAO;
import com.base.domain.mst.ProductCategoryDM;
import com.base.domain.mst.ProductCategoryListDM;
import com.base.service.mst.ProductCategoryService;

public class ProductCategoryServiceImpl implements ProductCategoryService {
	@Autowired
	private ProductCategoryDAO mgcatproductcategorydao;
	private Logger logger = Logger.getLogger(ProductCategoryServiceImpl.class);
	
	/**
	 * To save or update C details
	 * 
	 * @param categoryObj
	 *            of ProductCategoryDM
	 * 
	 */
	@Transactional
	public void saveorUpdateCategoryDetails(ProductCategoryDM categoryObj) {
		logger.info("Inside saveProductCategoryDetails > " + "About to save the data ... ");
		mgcatproductcategorydao.saveorUpdateCategoryDetails(categoryObj);
	}
	
	/**
	 * To get details from Product Category table depends on condition if all arguments are null it returns full list
	 * 
	 * @param Long
	 *            companyId, String cateName, String status, String parentid, String filtertype
	 * 
	 * @return list of ProductCategoryDM
	 * 
	 */
	@Transactional
	public List<ProductCategoryListDM> getProdCategoryList(Long cateid,Long companyId, String cateName, String status, String parentid,
			String filtertype) {
		logger.info("Inside getProductCategoryList > " + "About to get ProductCategory. list for " + companyId + ", "
				+ cateName + ", " + status);
		return mgcatproductcategorydao.getProdCategoryList(cateid,companyId, cateName, status, parentid, filtertype);
	}
}