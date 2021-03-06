package com.anitesh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "movie")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class MovieBean {
	@Id
	@Column(name = "movie_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieId;
	@Column(name="movie_name")
	private String movieName;
	
	public MovieBean(String movieName) {
		this.movieName=movieName;
	}
}
