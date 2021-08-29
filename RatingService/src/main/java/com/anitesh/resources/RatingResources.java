package com.anitesh.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anitesh.bean.RatingBean;
import com.anitesh.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingResources {
	
	@Autowired
	RatingService ratingService;
	
	@GetMapping(path="/{userid}" ,produces = "Application/json")
	public	List<RatingBean> getRatingUserId(@PathVariable("userid") int id) {
		return ratingService.getRatingbyUserId(id); 
	}
	
}
