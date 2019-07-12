package org.atlanmod.cypriot.generator;

import org.atlanmod.cypriot.generator.main.App;
import org.junit.Test;

public class UsecasesTests {
	final String rootInput = "-i../org.atlanmod.cypriot.examples/tests/";
	final String rootOutput = "-o../org.atlanmod.cypriot.examples/tests/";
	final String rootGen = "-c../org.atlanmod.cypriot.generator/";
	@Test
	public void testTwoThingsMosquitto() {
		String [] args = new String[3];
	    args[0] = rootInput+"1_TwoThingsMosquitto/input/main.cy";
	    args[1] = rootOutput+"1_TwoThingsMosquitto/output";
	    args[2] = rootGen+"config.cfg";
	    App.main(args);
	}
	
	@Test
	public void testTreeThingsMosquitto() {
		String [] args = new String[3];
	    args[0] = rootInput+"2_TreeThingsMosquitto/input/main.cy";
	    args[1] = rootOutput+"2_TreeThingsMosquitto/output";
	    args[2] = rootGen+"config.cfg";
	    App.main(args);
	}
	
	@Test
	public void testDisablePlugin() {
		String [] args = new String[4];
	    args[0] = rootInput+"3_IgnorePlugins/input/main.cy";
	    args[1] = rootOutput+"3_IgnorePlugins/output";
	    args[2] = rootGen+"config.cfg";
	    args[3] = "-d";
	    App.main(args);
	}
	
}
