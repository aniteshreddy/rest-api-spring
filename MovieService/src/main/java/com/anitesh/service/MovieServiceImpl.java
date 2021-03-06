package com.anitesh.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anitesh.bean.MovieBean;
import com.anitesh.persistance.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDao movieDao;

//	@Override
//	public Collection<MovieBean> getAllMovies() {
//
//		return movieDao.getallMovies();
//	}

	@Override
	public MovieBean getMovieById(int id) {
		
		return movieDao.getById(id);
	}

}
