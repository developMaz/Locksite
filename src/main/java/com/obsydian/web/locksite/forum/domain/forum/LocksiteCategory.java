package com.obsydian.web.locksite.domain.forum;

import java.util.List;

public class LocksiteForum extends Forum {

	public LocksiteForum(int id, String categoryName, List<Post> postsList) {
		super(id, categoryName, postsList);
	}
}
