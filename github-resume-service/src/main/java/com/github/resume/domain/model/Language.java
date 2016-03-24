/**
 * 
 */
package com.github.resume.domain.model;

/**
 * @author Mustafa Dagher
 *
 */
public class Language {
	private String name;
	private int popularity = 1;
	private int percent = 0;

	public Language(String name) {
		this.name = name;
	}

	public Language(String name, int percent) {
		this.name = name;
		this.percent = percent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopularity() {
		return popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public int incrementPopularity() {
		this.popularity++;
		return popularity;
	}
}
