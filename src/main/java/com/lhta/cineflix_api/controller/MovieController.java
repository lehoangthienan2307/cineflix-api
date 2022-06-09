package com.lhta.cineflix_api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhta.cineflix_api.entity.Movie;
import com.lhta.cineflix_api.services.IMovieServices;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	IMovieServices iMovieServices;
	
	@GetMapping("/get")
	public ResponseEntity<?> getAllMovie()
	{
		return new ResponseEntity<List<Movie>>(iMovieServices.getAllMovie(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getAllMovieById(@PathVariable("id") Integer id)
	{
		return new ResponseEntity<List<Map<String, ?>>>(iMovieServices.GetAllPhimWithId(id), HttpStatus.OK);
	}
	
	@GetMapping("/get/category")
	public ResponseEntity<?> getAllMovieAndCategory()
	{
		return new ResponseEntity<List<Map<String, ?>>>(iMovieServices.getAllMovieAndCategory(), HttpStatus.OK);
	}
}
