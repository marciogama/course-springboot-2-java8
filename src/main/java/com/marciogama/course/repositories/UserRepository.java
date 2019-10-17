package com.marciogama.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciogama.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
