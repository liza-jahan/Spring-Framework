package com.livingoncodes.spring.web.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoticesController {

	@RequestMapping("/")
//	public ModelAndView  showHome() {
//		ModelAndView mv = new ModelAndView("home");
//		Map<String,Object> model=mv.getModel();
//		model.put("name", "niha");
//		return mv;
//	}
	public String  showHome(Model model) {
		model.addAttribute("name", "pol");
		return "home";
	
	
	}
}
