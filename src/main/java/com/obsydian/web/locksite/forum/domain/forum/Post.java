package com.obsydian.web.locksite.domain.forum;

import com.obsydian.web.locksite.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "POSTS")
@Getter
@Setter
@DynamicUpdate
@AllArgsConstructor
public class Post {

	@Id
	@Column(name = "ID", updatable = false)
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	@Column(name = "POST_NAMES")
	private String postName;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AUTHOR_ID", updatable = false)
	private User author;

	@Column(name = "CREATE_DATES", updatable = false)
	private Date createDate;

	@Column(name = "UPDATE_DATES")
	private Date updateDate;

	@ManyToOne
	@JoinColumn(name = "FORUM_CATEGORY_ID")
	private Forum forum;


	public Post(int id, String postName, User author, Date createDate, Date updateDate) {
	}
}
