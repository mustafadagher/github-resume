/**
 * 
 */
package com.github.resume.domain.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mustafa Dagher
 *
 */
public class Resume {

	private String name;
	private String company;
	private String blog;
	private String location;
	private String email;
	private String bio;

	private long reposCount;
	private Map<String, Language> languages = new HashMap<String, Language>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public long getReposCount() {
		return reposCount;
	}

	public void setReposCount(long reposCount) {
		this.reposCount = reposCount;
	}

	public Map<String, Language> getLanguages() {
		return languages;
	}

	public void setLanguages(Map<String, Language> languages) {
		this.languages = languages;
	}

}
