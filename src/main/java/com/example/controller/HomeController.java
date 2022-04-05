package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Genre;
import com.example.service.GenreService;

@Controller(value = "homeController")
public class HomeController {

	@Autowired
	GenreService genreService;

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView showSomething() {
		ModelAndView model = new ModelAndView("web/home");
//		model.addObject("model", genreService.findAll());
		System.out.println(model);
		Genre genre = new Genre();
		genre.setGenreId(1l);
		genre.setGenreName("Hanh dong");
		genreService.save(genre);
		System.out.println(genre.toString());
		return model;
	}
	
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	

}
