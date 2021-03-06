/*
 * Created on 2019-03-08 ( Time 16:35:30 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.source.library.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.source.library.web.common.AbstractController;

/**
 * Spring MVC controller for 'Books' management.
 */
@Controller
public class HomeController extends AbstractController {

	 /*
	 * Default constructor
	 */
	public HomeController() {
		super(HomeController.class,  "home");
		log("HomeController created.");
	}

	
	/**
	 * Shows a form page in order to create a new Books
	 * @param model Spring MVC model
	 * @return
	 */
	@RequestMapping("/")
	public String home(Model model) {
		log("HomeController rendering");
		return "index";
	}

}


