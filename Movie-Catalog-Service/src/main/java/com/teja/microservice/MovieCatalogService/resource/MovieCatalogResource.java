package com.teja.microservice.MovieCatalogService.resource;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.teja.microservice.MovieCatalogService.model.CatalogItem;
import com.teja.microservice.MovieCatalogService.model.Movie;
import com.teja.microservice.MovieCatalogService.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") final Integer userId){
	
		UserRating userRating=restTemplate.getForObject("http://rating-data-service/ratingdata/users/"+userId,UserRating.class);
		return userRating.getUserRating().stream().map(rating ->{
					Movie movie=restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
					return new CatalogItem(movie.getName(), "", rating.getRating());
				}).collect(Collectors.toList());
	
	}
}
