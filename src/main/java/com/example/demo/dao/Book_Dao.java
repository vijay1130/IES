package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Book_Dao {
	
	@Autowired
	private JdbcTemplate template;
	
	private final static String SQL_QURY_FOR_BOOK_PAGE_BY_BOOKID="SELECT TOTAL_PAGE FROM BOOK_AUTHER_SCHEMA WHERE BOOK_ID=?";
	private final static String SQL_QURY_FOR_BOOK_PAGE_BY_AUTHER_ID="SELECT TOTAL_PAGE FROM BOOK_AUTHER_SCHEMA WHERE AUTHER_ID=?";
	
	public int countBookPageById(int bookId) {
		
		return  template.queryForObject(SQL_QURY_FOR_BOOK_PAGE_BY_BOOKID, Integer.class, new Object[] {bookId});
		
		
		
	}
	
	

}
