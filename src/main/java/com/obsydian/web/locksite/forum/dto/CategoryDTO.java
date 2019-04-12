package com.obsydian.web.locksite.forum.dto;

import com.obsydian.web.locksite.forum.domain.forum.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDTO {

	private int id;
	private String categoryName;
	private List<Post> postsList = new ArrayList<>();
}
