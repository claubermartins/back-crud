package com.clauber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clauber.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
