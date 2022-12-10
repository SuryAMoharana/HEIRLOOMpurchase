package com.heirloom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heirloom.models.Category;
import com.heirloom.services.CategoryServices;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryServices categoryService;
	
	
	@PostMapping("/create")
	public String createCategory(@RequestBody  Category category) {
		
		categoryService.createCategory(category);
		
		return "Success";
		
	}

}
