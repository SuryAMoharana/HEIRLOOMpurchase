package com.heirloom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heirloom.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>  {

}
