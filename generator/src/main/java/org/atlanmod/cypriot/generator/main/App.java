package org.atlanmod.cypriot.generator.main;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.generator.utilities.AcceleoStandaloneCompiler;
import org.atlanmod.cypriot.generator.utilities.NetworkHelper;
import org.atlanmod.cypriot.generator.utilities.Util;
import org.eclipse.acceleo.parser.compiler.AcceleoCompilerHelper;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "cypriot", mixinStandardHelpOptions = true)
public class App implements Runnable {
	
    public static final String CYPRIOT_FILE ="../examples/0_HelloWorld/hello.cy" ;
    public static final String THINGML_FILE ="../examples/0_HelloWorld/hello.thingml" ;
   
	
	static final Logger log = LogManager.getLogger(App.class.getName());
	@Option(names = { "-i", "--input" }, required = false, paramLabel = "INPUT", description = "The input file for the code generator")
	File cypriotInputFile;

	@Option(names = { "-it", "--inputTh" }, required = false, paramLabel = "INPUT", description = "The input file for the code generator")
	File thingMLInputFile;
	
	@Option(names = { "-o", "--output" }, required = false, paramLabel = "OUTPUT", description = "The output directory")
	File cypriotOutputDirectory;

	@Option(names = { "-c", "--config" }, required = false, paramLabel = "CONFIG", description = "The configuration file")
	File cypriotConfigFile;
	
	@Option(names = { "-d", "--disable-plugins" }, description = "The configuration file")
    boolean disablePlugin;

	public void run() {
		NetworkHelper.showProjectVersioInConsole();
		if(!CYPRIOT_FILE.equals("")) cypriotInputFile=new File(CYPRIOT_FILE);
		if(!THINGML_FILE.equals("")) thingMLInputFile=new File(THINGML_FILE);

		AcceleoStandaloneCompiler acceleoStandaloneCompiler = new AcceleoStandaloneCompiler();
		acceleoStandaloneCompiler.generateAcceleo(cypriotInputFile.getPath(),cypriotInputFile.getParent()+File.separator+"network-gen"+File.separator+"acceleo-gen");
		
		if(cypriotOutputDirectory==null) {
			cypriotOutputDirectory = new File (cypriotInputFile.getParent()+File.separator+"network-gen"+File.separator+"tr_thin.thingml");
			log.debug("Output Directory : "+cypriotOutputDirectory);
		}
			
		log.debug("CyprIoT Input File Path : "+ cypriotInputFile.getPath());
		log.debug("ThingML Input File Path: "+ thingMLInputFile.getPath());
		
		Util help = new Util();
		help.transform(cypriotOutputDirectory.getPath(), cypriotInputFile);
		
//		try {
//			Generate generator = new Generate(URI.createFileURI(cypriotInputFile.getPath()), cypriotOutputDirectory, new ArrayList<String>());
//			generator.doGenerate(new BasicMonitor());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/*
		// Network Model Loading
		CyprIoTModel model = Helpers.loadModelFromFile(cypriotInputFile, CyprIoTModel.class);
		
		// Plugin Loading
		if(!disablePlugin) {
			PluginLoader pluginLoader = new PluginLoader();
			pluginLoader.setConfigFile(cypriotConfigFile);
			pluginLoader.setModel(model);
			pluginLoader.setOutputDirectory(cypriotOutputDirectory);
			pluginLoader.load();
		}
		// Network Generation
		NetworkGenerator networkGenerator = new NetworkGenerator(model, cypriotOutputDirectory);
		networkGenerator.setBinding(new BindingTransformation());
		networkGenerator.setEnfocePolicy(new PolicyEnforcementTransformation());
		networkGenerator.generate();
		*/
	}

	public static void main(String[] args) {
		CommandLine.run(new App(), System.out, args);
	}

}
