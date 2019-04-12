package com.com.obsydian.web.locksite.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "CODES")
@Getter
@DynamicUpdate
public class Code {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", updatable = false, nullable = false)
	private int id;

	@Column(name = "ACCESS_CODES",  updatable = false, nullable = false)
	private int accessCode;

	@Column(name = "COMMENTS")
	private String comment;

}
