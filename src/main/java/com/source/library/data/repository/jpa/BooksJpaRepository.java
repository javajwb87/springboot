package com.source.library.data.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.library.bean.jpa.BooksEntity;

/**
 * Repository : Books.
 */
@Repository
public interface BooksJpaRepository extends JpaRepository<BooksEntity, Integer> {

}
