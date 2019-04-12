package com.obsydian.web.locksite.forum.dto;

import com.obsydian.web.locksite.forum.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@Getter
public class PostDTO {

	private int id;
	private String postName;
	private User author;
	private Date createDate;
	private Date updateDate;

	public PostDTO(int id, String postName, User author, Date createDate, Date updateDate) {
		this.id = this.id;
		this.postName = postName;
		this.author = author;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
}
