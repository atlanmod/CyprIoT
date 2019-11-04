package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

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
class MyThread extends Thread { 
	Logger log;
	Bind bind;
	CyprIoTModel cypriotModel;
	String parentPah;
	boolean isEnforcing;
	File outputDirectory;
	String TRANSFORMATION_DIRECTORY = "./transformations/";
	List<Resource> allThingMLResources;
	boolean isBridge;
	boolean isCompiling;
	boolean isTrigger;
	  public MyThread (Logger log, Bind bind, CyprIoTModel cypriotModel,String parentPah,
		boolean isEnforcing,
		File outputDirectory,
		String TRANSFORMATION_DIRECTORY,
		List<Resource> allThingMLResources,
		boolean isBridge,
		boolean isCompiling,
		boolean isTrigger) { 
	    this.log=log;
	    this.bind=bind;
	    this.cypriotModel=cypriotModel;
	    this.parentPah=parentPah;
	    this.isEnforcing=isEnforcing;
	    this.outputDirectory=outputDirectory;
	    this.TRANSFORMATION_DIRECTORY=TRANSFORMATION_DIRECTORY;
	    this.allThingMLResources=allThingMLResources;
	    this.isBridge=isBridge;
	    this.isCompiling=isCompiling;
	    this.isTrigger=isTrigger;
	  }

	  public void run() { 
		  InstanceThing instance = bind.getBindsInstanceThing();
			final String instanceName = instance.getName();
			String targetPlatform = instance.getTypeThing().getTargetedPlatform().getLiteral().toLowerCase();
			TypeThing thing = instance.getTypeThing().getThingToInstantiate();
			if (!(targetPlatform.equals("nodered") || thing.getImportPath().isEmpty())) {
				String thingPath = parentPah + File.separator + thing.getImportPath();
				File thingMLFile = new File(thingPath);

				log.info("Transforming thing : " + instanceName + "...");
				log.debug("Thing File Path : " + thingMLFile.getAbsolutePath());

				String outputFile = outputDirectory.getPath()+ File.separator + "transformed_" + instanceName + ".thingml";
				Resource resThingML = getResourceFromThingMLFile(thingMLFile, instanceName);
				Resource resCyprIoT = getResourceFromCyprIoTFile(cypriotModel);
				
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
					final String args = "-s " + outputFile + " -o " + outputGenDirectory + " -c " + targetPlatform+";";
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

		private Resource getResourceFromCyprIoTFile(CyprIoTModel cypriotModel) {
			Resource res = Helpers.getResourceFromModel(cypriotModel);
			return res;
		}

		private void registerMetamodelInEnvironment(String inputMetamodelNsURI, ExecEnv env, ResourceSet rs, String name) {
			Metamodel cypriotMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			cypriotMetamodel.setResource(rs.getResource(URI.createURI(inputMetamodelNsURI), true));
			env.registerMetaModel(name, cypriotMetamodel);
		}
	}
public class M2MHelper {
	static final Logger log = LogManager.getLogger(M2MHelper.class.getName());
	public final static String TRANSFORMATION_DIRECTORY = "./transformations/";
	
	public List<Resource> transform(CyprIoTModel cyprIoTmodel,File outputDirectory,boolean isEnforcing, boolean isTrigger, boolean isBridge, boolean isCompiling,ExecutorService executorService,String parentPah) {
		String networkName = cyprIoTmodel.getSpecifyNetworks().get(0).getName();
		
		List<Resource> allThingMLResources = new ArrayList<Resource>();
		if(outputDirectory.exists()) {
			log.info("Deleting old : "+networkName+"...");
			try {
				FileUtils.deleteDirectory(outputDirectory);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		outputDirectory.mkdirs();
		List<Bind> allBinds = cyprIoTmodel.getSpecifyNetworks().get(0).getHasBinds();
		log.info("Transforming things according to the network : "+networkName+"...");
		
		for (Bind bind : allBinds) {
			MyThread temp= new MyThread(log, bind, cyprIoTmodel,parentPah, isEnforcing, outputDirectory, TRANSFORMATION_DIRECTORY, allThingMLResources, isBridge, isCompiling, isTrigger);
	        //temp.start();
	        executorService.submit(temp);
		}
		return allThingMLResources;
	}

}
