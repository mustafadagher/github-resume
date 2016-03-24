/**
 * 
 */
package com.github.resume.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	private RestTemplate restTemplate;

	@Override
	public GithubRepository[] getRepos(String url, String username) {

		String reposURL = url.concat(username).concat("/repos");
		return getRepos(reposURL);
	}

	private GithubRepository[] getRepos(String reposURL) {

		log.debug("GithubApiClientDAOImpl:: getRepos : start");
		log.debug("repos url: " + reposURL);

		GithubRepository[] repos = null;
		try {
			repos = getRestTemplate().getForObject(reposURL,
					GithubRepository[].class);
		} catch (HttpClientErrorException hce) {
			log.error("Failed to get repos", hce);
			throw new UserNotFoundException(hce.getMessage());
		}

		log.debug("GithubApiClientDAOImpl:: getRepos : end");
		return repos;
	}

	@Override
	public GithubUser getUser(String url, String username) {

		log.debug("GithubApiClientDAOImpl:: getUser : start");

		GithubUser user = null;

		String userURL = url.concat(username);
		log.debug("user url: " + userURL);

		try {
			user = getRestTemplate().getForObject(userURL, GithubUser.class);
			log.debug("user info obtained successfully.");
			
			if (user != null && !user.getReposUrl().isEmpty()) {
				log.debug("getting user repos");
				user.setRepos(getRepos(user.getReposUrl()));
			}

		} catch (HttpClientErrorException hce) {
			log.error("failed to get user", hce);
			throw new UserNotFoundException(hce.getMessage());
		}
		
		log.debug("GithubApiClientDAOImpl:: getUser : end");
		return user;
	}

	private RestTemplate getRestTemplate() {
		if (restTemplate == null) {
			restTemplate = new RestTemplate();
		}
		return restTemplate;
	}
}
