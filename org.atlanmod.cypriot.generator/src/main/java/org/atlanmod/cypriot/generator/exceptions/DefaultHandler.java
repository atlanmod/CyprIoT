package org.atlanmod.cypriot.generator.exceptions;

public class DefaultHandler implements ExceptionHandler {

	public void handle(Exception e, String errorMessage) {
		throw new RuntimeException(errorMessage, e);
	}

}
