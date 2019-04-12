package com.obsydian.web.locksite.forum.repository;

import com.obsydian.web.locksite.forum.domain.forum.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

	@Override
	Category save(Category category);

	@Override
	void delete(Category category);

	Optional<Category> findById(Integer id);

	@Override
	List<Category> findAll();
}
