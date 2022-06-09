package com.lhta.cineflix_api.services;

import java.util.List;
import java.util.Map;

import com.lhta.cineflix_api.entity.Movie;



public interface IMovieServices {
	List<Movie> getAllMovie();
	List<Map<String, ?>> GetAllPhimWithId(Integer id);
	List<Map<String, ?>> getAllMovieAndCategory();
}
