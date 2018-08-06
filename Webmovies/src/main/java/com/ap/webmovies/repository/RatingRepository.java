package com.ap.webmovies.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ap.webmovies.model.Movie;
import com.ap.webmovies.model.Rating;

@NoRepositoryBean
public interface RatingRepository extends JpaRepository<Rating, Integer> {

	
	
	List<Rating> findRatingByMovieName(String firstName);
	List<Rating> findByMovieLike(String firstName);
	List<Rating> findAll();
}
