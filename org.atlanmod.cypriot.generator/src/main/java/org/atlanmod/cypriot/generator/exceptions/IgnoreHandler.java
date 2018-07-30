package org.atlanmod.cypriot.generator.exceptions;

public class IgnoreHandler implements ExceptionHandler {

	public void handle(Exception e, String errorMessage) {
		// Just ignore the exception
	}

}
