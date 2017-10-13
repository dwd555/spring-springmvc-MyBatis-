package com.dwd.controller;

import java.io.UnsupportedEncodingException;
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
	
	@RequestMapping("/getbykw")
	public List<Books> getByKw(String kw){
		System.out.println(kw);
//		try {
//			kw=new String(kw.getBytes("GBK"), "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("%"+kw+"%");
		List<Books> books=Books.bookGetByKw("%"+kw+"%");
		return books;
	}
}
