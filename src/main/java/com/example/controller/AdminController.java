package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller(value = "AdminController")
public class AdminController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showSomething() {

		return "admin/home";
	}

}