package com.obsydian.web.locksite.forum.mapper;

import com.obsydian.web.locksite.forum.domain.forum.Category;
import com.obsydian.web.locksite.forum.dto.CategoryDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryMapper {

	public Category mapToCategory(final CategoryDTO categoryDTO){
		return new Category(categoryDTO.getId(), categoryDTO.getCategoryName(), categoryDTO.getPostsList());
	}

	public CategoryDTO mapToCategoryDTO(final Category category){
		return new CategoryDTO(category.getId(), category.getCategoryName(), category.getPostsList());
	}

	public List<Category> mapToCategoryList(final List<CategoryDTO> categoryDTOList){
		return categoryDTOList.stream()
				.map(c -> new Category(c.getId(), c.getCategoryName(), c.getPostsList()))
				.collect(Collectors.toList());
	}

	public List<CategoryDTO> mapToCategoryListDTO(final List<Category> categoryList) {
		return categoryList.stream()
				.map(c -> new CategoryDTO(c.getId(), c.getCategoryName(), c.getPostsList()))
				.collect(Collectors.toList());
	}
}
