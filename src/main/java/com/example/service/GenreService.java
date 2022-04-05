package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Genre;

@Service
public interface GenreService {
	List<Genre> findAll();

	void save(Genre genre);

	Genre findbyId(Long id);
}
