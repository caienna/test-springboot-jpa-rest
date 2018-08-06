package com.ap.webmovies.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.ap.webmovies.model.Director;
import com.ap.webmovies.model.Movie;
import com.ap.webmovies.model.Rating;


@XmlRootElement
public class Message {

	
	private long id;
	private Movie movie;
	private Director director;
	private Rating rating;
	
	
	public Message() {
		
	}
	

	public Message(long id, Movie movie, Director director, Rating rating) {
		
		this.id = id;
		this.movie = movie;
		this.director = director;
		this.rating = rating;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	
	
}
