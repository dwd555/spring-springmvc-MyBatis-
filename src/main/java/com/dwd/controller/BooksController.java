package com.dwd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwd.dao.BooksMapper;
import com.dwd.pojo.Books;

@RestController
@RequestMapping("/book")
public class BooksController {
	@Autowired
	BooksMapper Books;
	
	@RequestMapping("/getbook")
	public Books getBook(Integer id) {
		Books book=Books.selectByPrimaryKey(1);
		return book;
	}
	
	@RequestMapping("/getall")
	public List<Books> getAllBook(){
		List<Books> books=Books.selectAllBooks();
		return books;
	}
}
