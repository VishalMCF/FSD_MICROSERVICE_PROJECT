package com.example.redcat.microservice1course.repository;

import com.example.redcat.microservice1course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>
{
    //findBy+fieldName
}
