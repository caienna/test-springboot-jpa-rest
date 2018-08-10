package com.ap.webmovies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ap.webmovies.model.Director;
import com.ap.webmovies.model.Movie;
import com.ap.webmovies.repository.DirectorRepository;
import com.ap.webmovies.repository.MovieRepository;

public class DirectorController {
	
	
	
	
	private DirectorRepository directorRepository;
	
	@GetMapping(value="/all")
	public List<Director> findAll(){
		return directorRepository.findAll();
	}
	
	@GetMapping(value="/{name}")
	public List<Director> findByName(@PathVariable final String name){
		return directorRepository.findByDirectorName(name);
		
	}
	
	@PostMapping(value="/load")
	public List<Director> load(@RequestBody final Movie movie){
		directorRepository.save(movie);
		 return directorRepository.findByDirectorName(movie.getTitle());
		
	}

}
