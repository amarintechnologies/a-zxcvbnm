package com.library.dao.mst;

import java.util.List;

import com.library.domain.mst.BooksDM;

public interface BooksDAO {

	/** Get getBookCategeoryList based on bookCatgid **/
	/**
	 * To get getBooksList based on book_id and categoryName
	 * 
	 * @param Long
	 *            book_id,Long company_id,String book_title,String
	 *            book_slno,String status
	 * 
	 * 
	 * @return list of BooksDM
	 */
	public List<BooksDM> getBooksList(Long book_id, Long company_id,Long category_id,
			String book_title, String book_slno, String status);

	/** Method for save or update BookCategoryDM **/
	/**
	 * @param booksobj
	 *            of BooksDM
	 */
	public void SaveOrUpdate(BooksDM booksobj);

}
