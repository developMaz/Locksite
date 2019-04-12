package com.obsydian.web.locksite.forum.domain.forum;

import java.util.List;

public class HydeparkCategory extends Category {

	public HydeparkCategory(int id, String categoryName, List<Post> postsList) {
		super(id, categoryName, postsList);
	}
}
