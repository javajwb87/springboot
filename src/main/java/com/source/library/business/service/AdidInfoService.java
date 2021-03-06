/*
 * Created on 2021-09-27 ( Time 22:17:26 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.source.library.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;

import java.util.Date;

import com.source.library.bean.AdidInfo;
import com.source.library.bean.jpa.AdidInfoEntity;
import com.source.library.business.service.mapping.AdidInfoServiceMapper;
import com.source.library.data.repository.jpa.AdidInfoJpaRepository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

/**
 * Definition of AdidInfoService
 */
@Service
@Transactional
public class AdidInfoService {

	@Resource
	private AdidInfoJpaRepository adidInfoJpaRepository;

	@Resource
	private AdidInfoServiceMapper adidInfoServiceMapper;
	
	public AdidInfo findById(Integer adidInfoId) {
		Optional<AdidInfoEntity> adidInfoEntity = adidInfoJpaRepository.findById(adidInfoId);

		if (adidInfoEntity.isPresent())
			return adidInfoServiceMapper.mapAdidInfoEntityToAdidInfo(adidInfoEntity.get());
		else
			throw new IllegalStateException("object doesn't exist");
	}

	public List<AdidInfo> findAll() {
		Iterable<AdidInfoEntity> entities = adidInfoJpaRepository.findAll();
		List<AdidInfo> beans = new ArrayList<AdidInfo>();
		for(AdidInfoEntity adidInfoEntity : entities) {
			beans.add(adidInfoServiceMapper.mapAdidInfoEntityToAdidInfo(adidInfoEntity));
		}
		return beans;
	}

	public AdidInfo save(AdidInfo adidInfo) {
		return update(adidInfo) ;
	}

	public AdidInfo create(AdidInfo adidInfo) {
		AdidInfoEntity adidInfoEntity;
		if(adidInfo.getAdidInfoId() != null){
			Optional<AdidInfoEntity> optional = adidInfoJpaRepository.findById(adidInfo.getAdidInfoId());
			if( optional.isPresent() ) {
				throw new IllegalStateException("already.exists");
			}
		}
		adidInfoEntity = new AdidInfoEntity();
		adidInfoServiceMapper.mapAdidInfoToAdidInfoEntity(adidInfo, adidInfoEntity);
		AdidInfoEntity adidInfoEntitySaved = adidInfoJpaRepository.save(adidInfoEntity);
		return adidInfoServiceMapper.mapAdidInfoEntityToAdidInfo(adidInfoEntitySaved);
	}

	public AdidInfo update(AdidInfo adidInfo) {
		AdidInfoEntity adidInfoEntity = adidInfoJpaRepository.findById(adidInfo.getAdidInfoId()).orElse(null);
		adidInfoServiceMapper.mapAdidInfoToAdidInfoEntity(adidInfo, adidInfoEntity);
		AdidInfoEntity adidInfoEntitySaved = adidInfoJpaRepository.save(adidInfoEntity);
		return adidInfoServiceMapper.mapAdidInfoEntityToAdidInfo(adidInfoEntitySaved);
	}

	public void delete(Integer adidInfoId) {
		adidInfoJpaRepository.deleteById(adidInfoId);
	}

	public AdidInfoJpaRepository getAdidInfoJpaRepository() {
		return adidInfoJpaRepository;
	}

	public void setAdidInfoJpaRepository(AdidInfoJpaRepository adidInfoJpaRepository) {
		this.adidInfoJpaRepository = adidInfoJpaRepository;
	}

	public AdidInfoServiceMapper getAdidInfoServiceMapper() {
		return adidInfoServiceMapper;
	}

	public void setAdidInfoServiceMapper(AdidInfoServiceMapper adidInfoServiceMapper) {
		this.adidInfoServiceMapper = adidInfoServiceMapper;
	}

}
