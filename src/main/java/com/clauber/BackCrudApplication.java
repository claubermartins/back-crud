package com.clauber;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.clauber.model.Course;
import com.clauber.repository.CourseRepository;

@SpringBootApplication
public class BackCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackCrudApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();
			
			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("front-end");
			
			courseRepository.save(c);
		};
	}
}
