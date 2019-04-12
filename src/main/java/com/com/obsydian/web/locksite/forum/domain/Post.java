package com.com.obsydian.web.locksite.forum.domain;

import com.com.obsydian.web.locksite.forum.domain.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity(name = "POSTS")
@Getter
@DynamicUpdate
@AllArgsConstructor
public class Post {

	@Id
	@Column(name = "ID", updatable = false)
	private int id;

	@Column(name = "POST_NAMES")
	private String postName;

	@Column(name = "AUTHORS")
	private User author;

	@Column(name = "CREATE_DATES", updatable = false)
	private Date createDate;

	@Column(name = "UPDATE_DATES")
	private Date updateDate;



}
