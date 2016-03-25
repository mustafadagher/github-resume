/**
 * 
 */
package com.github.resume.exception;

/**
 * @author Mustafa Dagher
 *
 */
public class GithubApiLimitException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public GithubApiLimitException() {
        super();
    }

    public GithubApiLimitException(String message, Throwable cause) {
        super(message, cause);
    }

    public GithubApiLimitException(String message) {
        super(message);
    }

	public GithubApiLimitException(Throwable cause) {
        super(cause);
    }
}
