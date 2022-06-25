package com.project.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dslearn.entities.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {

}
