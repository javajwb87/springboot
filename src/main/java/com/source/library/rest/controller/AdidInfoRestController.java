/*
 * Created on 2021-09-27 ( Time 22:17:26 )
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

import com.source.library.bean.AdidInfo;
import com.source.library.business.service.AdidInfoService;

/**
 * Spring MVC controller for 'AdidInfo' management.
 */
@RestController
@Api(tags= {"AdidInfo"})
@RequestMapping("/api")
public class AdidInfoRestController {

	@Resource
	private AdidInfoService adidInfoService;
	
	@RequestMapping( value="/adidInfo",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<AdidInfo> findAll() {
		return adidInfoService.findAll();
	}

	@RequestMapping( value="/adidInfo/{adidInfoId}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public AdidInfo findOne(@PathVariable("adidInfoId") Integer adidInfoId) {
		return adidInfoService.findById(adidInfoId);
	}
	
	@RequestMapping( value="/adidInfo",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public AdidInfo create(@RequestBody AdidInfo adidInfo) {
		return adidInfoService.create(adidInfo);
	}

	@RequestMapping( value="/adidInfo/{adidInfoId}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public AdidInfo update(@PathVariable("adidInfoId") Integer adidInfoId, @RequestBody AdidInfo adidInfo) {
		return adidInfoService.update(adidInfo);
	}

	@RequestMapping( value="/adidInfo/{adidInfoId}",
			method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("adidInfoId") Integer adidInfoId) {
		adidInfoService.delete(adidInfoId);
	}
	
}
