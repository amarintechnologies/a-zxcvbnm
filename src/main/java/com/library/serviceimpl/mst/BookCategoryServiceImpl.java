package com.library.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.library.dao.mst.BookCategoryDAO;
import com.library.daoimpl.mst.BookCategoryDAOimpl;
import com.library.domain.mst.BookCategoryDM;
import com.library.service.mst.BookCategoryService;


public class BookCategoryServiceImpl implements BookCategoryService{
	@Autowired
	private  BookCategoryDAO bookCategoryDAO; 
	private Logger logger = Logger.getLogger(BookCategoryDAOimpl.class);
	/**
	 * To get details from StudentCategoryDM table depends on condition if all arguments
	 * are null it returns full list
	 * 
	 * @param Long studCid, String categoryName, String status
	 * 
	 * @return StudentCategoryDM list
	 * 
	 */
	
	
@Transactional
	public void SaveOrUpdate(BookCategoryDM obj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAndUpdate > " + "About to save the data ... ");
		bookCategoryDAO.SaveOrUpdate(obj);
	}
@Transactional
public List<BookCategoryDM> getBookCategeoryList(Long bkCategoryid,
			Long companyId, String categoryName, String status) {
		// TODO Auto-generated method stub
		return bookCategoryDAO.getBookCategoryList(bkCategoryid, companyId, categoryName, status);

	}
	
}
