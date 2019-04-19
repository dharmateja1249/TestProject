package com.teja.microservice.MovieCatalogService.model;

public class Rating {
	
	private String movieId;
	private Integer rating;
	
	public Rating() {
		System.out.println("Rating Object Created...");
	}

	public Rating(String movieId, Integer rating) {
		this.movieId = movieId;
		this.rating = rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
	
	
	
}
