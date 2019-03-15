/*
 * Created on 2019-03-15 ( Time 15:44:19 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.nit.order_library.rest.controller;

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

import com.nit.order_library.bean.Chapters;
import com.nit.order_library.business.service.ChaptersService;

/**
 * Spring MVC controller for 'Chapters' management.
 */
@RestController
@Api(tags= {"Chapters"})
@RequestMapping("/api")
public class ChaptersRestController {

	@Resource
	private ChaptersService chaptersService;
	
	@RequestMapping( value="/chapters",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Chapters> findAll() {
		return chaptersService.findAll();
	}

	@RequestMapping( value="/chapters/{chapterId}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Chapters findOne(@PathVariable("chapterId") Integer chapterId) {
		return chaptersService.findById(chapterId);
	}
	
	@RequestMapping( value="/chapters",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Chapters create(@RequestBody Chapters chapters) {
		return chaptersService.create(chapters);
	}

	@RequestMapping( value="/chapters/{chapterId}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Chapters update(@PathVariable("chapterId") Integer chapterId, @RequestBody Chapters chapters) {
		return chaptersService.update(chapters);
	}

	@RequestMapping( value="/chapters/{chapterId}",
			method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("chapterId") Integer chapterId) {
		chaptersService.delete(chapterId);
	}
	
}
