package com.nextinnovation.webreader.service.impl;


import com.nextinnovation.webreader.dao.GenericDao;
import com.nextinnovation.webreader.entity.Book;
import com.nextinnovation.webreader.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

	private GenericDao<Book,String> genericDao;

	public void setGenericDao(GenericDao<Book, String> genericDao) {
		this.genericDao = genericDao;
	}


	public void add(Book model) {
		genericDao.save(model);
	}


	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return genericDao.findAll(Book.class);
	}

}
