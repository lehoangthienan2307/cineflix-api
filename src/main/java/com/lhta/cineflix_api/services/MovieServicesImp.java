package com.lhta.cineflix_api.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhta.cineflix_api.entity.Movie;
import com.lhta.cineflix_api.repository.MovieRepository;

@Service
public class MovieServicesImp implements IMovieServices {
	@Autowired
	MovieRepository movieRepository;
	@Override
	public List<Movie> getAllMovie() {
		return movieRepository.findAll();
	}
	@Override
	public List<Map<String, ?>> GetAllPhimWithId(Integer id) {
		
		return movieRepository.GetAllPhimWithId(id);
	}
	@Override
	public List<Map<String, ?>> getAllMovieAndCategory() {
		
		
		return movieRepository.getAllMovieAndCategory();
	}
	
}
