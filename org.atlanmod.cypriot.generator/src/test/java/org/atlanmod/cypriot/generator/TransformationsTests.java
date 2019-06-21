        package org.atlanmod.cypriot.generator;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import org.junit.Test;

public class TransformationsTests {
	static final Logger log = LogManager.getLogger(App.class.getName());
	public final static String THINGML_METAMODEL = "./transformations/metamodels/ThingML.ecore";
	public final static String CYPRIOT_METAMODEL = "./transformations/metamodels/cypriot/Cypriot.ecore";
	public final static String TRANSFORMATION_DIRECTORY= "./transformations/";
	public final static String MODULE_NAME= "Network2Thing";
	public final static String INPUT_MODEL = "./transformations/models/test.xmi";
	public final static String OUTPUT_MODEL = "./transformations/models/output.xmi";
	
	private String inputMetamodelNsURI;
	private String outputMetamodelNsURI;
	
	private String lazyMetamodelRegistration(String metamodelPath) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		// Enables extended meta-data, weird we have to do this but well...
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		
		Resource r = rs.getResource(URI.createFileURI(metamodelPath), true);
		EObject eObject = r.getContents().get(0);
		// A meta-model might have multiple packages we assume the main package is the
		// first one listed
		if (eObject instanceof EPackage) {
			EPackage p = (EPackage) eObject;
			System.out.println(p.getNsURI());
			EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
			return p.getNsURI();
		}
		return null;
	}
	

	@Test
	public void testBasic() {
		
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		inputMetamodelNsURI = lazyMetamodelRegistration(CYPRIOT_METAMODEL);
		outputMetamodelNsURI = lazyMetamodelRegistration(THINGML_METAMODEL);
		ResourceSet rs = new ResourceSetImpl();
		Metamodel cypriotMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
		cypriotMetamodel.setResource(rs.getResource(URI.createURI(inputMetamodelNsURI), true));
		env.registerMetaModel("CyprIoT", cypriotMetamodel);

		Metamodel thingmlMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
		thingmlMetamodel.setResource(rs.getResource(URI.createURI(outputMetamodelNsURI), true));
		env.registerMetaModel("ThingML", thingmlMetamodel);
		
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Models
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		inModel.setResource(rs.getResource(URI.createURI(INPUT_MODEL, true), true));
		env.registerInputModel("IN", inModel);

		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		outModel.setResource(rs.createResource(URI.createFileURI(OUTPUT_MODEL)));
		env.registerOutputModel("OUT", outModel);

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
		log.debug("Size : " + env.getInputModels().size());
		assertTrue(env.getInputModels().size() != 0);
	}
}
