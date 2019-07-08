package org.atlanmod.cypriot.generator.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.CypriotStandaloneSetup;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.generator.main.App;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;

public class Helpers {
	static final Logger log = LogManager.getLogger(App.class.getName());
	public final static String THINGML_METAMODEL = "./transformations/metamodels/ThingML.ecore";
	public final static String CYPRIOT_METAMODEL = "./transformations/metamodels/cypriot/Cypriot.ecore";
	public final static String TRANSFORMATION_DIRECTORY = "./transformations/";
	public final static String MODULE_NAME = "Network2Thing";
	
	public static String lazyMetamodelRegistration(String metamodelPath) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();

		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		Resource r = rs.getResource(URI.createFileURI(metamodelPath), true);
		EObject eObject = r.getContents().get(0);

		if (eObject instanceof EPackage) {
			EPackage p = (EPackage) eObject;
			System.out.println(p.getNsURI());
			EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
			return p.getNsURI();
		}
		return null;
	}
	
	public static void transform(String inputCyprIoT, String inputThingML, String outputFile) {

		ResourceSet rs = new ResourceSetImpl();
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		
		Helpers.lazyMetamodelRegistration(CYPRIOT_METAMODEL);
		Helpers.lazyMetamodelRegistration(THINGML_METAMODEL);
				
		registerMetamodelInEnvironment("http://www.thingml.org/xtext/ThingML", env, rs, "ThingML");
		registerMetamodelInEnvironment("http://www.atlanmod.org/CyprIoT", env, rs, "CyprIoT");

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		//org.atlanmod.cypriot.cyutil.Helpers.loadModelFromFile(cypriotFile, CyprIoTModel.class);
		
		// Models
		registerInputModelInEnvironment(inputThingML, rs, env, "TH");
		registerInputModelInEnvironment(inputCyprIoT, rs, env, "CY");
		
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

	private static Model registerOutputModelInEnvironment(String OUTPUT_MODEL, ResourceSet rs, ExecEnv env, String name) {
		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		outModel.setResource(rs.createResource(URI.createFileURI(OUTPUT_MODEL)));
		env.registerOutputModel(name, outModel);
		return outModel;
	}
	
	private static void registerInputModelInEnvironment(String inputFilePath, ResourceSet rs, ExecEnv env, String name) {
		Model inThingMLModel = EmftvmFactory.eINSTANCE.createModel();
		inThingMLModel.setResource(rs.getResource(URI.createURI(inputFilePath, true), true));
		env.registerInputModel(name, inThingMLModel);
	}

	private static void registerMetamodelInEnvironment(String inputMetamodelNsURI, ExecEnv env, ResourceSet rs, String name) {
		Metamodel cypriotMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
		cypriotMetamodel.setResource(rs.getResource(URI.createURI(inputMetamodelNsURI), true));
		env.registerMetaModel(name, cypriotMetamodel);
	}
	
}
