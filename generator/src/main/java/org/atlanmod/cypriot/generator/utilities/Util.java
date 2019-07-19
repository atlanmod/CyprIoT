package org.atlanmod.cypriot.generator.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.atlanmod.cypriot.generator.main.App;
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
import org.thingml.xtext.thingML.ThingMLModel;

public class Util {
	static final Logger log = LogManager.getLogger(App.class.getName());
	public final static String THINGML_METAMODEL = "../language/org.atlanmod.cypriot/model/ThingML.ecore";
	public final static String CYPRIOT_METAMODEL = "../language/org.atlanmod.cypriot/model/generated/Cypriot.ecore";
	public final static String TRANSFORMATION_DIRECTORY = "./transformations/";
	public final static String MODULE_NAME = "Network2Thing";
	
	public void transform(String outputFile, File cypriotInputFile ,File thingMLInputFile) {
		
		ResourceSet rs = new ResourceSetImpl();
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();

		// Models
		registerThingMLModelInEnvironment(rs, env, "TH", thingMLInputFile);
		registerCyprIoTModelInEnvironment(rs, env, "CY", cypriotInputFile);
		
		registerMetamodelInEnvironment("http://www.thingml.org/xtext/ThingML", env, rs, "ThingML");
		registerMetamodelInEnvironment("http://www.atlanmod.org/CyprIoT", env, rs, "CyprIoT");

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Model outModel = registerOutputModelInEnvironment(outputFile, rs, env, "OUT");

		ModuleResolver mr = new DefaultModuleResolver(TRANSFORMATION_DIRECTORY, rs);
		TimingData td = new TimingData();
		env.loadModule(mr, MODULE_NAME);
		td.finishLoading();
		env.run(td);
		td.finish();
		// Save models
		try {
			outModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Model registerOutputModelInEnvironment(String outputModel, ResourceSet rs, ExecEnv env, String name) {
		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		outModel.setResource(rs.createResource(URI.createFileURI(outputModel)));
		env.registerOutputModel(name, outModel);
		return outModel;
	}
	
	private void registerThingMLModelInEnvironment(ResourceSet rs, ExecEnv env, String name, File thingMLInputFile) {
		Resource res = getResourceFromThingMLFile(thingMLInputFile);
		registerResourceInEnv(env, name, res);
	}

	private Resource getResourceFromThingMLFile(File thingMLInputFile) {
		ThingMLModel thingmlModel = Helpers.loadModelFromFile(thingMLInputFile, ThingMLModel.class);
		Resource res = Helpers.getResourceFromModel(thingmlModel);
		return res;
	}
	
	private void registerCyprIoTModelInEnvironment(ResourceSet rs, ExecEnv env, String name, File cypriotInputFile) {
		Resource res = getResourceFromCyprIoTFile(cypriotInputFile);
		registerResourceInEnv(env, name, res);
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
