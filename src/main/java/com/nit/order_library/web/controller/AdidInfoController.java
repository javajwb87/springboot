/*
 * Created on 2021-09-27 ( Time 22:17:26 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
package com.nit.order_library.web.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//--- Common classes
import com.nit.order_library.web.common.AbstractController;
import com.nit.order_library.web.common.FormMode;
//import com.nit.order_library.web.common.Message;
//import com.nit.order_library.web.common.MessageType;

//--- Entities
import com.nit.order_library.bean.AdidInfo;
import com.nit.order_library.bean.User;

//--- Services 
import com.nit.order_library.business.service.AdidInfoService;
import com.nit.order_library.business.service.UserService;

/**
 * Spring MVC controller for 'AdidInfo' management.
 */
@Controller
@RequestMapping("/adidInfo")
public class AdidInfoController extends AbstractController {

	//--- Variables names ( to be used in JSP with Expression Language )
	private static final String MAIN_ENTITY_NAME = "adidInfo";
	private static final String MAIN_LIST_NAME   = "list";

	//--- JSP pages names ( View name in the MVC model )
	private static final String JSP_FORM   = "adidInfo/form";
	private static final String JSP_LIST   = "adidInfo/list";

	//--- SAVE ACTION ( in the HTML form )
	private static final String SAVE_ACTION_CREATE   = "/adidInfo/create";
	private static final String SAVE_ACTION_UPDATE   = "/adidInfo/update";

	//--- Main entity service
	@Resource
    private AdidInfoService adidInfoService; // Injected by Spring
	//--- Other service(s)
	@Resource
    private UserService userService; // Injected by Spring

	//--------------------------------------------------------------------------------------
	/**
	 * Default constructor
	 */
	public AdidInfoController() {
		super(AdidInfoController.class, MAIN_ENTITY_NAME );
		log("AdidInfoController created.");
	}

	//--------------------------------------------------------------------------------------
	// Spring MVC model management
	//--------------------------------------------------------------------------------------
	/**
	 * Populates the combo-box "items" for the referenced entity "User"
	 * @param model
	 */
	private void populateListOfUserItems(Model model) {
		List<User> list = userService.findAll();
		model.addAttribute("listOfUserItems", list ) ;
	}


	/**
	 * Populates the Spring MVC model with the given entity and eventually other useful data
	 * @param model
	 * @param adidInfo
	 */
	private void populateModel(Model model, AdidInfo adidInfo, FormMode formMode) {
		//--- Main entity
		model.addAttribute(MAIN_ENTITY_NAME, adidInfo);
		if ( formMode == FormMode.CREATE ) {
			model.addAttribute(MODE, MODE_CREATE); // The form is in "create" mode
			model.addAttribute(SAVE_ACTION, SAVE_ACTION_CREATE); 			
			//--- Other data useful in this screen in "create" mode (all fields)
			populateListOfUserItems(model);
		}
		else if ( formMode == FormMode.UPDATE ) {
			model.addAttribute(MODE, MODE_UPDATE); // The form is in "update" mode
			model.addAttribute(SAVE_ACTION, SAVE_ACTION_UPDATE); 			
			//--- Other data useful in this screen in "update" mode (only non-pk fields)
			populateListOfUserItems(model);
		}
	}

	//--------------------------------------------------------------------------------------
	// Request mapping
	//--------------------------------------------------------------------------------------
	/**
	 * Shows a list with all the occurrences of AdidInfo found in the database
	 * @param model Spring MVC model
	 * @return
	 */
	@RequestMapping()
	public String list(Model model) {
		log("Action 'list'");
		List<AdidInfo> list = adidInfoService.findAll();
		model.addAttribute(MAIN_LIST_NAME, list);		
		return JSP_LIST;
	}

	/**
	 * Shows a form page in order to create a new AdidInfo
	 * @param model Spring MVC model
	 * @return
	 */
	@RequestMapping("/form")
	public String formForCreate(Model model) {
		log("Action 'formForCreate'");
		//--- Populates the model with a new instance
		AdidInfo adidInfo = new AdidInfo();	
		populateModel( model, adidInfo, FormMode.CREATE);
		return JSP_FORM;
	}

	/**
	 * Shows a form page in order to update an existing AdidInfo
	 * @param model Spring MVC model
	 * @param adidInfoId  primary key element
	 * @return
	 */
	@RequestMapping(value = "/form/{adidInfoId}")
	public String formForUpdate(Model model, @PathVariable("adidInfoId") Integer adidInfoId ) {
		log("Action 'formForUpdate'");
		//--- Search the entity by its primary key and stores it in the model 
		AdidInfo adidInfo = adidInfoService.findById(adidInfoId);
		populateModel( model, adidInfo, FormMode.UPDATE);		
		return JSP_FORM;
	}

	/**
	 * 'CREATE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param adidInfo  entity to be created
	 * @param bindingResult Spring MVC binding result
	 * @param model Spring MVC model
	 * @param redirectAttributes Spring MVC redirect attributes
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/create" ) // GET or POST
	public String create(@Valid AdidInfo adidInfo, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, HttpServletRequest httpServletRequest) {
		log("Action 'create'");
		try {
			if (!bindingResult.hasErrors()) {
				AdidInfo adidInfoCreated = adidInfoService.create(adidInfo); 
				model.addAttribute(MAIN_ENTITY_NAME, adidInfoCreated);

				//---
				return redirectToForm(httpServletRequest, adidInfo.getAdidInfoId() );
			} else {
				populateModel( model, adidInfo, FormMode.CREATE);
				return JSP_FORM;
			}
		} catch(Exception e) {
			log("Action 'create' : Exception - " + e.getMessage() );
			populateModel( model, adidInfo, FormMode.CREATE);
			return JSP_FORM;
		}
	}

	/**
	 * 'UPDATE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param adidInfo  entity to be updated
	 * @param bindingResult Spring MVC binding result
	 * @param model Spring MVC model
	 * @param redirectAttributes Spring MVC redirect attributes
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/update" ) // GET or POST
	public String update(@Valid AdidInfo adidInfo, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, HttpServletRequest httpServletRequest) {
		log("Action 'update'");
		try {
			if (!bindingResult.hasErrors()) {
				//--- Perform database operations
				AdidInfo adidInfoSaved = adidInfoService.update(adidInfo);
				model.addAttribute(MAIN_ENTITY_NAME, adidInfoSaved);
				//--- Set the result message
				log("Action 'update' : update done - redirect");
				return redirectToForm(httpServletRequest, adidInfo.getAdidInfoId());
			} else {
				log("Action 'update' : binding errors");
				populateModel( model, adidInfo, FormMode.UPDATE);
				return JSP_FORM;
			}
		} catch(Exception e) {
			log("Action 'update' : Exception - " + e.getMessage() );
			populateModel( model, adidInfo, FormMode.UPDATE);
			return JSP_FORM;
		}
	}

	/**
	 * 'DELETE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param redirectAttributes
	 * @param adidInfoId  primary key element
	 * @return
	 */
	@RequestMapping(value = "/delete/{adidInfoId}") // GET or POST
	public String delete(RedirectAttributes redirectAttributes, @PathVariable("adidInfoId") Integer adidInfoId) {
		log("Action 'delete'" );
		try {
			adidInfoService.delete( adidInfoId );
			//--- Set the result message
		} catch(Exception e) {
		}
		return redirectToList();
	}

}
