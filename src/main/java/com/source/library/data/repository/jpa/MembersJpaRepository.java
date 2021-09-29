package com.source.library.data.repository.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.source.library.bean.jpa.MembersEntity;

/**
 * Repository : Members.
 */
@Repository
public interface MembersJpaRepository extends JpaRepository<MembersEntity, Integer> {
	
	@Query("select a from MembersEntity a join fetch a.listOfRoles where login_name=:name ")
	Optional<MembersEntity> findByLoginName(@Param("name") String loginName);
	
	@Query("select a from MembersEntity a join fetch a.listOfRoles")
	List<MembersEntity> findAllJoinFetch();
	
	@Query("select a from MembersEntity a join fetch a.listOfRoles")
	List<MembersEntity> findAllJoinFetch(Pageable pageable);

}
