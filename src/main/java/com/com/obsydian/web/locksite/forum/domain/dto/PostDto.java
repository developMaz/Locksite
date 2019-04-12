package com.com.obsydian.web.locksite.forum.domain.dto;

import com.com.obsydian.web.locksite.forum.domain.users.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.sql.Date;

@NoArgsConstructor
@Getter
public class PostDto {

	private int id;
	private String postName;
	private User author;
	private Date createDate;
	private Date updateDate;

	public PostDto(String postName, User author, Date createDate, Date updateDate) {
		this.id = id;
		this.postName = postName;
		this.author = author;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
}
