
package com.base.dao.mst;

import java.util.List;

import com.base.domain.mst.ProductCategoryDM;
import com.base.domain.mst.ProductCategoryListDM;

public interface ProductCategoryDAO {
	/** Method for save or update ProductCategory **/
	/**
	 * @param categoryObj
	 *            of ProductCategoryDM
	 */
	public void saveorUpdateCategoryDetails(ProductCategoryDM categoryObj);
	
	/**
	 * To get details from product category table depends on condition if all arguments are null it returns full list
	 * 
	 * @param Long
	 *            Long companyId, String cateName, String status, String parentid,String filtertype
	 * 
	 * @return list of ProductCategoryDM
	 * 
	 */
	public List<ProductCategoryListDM> getProdCategoryList(Long cateid,Long companyId, String cateName, String status, String parentid,
			String filtertype);
}