package com.capg.moviecatelog.model;

import javax.persistence.Id;

public class MovieCatelog {

	@Id
	private Long id;
	private String movieName;
	
	public MovieCatelog(Long id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}
	
	public MovieCatelog() {
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
}

