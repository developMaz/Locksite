package com.obsydian.web.locksite.forum.domain.forum;

import java.util.List;

public class LocksiteCategory extends Category {

	public LocksiteCategory(int id, String categoryName, List<Post> postsList) {
		super(id, categoryName, postsList);
	}
}
