/*
 * Created on 2021-09-27 ( Time 22:18:44 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.source.library.business.service.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.source.library.bean.User;
import com.source.library.bean.jpa.UserEntity;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class UserServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public UserServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'UserEntity' to 'User'
	 * @param userEntity
	 */
	public User mapUserEntityToUser(UserEntity userEntity) {
		if(userEntity == null) {
			return null;
		}

		//--- Generic mapping 
		User user = map(userEntity, User.class);

		return user;
	}
	
	/**
	 * Mapping from 'User' to 'UserEntity'
	 * @param user
	 * @param userEntity
	 */
	public void mapUserToUserEntity(User user, UserEntity userEntity) {
		if(user == null) {
			return;
		}

		//--- Generic mapping 
		map(user, userEntity);

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