package org.atlanmod.cypriot.generator.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModelExceptionHandler implements ExceptionHandler {
	
	static final Logger log = LogManager.getLogger(ModelExceptionHandler.class.getName());

	public void handle(Exception e, String errorMessage) {
		log.debug("A exception  has been thrown");
		throw new RuntimeException(errorMessage);
	}
}
