package com.livingoncodes.spring.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.livingoncodes.spring.web.dao.Notice;
import com.livingoncodes.spring.web.service.NoticesService;

@Controller
public class NoticesController {
	private NoticesService noticesService;

	@Autowired
	public void setNoticesService(NoticesService noticesService) {
		this.noticesService = noticesService;
	}

	@RequestMapping("/test")
	public String showTest(Model model, @RequestParam("id") String id) {
		System.out.println("Id is : " + id);

		return "home";
	}

	@RequestMapping("/notices")
	public String showNotices(Model model) {
		List<Notice> notices = noticesService.getCurrent();

		model.addAttribute("notices", notices);

		return "notices";
	}

	@RequestMapping("/createnotice")
	public String createNotice(Model model) {

		return "createnotice";
	}
	@RequestMapping(value="/docreate", method=RequestMethod.POST)
	public String doCreate(Model model,Notice notice){
		System.out.println(notice);
		return "noticecreated";
		
	}
}
