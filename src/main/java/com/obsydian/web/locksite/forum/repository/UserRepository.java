package com.obsydian.web.locksite.forum.repository;

import com.obsydian.web.locksite.forum.domain.user.User;
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
