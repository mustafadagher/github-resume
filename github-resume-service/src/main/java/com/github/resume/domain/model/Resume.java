/**
 * 
 */
package com.github.resume.domain.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mustafa Dagher
 *
 */
@ApiModel
public class Resume {

	@ApiModelProperty(notes = "The full name of the user")
	private String name;

	private String company;
	private String blog;
	private String location;
	private String email;
	private String bio;

	private long reposCount;

	@ApiModelProperty(notes = "A map for the programming languages user uses in his github repos", dataType = "Map[string,com.github.resume.domain.model.Language]")
	private Map<String, Language> languages;

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
		if (languages == null)
			languages = new HashMap<String, Language>();
		return languages;
	}

	public void setLanguages(Map<String, Language> languages) {
		this.languages = languages;
	}

}
