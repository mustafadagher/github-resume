/**
 * 
 */
package com.github.resume.dao;

import com.github.resume.domain.entity.GithubRepository;
import com.github.resume.domain.entity.GithubUser;

/**
 * @author Mustafa Dagher
 *
 */
public interface ResumeDAO {

	public GithubRepository[] getRepos(String url, String username);

	public GithubUser getUser(String url, String username);

}
