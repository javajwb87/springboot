/*
 * Created on 2019-03-11 ( Time 16:43:22 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.nit.order_library.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.nit.order_library.bean.Books;
import com.nit.order_library.bean.jpa.BooksEntity;
import java.util.Date;
import java.util.List;
import com.nit.order_library.business.service.BooksService;
import com.nit.order_library.business.service.mapping.BooksServiceMapper;
import com.nit.order_library.data.repository.jpa.BooksJpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of BooksService
 */
@Component
@Transactional
public class BooksServiceImpl implements BooksService {

	@Resource
	private BooksJpaRepository booksJpaRepository;

	@Resource
	private BooksServiceMapper booksServiceMapper;
	
	@Override
	public Books findById(Integer bookId) {
		BooksEntity booksEntity = booksJpaRepository.findById(bookId).orElse(null);
		return booksServiceMapper.mapBooksEntityToBooks(booksEntity);
	}

	@Override
	public List<Books> findAll() {
		Iterable<BooksEntity> entities = booksJpaRepository.findAll();
		List<Books> beans = new ArrayList<Books>();
		for(BooksEntity booksEntity : entities) {
			beans.add(booksServiceMapper.mapBooksEntityToBooks(booksEntity));
		}
		return beans;
	}

	@Override
	public Books save(Books books) {
		return update(books) ;
	}

	@Override
	public Books create(Books books) {
		BooksEntity booksEntity;
		if(books.getBookId() != null){
			booksEntity = booksJpaRepository.findById(books.getBookId()).orElse(null);
			if( booksEntity != null ) {
				throw new IllegalStateException("already.exists");
			}
		}
		booksEntity = new BooksEntity();
		booksServiceMapper.mapBooksToBooksEntity(books, booksEntity);
		BooksEntity booksEntitySaved = booksJpaRepository.save(booksEntity);
		return booksServiceMapper.mapBooksEntityToBooks(booksEntitySaved);
	}

	@Override
	public Books update(Books books) {
		BooksEntity booksEntity = booksJpaRepository.findById(books.getBookId()).orElse(null);
		booksServiceMapper.mapBooksToBooksEntity(books, booksEntity);
		BooksEntity booksEntitySaved = booksJpaRepository.save(booksEntity);
		return booksServiceMapper.mapBooksEntityToBooks(booksEntitySaved);
	}

	@Override
	public void delete(Integer bookId) {
		booksJpaRepository.deleteById(bookId);
	}

	public BooksJpaRepository getBooksJpaRepository() {
		return booksJpaRepository;
	}

	public void setBooksJpaRepository(BooksJpaRepository booksJpaRepository) {
		this.booksJpaRepository = booksJpaRepository;
	}

	public BooksServiceMapper getBooksServiceMapper() {
		return booksServiceMapper;
	}

	public void setBooksServiceMapper(BooksServiceMapper booksServiceMapper) {
		this.booksServiceMapper = booksServiceMapper;
	}

}
