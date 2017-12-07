package fr.imta.naomod;

import java.util.HashMap;


public class Registry {
	private HashMap<String, CodeGenerator> codeGenerators = new HashMap<String, CodeGenerator>();
	
	
	public void addGenerator(CodeGenerator c) {
		codeGenerators.put(c.getID(), c);
    }
}
