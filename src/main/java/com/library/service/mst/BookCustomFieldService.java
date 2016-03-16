package com.library.service.mst;

import java.util.List;

import com.library.domain.mst.BookCustomFieldsDM;

public interface BookCustomFieldService {
	/** Method for save or update BookCustomFieldsDM **/
	/**
	 * @param bookCussobj
	 *            of BookCustomFieldsDM
	 */
	public void SaveOrUpdate(BookCustomFieldsDM bookCussobj);

	/** Get getBookCategeoryList based on bookCatgid **/
	/**
	 * To get BookCustomFieldsDM based on bkcfld_valid
	 * 
	 * @param (Long bkcfld_valid, Long book_id, Long field_id, String status
	 * 
	 * 
	 * @return list of BookCustomFieldsDM
	 */
	public List<BookCustomFieldsDM> getBookCustomListList(Long bkcfld_valid,
			Long book_id, Long field_id, String status);
	public void deleteBooksCutomfd(Long bfld);

}
