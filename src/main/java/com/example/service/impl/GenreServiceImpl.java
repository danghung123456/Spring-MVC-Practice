package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Genre;
import com.example.repository.GenreRepository;
import com.example.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

	@Autowired
	GenreRepository repository;

	@Override
	public List<Genre> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Genre genre) {
		// TODO Auto-generated method stub
		repository.save(genre);
	}

	@Override
	public Genre findbyId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
