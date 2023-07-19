package com.enrollment.EnrollmentService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class EnrollmentRequest {
	private Long userId;
	private Long courseId;

	public EnrollmentRequest() {
		
	}

	public EnrollmentRequest(Long userId, Long courseId) {
		super();
		this.userId = userId;
		this.courseId = courseId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	
}
