package com.ap.webmovies.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="RATING")


public class Rating implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    
	@Column(name="ID")
	private Integer id; //primary key
	
	@Column(name="EVALUATE")
	int evaluate;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getEvaluate() {
		return evaluate;
	}

	public void setEvaluate(int evaluate) {
		this.evaluate = evaluate;
	}
	
	
	
	@ManyToOne
	@JoinTable(name="MOVIE_RATING",
			joinColumns= {@JoinColumn(name="ID_RATING",referencedColumnName="ID")},
			inverseJoinColumns= {@JoinColumn(name="ID_MOVIE",referencedColumnName="ID")})
	
	private Movie movie;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	  


    
	

}
