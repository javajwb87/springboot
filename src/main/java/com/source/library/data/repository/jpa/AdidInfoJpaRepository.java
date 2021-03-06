package com.source.library.data.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.library.bean.jpa.AdidInfoEntity;

/**
 * Repository : AdidInfo.
 */
@Repository
public interface AdidInfoJpaRepository extends JpaRepository<AdidInfoEntity, Integer> {

}
