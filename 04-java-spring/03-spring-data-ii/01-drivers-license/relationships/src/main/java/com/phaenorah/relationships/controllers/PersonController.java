package com.phaenorah.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.phaenorah.relationships.models.Person;
import com.phaenorah.relationships.services.PersonService;

@Controller
@RequestMapping("/persons")
public class PersonController {
	private final PersonService personService;    
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @RequestMapping("/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "/views/index.jsp";
    }
    @RequestMapping("")
	public String Index(Model model) {
		List<Person> people = personService.getPersons();
		model.addAttribute("persons", people);
		return "/views/personInfo.jsp";
    }
    @RequestMapping(value="", method=RequestMethod.POST)
    public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "/views/index.jsp";
        } else {
        	personService.createPerson(person);
            return "redirect:/licenses/new";
        }
    }
    @RequestMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
    	Person person = personService.getPerson(id);    	
        model.addAttribute("person", person);
        return "/views/show.jsp";  
    }
}
