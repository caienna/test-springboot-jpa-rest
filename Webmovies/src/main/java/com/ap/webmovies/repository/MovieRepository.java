package com.ap.webmovies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ap.webmovies.model.Movie;

@NoRepositoryBean
public interface MovieRepository extends CrudRepository<Movie, Integer> {
	
	
	Movie findByDirectorName(String name);
	List<Movie> findByMovieLike(String firstName);
	List<Movie> findAll();
	
	
	 

}
