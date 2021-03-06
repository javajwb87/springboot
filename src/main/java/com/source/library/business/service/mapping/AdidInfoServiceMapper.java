/*
 * Created on 2021-09-27 ( Time 22:17:27 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.source.library.business.service.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.source.library.bean.AdidInfo;
import com.source.library.bean.jpa.AdidInfoEntity;
import com.source.library.bean.jpa.UserEntity;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class AdidInfoServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public AdidInfoServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'AdidInfoEntity' to 'AdidInfo'
	 * @param adidInfoEntity
	 */
	public AdidInfo mapAdidInfoEntityToAdidInfo(AdidInfoEntity adidInfoEntity) {
		if(adidInfoEntity == null) {
			return null;
		}

		//--- Generic mapping 
		AdidInfo adidInfo = map(adidInfoEntity, AdidInfo.class);

		//--- Link mapping ( link to User )
		if(adidInfoEntity.getUser() != null) {
			adidInfo.setUserId(adidInfoEntity.getUser().getUserId());
		}
		return adidInfo;
	}
	
	/**
	 * Mapping from 'AdidInfo' to 'AdidInfoEntity'
	 * @param adidInfo
	 * @param adidInfoEntity
	 */
	public void mapAdidInfoToAdidInfoEntity(AdidInfo adidInfo, AdidInfoEntity adidInfoEntity) {
		if(adidInfo == null) {
			return;
		}

		//--- Generic mapping 
		map(adidInfo, adidInfoEntity);

		//--- Link mapping ( link : adidInfo )
		if( hasLinkToUser(adidInfo) ) {
			UserEntity user1 = new UserEntity();
			user1.setUserId( adidInfo.getUserId() );
			adidInfoEntity.setUser( user1 );
		} else {
			adidInfoEntity.setUser( null );
		}

	}
	
	/**
	 * Verify that User id is valid.
	 * @param User User
	 * @return boolean
	 */
	private boolean hasLinkToUser(AdidInfo adidInfo) {
		if(adidInfo.getUserId() != null) {
			return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ModelMapper getModelMapper() {
		return modelMapper;
	}

	protected void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

}