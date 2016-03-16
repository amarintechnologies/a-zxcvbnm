package com.library.dao.mst;

import java.util.List;

import com.library.domain.mst.BookTagsDM;

public interface BookTagsDAO {
	/** Method for save or update BookTagsDM **/
	/**
	 * @param tagobj
	 *            of BookTagsDM
	 */
	public void SaveOrUpdate(BookTagsDM tagobj);

	/** Get getBookCategeoryList based on bookCatgid **/
	/**
	 * To get BookTagsDM based on bksrch_tagid
	 * 
	 * @param Long bksrch_tagid,Long book_id,String search_tag
	 * 
	 * 
	 * @return list of BookTagsDM
	 */
	public List<BookTagsDM> getBookTagsList(Long bksrch_tagid,Long book_id,String search_tag);
}
