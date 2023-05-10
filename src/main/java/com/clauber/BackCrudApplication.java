package com.clauber;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.clauber.enums.Category;
import com.clauber.enums.Status;
import com.clauber.model.Course;
import com.clauber.model.Lesson;
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
			c.setCategory(Category.FRONT_END);
			c.setStatus(Status.ACTIVE);
			
			Lesson l = new Lesson();
			l.setName("Introdução");
			l.setYoutubeUrl("siteAula");
			l.setCourse(c);
			c.getLessons().add(l);
			
			courseRepository.save(c);
		};
	}
}
