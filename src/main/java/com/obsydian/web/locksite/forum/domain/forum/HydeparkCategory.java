package com.obsydian.web.locksite.domain.forum;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

public class HydeparkForum extends Forum {

	public HydeparkForum(int id, String categoryName, List<Post> postsList) {
		super(id, categoryName, postsList);
	}
}
