package com.nit.order_library.data.repository.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.order_library.bean.jpa.MembersEntity;

/**
 * Repository : Members.
 */
@Repository
public interface MembersJpaRepository extends JpaRepository<MembersEntity, Integer> {
	
	Optional<MembersEntity> findByLoginName(String loginName);

}
