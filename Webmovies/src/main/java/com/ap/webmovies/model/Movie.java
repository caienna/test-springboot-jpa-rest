package com.ap.webmovies.model;

import java.io.Serializable;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity
@Table(name="MOVIE")
public class Movie implements Serializable{
	
	@Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id; //primary key
	
	@Column(name="TITLE")
	private String title;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	
	@OneToMany
	@JoinTable(name="MOVIE_RATING",
		joinColumns= {@JoinColumn(name="ID_MOVIE",referencedColumnName="ID")},
		inverseJoinColumns= {@JoinColumn(name="ID_RATING",referencedColumnName="ID")})
	
	
	List<Rating> ratings;
	
	@ManyToOne
	@JoinTable(name="DIRECTOR_MOVIE",
		joinColumns= {@JoinColumn(name="ID_MOVIE",referencedColumnName="ID")},
		inverseJoinColumns= {@JoinColumn(name="ID_DIRECTOR",referencedColumnName="ID")})
	
	
	Director director;


	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}

	
	
	

	    
	
	
}
	


