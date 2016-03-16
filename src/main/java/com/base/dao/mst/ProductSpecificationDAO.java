
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.ProductSpecificationDM;

public interface ProductSpecificationDAO {
	/** Method for save or update ProductSpecification **/
	/**
	 * @param specObj
	 *            of ProductSpecificationDM
	 */
	public void saveorUpdateProdSpecDetails(ProductSpecificationDM specObj);
	
	/**
	 * Delete Product Specification list based on parameters.
	 * 
	 * @param specId
	 * @return List<ProductSpecification>
	 */
	public void deleteProductSpecification(Long specId);
	
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
	public List<ProductSpecificationDM> getSpecList(Long prodId, Long companyId, String status);
}
