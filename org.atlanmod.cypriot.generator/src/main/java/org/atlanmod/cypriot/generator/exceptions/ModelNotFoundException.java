package org.atlanmod.cypriot.generator.exceptions;

public class ModelNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -149403869612327933L;

	public ModelNotFoundException(String s) {
		super("The model can't be loaded");
	}
}
