package com.anitesh.service;

import java.util.List;

import com.anitesh.bean.RatingBean;

public interface RatingService {
	public List<RatingBean> getRatingbyUserId(int id);
}
