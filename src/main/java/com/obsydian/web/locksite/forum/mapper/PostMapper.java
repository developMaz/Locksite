package com.obsydian.web.locksite.mapper;

import com.obsydian.web.locksite.domain.forum.Post;
import com.obsydian.web.locksite.dto.PostDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ForumMapper {

	public Post mapToPost(final PostDTO postDTO){
		return new Post(postDTO.getId(), postDTO.getPostName(), postDTO.getAuthor(),
					postDTO.getCreateDate(), postDTO.getUpdateDate());
	}

	public PostDTO mapToPosDTO(final Post post){
		return new PostDTO(post.getId(), post.getPostName(), post.getAuthor(),
						post.getCreateDate(), post.getUpdateDate());
	}

	public List<Post> mapToPostList(final List<PostDTO> postDTOList){
		return postDTOList.stream()
				.map(p -> new Post(p.getId(), p.getPostName(), p.getAuthor(), p.getCreateDate(), p.getUpdateDate()))
				.collect(Collectors.toList());
	}

	public List<PostDTO> mapToPostListDTO(final List<Post> postList) {
		return postList.stream()
				.map(p -> new PostDTO(p.getId(), p.getPostName(), p.getAuthor(), p.getCreateDate(), p.getUpdateDate()))
				.collect(Collectors.toList());
	}
}
