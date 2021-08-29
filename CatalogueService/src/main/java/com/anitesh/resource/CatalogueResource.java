package com.anitesh.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anitesh.bean.MovieRating;
import com.anitesh.service.CatalogueServiceImpl;

@RestController
@RequestMapping("/movie-rating")
public class CatalogueResource {
	@Autowired
	private CatalogueServiceImpl catalogueService;
	
	@RequestMapping("/{id}")
	public List<MovieRating> getRatingId(@PathVariable("id") int id) {
		return catalogueService.getMovieRatingById(id);
	}
	
	
	
}
