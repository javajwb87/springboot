package com.nit.order_library.data.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nit.order_library.bean.jpa.PrepaymentEntity;

/**
 * Repository : Prepayment.
 */
@Repository
public interface PrepaymentJpaRepository extends JpaRepository<PrepaymentEntity, Integer> {

}
