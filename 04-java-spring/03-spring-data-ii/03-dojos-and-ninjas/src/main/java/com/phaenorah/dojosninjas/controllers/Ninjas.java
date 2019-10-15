package com.phaenorah.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phaenorah.dojosninjas.models.Dojo;
import com.phaenorah.dojosninjas.models.Ninja;
import com.phaenorah.dojosninjas.services.DojoService;
import com.phaenorah.dojosninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class Ninjas {
	NinjaService ninjaService;
    DojoService dojoService;
    public Ninjas(NinjaService ninjaService, DojoService dojoService){
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }
    @RequestMapping("/new")
    public String NewNinja(@ModelAttribute("ninja")Ninja ninja, Model model){
    	List<Dojo> dojos = dojoService.findAll();
        model.addAttribute("dojos", dojos);
        return "/views/newNinja.jsp";
    }
    @PostMapping("/new")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model){
        if(result.hasErrors()){
        	List<Dojo> dojos = dojoService.findAll();
            model.addAttribute("dojos", dojos);
            return "/views/newNinja.jsp";
        }else{            
            ninjaService.createNinja(ninja);
            return "redirect:/dojos/"+ninja.getDojo().getId();
        }
    }

}
