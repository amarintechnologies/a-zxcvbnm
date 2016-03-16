
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.ProductDAO;
import com.base.domain.mst.ProductDM;
import com.base.service.mst.ProductService;

public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO mgcatproductdao;
	private Logger logger = Logger.getLogger(ProductServiceImpl.class);
	/**
	 * To save or update product details
	 * 
	 * @param productObj
	 *            of ProductDM
	 * 
	 */
	@Transactional
	@CacheEvict(value = "Product", allEntries = true)
	public void saveorUpdateProductDetails(ProductDM productObj) {
		logger.info(" saveorUpdateProductDetails > " + "About to update the data ... ");
		mgcatproductdao.saveorUpdateProductDetails(productObj);
	}
	
	/**
	 * To get details from product table depends on condition if all arguments are null it returns full list
	 * 
	 * @param Long
	 *            companyId, Long prodId,Long branchId,String prodName,String status,Long cateId
	 * 
	 * @return productlist of ProductDM
	 * 
	 */
	@Transactional
	@Cacheable(value = "Product")
	public List<ProductDM> getProductList(Long companyId, Long prodId,Long branchId, String prodName, String status, Long cateId,String uom, String filtertype) {
		logger.info("getProductList > " + companyId + ", " + prodId + "," +branchId+","+ prodName + ", " + status+","+cateId+","+filtertype);
		return mgcatproductdao.getProductList(companyId, prodId,branchId, prodName, status, cateId,uom,filtertype);
	}
}