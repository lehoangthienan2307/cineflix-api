package com.lhta.cineflix_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhta.cineflix_api.entity.Category;
import com.lhta.cineflix_api.services.ICategoryServices;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	ICategoryServices iCategoryServices;
	
	@GetMapping("/get")
	public List<Category> category()
	{
		return iCategoryServices.getAllCategory();
	}
}
