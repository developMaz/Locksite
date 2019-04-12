package com.obsydian.web.locksite.forum.service;
import com.obsydian.web.locksite.forum.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRepository {

	@Autowired
	private UserRepository userRepository;

	public User save(final User user){
		return userRepository.save(user);
	}

	public void delete(final User user){
		userRepository.delete(user);
	}

	public Optional<User> findByName(final String name){
		return userRepository.findByName(name);
	}

	public List<User> findAll(){
		return userRepository.findAll();
	}

}
