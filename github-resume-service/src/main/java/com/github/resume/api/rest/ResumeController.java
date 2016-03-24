/**
 * 
 */
package com.github.resume.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.resume.domain.model.Resume;
import com.github.resume.service.ResumeService;

/**
 * @author Mustafa Dagher
 *
 */
@Controller
@RequestMapping("/resume")
public class ResumeController {

	private final String url = "https://api.github.com/users/";

	@Autowired
	private ResumeService resumeService;

	@RequestMapping("/{username}")
	public @ResponseBody Resume loadResume(
			@PathVariable("username") String username) {
		
		Resume resume = resumeService.getResume(url, username);
		
		return resume;
	}

}
