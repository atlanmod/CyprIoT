package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

public class TransformationHelper {
	static final Logger log = LogManager.getLogger(TransformationHelper.class.getName());
	public final static String TRANSFORMATION_DIRECTORY = "./transformations/";
	public final static String MODULE_NAME = "RuleComm";

	public List<Resource> transform(File cypriotInputFile) {
		log.info("Transforming things according to the network...");
		CyprIoTModel cyprIoTmodel = Helpers.loadModelFromFile(cypriotInputFile, CyprIoTModel.class);
		List<Resource> allThingMLResources = new ArrayList<Resource>();
		String outputDirectory = cypriotInputFile.getParent() + File.separator + "network-gen" + File.separator;
		new File(outputDirectory).mkdirs();
		for (Bind bind : cyprIoTmodel.getSpecifyNetworks().get(0).getHasBinds()) {
			InstanceThing instance = bind.getBindsInstanceThing();
			String targetPlatform = instance.getTypeThing().getTargetedPlatform().getLiteral().toLowerCase();
			TypeThing thing = instance.getTypeThing().getThingToInstantiate();
			if (!(targetPlatform.equals("nodered") || thing.getImportPath().isEmpty())) {
				String thingPath = cypriotInputFile.getParentFile() + File.separator + thing.getImportPath();
				File thingMLFile = new File(thingPath);

				log.info("Transforming thing : " + thing.getName() + "...");
				log.debug("Thing File Path : " + thingMLFile.getAbsolutePath());

				String outputFile = outputDirectory + "transformed_" + thing.getName() + ".thingml";
				Resource resThingML = getResourceFromThingMLFile(thingMLFile, thing.getName());
				Resource resCyprIoT = getResourceFromCyprIoTFile(cypriotInputFile);
				
				Resource transformedThingMLModel = transformThingMLModel(resCyprIoT, resThingML, "Network2Thing", outputFile);
				transformedThingMLModel = transformThingMLModel(resCyprIoT, transformedThingMLModel, "RuleComm", outputFile);
				
				allThingMLResources.add(transformedThingMLModel);

				String outputGenDirectory = outputDirectory + File.separator + "devices" + File.separator
						+ thing.getName() + File.separator + targetPlatform;
				String args = "-s " + outputFile + " -o " + outputGenDirectory + " -c " + targetPlatform;

				try {
					log.info("Running ThingML generator...");
					Process proc = Runtime.getRuntime().exec("java -jar lib/thingml/thingmlcmd.jar " + args);
					proc.waitFor();
					InputStream in = proc.getInputStream();
					log.debug(NetworkHelper.convertStreamToString(in));
					InputStream err = proc.getErrorStream();
					String errors = NetworkHelper.convertStreamToString(err);
					if (!errors.equals("")) {
						log.error("There was errors in ThingML generation.");
						log.error(errors);
					} else {
						log.info("ThingML generator completed without errors for " + thing.getName() + ".");
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
		log.info("All things transformed.");
		return allThingMLResources;
	}

	private Resource transformThingMLModel(Resource cypriotRes, Resource thingMLRes, String moduleName, String outputFile) {
		
		log.info("Applying ATL transformation module : "+ moduleName);
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

}
