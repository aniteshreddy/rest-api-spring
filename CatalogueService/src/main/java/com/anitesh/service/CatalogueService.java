package com.anitesh.service;

import java.util.List;

import com.anitesh.bean.MovieRating;

public interface CatalogueService {
	public List<MovieRating> getMovieRatingById(int id);	
}
