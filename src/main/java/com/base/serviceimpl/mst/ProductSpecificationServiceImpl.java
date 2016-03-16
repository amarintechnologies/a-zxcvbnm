
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.ProductSpecificationDAO;
import com.base.domain.mst.ProductSpecificationDM;
import com.base.service.mst.ProductSpecificationService;

public class ProductSpecificationServiceImpl implements ProductSpecificationService {
	
	@Autowired
	private ProductSpecificationDAO prodspecificationdao;
	private Logger logger = Logger.getLogger(ProductSpecificationServiceImpl.class);
	
	/**
	 * To save or update product Spec details
	 * 
	 * @param specObj of ProductSpecificationDM
	 * 
	 */
	@Transactional
	@CacheEvict(value="mgcatProductSpec",allEntries=true)
	public void saveorUpdateProdSpecDetails(ProductSpecificationDM specObj) {
		logger.info("Inside saveorUpdateProdSpecDetails > " + "About to save the data ... ");
		prodspecificationdao.saveorUpdateProdSpecDetails(specObj);
	}
	
	/**
	 * To get details from product Spec table depends on condition if all arguments are null it returns full list
	 * 
	 * @param Long prodId, Long companyId, String status
	 * 
	 * @return productspeclist of ProductSpecificationDM
	 * 
	 */
	@Transactional
	 @Cacheable(value="mgcatProductSpec")
	public List<ProductSpecificationDM> getSpecList(Long prodId, Long companyId, String status) {
		logger.info("getParameterList > " + prodId + ", " + companyId + ","  + status);
		return prodspecificationdao.getSpecList(prodId, companyId, status);
	}
	
	/**
	 * To delete product Spec details
	 * 
	 * @param specId
	 * 
	 */
	@Transactional
	@CacheEvict(value = "mgcatProductSpec", allEntries = true)
	public void deleteProductSpecification(Long specId) {
		prodspecificationdao.deleteProductSpecification(specId);
	}
	
	
}
