/*
 * Created on 2019-03-14 ( Time 16:44:08 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.source.library.business.service.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.source.library.bean.Books;
import com.source.library.bean.jpa.BooksEntity;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class BooksServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public BooksServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'BooksEntity' to 'Books'
	 * @param booksEntity
	 */
	public Books mapBooksEntityToBooks(BooksEntity booksEntity) {
		if(booksEntity == null) {
			return null;
		}

		//--- Generic mapping 
		Books books = map(booksEntity, Books.class);

		return books;
	}
	
	/**
	 * Mapping from 'Books' to 'BooksEntity'
	 * @param books
	 * @param booksEntity
	 */
	public void mapBooksToBooksEntity(Books books, BooksEntity booksEntity) {
		if(books == null) {
			return;
		}

		//--- Generic mapping 
		map(books, booksEntity);

	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ModelMapper getModelMapper() {
		return modelMapper;
	}

	protected void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

}