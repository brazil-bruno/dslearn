package com.project.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dslearn.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
