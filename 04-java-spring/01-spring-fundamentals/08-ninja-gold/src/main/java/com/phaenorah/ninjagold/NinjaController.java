package com.phaenorah.ninjagold;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		if(session.getAttribute("gold")== null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activities", new ArrayList<String>());		
		}		
		
		return "index.jsp"; 
	}
	public int getRandomGold(int max, int min) {
		Random rand = new Random();
		int value = rand.nextInt((max-min)+1)+min;
		return value;
	}
	@RequestMapping(value="/gold", method=RequestMethod.POST)
	public String postTo(@RequestParam("building") String building,Model model,HttpSession session) {
		
		String timeStamp = new SimpleDateFormat("EEEE, dd MMMM, yyyy hh:mm aa").format(new Date());
		
		if(building.equals("farm")) {
			Integer money = getRandomGold(20,10);
			Integer myMoney = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", money+myMoney);
			((ArrayList<String>) session.getAttribute("activities")).add("You entered a farm and earned "+ money+" gold. ("+timeStamp+")");
		
		}
		if(building.equals("cave")) {
			Integer money = getRandomGold(5,10);
			Integer myMoney = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", money+myMoney);
			((ArrayList<String>) session.getAttribute("activities")).add("You entered a cave and earned "+ money+" gold. ("+timeStamp+")");
		
		}
		if(building.equals("house")) {
			Integer money = getRandomGold(2,5);
			Integer myMoney = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", money+myMoney);
			((ArrayList<String>) session.getAttribute("activities")).add("You entered a house and earned "+ money+" gold. ("+timeStamp+")");
		
		}
		if(building.equals("casino")) {
			Integer money = getRandomGold(0,50);
			Integer myMoney = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", money+myMoney);
			((ArrayList<String>) session.getAttribute("activities")).add("You entered a casino and earned "+ money+" gold. ("+timeStamp+")");
			if(money<0) {
				((ArrayList<String>) session.getAttribute("activities")).add("You entered a Casino and lost "+money+" gold. Ouch .. ("+timeStamp+")");
			}else {
				((ArrayList<String>) session.getAttribute("activities")).add("You entered a Casino and won "+ money+" gold. ("+timeStamp+")");
			}
		}		
		
		return "redirect:/"; 
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {	
		session.invalidate();
        return "redirect:/";
	}

}
