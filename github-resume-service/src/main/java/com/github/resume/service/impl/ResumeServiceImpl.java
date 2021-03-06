/**
 * 
 */
package com.github.resume.service.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.resume.dao.ResumeDAO;
import com.github.resume.domain.entity.GithubRepository;
import com.github.resume.domain.entity.GithubUser;
import com.github.resume.domain.model.Language;
import com.github.resume.domain.model.Resume;
import com.github.resume.exception.UserNotFoundException;
import com.github.resume.service.ResumeService;

/**
 * @author Mustafa Dagher
 *
 */
@Service
public class ResumeServiceImpl implements ResumeService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private static final String NOT_FOUND = "Not Found";
	private static final String MESSAGE = "message";

	@Autowired
	private ResumeDAO resumeDAO;

	@Override
	public Resume getResume(String url, String username) {
		log.debug("ResumeServiceImpl:: getResume : start");
		log.debug("User Name: " + username);

		Resume resume = null;

		log.debug("calling resumeDAO.getUser");
		GithubUser user = resumeDAO.getUser(url, username);

		if (user != null) {
			log.debug("successfully obtained the github user info");
			if (user.getAdditionalProperties() != null) {
				Map<String, Object> props = user.getAdditionalProperties();
				if (props.containsKey(MESSAGE)
						&& props.get(MESSAGE).equals(NOT_FOUND)) {
					throw new UserNotFoundException(NOT_FOUND);
				}
			}

			resume = new Resume();
			BeanUtils.copyProperties(user, resume);

			GithubRepository[] repos = user.getRepos();

			log.debug("user has {} repos", repos.length);

			if (repos != null && repos.length > 0) {

				resume.setReposCount(repos.length);
				for (GithubRepository repo : repos) {
					String lang = repo.getLanguage();
					if (resume.getLanguages().containsKey(lang)) {
						Language language = resume.getLanguages().get(lang);
						float popularity = (float) language
								.incrementPopularity();
						float ratio = popularity / resume.getReposCount();
						int percent = Double.valueOf(Math.round(ratio * 100))
								.intValue();
						language.setPercent(percent);

					} else {
						float ratio = 1f / resume.getReposCount();
						int percent = Double.valueOf(Math.round(ratio * 100))
								.intValue();

						Language language = new Language(lang, percent);
						resume.getLanguages().put(lang, language);
					}

				}
			}
		} else {
			log.error("User Not Found");
			throw new UserNotFoundException(NOT_FOUND);
		}

		log.debug("ResumeServiceImpl:: getResume : end");

		return resume;
	}
}
