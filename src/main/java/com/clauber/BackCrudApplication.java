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
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class BackCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackCrudApplication.class, args);
	}
	
	@Bean
	@Profile("dev")
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			for(int i = 0; i < 20; i++) {

				Course c = new Course();
				c.setName("Angular com Spring" + i);
				c.setCategory(Category.BACK_END);
				c.setStatus(Status.ACTIVE);

				Lesson l = new Lesson();
				l.setName("Introdução");
				l.setYoutubeUrl("01234567890");
				l.setCourse(c);
				c.getLessons().add(l);

				Lesson l1 = new Lesson();
				l1.setName("Angular");
				l1.setYoutubeUrl("01234567891");
				l1.setCourse(c);
				c.getLessons().add(l1);

				courseRepository.save(c);
			}
		};
	}
}
