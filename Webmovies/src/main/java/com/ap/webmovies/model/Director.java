package com.ap.webmovies.model;

import java.io.Serializable;
import java.util.List;

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
@Table(name="DIRECTOR")

public class Director implements Serializable{
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
	private Integer id; //primary key
	
	 @Column(name="NAME")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	


	@OneToMany
	@JoinTable(name="DIRECTOR_MOVIE",
		joinColumns= {@JoinColumn(name="ID_DIRECTOR",referencedColumnName="ID")},
		inverseJoinColumns= {@JoinColumn(name="ID_MOVIE",referencedColumnName="ID")})
	
	
	private List<Movie> movies;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
}
