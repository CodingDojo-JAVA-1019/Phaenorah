package com.phaenorah.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DisplayController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp"; 
	}
	@RequestMapping("/date")
	public String date(Model model) {
		String formattedDate = new SimpleDateFormat("EEEE, dd MMMM, yyyy").format(new Date());
		model.addAttribute("date", formattedDate);
		return "date.jsp"; 
	}
	@RequestMapping("/time")
	public String time(Model model) {
		String formattedTime = new SimpleDateFormat("hh:mm aa").format(new Date());
		model.addAttribute("time", formattedTime);
		return "time.jsp"; 
	}

}

//new java.util.Date()