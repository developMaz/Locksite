package com.obsydian.web.locksite.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CodeDTO {

	private int id;
	private int accessCode;
	private String comment;

	public CodeDTO(int accessCode) {
		this.id = id;
		this.accessCode = accessCode;
		this.comment = comment;
	}

//	public CodeDTO(String comment) {
//		this.comment = comment;
//	}

}
