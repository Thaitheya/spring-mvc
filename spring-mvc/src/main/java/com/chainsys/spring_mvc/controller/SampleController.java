package com.chainsys.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {
	@RequestMapping("/")
	public String index() {
		return "index";// index is the name of the view
		// The run time will search for index.jsp in webapp/WEB-INF/views

	}

	@PostMapping("/print")
	public String print(@RequestParam("userName") String uName, Model model) {
		model.addAttribute("UserName", uName); // To share data from the controller to view
		return "print";// print is the name of the view
		// The run time will search for print.jsp in webapp/WEB-INF/views
	}

}
