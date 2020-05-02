package com.devstale.pattern.exception;

/**
 * Exception for errors in git commands.
 * 
 * @author DEVS_tale
 *
 */
public class GitException extends Exception {

	private static final long serialVersionUID = -3836114440915586316L;

	public GitException(String message) {
		super(message);
	}


}
