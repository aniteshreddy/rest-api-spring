package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.anitesh.bean.MovieBean;
import com.anitesh.persistance.MovieDao;

@SpringBootApplication(scanBasePackages = "com.anitesh")
@EnableJpaRepositories(basePackages = "com.anitesh.persistance")
@EntityScan(basePackages = "com.anitesh.bean")
public class MovieServiceApplication implements CommandLineRunner{
	
	@Autowired
	MovieDao movieDao;

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		movieDao.save(new MovieBean("Bahubali"));
		movieDao.save(new MovieBean("Bheemla Nayak") );
		movieDao.save(new MovieBean("Thimmarasu") );
		movieDao.save(new MovieBean("SR kalyana Mandapam") );
		movieDao.save(new MovieBean("King") );

		
			
	}

}
