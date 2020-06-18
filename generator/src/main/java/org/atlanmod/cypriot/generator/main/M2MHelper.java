package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.TypeThing;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;

public class M2MHelper {
	static final Logger log = LogManager.getLogger(M2MHelper.class.getName());
	public final static String TRANSFORMATION_DIRECTORY = "./transformations/";
	
	public List<Resource> transform(File cypriotInputFile,File outputDirectory,boolean isEnforcing, boolean isTrigger, boolean isBridge, boolean isCompiling) {
		CyprIoTModel cyprIoTmodel = Helpers.loadModelFromFile(cypriotInputFile, CyprIoTModel.class);
		String networkName = cyprIoTmodel.getSpecifyNetworks().get(0).getName();
		log.info("Transforming things according to the network : "+networkName+"...");
		
		List<Resource> allThingMLResources = new ArrayList<Resource>();
		if(outputDirectory.exists()) {
			try {
				FileUtils.deleteDirectory(outputDirectory);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		outputDirectory.mkdirs();
		for (Bind bind : cyprIoTmodel.getSpecifyNetworks().get(0).getHasBinds()) {
			InstanceThing instance = bind.getBindsInstanceThing();
			String instanceName = instance.getName();
			String targetPlatform = instance.getTypeThing().getTargetedPlatform().getLiteral().toLowerCase();
			TypeThing thing = instance.getTypeThing().getThingToInstantiate();
			if (!(targetPlatform.equals("nodered") || thing.getImportPath().isEmpty())) {
				String thingPath = cypriotInputFile.getParentFile() + File.separator + thing.getImportPath();
				File thingMLFile = new File(thingPath);

				log.info("Transforming thing : " + instanceName + "...");
				log.debug("Thing File Path : " + thingMLFile.getAbsolutePath());

				String outputFile = outputDirectory.getPath()+ File.separator + "transformed_" + instanceName + ".thingml";
				Resource resThingML = getResourceFromThingMLFile(thingMLFile, instanceName);
				Resource resCyprIoT = getResourceFromCyprIoTFile(cypriotInputFile);
				
				Resource transformedThingMLModel = transformThingMLModel(resCyprIoT, resThingML, "Network2Thing", outputFile,instanceName);
				if(isEnforcing) {
					transformedThingMLModel = transformThingMLModel(resCyprIoT, transformedThingMLModel, "RuleComm", outputFile,instanceName);
				}
				if(isTrigger) {
					transformedThingMLModel = transformThingMLModel(resCyprIoT, transformedThingMLModel, "RuleTrigger", outputFile,instanceName);
				}
				if(isBridge) {
					transformedThingMLModel = transformThingMLModel(resCyprIoT, transformedThingMLModel, "NetworkBridge", outputFile,instanceName);
				}
				allThingMLResources.add(transformedThingMLModel);
				if(isCompiling) {
					String outputGenDirectory = outputDirectory.getPath()+ File.separator + "devices" + File.separator
							+ instanceName + File.separator + targetPlatform;
					String args = "-s " + outputFile + " -o " + outputGenDirectory + " -c " + targetPlatform;
								 
					try {
						log.info(" * "+instanceName+" : Running ThingML generator...");
						
						Process proc = Runtime.getRuntime().exec("java -jar lib/thingml/thingmlcmd.jar " + args);
						proc.waitFor();
						InputStream in = proc.getInputStream();
						log.debug(NetworkHelper.convertStreamToString(in));
						InputStream err = proc.getErrorStream();
						String errors = NetworkHelper.convertStreamToString(err);
						if (!errors.equals("")) {
							log.error(" ✘ "+instanceName+ " : There was errors in ThingML generation.");
							log.error(errors);
						} else {
							log.info(" ✔ "+instanceName+" : ThingML generator completed without errors.");
							File codeDir = new File(outputGenDirectory);
							log.info("Removing empty lines..."+codeDir.getAbsolutePath());
							StringBuilder allLocs = new StringBuilder();    
							listFilesForFolder(codeDir,codeDir,allLocs);
						}

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		log.info("All things transformed.");
		return allThingMLResources;
	}

	private Resource transformThingMLModel(Resource cypriotRes, Resource thingMLRes, String moduleName, String outputFile, String instanceName) {
		
		log.info(" * "+instanceName+" : Applying "+moduleName+" transformation module");
		ResourceSet rs = new ResourceSetImpl();
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		log.debug("Output Directory after transformation : " + outputFile);
		// Models
		registerResourceInEnv(env, "TH", thingMLRes);

		registerResourceInEnv(env, "CY", cypriotRes);
		
		registerMetamodelInEnvironment("http://www.thingml.org/xtext/ThingML", env, rs, "ThingML");
		registerMetamodelInEnvironment("http://www.atlanmod.org/CyprIoT", env, rs, "CyprIoT");

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Model outModel = registerOutputModelInEnvironment(outputFile, rs, env, "OUT");
		ModuleResolver mr = new DefaultModuleResolver(TRANSFORMATION_DIRECTORY, rs);
		TimingData td = new TimingData();
		env.loadModule(mr, moduleName);
		td.finishLoading();
		env.run(td);
		td.finish();
		Resource resource = outModel.getResource();
		// Save models
		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resource;
	}

	private Model registerOutputModelInEnvironment(String outputModel, ResourceSet rs, ExecEnv env, String name) {
		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		outModel.setResource(rs.createResource(URI.createFileURI(outputModel)));
		env.registerOutputModel(name, outModel);
		return outModel;
	}

	private Resource getResourceFromThingMLFile(File thingMLInputFile, String thingName) {
		Resource res = Helpers.getResourceFromFile(thingMLInputFile, thingName);
		return res;
	}

	private void registerResourceInEnv(ExecEnv env, String name, Resource res) {
		Model inThingMLModel = EmftvmFactory.eINSTANCE.createModel();
		inThingMLModel.setResource(res);
		env.registerInputModel(name, inThingMLModel);
	}

	private Resource getResourceFromCyprIoTFile(File cypriotInputFile) {
		CyprIoTModel cypriotModel = Helpers.loadModelFromFile(cypriotInputFile, CyprIoTModel.class);
		Resource res = Helpers.getResourceFromModel(cypriotModel);
		return res;
	}

	private void registerMetamodelInEnvironment(String inputMetamodelNsURI, ExecEnv env, ResourceSet rs, String name) {
		Metamodel cypriotMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
		cypriotMetamodel.setResource(rs.getResource(URI.createURI(inputMetamodelNsURI), true));
		env.registerMetaModel(name, cypriotMetamodel);
	}
	
	public void listFilesForFolder(final File folder, final File racine,StringBuilder allLocs) {
		   for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry,racine,allLocs);
	        } else {
	        	 	
	        	if(fileEntry.getName().contains("MQTT")) {
	        		allLocs.append("\n"+Helpers.getContentFromFile(fileEntry));
	        	}
	        }
	    }
	    Helpers.writeStringOnFile(racine.getAbsolutePath()+File.separator+"allLocs.txt", filterString(allLocs.toString()));
	}
	
	private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
	
	private String filterString(String code) {
		  String partialFiltered = code.replaceAll("(/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/)|(//.*)","");
		  return partialFiltered.replaceAll("(?m)^\\s*$[\n\r]{1,}", "").trim();
	}
	
}
