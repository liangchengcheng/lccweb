package com.hdsx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String list(Model model, Integer offset, Integer limit) {
		model.addAttribute("userlist", "hellow");
		return "login";
	}
}
