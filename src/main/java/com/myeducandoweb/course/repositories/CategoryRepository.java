package com.myeducandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myeducandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
