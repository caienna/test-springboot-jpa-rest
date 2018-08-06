package com.ap.webmovies.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


import com.ap.webmovies.model.Director;
import com.ap.webmovies.model.Movie;



@NoRepositoryBean
public interface DirectorRepository extends JpaRepository<Director, Integer> {
	
	Director findByName(String name);
	List<Director> findByDirectorLike(String firstName);
	List<Director> findByDirectorName(String firstName);
	void save(Movie movie);

}
