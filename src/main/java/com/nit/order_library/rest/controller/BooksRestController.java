/*
 * Created on 2019-03-11 ( Time 16:43:22 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.nit.order_library.rest.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nit.order_library.bean.Books;
import com.nit.order_library.business.service.BooksService;

/**
 * Spring MVC controller for 'Books' management.
 */
@RestController
@RequestMapping("/api")
public class BooksRestController {

	@Resource
	private BooksService booksService;
	
	@RequestMapping( value="/books",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Books> findAll() {
		return booksService.findAll();
	}

	@RequestMapping( value="/books/{bookId}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Books findOne(@PathVariable("bookId") Integer bookId) {
		return booksService.findById(bookId);
	}
	
	@RequestMapping( value="/books",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Books create(@RequestBody Books books) {
		return booksService.create(books);
	}

	@RequestMapping( value="/books/{bookId}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Books update(@PathVariable("bookId") Integer bookId, @RequestBody Books books) {
		return booksService.update(books);
	}

	@RequestMapping( value="/books/{bookId}",
			method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("bookId") Integer bookId) {
		booksService.delete(bookId);
	}
	
}
