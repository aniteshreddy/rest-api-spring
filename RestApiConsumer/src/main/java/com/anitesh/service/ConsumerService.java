package com.anitesh.service;

import com.anitesh.bean.MovieRatingBean;

public interface ConsumerService {
	public MovieRatingBean[] getMovieRatingByUserId(int id); 
}
