/*
 * Created on 2021-09-27 ( Time 22:21:02 )
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

import com.source.library.bean.Prepayment;
import com.source.library.business.service.PrepaymentService;

/**
 * Spring MVC controller for 'Prepayment' management.
 */
@RestController
@Api(tags= {"Prepayment"})
@RequestMapping("/api")
public class PrepaymentRestController {

	@Resource
	private PrepaymentService prepaymentService;
	
	@RequestMapping( value="/prepayment",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Prepayment> findAll() {
		return prepaymentService.findAll();
	}

	@RequestMapping( value="/prepayment/{prepaymentId}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Prepayment findOne(@PathVariable("prepaymentId") Integer prepaymentId) {
		return prepaymentService.findById(prepaymentId);
	}
	
	@RequestMapping( value="/prepayment",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Prepayment create(@RequestBody Prepayment prepayment) {
		return prepaymentService.create(prepayment);
	}

	@RequestMapping( value="/prepayment/{prepaymentId}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Prepayment update(@PathVariable("prepaymentId") Integer prepaymentId, @RequestBody Prepayment prepayment) {
		return prepaymentService.update(prepayment);
	}

	@RequestMapping( value="/prepayment/{prepaymentId}",
			method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("prepaymentId") Integer prepaymentId) {
		prepaymentService.delete(prepaymentId);
	}
	
}
