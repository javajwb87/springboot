/*
 * Created on 2019-03-14 ( Time 16:44:08 )
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
import com.nit.order_library.bean.Chapters;
import com.nit.order_library.bean.Books;

//--- Services 
import com.nit.order_library.business.service.ChaptersService;
import com.nit.order_library.business.service.BooksService;

/**
 * Spring MVC controller for 'Chapters' management.
 */
@Controller
@RequestMapping("/chapters")
public class ChaptersController extends AbstractController {

	//--- Variables names ( to be used in JSP with Expression Language )
	private static final String MAIN_ENTITY_NAME = "chapters";
	private static final String MAIN_LIST_NAME   = "list";

	//--- JSP pages names ( View name in the MVC model )
	private static final String JSP_FORM   = "chapters/form";
	private static final String JSP_LIST   = "chapters/list";

	//--- SAVE ACTION ( in the HTML form )
	private static final String SAVE_ACTION_CREATE   = "/chapters/create";
	private static final String SAVE_ACTION_UPDATE   = "/chapters/update";

	//--- Main entity service
	@Resource
    private ChaptersService chaptersService; // Injected by Spring
	//--- Other service(s)
	@Resource
    private BooksService booksService; // Injected by Spring

	//--------------------------------------------------------------------------------------
	/**
	 * Default constructor
	 */
	public ChaptersController() {
		super(ChaptersController.class, MAIN_ENTITY_NAME );
		log("ChaptersController created.");
	}

	//--------------------------------------------------------------------------------------
	// Spring MVC model management
	//--------------------------------------------------------------------------------------
	/**
	 * Populates the combo-box "items" for the referenced entity "Books"
	 * @param model
	 */
	private void populateListOfBooksItems(Model model) {
		List<Books> list = booksService.findAll();
		model.addAttribute("listOfBooksItems", list ) ;
	}


	/**
	 * Populates the Spring MVC model with the given entity and eventually other useful data
	 * @param model
	 * @param chapters
	 */
	private void populateModel(Model model, Chapters chapters, FormMode formMode) {
		//--- Main entity
		model.addAttribute(MAIN_ENTITY_NAME, chapters);
		if ( formMode == FormMode.CREATE ) {
			model.addAttribute(MODE, MODE_CREATE); // The form is in "create" mode
			model.addAttribute(SAVE_ACTION, SAVE_ACTION_CREATE); 			
			//--- Other data useful in this screen in "create" mode (all fields)
			populateListOfBooksItems(model);
		}
		else if ( formMode == FormMode.UPDATE ) {
			model.addAttribute(MODE, MODE_UPDATE); // The form is in "update" mode
			model.addAttribute(SAVE_ACTION, SAVE_ACTION_UPDATE); 			
			//--- Other data useful in this screen in "update" mode (only non-pk fields)
			populateListOfBooksItems(model);
		}
	}

	//--------------------------------------------------------------------------------------
	// Request mapping
	//--------------------------------------------------------------------------------------
	/**
	 * Shows a list with all the occurrences of Chapters found in the database
	 * @param model Spring MVC model
	 * @return
	 */
	@RequestMapping()
	public String list(Model model) {
		log("Action 'list'");
		List<Chapters> list = chaptersService.findAll();
		model.addAttribute(MAIN_LIST_NAME, list);		
		return JSP_LIST;
	}

	/**
	 * Shows a form page in order to create a new Chapters
	 * @param model Spring MVC model
	 * @return
	 */
	@RequestMapping("/form")
	public String formForCreate(Model model) {
		log("Action 'formForCreate'");
		//--- Populates the model with a new instance
		Chapters chapters = new Chapters();	
		populateModel( model, chapters, FormMode.CREATE);
		return JSP_FORM;
	}

	/**
	 * Shows a form page in order to update an existing Chapters
	 * @param model Spring MVC model
	 * @param chapterId  primary key element
	 * @return
	 */
	@RequestMapping(value = "/form/{chapterId}")
	public String formForUpdate(Model model, @PathVariable("chapterId") Integer chapterId ) {
		log("Action 'formForUpdate'");
		//--- Search the entity by its primary key and stores it in the model 
		Chapters chapters = chaptersService.findById(chapterId);
		populateModel( model, chapters, FormMode.UPDATE);		
		return JSP_FORM;
	}

	/**
	 * 'CREATE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param chapters  entity to be created
	 * @param bindingResult Spring MVC binding result
	 * @param model Spring MVC model
	 * @param redirectAttributes Spring MVC redirect attributes
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/create" ) // GET or POST
	public String create(@Valid Chapters chapters, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, HttpServletRequest httpServletRequest) {
		log("Action 'create'");
		try {
			if (!bindingResult.hasErrors()) {
				Chapters chaptersCreated = chaptersService.create(chapters); 
				model.addAttribute(MAIN_ENTITY_NAME, chaptersCreated);

				//---
				return redirectToForm(httpServletRequest, chapters.getChapterId() );
			} else {
				populateModel( model, chapters, FormMode.CREATE);
				return JSP_FORM;
			}
		} catch(Exception e) {
			log("Action 'create' : Exception - " + e.getMessage() );
			populateModel( model, chapters, FormMode.CREATE);
			return JSP_FORM;
		}
	}

	/**
	 * 'UPDATE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param chapters  entity to be updated
	 * @param bindingResult Spring MVC binding result
	 * @param model Spring MVC model
	 * @param redirectAttributes Spring MVC redirect attributes
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/update" ) // GET or POST
	public String update(@Valid Chapters chapters, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, HttpServletRequest httpServletRequest) {
		log("Action 'update'");
		try {
			if (!bindingResult.hasErrors()) {
				//--- Perform database operations
				Chapters chaptersSaved = chaptersService.update(chapters);
				model.addAttribute(MAIN_ENTITY_NAME, chaptersSaved);
				//--- Set the result message
				log("Action 'update' : update done - redirect");
				return redirectToForm(httpServletRequest, chapters.getChapterId());
			} else {
				log("Action 'update' : binding errors");
				populateModel( model, chapters, FormMode.UPDATE);
				return JSP_FORM;
			}
		} catch(Exception e) {
			log("Action 'update' : Exception - " + e.getMessage() );
			populateModel( model, chapters, FormMode.UPDATE);
			return JSP_FORM;
		}
	}

	/**
	 * 'DELETE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param redirectAttributes
	 * @param chapterId  primary key element
	 * @return
	 */
	@RequestMapping(value = "/delete/{chapterId}") // GET or POST
	public String delete(RedirectAttributes redirectAttributes, @PathVariable("chapterId") Integer chapterId) {
		log("Action 'delete'" );
		try {
			chaptersService.delete( chapterId );
			//--- Set the result message
		} catch(Exception e) {
		}
		return redirectToList();
	}

}
