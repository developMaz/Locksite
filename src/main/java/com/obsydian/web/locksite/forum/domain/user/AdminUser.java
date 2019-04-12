package com.obsydian.web.locksite.domain.user;

import java.sql.Date;

public class AdminUser extends User {
	private String privilage;

	public AdminUser(int id, String name, Date registrationDate) {
		super(id, name, registrationDate);
	}
}
