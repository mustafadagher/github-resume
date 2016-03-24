/**
 * 
 */
package com.github.resume.api.rest;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.github.resume.domain.model.RestError;
import com.github.resume.domain.model.Resume;
import com.github.resume.exception.UserNotFoundException;
import com.github.resume.service.ResumeService;

/**
 * @author Mustafa Dagher
 *
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private final String url = "https://api.github.com/users/";

	@Autowired
	private ResumeService resumeService;

	@RequestMapping("/{username}")
	public @ResponseBody Resume loadResume(
			@PathVariable("username") String username) {

		log.debug("ResumeController:: loadResume : start");
		log.debug("username: " + username);
		
		Resume resume = resumeService.getResume(url, username);
		
		log.debug("ResumeController:: loadResume : end");
		return resume;
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(UserNotFoundException.class)
	public @ResponseBody RestError handleUserNotFoundException(
			UserNotFoundException ex, WebRequest request,
			HttpServletResponse response) {
		log.info("UserNotFoundException handler:" + ex.getMessage());

		return new RestError(ex, "No user found for the given username!");
	}

}
