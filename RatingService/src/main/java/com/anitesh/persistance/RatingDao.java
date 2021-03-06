package com.anitesh.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anitesh.bean.RatingBean;

@Repository
public interface RatingDao extends JpaRepository<RatingBean, Integer> {
	
	@Query("From RatingBean where user_id=:id")
	public List<RatingBean> getRatingByUserId(@Param("id")int id);
	
}






