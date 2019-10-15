package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.atlanmod.cypriot.cyprIoT.Bind;
import org.atlanmod.cypriot.cyprIoT.BindAction;
import org.atlanmod.cypriot.cyprIoT.InstanceThing;
import org.atlanmod.cypriot.cyprIoT.NamedElement;
import org.atlanmod.cypriot.cyprIoT.Network;
import org.atlanmod.cypriot.cyprIoT.Path;
import org.atlanmod.cypriot.cyprIoT.Role;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public final class NetworkHelper {

	public static String extractNotepadHighlights() {
		String syntax  = Helpers.getContentFromFile(new File("../language/org.atlanmod.cypriot/src/org/atlanmod/cypriot/Cypriot.xtext"));	
		Pattern pattern = Pattern.compile("\'(.*?)\'", Pattern.DOTALL);
		Matcher matcher = pattern.matcher(syntax);
		StringBuilder keywords = new StringBuilder();
		while (matcher.find()) {
			if(matcher.group(1).length()>1) {
				keywords.append("\""+matcher.group(1)+"\" ");
			}
		}
		return keywords.toString();
	}
	/**
	 * Return EObject of a given type contained by a given EObject
	 * 
	 * @param networkModel
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<T> allEObjectContainedIn(EObject supertype, Class<T> type) {

		EList<EObject> allChildrenTypes = supertype.eContents();
		ArrayList<T> instanceThings = new ArrayList<T>();
		for (EObject eObject : allChildrenTypes) {
			if (type.isInstance(eObject)) {
				instanceThings.add((T) eObject);
			}
		}
		return instanceThings;
	}
	static String convertStreamToString(InputStream is) {
	    @SuppressWarnings("resource")
		java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
	}
	/**
	 * Show the version of Cypriot in the console
	 */
	public static void showProjectVersioInConsole() {
		System.out.println("CyprIoT v" + getProjectVersionFromMaven().replaceAll("-SNAPSHOT", ""));
	}

	/**
	 * Get the project version as defined in maven pom.xml
	 * 
	 * @return
	 */
	public static String getProjectVersionFromMaven() {
		try {
			MavenXpp3Reader reader = new MavenXpp3Reader();
			Model model;
			model = reader.read(new FileReader("../pom.xml"));
			return model.getVersion();
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
	 * Get the ID name of any EObject
	 * 
	 * @param instance
	 * @return The ID name
	 */
	public static String getIdNameOfEobject(EObject eObject) {
		String name = null;
		if (eObject instanceof NamedElement) {
			name = ((NamedElement) eObject).getName();
		}
		return name;
	}

	/**
	 * Get the assigned roles to the thing corresponding to the instanceThing
	 * 
	 * @param instance
	 * @return The roles assigned to the instanceThing
	 */
	public static EList<Role> getAssignedRolesToThing(InstanceThing instance) {
		return instance.getTypeThing().getThingToInstantiate().getAssignedRoles();
	}

	/**
	 * @param bindPubSubs
	 * @return
	 */
	public static List<Path> getAllTopicsOfType(List<Bind> bindPubSubs, BindAction bindAction) {
		ArrayList<Path> topics = new ArrayList<Path>();
		for (Bind bind : bindPubSubs) {
			if (bind.getBindAction() == bindAction) {
				EList<Path> allTopics = bind.getChannelToBind().getPaths();
				for (Path topic : allTopics) {
					topics.add(topic);
				}
			}
		}

		return topics;
	}

	/**
	 * @param instanceThing
	 * @param bind
	 * @return
	 */
	public static boolean isInstanceThingInBind(InstanceThing instanceThing, Bind bind) {
		return bind.getBindsInstanceThing().equals(instanceThing);
	}

	/**
	 * @param network
	 */
	public static List<InstanceThing> getAllInstanceThingBehaviorInNetwork(Network network) {
		List<InstanceThing> allModelsInNetwork = new ArrayList<InstanceThing>();
		for (InstanceThing instanceThing : allEObjectContainedIn(network, InstanceThing.class)) {
			allModelsInNetwork.add(instanceThing);
		}
		return allModelsInNetwork;
	}

}
