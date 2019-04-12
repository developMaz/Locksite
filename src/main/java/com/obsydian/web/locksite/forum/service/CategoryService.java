package com.obsydian.web.locksite.forum.service;

import com.obsydian.web.locksite.forum.domain.forum.Category;
import com.obsydian.web.locksite.forum.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public void save(final Category category) {
		categoryRepository.save(category);
	}

	public void delete(final Category category){
		categoryRepository.delete(category);
	}

	public Optional<Category> findById(Integer id){
		return categoryRepository.findById(id);
	}

	public List<Category> findAll(){
		return categoryRepository.findAll();
	}




}
