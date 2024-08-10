package com.myeducandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myeducandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
