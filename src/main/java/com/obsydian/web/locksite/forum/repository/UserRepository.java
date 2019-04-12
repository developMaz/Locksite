package com.obsydian.web.locksite.repository;

import com.obsydian.web.locksite.domain.forum.Post;
import com.obsydian.web.locksite.domain.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	@Override
	User save(User user);

	@Override
	void delete(User user);

	Optional<User> findByName(String name);

	@Override
	List<User> findAll();




}
