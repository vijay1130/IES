package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Book_Dao;

@Service
public class BookService {
	
	@Autowired
	private Book_Dao dao;
	
	public int countPage(int id) {
		
			
		return	dao.countBookPageById(id);
			
		
	}

}
