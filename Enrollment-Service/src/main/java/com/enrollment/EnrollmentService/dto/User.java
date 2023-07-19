package com.enrollment.EnrollmentService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private Long id;

	public Long getId() {
		return id;
	}

	public User() {
		super();
	}

	public User(Long id) {
		super();
		this.id = id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
