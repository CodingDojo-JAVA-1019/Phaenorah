package com.phaenorah.strings;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{dojo}")
    public String display(@PathVariable("dojo") String dojo) {
    	return "The " + dojo + " is awesome!";
    }
	@RequestMapping("/{burbank-dojo}/")
    public String showLocation(@PathVariable("burbank-dojo") String burbank, @PathVariable("dojo") String dojo) {
    	return burbank + dojo + "is located in Southern California";
    }
	@RequestMapping("/{san-jose}/")
    public String city(@PathVariable("san-jose") String SJ, @PathVariable("dojo") String dojo) {
    	return SJ + dojo + "is the headquarters";
    }

}
