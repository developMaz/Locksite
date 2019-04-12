package com.obsydian.web.locksite.forum.domain.forum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "FORUM_CATEGORY")
@Getter
@Setter
@DynamicUpdate
@AllArgsConstructor
public class Category {

	@Id
	@Column(name = "ID", updatable = false)
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	@Column(name = "CATEGORY_NAME")
	private String categoryName;

	@OneToMany(targetEntity = Post.class, mappedBy = "forum", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Post> postsList = new ArrayList<>();
}
