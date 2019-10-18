package com.marciogama.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciogama.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
