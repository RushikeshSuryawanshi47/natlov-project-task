package com.kafkaSpring.Task2.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kafkaSpring.Task2.entity.User;





@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
