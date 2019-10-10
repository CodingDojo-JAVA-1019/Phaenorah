package com.phaenorah.hellohuman;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HumanController {	
	@RequestMapping("/")
	public String index(@RequestParam(value= "name", required= false) String name, Model model) {
		
		model.addAttribute("name", name);
		
		if(name != null ) {				
			return "index.jsp"; 
			
		} else {
			return "hello.html";
		}		
	}

}
