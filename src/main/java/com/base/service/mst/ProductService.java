
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.ProductDM;

public interface ProductService {
	/**
	 * To save or update company devices details
	 * 
	 * @param productObj
	 *            of ProductDM
	 * 
	 */
	public void saveorUpdateProductDetails(ProductDM productObj);
	
	/**
	 * To get details from product table depends on condition if all arguments are null it returns full list
	 * 
	 * Long companyId,Long prodId,Long branchId,String prodName,String status,Long cateId
	 * 
	 * @return productlist of ProductDM
	 * 
	 */
	public List<ProductDM> getProductList(Long companyId, Long prodId, Long branchId,String prodName, String status, Long cateId,String uom, String filtertype);
}