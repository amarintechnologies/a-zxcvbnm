package com.library.serviceimpl.mst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.library.dao.mst.BookCustomFieldsDAO;
import com.library.dao.mst.BooksDAO;
import com.library.domain.mst.BookCustomFieldsDM;
import com.library.service.mst.BookCustomFieldService;

public class BookCustomFiledServiceImpl implements BookCustomFieldService {
	@Autowired
	private BookCustomFieldsDAO bookCusDAO;

	/**
	 * To save BookCustomFieldsDM table details
	 * 
	 * @param bookCussobj
	 * 
	 */
	@Transactional
	public void SaveOrUpdate(BookCustomFieldsDM bookCussobj) {

		bookCusDAO.SaveOrUpdate(bookCussobj);

	}

	/**
	 * To get details from BookCustomFieldsDM table depends on condition if all
	 * arguments are null it returns entire list
	 * 
	 * @param bkcfld_valid
	 *            , book_id, field_id, status
	 * @return list BooksDM
	 * 
	 */
	@Transactional
	public List<BookCustomFieldsDM> getBookCustomListList(Long bkcfld_valid,
			Long book_id, Long field_id, String status) {

		return bookCusDAO.getBookCustomListList(bkcfld_valid, book_id,
				field_id, status);
	}

	@Transactional
	public void deleteBooksCutomfd(Long bfld) {
		bookCusDAO.deleteBooksCutomfd(bfld);

	}

}
