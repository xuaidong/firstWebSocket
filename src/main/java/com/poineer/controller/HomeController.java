package com.poineer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/index")
	@ResponseBody
	public ModelAndView index(){
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
}
