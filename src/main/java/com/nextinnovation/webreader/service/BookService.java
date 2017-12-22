package com.nextinnovation.webreader.service;


import com.nextinnovation.webreader.entity.Book;

import java.util.List;

public interface BookService {

	void add(Book model);

	List<Book> findAll();

}
