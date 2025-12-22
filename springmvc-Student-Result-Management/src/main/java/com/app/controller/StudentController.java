package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
    @RequestMapping("/")
	public String home() {
		
		return "home";
		
	}
    
    @RequestMapping("enterMarks")
    public String openMarkForm() {
    	
    	return "marksForm";
    	
    }
    
    @RequestMapping("calculateResult")
    public String calculateResult(@RequestParam ("name") String name, 
    		@RequestParam ("m1") int m1, 
    		@RequestParam ("m2") int m2, 
    		@RequestParam ("m3") int m3, 
    		Model model) {
    	
    	int total = m1 + m2 + m3;
    	
    	double percentage = total / 3;
    	
    	String result;
    	
    	if(percentage >= 33.33) {
    		
    		result = "PASS";
    		
    	} else {
    		
    		result = "FAIL";
    		
    	}
    	
    	model.addAttribute("name", name);
    	model.addAttribute("total", total);
        model.addAttribute("percentage", percentage);
        model.addAttribute("result", result);
    	
    	
    	return "result";
    	
    }

}
