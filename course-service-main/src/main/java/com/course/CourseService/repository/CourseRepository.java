package com.course.CourseService.repository;

import com.course.CourseService.model.Course;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

	Optional<Course> findByTitle(String title);
	
//	 List<Course> findAllByPrefix(String prefix);
}
