package com.amarin.school;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(Locale locale, Model model) {
		logger.info("Welcome Dashboard! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "dashboard";
	}
		
	
	@RequestMapping(value = "/addstudent", method = RequestMethod.GET)
	public ModelAndView addstudent() {
		
		ModelAndView model = new ModelAndView();		 
		model.setViewName("addstudent");
		return model;
	}
	
	@RequestMapping(value = "/applicantlist", method = RequestMethod.GET)
	public ModelAndView applicantlist() {	 

		ModelAndView model = new ModelAndView();		 
		model.setViewName("applicantlist");
		return model;
	}
	
	
	@RequestMapping(value = "/studentlist", method = RequestMethod.GET)
	public ModelAndView studentlist() {	 

		ModelAndView model = new ModelAndView();		 
		model.setViewName("studentlist");
		return model;
	}
	
	@RequestMapping(value = "/studentcategory", method = RequestMethod.GET)
	public ModelAndView studentcategory() {	 

		ModelAndView model = new ModelAndView();		 
		model.setViewName("studentcategory");
		return model;
	}
	
	@RequestMapping(value = "/listguardians", method = RequestMethod.GET)
	public ModelAndView listguardians() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("listguardians");
		return model;
	}
	
	@RequestMapping(value = "/complaint", method = RequestMethod.GET)
	public ModelAndView complaint() {	 
		ModelAndView model = new ModelAndView();		 
		model.setViewName("complaint");
		return model;
	}
	
	
}
