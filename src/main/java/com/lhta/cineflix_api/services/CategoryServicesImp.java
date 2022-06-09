package com.lhta.cineflix_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhta.cineflix_api.entity.Category;
import com.lhta.cineflix_api.repository.CategoryRepository;

@Service
public class CategoryServicesImp implements ICategoryServices {
	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public List<Category> getAllCategory() {
		
		return categoryRepository.findAll();
	}

}
