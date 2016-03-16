package com.library.serviceimpl.mst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.library.dao.mst.BookCustomFieldsDAO;
import com.library.dao.mst.BookTagsDAO;
import com.library.domain.mst.BookTagsDM;
import com.library.service.mst.BookTagsService;

public class BookTagsServiceImpl implements BookTagsService{
	@Autowired
	private BookTagsDAO tagsDAO;
	/** Method for save or update BookTagsDM **/
	/**
	 * @param tagobj
	 *            of BookTagsDM
	 */
	@Transactional
	public void SaveOrUpdate(BookTagsDM tagobj) {
		// TODO Auto-generated method stub
		tagsDAO.SaveOrUpdate(tagobj);
		
	}
	/** Get getBookCategeoryList based on bookCatgid **/
	/**
	 * To get BookTagsDM based on bksrch_tagid
	 * 
	 * @param Long bksrch_tagid,Long book_id,String search_tag
	 * 
	 * 
	 * @return list of BookTagsDM
	 */
	@Transactional
	public List<BookTagsDM> getBookTagsList(Long bksrch_tagid, Long book_id,
			String search_tag) {
		// TODO Auto-generated method stub
		return tagsDAO.getBookTagsList(bksrch_tagid, book_id, search_tag); 
	}

}
