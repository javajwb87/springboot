package com.source.library.data.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.library.bean.jpa.PrepaymentEntity;

/**
 * Repository : Prepayment.
 */
@Repository
public interface PrepaymentJpaRepository extends JpaRepository<PrepaymentEntity, Integer> {

}
