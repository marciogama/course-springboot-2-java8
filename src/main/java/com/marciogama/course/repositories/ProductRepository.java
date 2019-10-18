package com.marciogama.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciogama.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
