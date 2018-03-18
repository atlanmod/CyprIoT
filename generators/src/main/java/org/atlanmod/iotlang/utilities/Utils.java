package org.atlanmod.iotlang.utilities;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.HashSet;

import org.atlanmod.iotlang.generators.EntryPoint.PuSubType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.thingML.ThingMLModel;

import lang.IotlangStandaloneSetup;
import lang.iotlang.Bind;
import lang.iotlang.InstanceThing;
import lang.iotlang.IoTLangModel;
import lang.iotlang.NetworkConfiguration;
import lang.iotlang.Thing;
import lang.iotlang.Topic;

public class Utils {
	public static int accessConverter(String direction) {
		switch (direction) {
		case "=>":
			return 2;
		case "<=>":
			return 2;
		case "<=":
			return 1;
		case "=":
			return 1;
		default:
			return 0;
		}
	}

	public static String accessConverterTxt(String direction) {
		switch (direction) {
		case "=>":
			return "write";
		case "<=>":
			return "readwrite";
		case "<=":
			return "read";
		case "=":
			return "";
		default:
			return "";
		}
	}

	public static String sha256(String base) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(base.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}

			return hexString.toString();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static String sign(NetworkConfiguration config, InstanceThing thing) {
		String signature = sha256(config.getDomain().get(0).getName() + thing.getName().toString());
		return String.valueOf((signature.hashCode() & 0xfffffff));
	}

	public static void registerThingMLFactory() {
		ThingMLStandaloneSetup.doSetup();
	}

	public static boolean checkEMFErrorsAndWarnings(Resource model, Logger log) {
		log.info("Checking for EMF errors and warnings");
		boolean isOK = true;
		if (model.getErrors().size() > 0) {
			isOK = false;
			log.error("ERROR: The input model contains " + model.getErrors().size() + " errors.");
			for (Resource.Diagnostic d : model.getErrors()) {
				String location = d.getLocation();
				if (location == null) {
					location = model.getURI().toFileString();
				}
				log.error("Error in file  " + location + " (" + d.getLine() + ", " + d.getColumn() + "): "
						+ d.getMessage());
			}
		} else {
			log.info("No error was found !");
		}

		if (model.getWarnings().size() > 0) {
			log.warning("WARNING: The input model contains " + model.getWarnings().size() + " warnings.");
			for (Resource.Diagnostic d : model.getWarnings()) {
				String location = d.getLocation();
				if (location == null) {
					location = model.getURI().toFileString();
				}
				log.warning("Warning in file  " + location + " (" + d.getLine() + ", " + d.getColumn() + "): "
						+ d.getMessage());
			}
		}
		return isOK;
	}

	public static ThingMLModel loadModel(String str) {
		Utils.registerThingMLFactory();
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createURI("dummy:/example.thingml"));
		InputStream in = new ByteArrayInputStream(str.getBytes());
		try {
			resource.load(in, rs.getLoadOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resource.getErrors();
		}
		ThingMLModel model = (ThingMLModel) resource.getContents().get(0);
		return model;
	}

	public static void registerFactory() {
		IotlangStandaloneSetup.doSetup();
	}

	public static String readFile(String path) {
		byte[] encoded;
		try {
			encoded = Files.readAllBytes(Paths.get(path));
			return new String(encoded, StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static String readFromFile(InstanceThing th) {
		String read = th.getTypeThing().getCode().get(0).replace("\"", "");
		String code = "";
		code = readFile("/home/imad/dev/workspaces/iotlang/generators/sample/" + read);
		return code;
	}
	
	public static HashSet<Topic> getTopicsForThing(IoTLangModel iotModel,Thing thing, PuSubType puSubType) {
		HashSet<Topic> hs = new HashSet<>();
		EList<Bind> binds = iotModel.getNetworkConfigs().get(0).getBinds();
		for (Bind bind : binds) {
			if(puSubType == puSubType.PUB && bind.getThingInstance().getTypeThing().getName().equals(thing.getName()) && bind.getDirection().contains(">")) {
				for (Topic topic : bind.getTopics()) {
					hs.add(topic);
				}
			} else if(puSubType == puSubType.SUB && bind.getThingInstance().getTypeThing().getName().equals(thing.getName()) && bind.getDirection().contains("<")) {
				for (Topic topic : bind.getTopics()) {
					hs.add(topic);
				}
			}
		}

		return hs;
	}	
	
	public static ThingMLModel getModelFromRelativeURI(String uri) throws Exception {
		ResourceSet rs = new ResourceSetImpl();
        URI xmiuri = URI.createFileURI(uri);
        Resource model = rs.createResource(xmiuri);
		if (model!= null && model.getContents().size() > 0 && model.getContents().get(0) instanceof ThingMLModel ) {
			return (ThingMLModel)model.getContents().get(0);
		} else {
			throw new Exception("No valid model found for resource "+uri);
		}
	}
	public static IoTLangModel getIoTModelFromFile(Path path,String fileName) {
		File input = null;
		input = new File(fileName);
		//System.out.println(readFile(input.getAbsolutePath()));
		Utils.registerFactory();
		ResourceSet rs = new ResourceSetImpl();
        URI xmiuri = URI.createFileURI(input.getAbsolutePath());
        Resource model = rs.createResource(xmiuri);
        try {
			model.load(null);
	        EcoreUtil.resolveAll(model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        for (Resource r : model.getResourceSet().getResources()) {
            Utils.checkEMFErrorsAndWarnings(r, Logger.SYSTEM);
        }
        
        IoTLangModel iotModel = (IoTLangModel) model.getContents().get(0);
        return iotModel;
        
	}
}
