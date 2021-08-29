package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.anitesh.bean.RatingBean;
import com.anitesh.persistance.RatingDao;

@SpringBootApplication(scanBasePackages = "com.anitesh")
@EntityScan(basePackages = "com.anitesh.bean")
@EnableJpaRepositories(basePackages = "com.anitesh.persistance")
public class RatingServiceApplication implements CommandLineRunner{
	
	@Autowired
	RatingDao ratingDao;

	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ratingDao.save(new RatingBean(1, 1, 4));
		ratingDao.save(new RatingBean(1, 2, 3));
		ratingDao.save(new RatingBean(2, 1, 5));
		ratingDao.save(new RatingBean(2, 2, 4));
		ratingDao.save(new RatingBean(3, 1, 1));

		
	}

	
	
}
