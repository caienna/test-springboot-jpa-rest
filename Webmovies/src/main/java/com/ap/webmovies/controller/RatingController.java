package com.ap.webmovies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ap.webmovies.model.Director;
import com.ap.webmovies.model.Movie;
import com.ap.webmovies.model.Rating;
import com.ap.webmovies.repository.MovieRepository;
import com.ap.webmovies.repository.RatingRepository;
import com.sun.enterprise.module.common_impl.DirectoryBasedRepository;

public class RatingController {
	
	
	
	private RatingRepository ratingRepository;
	
	@GetMapping(value="/all")
	public List<Rating> findAll(){
		return ratingRepository.findAll();
	}
	
	@GetMapping(value="/{name}")
	public List<Rating> findByName(@PathVariable final String name){
		return ratingRepository.findRatingByMovieName(name);
		
	}
	


}
