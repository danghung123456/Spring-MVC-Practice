package com.example.service;

import java.util.List;
import com.example.entity.Movie;

public interface MovieService {
	List<Movie> findAll();

	void save(Movie movie);

	Movie findById(Long id);

	void update(Long id);
}
