package com.dwd.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dwd.dao.BooksMapper;
import com.dwd.pojo.Books;
@CrossOrigin(origins="*",maxAge=3600)//‘ –ÌøÁ”Ú
@RestController
@RequestMapping("/book")
public class BooksController {
	@Autowired
	BooksMapper Books;
	
	@RequestMapping("/booklist")
	public List<Books> getBookList(Integer start) {
		if(start==null) {
			start=0;
		}
		List<Books> books=Books.getBookList(start);
		return books;
	}
	@RequestMapping("bookdetail")
	public Books selectByPrimaryKey(@RequestParam Integer bid) {
		Books book=Books.selectByPrimaryKey(bid);
		return book;
	}
	
	@RequestMapping("advertisement")
	public List<Books> advertisement(Integer bid){
		List<Books> advertisement=Books.getAdvertisement(bid);
		return advertisement;
	}
	
	@RequestMapping("hot_search")
	public List<Books> getHotSearch(){
		List<Books> hotsearch=Books.hotSearch();
		return hotsearch;
	}
	
	@RequestMapping("/getall")
	public List<Books> getAllBook(){
		List<Books> books=Books.selectAllBooks();
		return books;
	}
	
	@RequestMapping("/book_getbykw")
	public List<Books> getByKw(String kw){
		System.out.println(kw);
		List<Books> books=Books.bookGetByKw("%"+kw+"%");
		return books;
	}
}
