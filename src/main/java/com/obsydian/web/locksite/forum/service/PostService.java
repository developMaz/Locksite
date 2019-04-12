package com.obsydian.web.locksite.service;

import com.obsydian.web.locksite.domain.forum.Post;
import com.obsydian.web.locksite.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ForumService {

	@Autowired
	private ForumRepository forumRepository;

	public Post save(final Post post) {
		return forumRepository.save(post);
	}

	public void delete(final Post post) {
		forumRepository.delete(post);
	}

	public Optional<Post> findById(final Integer id) {
		return forumRepository.findById(id);
	}

	public List<Post> findAll() {
		return forumRepository.findAll();
	}

	public List<Post> findPostByUser(final Integer id) {
		return forumRepository.findByAuthor(id);
	}
}
