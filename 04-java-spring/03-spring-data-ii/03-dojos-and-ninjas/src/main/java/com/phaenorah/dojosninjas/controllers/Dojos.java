package com.phaenorah.dojosninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.phaenorah.dojosninjas.models.Dojo;
import com.phaenorah.dojosninjas.services.DojoService;
import com.phaenorah.dojosninjas.services.NinjaService;

@Controller
@RequestMapping("/dojos")
public class Dojos {
	DojoService dojoService;
    NinjaService ninjaService;
    public Dojos(DojoService dojoService, NinjaService ninjaService){
        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
    }
    @GetMapping("/new")
    public String newDojo(@ModelAttribute("dojo")Dojo dojo){
        return "/views/newDojo.jsp";
    }
    @RequestMapping(value="/new", method=RequestMethod.POST)
    public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "/views/newDojo.jsp";
        } else {
        	dojoService.createDojo(dojo);
        	return "redirect:/dojos/"+dojo.getId();
        }
    }
    @RequestMapping("/{id}")
    public String getDojo(@PathVariable("id") Long id, Model model){
        Dojo dojo = dojoService.findById(id);       
        model.addAttribute("dojo", dojo);
        return "/views/ninjas.jsp";
    }    

}
