//Class : BookCategoryDAO

package com.library.dao.mst;


import java.util.List;

import com.library.domain.mst.BookCategoryDM;
public interface BookCategoryDAO {

	/** Get getBookCategeoryList based on bookCatgid**/
	/**
	 * To get getStudentCategoryList based on studCid and categoryName
	 * 
	 * @param Long bookCatgid,String categoryName,Long companyId,String status,Date updatedDt,String updatedBy

	 * 
	 * @return list of BookCategoryDM
	 */
	public  List<BookCategoryDM> getBookCategoryList(Long bkCategoryid,Long companyId,String categoryName,String status);
	/** Method for save or update BookCategoryDM **/
	/**
	 * @param studCatObj of BookCategoryDM
	 */
	public void SaveOrUpdate(BookCategoryDM obj);
}
