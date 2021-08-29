package com.anitesh.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class RatingBean {
	

	private int ratingId;
	private int movieId;
	private int userId;
	private int rating;
	public RatingBean(int movieId, int userId, int rating) {
		super();
		this.movieId = movieId;
		this.userId = userId;
		this.rating = rating;
	}
	
	
	
}
