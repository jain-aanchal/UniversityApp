package com.university.network;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.university.network.service.UniversityService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UniversityController {
	
	private static final Logger logger = LoggerFactory.getLogger(UniversityController.class);
	
	@Autowired
	private UniversityService universityService ;

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
		
		return "index";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String searchUniversities(Model model, HttpServletRequest request) {
		logger.info("Search Universites ");
		logger.info(" terms: " +request.getParameter("search"));
		model.addAttribute("university", universityService.findUniversityByName(request.getParameter("search")));
		return "university/list";
	}
}
