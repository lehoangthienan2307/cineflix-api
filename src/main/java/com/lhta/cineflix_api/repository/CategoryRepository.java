package com.lhta.cineflix_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhta.cineflix_api.entity.Category;




@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	List<Category> findAll();
}
