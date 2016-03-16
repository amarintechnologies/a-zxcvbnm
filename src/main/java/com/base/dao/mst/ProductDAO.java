
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.ProductDM;

public interface ProductDAO {
	/**
	 * To save or update product details
	 * 
	 * @param productObj
	 *            of ProductDM
	 * 
	 */
	public void saveorUpdateProductDetails(ProductDM productObj);
	
	/**
	 * To get details from product table depends on condition if all arguments are null it returns full list
	 * 
	 * @param Long
	 *            companyId,Long prodId,Long branchId,String prodName,String status,Long cateId
	 * 
	 * @return productlist of ProductDM
	 * 
	 */
	public List<ProductDM> getProductList(Long companyId, Long prodId,Long branchId, String prodName, String status, Long cateId,String uom,String filtertype);
}
