package com.nit.order_library.data.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nit.order_library.bean.jpa.UserEntity;

/**
 * Repository : User.
 */
@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, Integer> {

}
