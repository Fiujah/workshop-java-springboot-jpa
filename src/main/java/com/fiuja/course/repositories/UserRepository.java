package com.fiuja.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiuja.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
