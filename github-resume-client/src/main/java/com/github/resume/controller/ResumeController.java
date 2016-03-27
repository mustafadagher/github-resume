/**
 * 
 */
package com.github.resume.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Mustafa Dagher
 *
 */
@Controller
@RequestMapping("/resume")
public class ResumeController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = { "", "/" }, method = RequestMethod.GET)
	public String githubResumeLanding() {

		log.debug("ResumeController:: landing");
		return "landing";
	}

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public String githubResume(Model model, @PathVariable String username) {
		log.debug("ResumeController:: geting resume for " + username);
		model.addAttribute("username", username);
		return "resume";
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String error(Model model, @RequestParam("code") int code) {

		log.debug("ResumeController:: error");
		String message = "";
		switch (code) {
		case 404:
			message = "User was not found! Please, enter a valid user!";
			break;
		case 403:
			message = "API Limit Reached!";
			break;
		default:
			message = "Technical Error, please contact admin!";
			break;

		}

		model.addAttribute("message", message);
		return "landing";
	}
}
