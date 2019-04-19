package com.teja.microservice.MovieCatalogService.model;

public class CatalogItem {
	
	
	private String name;
	private String description;
	private Integer rating;
	
	public CatalogItem() {
		System.out.println("CatalogItem Object is Created..");
	}

	public CatalogItem(String name, String description, Integer rating) {
		this.name = name;
		this.description = description;
		this.rating = rating;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
	
	
}	
