package com.d460.springdemo;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	
	//need a controller method to show initial html form
		
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	//need controller method to process html form
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	//add a new controller method to rad form data and add data to the model
	@RequestMapping("/processFormVersioTwo")
	public String letsShoutDude(HttpServletRequest request, Model model){
		
		//read the request parameter from the html form
		String theName = request.getParameter("studentName");
		
		
		//convert data to all caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Yoo!! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
				
		return "helloworld";
	}
	
	
	
	@RequestMapping("/processFormVersioThree")
	public String processFormVersioThree(@RequestParam("studentName") String theName, Model model){
		
//		//read the request parameter from the html form
//		String theName = request.getParameter("studentName");
		
		
		//convert data to all caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Hey!! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
				
		return "helloworld";
	}

}
