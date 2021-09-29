/*
 * Created on 2021-09-27 ( Time 22:53:20 )
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

import com.source.library.bean.OrderDataLog;
import com.source.library.business.service.OrderDataLogService;

/**
 * Spring MVC controller for 'OrderDataLog' management.
 */
@RestController
@Api(tags= {"OrderDataLog"})
@RequestMapping("/api")
public class OrderDataLogRestController {

	@Resource
	private OrderDataLogService orderDataLogService;
	
	@RequestMapping( value="/orderDataLog",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<OrderDataLog> findAll() {
		return orderDataLogService.findAll();
	}

	@RequestMapping( value="/orderDataLog/{orderDataLogId}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public OrderDataLog findOne(@PathVariable("orderDataLogId") Integer orderDataLogId) {
		return orderDataLogService.findById(orderDataLogId);
	}
	
	@RequestMapping( value="/orderDataLog",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public OrderDataLog create(@RequestBody OrderDataLog orderDataLog) {
		return orderDataLogService.create(orderDataLog);
	}

	@RequestMapping( value="/orderDataLog/{orderDataLogId}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public OrderDataLog update(@PathVariable("orderDataLogId") Integer orderDataLogId, @RequestBody OrderDataLog orderDataLog) {
		return orderDataLogService.update(orderDataLog);
	}

	@RequestMapping( value="/orderDataLog/{orderDataLogId}",
			method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("orderDataLogId") Integer orderDataLogId) {
		orderDataLogService.delete(orderDataLogId);
	}
	
}