package org.atlanmod.cypriot.generator.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.atlanmod.cypriot.cyprIoT.NamedElement;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class Helpers {

	/**
	 * Return EObject of a given type contained by a given EObject
	 * 
	 * @param model
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> ArrayList<T> allEObjectContainedIn(EObject supertype, Class<T> type) {

		EList<EObject> allChildrenTypes = supertype.eContents();
		ArrayList<T> instanceThings = new ArrayList<T>();
		for (EObject eObject : allChildrenTypes) {
			if (type.isInstance(eObject)) {
				instanceThings.add((T) eObject);
			}
		}
		return instanceThings;
	}

	/**
	 * Create a Xtext resource from a file
	 * 
	 * @param file
	 * @param log
	 * @return
	 */
	public static Resource createEMFResourceFromFile(File file) {
		URI xmiuri = URI.createFileURI(file.getAbsolutePath());
		ResourceSet rs = new ResourceSetImpl();
		Resource model = rs.createResource(xmiuri);
		return model;
	}

	/**
	 * Check if there are errors and warning inside an EMF resource
	 * 
	 * @param resource
	 * @param log
	 * @return
	 */
	public static boolean checkProblemsInEMFResource(Resource resource) {
		boolean noErrors = checkErrorsInResource(resource);
		checkWarningInResource(resource);
		return noErrors;
	}
	
	/**
	 * Show the version of Cypriot in the console
	 */
	public static void showProjectVersioInConsole() {
		System.out.println("CyprIoT v" + getProjectVersionFromMaven());
	}

	/**
	 * Get the project version as defined in maven pom.xml
	 * 
	 * @return
	 */
	public static String getProjectVersionFromMaven() {
		try {
			return readVersionMavenFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Read a file and returns its content
	 * 
	 * @param file File to read
	 * @return
	 */
	public static String getContentFromFile(File file) {
		String content = null;
		FileReader reader = null;
		try {
			reader = new FileReader(file);
			char[] chars = new char[(int) file.length()];
			reader.read(chars);
			content = new String(chars);
			return content;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return content;
	}
	
	/**
	 * Append EObject names separated by a given separator ("," or ";"..etc)
	 * 
	 * @param list
	 * @param separator
	 * @return
	 */
	public static String appendStrings(EList<? extends EObject> list, String separator) {
		String currentSeparator = "";
		StringBuilder builder = new StringBuilder();
		for (EObject eObject : list) {
			builder.append(currentSeparator);
			if (eObject instanceof NamedElement) {
				String name = ((NamedElement) eObject).getName();
				builder.append(name);

			}
			currentSeparator = separator;
		}
		return builder.toString();
	}

	/**
	 * A method encapsulating the logic to used to read the version in Maven file,
	 * used by {@link #getProjectVersionFromMaven()}
	 * 
	 * @return
	 * @throws IOException
	 * @throws XmlPullParserException
	 * @throws FileNotFoundException
	 */
	private static String readVersionMavenFile() throws IOException, XmlPullParserException, FileNotFoundException {
		MavenXpp3Reader reader = new MavenXpp3Reader();
		Model model;
		model = reader.read(new FileReader("../pom.xml"));
		String projectVersion = model.getVersion();
		return projectVersion;
	}

	/**
	 * Check if there is any error in the model, used by
	 * {@link #checkProblemsInModel()}
	 * 
	 * @param resource
	 * @param log
	 * @return
	 */
	private static boolean checkErrorsInResource(Resource resource) {
		boolean noErrors = true;
		if (resource.getErrors().size() > 0) {
			noErrors = false;
			for (Resource.Diagnostic d : resource.getErrors()) {
				String location = d.getLocation();
				if (location == null) {
					location = resource.getURI().toFileString();
				}
			}
		}
		return noErrors;
	}

	/**
	 * Check if there is any warning in the resource, used by
	 * {@link #checkProblemsInModel()}
	 * 
	 * @param model
	 * @param log
	 */
	private static boolean checkWarningInResource(Resource model) {
		boolean noWarning = true;
		if (model.getWarnings().size() > 0) {
			noWarning = false;
			for (Resource.Diagnostic d : model.getWarnings()) {
				String location = d.getLocation();
				if (location == null) {
					location = model.getURI().toFileString();
				}
			}
		}
		return noWarning;
	}

}
