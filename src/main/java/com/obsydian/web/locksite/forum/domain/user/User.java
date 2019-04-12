package com.obsydian.web.locksite.forum.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "USERS")
@AllArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "USER_NAMES")
	private String name;

	@Column(name = "REGISTRATION_DATE")
	private Date registrationDate;

}
