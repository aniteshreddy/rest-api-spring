package com.anitesh.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class MovieBean {
	
	private int movieId;
	private String movieName;
	
	public MovieBean(String movieName) {
		this.movieName=movieName;
	}
}