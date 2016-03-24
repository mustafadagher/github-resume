package com.github.resume.domain.model;

public class RestError {
	public final String detail;
	public final String message;

	public RestError(Exception ex, String detail) {
		this.message = ex.getLocalizedMessage();
		this.detail = detail;
	}
}
