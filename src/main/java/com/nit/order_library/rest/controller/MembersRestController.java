/*
 * Created on 2019-03-14 ( Time 16:44:08 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.nit.order_library.rest.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nit.order_library.bean.Members;
import com.nit.order_library.bean.Roles;
import com.nit.order_library.business.service.MembersService;

/**
 * Spring MVC controller for 'Members' management.
 */
@RestController
@RequestMapping("/api")
public class MembersRestController {

	@Resource
	private MembersService membersService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@RequestMapping( value="/members",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Members> findAll() {
		return membersService.findAll();
	}

	@RequestMapping( value="/members/{userId}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Members findOne(@PathVariable("userId") Integer userId) {
		return membersService.findById(userId);
	}
	
	@RequestMapping( value="/members",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Members create(@RequestBody Members members) {
		Roles role = new Roles();
		role.setRoleName("ADMIN");
		members.setPassword(passwordEncoder.encode(members.getPassword()));
		return membersService.create(members, role);
	}

	@RequestMapping( value="/members/{userId}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Members update(@PathVariable("userId") Integer userId, @RequestBody Members members) {
		return membersService.update(members);
	}

	@RequestMapping( value="/members/{userId}",
			method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("userId") Integer userId) {
		membersService.delete(userId);
	}
	
}
