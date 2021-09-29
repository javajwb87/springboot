package com.source.library.data.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.library.bean.jpa.OrderDataLogEntity;

/**
 * Repository : OrderDataLog.
 */
@Repository
public interface OrderDataLogJpaRepository extends JpaRepository<OrderDataLogEntity, Integer> {

}
