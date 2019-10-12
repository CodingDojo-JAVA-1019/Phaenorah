package com.phaenorah.dojosurvey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index(HttpSession session,Model model) {
		
		String name = (String) session.getAttribute("name");
		String location = (String) session.getAttribute("location");
		String language = (String) session.getAttribute("language");
		String comment = (String) session.getAttribute("comment");
		
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		
		return "index.jsp"; 
	}
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public String postTo(
			@RequestParam("name") String personName, 
			@RequestParam("location") String dojoLocation,
			@RequestParam("language") String favoriteLanguage,
			@RequestParam("comment") String comment, HttpSession session) {
		
		session.setAttribute("name", personName);
		session.setAttribute("location", dojoLocation);
		session.setAttribute("language", favoriteLanguage);
		session.setAttribute("comment", comment);
		
		return "survey.jsp"; 
	}

}
