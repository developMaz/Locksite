package com.obsydian.web.locksite.forum.service;

import com.obsydian.web.locksite.forum.domain.forum.Post;
import com.obsydian.web.locksite.forum.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

	@Autowired
	private PostRepository forumRepository;

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
