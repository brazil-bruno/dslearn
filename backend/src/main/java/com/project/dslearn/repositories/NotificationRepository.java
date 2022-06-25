package com.project.dslearn.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.dslearn.entities.Notification;
import com.project.dslearn.entities.User;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
	
	Page<Notification> findByUser(User user, Pageable pageable);

}
