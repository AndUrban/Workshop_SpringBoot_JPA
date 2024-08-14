package com.myeducandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myeducandoweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
