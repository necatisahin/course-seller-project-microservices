package com.necatisahiin.courses.repository;

import com.necatisahiin.courses.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
