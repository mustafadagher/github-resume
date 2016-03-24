package com.github.resume.domain.entity;

/**
 * @author Mustafa Dagher
 *
 */
public class GithubError {

	private String message;
	private String documentationUrl;

	public GithubError(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDocumentationUrl() {
		return documentationUrl;
	}

	public void setDocumentationUrl(String documentationUrl) {
		this.documentationUrl = documentationUrl;
	}

}
