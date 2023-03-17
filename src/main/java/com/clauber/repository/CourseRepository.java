package com.clauber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clauber.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
