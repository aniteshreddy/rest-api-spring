package com.anitesh.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anitesh.bean.MovieRatingBean;

@Service
public class ConsumerServiceImpl implements ConsumerService {
	
	RestTemplate restTemplate = new RestTemplate();

	@Override
	public MovieRatingBean[] getMovieRatingByUserId(int id) {

		return restTemplate.getForObject("http://localhost:8085/movie-rating/" + id, MovieRatingBean[].class);

	}


}
