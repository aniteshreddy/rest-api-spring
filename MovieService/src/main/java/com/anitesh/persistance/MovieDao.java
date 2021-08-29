package com.anitesh.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anitesh.bean.MovieBean;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDao extends JpaRepository<MovieBean, Integer> {

//	@Query("select movie_id,movie_name from movie")
//	public List<MovieBean> getallMovies();
	
}
