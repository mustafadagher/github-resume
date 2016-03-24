/**
 * 
 */
package com.github.resume.service;

import com.github.resume.domain.model.Resume;

/**
 * @author Mustafa Dagher
 *
 */
public interface ResumeService {

	public Resume getResume(String url, String username);

}
