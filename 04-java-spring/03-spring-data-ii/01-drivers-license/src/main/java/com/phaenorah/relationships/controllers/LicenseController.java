package com.phaenorah.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phaenorah.relationships.models.License;
import com.phaenorah.relationships.models.Person;
import com.phaenorah.relationships.services.LicenseService;
import com.phaenorah.relationships.services.PersonService;

@Controller
@RequestMapping("/licenses")
public class LicenseController {
	private final LicenseService licenseService;
	private final PersonService personService;
	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	@PostMapping("")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		System.out.println("Creating License");
		if(result.hasErrors()){
            return "/views/license.jsp";
        }else{
        	licenseService.createLicense(license);
            return "redirect:/persons/"+license.getPerson().getId();
        }
    }
	 @RequestMapping("/new")
	    public String NewLicense(@ModelAttribute("license") License license, Model model){
	        List<Person> unlicensed  = personService.getUnlicensedPeople();
	        model.addAttribute("persons", unlicensed);
	        return "/views/license.jsp";
	    }	
}
