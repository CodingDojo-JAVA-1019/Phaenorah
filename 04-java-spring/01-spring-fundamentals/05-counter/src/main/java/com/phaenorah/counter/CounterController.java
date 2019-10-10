package com.phaenorah.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session){       
        Integer count = (Integer) session.getAttribute("count");
        if (count == null){
            count = 0;
            count++;
			session.setAttribute("count", count);
        }else {
			count++;
        session.setAttribute("count", count ++);
        }
        return  "index.jsp";        
    }
	@RequestMapping("/counter")
	public String counter(HttpSession session) {		
		return "counter.jsp"; 
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {	
		session.invalidate();
        return "redirect:/counter";
	}

}
