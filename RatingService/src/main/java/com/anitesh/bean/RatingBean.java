package com.anitesh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="rating")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RatingBean {
	
	@Id
	@Column(name="rating_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ratingId;
	@Column(name="movie_id")
	private int movieId;
	@Column(name="user_id")
	private int userId;
	@Column(name="rating")
	private int rating;
	public RatingBean(int movieId, int userId, int rating) {
		super();
		this.movieId = movieId;
		this.userId = userId;
		this.rating = rating;
	}
	
	
	
}
