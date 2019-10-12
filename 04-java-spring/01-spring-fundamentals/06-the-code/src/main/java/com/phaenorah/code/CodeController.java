package com.phaenorah.code;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String index() {		
		return "index.jsp"; 
	}
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String postTo(@RequestParam("code") String code, RedirectAttributes redirectAttributes) {		
		if(code.equals("bushido")){
            return "redirect:/code";
        }else {
        redirectAttributes.addFlashAttribute("error", "You must try harder!");
        return "redirect:/";
        }		
	}
	@RequestMapping("/code")
	public String code() {
		return "code.jsp"; 
	}	
	
}
