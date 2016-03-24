/**
 * 
 */
package com.github.resume.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.github.resume.dao.ResumeDAO;
import com.github.resume.domain.entity.GithubRepository;
import com.github.resume.domain.entity.GithubUser;
import com.github.resume.exception.UserNotFoundException;

/**
 * @author Mustafa Dagher
 *
 */
@Repository
public class GithubApiClientDAOImpl implements ResumeDAO {
	private RestTemplate restTemplate;

	@Override
	public GithubRepository[] getRepos(String url, String username) {

		String reposURL = url.concat(username).concat("/repos");
		return getRepos(reposURL);
	}

	private GithubRepository[] getRepos(String reposURL) {

		GithubRepository[] repos = null;
		try {
			repos = getRestTemplate().getForObject(reposURL,
					GithubRepository[].class);
		} catch (HttpClientErrorException hce) {
			throw new UserNotFoundException(hce.getMessage());
		}

		return repos;
	}

	@Override
	public GithubUser getUser(String url, String username) {
		GithubUser user = null;

		String userURL = url.concat(username);
		try {
			user = getRestTemplate().getForObject(userURL, GithubUser.class);
			
			if (user != null && !user.getReposUrl().isEmpty()) {
				user.setRepos(getRepos(user.getReposUrl()));
			}
			
		} catch (HttpClientErrorException hce) {
			throw new UserNotFoundException(hce.getMessage());
		}

		return user;
	}

	private RestTemplate getRestTemplate() {
		if (restTemplate == null) {
			restTemplate = new RestTemplate();
		}
		return restTemplate;
	}
}
