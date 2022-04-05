package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Movie;
import com.example.repository.MovieRepository;
import com.example.service.MovieService;

public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository repository;

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public void save(Movie movie) {
		repository.save(movie);
	}

	@Override
	public Movie findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long id) {
		// TODO Auto-generated method stub

	}

	public void testSave() {
		repository.save(new Movie());
	}
	
}
