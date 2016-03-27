/**
 * 
 */
package com.github.resume.api.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.github.resume.domain.model.RestError;
import com.github.resume.domain.model.Resume;
import com.github.resume.exception.GithubApiLimitException;
import com.github.resume.exception.UserNotFoundException;
import com.github.resume.service.ResumeService;

/**
 * @author Mustafa Dagher
 *
 */
@RestController
@RequestMapping("/resumeAPI")
@Api(value = "resumeAPI")
public class ResumeAPI {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private final String url = "https://api.github.com/users/";

	@Autowired
	private ResumeService resumeService;

	@ApiOperation(value = "generates the Resume from the github account with the given username", nickname = "loadResume", notes = "You have to provide a valid github account username", responseContainer = "Map")
	@ApiImplicitParams({ @ApiImplicitParam(name = "username", value = "Github Account User Name", required = true, dataType = "string", paramType = "path", defaultValue = "mustafadagher") })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = Resume.class, responseContainer = "Map"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "API Limit Exception"),
			@ApiResponse(code = 404, message = "User Not Found Exception"),
			@ApiResponse(code = 500, message = "Failure") })
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/{username}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Resume loadResume(
			@PathVariable("username") String username) {

		log.debug("ResumeAPI:: loadResume : start");
		log.debug("username: " + username);

		Resume resume = resumeService.getResume(url, username);

		log.debug("ResumeAPI:: loadResume : end");
		return resume;
	}

	@CrossOrigin(origins = "*")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(UserNotFoundException.class)
	public @ResponseBody RestError handleUserNotFoundException(
			UserNotFoundException ex, WebRequest request,
			HttpServletResponse response) {
		log.info("UserNotFoundException handler:" + ex.getMessage());

		return new RestError(ex, "No user found for the given username!");
	}

	@CrossOrigin(origins = "*")
	@ResponseStatus(HttpStatus.FORBIDDEN)
	@ExceptionHandler(GithubApiLimitException.class)
	public @ResponseBody RestError handleGithubApiLimitException(
			GithubApiLimitException ex, WebRequest request,
			HttpServletResponse response) {
		log.info("GithubApiLimitException handler:" + ex.getMessage());

		return new RestError(ex, "API Limit Exception");
	}

}
