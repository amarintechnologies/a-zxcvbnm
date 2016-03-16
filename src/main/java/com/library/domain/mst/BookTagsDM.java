package com.library.domain.mst;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "m_lib_book_tags")
public class BookTagsDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bksrch_tagid;
	private Long book_id;
	private String search_tag;
	@Transient
	private String bookName;
	public Long getBksrch_tagid() {
		return bksrch_tagid;
	}
	public void setBksrch_tagid(Long bksrch_tagid) {
		this.bksrch_tagid = bksrch_tagid;
	}
	public Long getBook_id() {
		return book_id;
	}
	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}
	public String getSearch_tag() {
		return search_tag;
	}
	public void setSearch_tag(String search_tag) {
		this.search_tag = search_tag;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}
