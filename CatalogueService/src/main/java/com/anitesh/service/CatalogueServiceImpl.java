package com.anitesh.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anitesh.bean.MovieBean;
import com.anitesh.bean.MovieRating;
import com.anitesh.bean.RatingBean;

@Service
public class CatalogueServiceImpl implements CatalogueService{

	RestTemplate restTemplate = new RestTemplate();

	private RatingBean[] getRatingById(int id) {

		return restTemplate.getForObject("http://localhost:8084/rating/" + id, RatingBean[].class);
	}

	private MovieBean getMovieById(int id) {
		System.out.println("http://localhost:8083/movies/" + id);

		ResponseEntity<MovieBean> moviebean = restTemplate.getForEntity("http://localhost:8083/movies/" + id,
				MovieBean.class);
		System.out.println(moviebean.getStatusCodeValue());
		return moviebean.getBody();
	}

	@Override
	public List<MovieRating> getMovieRatingById(int id) {
		ArrayList<MovieRating> movierating = new ArrayList<>();
		Arrays.stream(getRatingById(id)).forEach(e -> movierating
				.add(new MovieRating(e.getRating(), getMovieById(e.getMovieId()).getMovieName(), e.getUserId())));
		
		movierating.stream().forEach(System.out::println);
		
		return movierating;

	}

}
