package com.library.serviceimpl.mst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.library.dao.mst.BooksDAO;
import com.library.domain.mst.BooksDM;
import com.library.service.mst.BooksService;

public class BooksServiceImpl implements BooksService {
	@Autowired
	private BooksDAO booksDAO;

	/**
	 * To get details from BooksDM table depends on condition if all arguments
	 * are null it returns entire list
	 * 
	 * @param Long
	 *            book_id, Long company_id, String book_title, String book_slno,
	 *            String status
	 * @return list BooksDM
	 * 
	 */
	@Transactional
	// @Cacheable(value = "accessconfig")
	public List<BooksDM> getBooksList(Long book_id, Long company_id,Long category_id,
			String book_title, String book_slno, String status) {
		return booksDAO.getBooksList(book_id, company_id,category_id, book_title,
				book_slno, status);
	}

	/**
	 * To save access BooksDM table details
	 * 
	 * @param booksobj
	 * 
	 */
	@Transactional
	// @CacheEvict(value = "accessconfig", allEntries = true)
	public void SaveOrUpdate(BooksDM booksobj) {
		booksDAO.SaveOrUpdate(booksobj);

	}

}
