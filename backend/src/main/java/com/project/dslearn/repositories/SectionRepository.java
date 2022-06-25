package com.project.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dslearn.entities.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {

}
