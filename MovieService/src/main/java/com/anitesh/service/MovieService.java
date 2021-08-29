package com.anitesh.service;

import java.util.Collection;

import com.anitesh.bean.MovieBean;

public interface MovieService {
//	Collection<MovieBean> getAllMovies();
	MovieBean getMovieById(int id);
}
