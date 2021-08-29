package com.anitesh.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class MovieRatingBean {
	private int rating;
	private String movieName;
	private int userId;
}
