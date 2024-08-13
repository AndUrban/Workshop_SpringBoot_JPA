package com.myeducandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myeducandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
