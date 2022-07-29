package com.educanoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educanoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
