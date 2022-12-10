package com.heirloom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heirloom.models.Category;
import com.heirloom.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryServices {
	
	@Autowired
	CategoryRepository categoryRepo;

	@Override
	public Category createCategory(Category category) {
		
		categoryRepo.save(category);
		
		return category;
	}

}
