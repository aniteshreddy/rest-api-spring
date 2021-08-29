package com.anitesh.resources;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anitesh.bean.MovieBean;
import com.anitesh.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	@Autowired
	private MovieService movieService;
	
	@GetMapping(path="/{id}", produces = "Application/json")
	public MovieBean getMovieById(@PathVariable(value = "id") Integer id){
		
		return movieService.getMovieById(id);
	}
	
	
	
}
