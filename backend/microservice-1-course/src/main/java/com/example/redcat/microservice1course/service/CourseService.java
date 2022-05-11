package com.example.redcat.microservice1course.service;

import com.example.redcat.microservice1course.model.Course;

import java.util.List;

public interface CourseService
{
    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
