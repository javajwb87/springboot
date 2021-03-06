/*
 * Created on 2021-09-27 ( Time 22:21:02 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.source.library.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;

import java.util.Date;

import com.source.library.bean.Prepayment;
import com.source.library.bean.jpa.PrepaymentEntity;
import com.source.library.business.service.mapping.PrepaymentServiceMapper;
import com.source.library.data.repository.jpa.PrepaymentJpaRepository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

/**
 * Definition of PrepaymentService
 */
@Service
@Transactional
public class PrepaymentService {

	@Resource
	private PrepaymentJpaRepository prepaymentJpaRepository;

	@Resource
	private PrepaymentServiceMapper prepaymentServiceMapper;
	
	public Prepayment findById(Integer prepaymentId) {
		Optional<PrepaymentEntity> prepaymentEntity = prepaymentJpaRepository.findById(prepaymentId);

		if (prepaymentEntity.isPresent())
			return prepaymentServiceMapper.mapPrepaymentEntityToPrepayment(prepaymentEntity.get());
		else
			throw new IllegalStateException("object doesn't exist");
	}

	public List<Prepayment> findAll() {
		Iterable<PrepaymentEntity> entities = prepaymentJpaRepository.findAll();
		List<Prepayment> beans = new ArrayList<Prepayment>();
		for(PrepaymentEntity prepaymentEntity : entities) {
			beans.add(prepaymentServiceMapper.mapPrepaymentEntityToPrepayment(prepaymentEntity));
		}
		return beans;
	}

	public Prepayment save(Prepayment prepayment) {
		return update(prepayment) ;
	}

	public Prepayment create(Prepayment prepayment) {
		PrepaymentEntity prepaymentEntity;
		if(prepayment.getPrepaymentId() != null){
			Optional<PrepaymentEntity> optional = prepaymentJpaRepository.findById(prepayment.getPrepaymentId());
			if( optional.isPresent() ) {
				throw new IllegalStateException("already.exists");
			}
		}
		prepaymentEntity = new PrepaymentEntity();
		prepaymentServiceMapper.mapPrepaymentToPrepaymentEntity(prepayment, prepaymentEntity);
		PrepaymentEntity prepaymentEntitySaved = prepaymentJpaRepository.save(prepaymentEntity);
		return prepaymentServiceMapper.mapPrepaymentEntityToPrepayment(prepaymentEntitySaved);
	}

	public Prepayment update(Prepayment prepayment) {
		PrepaymentEntity prepaymentEntity = prepaymentJpaRepository.findById(prepayment.getPrepaymentId()).orElse(null);
		prepaymentServiceMapper.mapPrepaymentToPrepaymentEntity(prepayment, prepaymentEntity);
		PrepaymentEntity prepaymentEntitySaved = prepaymentJpaRepository.save(prepaymentEntity);
		return prepaymentServiceMapper.mapPrepaymentEntityToPrepayment(prepaymentEntitySaved);
	}

	public void delete(Integer prepaymentId) {
		prepaymentJpaRepository.deleteById(prepaymentId);
	}

	public PrepaymentJpaRepository getPrepaymentJpaRepository() {
		return prepaymentJpaRepository;
	}

	public void setPrepaymentJpaRepository(PrepaymentJpaRepository prepaymentJpaRepository) {
		this.prepaymentJpaRepository = prepaymentJpaRepository;
	}

	public PrepaymentServiceMapper getPrepaymentServiceMapper() {
		return prepaymentServiceMapper;
	}

	public void setPrepaymentServiceMapper(PrepaymentServiceMapper prepaymentServiceMapper) {
		this.prepaymentServiceMapper = prepaymentServiceMapper;
	}

}
