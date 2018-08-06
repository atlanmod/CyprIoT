package org.atlanmod.cypriot.generator.transformer;

import java.io.IOException;

import org.eclipse.m2m.atl.emftvm.standalone.ATLRunner;

public class MainTransformer {
	public MainTransformer() {
		String[] args = null;
		try {
			ATLRunner.main(args);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
