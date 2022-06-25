package com.project.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dslearn.entities.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
