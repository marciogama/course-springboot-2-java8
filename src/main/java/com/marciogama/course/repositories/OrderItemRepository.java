package com.marciogama.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciogama.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
