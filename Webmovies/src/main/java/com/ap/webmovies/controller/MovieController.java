package com.ap.webmovies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.webmovies.model.Movie;
import com.ap.webmovies.repository.MovieRepository;


	
	@RestController
	@RequestMapping("api/movie")
	public class MovieController {
		
		
		
		
		private MovieRepository movieRepository;
		
		@GetMapping(value="/all")
		public List<Movie> findAll(){
			return movieRepository.findAll();
		}
		
		@GetMapping(value="/{name}")
		public Movie findByName(@PathVariable final String name){
			return movieRepository.findByDirectorName(name);
			
		}
		
		@PostMapping(value="/load")
		public Movie load(@RequestBody final Movie movie){
			 movieRepository.save(movie);
			 return movieRepository.findByDirectorName(movie.getTitle());
			
		}
		
}
