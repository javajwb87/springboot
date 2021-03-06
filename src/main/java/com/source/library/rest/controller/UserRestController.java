/*
 * Created on 2021-09-27 ( Time 22:18:43 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.source.library.rest.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

import com.source.library.bean.User;
import com.source.library.business.service.UserService;

/**
 * Spring MVC controller for 'User' management.
 */
@RestController
@Api(tags= {"User"})
@RequestMapping("/api")
public class UserRestController {

	@Resource
	private UserService userService;
	
	@RequestMapping( value="/user",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<User> findAll() {
		return userService.findAll();
	}

	@RequestMapping( value="/user/{userId}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public User findOne(@PathVariable("userId") Integer userId) {
		return userService.findById(userId);
	}
	
	@RequestMapping( value="/user",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public User create(@RequestBody User user) {
		return userService.create(user);
	}

	@RequestMapping( value="/user/{userId}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public User update(@PathVariable("userId") Integer userId, @RequestBody User user) {
		return userService.update(user);
	}

	@RequestMapping( value="/user/{userId}",
			method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("userId") Integer userId) {
		userService.delete(userId);
	}
	
}
