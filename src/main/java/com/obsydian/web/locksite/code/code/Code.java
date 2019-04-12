package com.obsydian.web.locksite.domain.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

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
