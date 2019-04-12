package com.obsydian.web.locksite.repository;

import com.obsydian.web.locksite.domain.forum.Post;
import com.obsydian.web.locksite.domain.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ForumRepository extends CrudRepository<Post, Integer> {

	@Override
	Post save(Post post);

	@Override
	void delete(Post post);

	Optional<Post> findById(Integer id);

	List<Post> findByAuthor(Integer id);

	@Override
	List<Post> findAll();




}
