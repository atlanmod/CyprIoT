package org.atlanmod.cypriot.generator.exceptions;

import org.apache.log4j.Logger;

public class ModeExceptionHandler implements ExceptionHandler {
	
	static final Logger log = Logger.getLogger(ModeExceptionHandler.class.getName());

	public void handle(Exception e, String errorMessage) {
		log.debug("A exception  has been thrown");
		throw new RuntimeException(errorMessage);
	}
}
