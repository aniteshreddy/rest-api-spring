package com.anitesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anitesh.bean.RatingBean;
import com.anitesh.persistance.RatingDao;

@Service
public class RatingServiceImp implements RatingService {

	@Autowired
	RatingDao ratingDao;

	@Override
	public List<RatingBean> getRatingbyUserId(int id) {
		return ratingDao.getRatingByUserId(id);
	}

}
