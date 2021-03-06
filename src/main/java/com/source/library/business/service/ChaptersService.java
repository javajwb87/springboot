/*
 * Created on 2019-03-18 ( Time 11:36:14 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.source.library.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;

import com.source.library.bean.Chapters;
import com.source.library.bean.jpa.ChaptersEntity;
import com.source.library.business.service.mapping.ChaptersServiceMapper;
import com.source.library.data.repository.jpa.ChaptersJpaRepository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

/**
 * Definition of ChaptersService
 */
@Service
@Transactional
public class ChaptersService {

	@Resource
	private ChaptersJpaRepository chaptersJpaRepository;

	@Resource
	private ChaptersServiceMapper chaptersServiceMapper;
	
	public Chapters findById(Integer chapterId) {
		Optional<ChaptersEntity> chaptersEntity = chaptersJpaRepository.findById(chapterId);

		if (chaptersEntity.isPresent())
			return chaptersServiceMapper.mapChaptersEntityToChapters(chaptersEntity.get());
		else
			throw new IllegalStateException("object doesn't exist");
	}

	public List<Chapters> findAll() {
		Iterable<ChaptersEntity> entities = chaptersJpaRepository.findAll();
		List<Chapters> beans = new ArrayList<Chapters>();
		for(ChaptersEntity chaptersEntity : entities) {
			beans.add(chaptersServiceMapper.mapChaptersEntityToChapters(chaptersEntity));
		}
		return beans;
	}

	public Chapters save(Chapters chapters) {
		return update(chapters) ;
	}

	public Chapters create(Chapters chapters) {
		ChaptersEntity chaptersEntity;
		if(chapters.getChapterId() != null){
			Optional<ChaptersEntity> optional = chaptersJpaRepository.findById(chapters.getChapterId());
			if( optional.isPresent() ) {
				throw new IllegalStateException("already.exists");
			}
		}
		chaptersEntity = new ChaptersEntity();
		chaptersServiceMapper.mapChaptersToChaptersEntity(chapters, chaptersEntity);
		ChaptersEntity chaptersEntitySaved = chaptersJpaRepository.save(chaptersEntity);
		return chaptersServiceMapper.mapChaptersEntityToChapters(chaptersEntitySaved);
	}

	public Chapters update(Chapters chapters) {
		ChaptersEntity chaptersEntity = chaptersJpaRepository.findById(chapters.getChapterId()).orElse(null);
		chaptersServiceMapper.mapChaptersToChaptersEntity(chapters, chaptersEntity);
		ChaptersEntity chaptersEntitySaved = chaptersJpaRepository.save(chaptersEntity);
		return chaptersServiceMapper.mapChaptersEntityToChapters(chaptersEntitySaved);
	}

	public void delete(Integer chapterId) {
		chaptersJpaRepository.deleteById(chapterId);
	}

	public ChaptersJpaRepository getChaptersJpaRepository() {
		return chaptersJpaRepository;
	}

	public void setChaptersJpaRepository(ChaptersJpaRepository chaptersJpaRepository) {
		this.chaptersJpaRepository = chaptersJpaRepository;
	}

	public ChaptersServiceMapper getChaptersServiceMapper() {
		return chaptersServiceMapper;
	}

	public void setChaptersServiceMapper(ChaptersServiceMapper chaptersServiceMapper) {
		this.chaptersServiceMapper = chaptersServiceMapper;
	}

}
