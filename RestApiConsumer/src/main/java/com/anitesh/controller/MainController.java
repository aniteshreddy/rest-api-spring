package com.anitesh.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.anitesh.service.ConsumerServiceImpl;

@Controller
public class MainController {

	@Autowired
	ConsumerServiceImpl consumerServiceImpl;

	@RequestMapping("/")
	public ModelAndView homePageController() {
		return new ModelAndView("index");
	}

	@RequestMapping("/user-reviews")
	public ModelAndView userReviewsController(HttpServletRequest request) {
		System.out.println("I got here");

		return new ModelAndView("userReviews", "ratings",
				consumerServiceImpl.getMovieRatingByUserId(Integer.parseInt(request.getParameter("userId"))));

	}

}
