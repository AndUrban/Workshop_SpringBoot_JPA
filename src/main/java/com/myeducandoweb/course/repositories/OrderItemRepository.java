package com.myeducandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myeducandoweb.course.entities.OrderItem;
import com.myeducandoweb.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
