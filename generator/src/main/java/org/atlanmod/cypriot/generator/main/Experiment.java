package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.atlanmod.cypriot.generator.plugins.PluginLoader;

public class Experiment {
	static final Logger log = LogManager.getLogger(Experiment.class.getName());
	public static int maxNumberOfNodes = 2;
	public static int NumberOfTimes = 1;
	public static boolean isMosquitto = true;
	public static boolean isRabbit = true;
	public static final String mainDir = "../generator/src/test/resources/Experiment/";
	public static String outDir = mainDir + "experiment5/";
	public static final String CONFIG_FILE = "../generator/config.cfg";
	public static final String sendThingml = mainDir + "s.thingml";
	public static final String receiveThingml = mainDir + "r.thingml";
	static List<Integer> nodesNumber = new ArrayList<Integer>();
	static List<Integer> cypriotCharacters = new ArrayList<Integer>();
	static List<Integer> thingMLAddedCharacters = new ArrayList<Integer>();
	static List<Integer> thingMLAddedCharactersMosquitto = new ArrayList<Integer>();
	static List<Integer> thingMLAddedCharactersRabbit = new ArrayList<Integer>();
	static List<String> executionTimes = new ArrayList<String>();

	public static void make() {
		int charStart = 97;
		copyFileToDirectory(sendThingml, outDir);
		copyFileToDirectory(receiveThingml, outDir);
		for (int i = 1; i <= maxNumberOfNodes; i++) {
			log.info("Experiment n° : " + i);
			String fileId = i + ".cy";
			int alphabets = charStart + i;
			
			StringBuilder cypriotFile = new StringBuilder();

			for (int j = charStart; j < alphabets; j++) {
				String alphabet = String.valueOf((char) j);
				if(j>122) alphabet = String.valueOf((char) (j-26)).concat(String.valueOf(j-122));
				if ((j & 1) == 0) {
					cypriotFile.append("thing " + alphabet + " import \"s.thingml\"\n");
				} else {
					cypriotFile.append("thing " + alphabet + " import \"r.thingml\"\n");
				}
				cypriotFile.append("user " + alphabet + "\n");
			}

			cypriotFile.append("channel:pubsub a {\n" + "	topic a(m:JSON)\n" + "}\n"
					+ "network n {\n" + "	domain a.a.a\n");
			for (int j = charStart; j < alphabets; j++) {
				String alphabet = String.valueOf((char) j);
				if(j>122) alphabet = String.valueOf((char) (j-26)).concat(String.valueOf(j-122));
				cypriotFile.append("	instance " + alphabet + ":" + alphabet + " platform POSIX owner  "+ alphabet + "\n");
			}
			cypriotFile.append("	instance a:a protocol MQTT(server=\"mqtt.eclipse.org:1883\")\n");

			for (int j = charStart; j < alphabets; j++) {
				String alphabet = String.valueOf((char) j);
				if(j>122) alphabet = String.valueOf((char) (j-26)).concat(String.valueOf(j-122));
				if ((j & 1) == 0) {
					cypriotFile.append("	bind " + alphabet + ".a => a{a}\n");
				} else {
					cypriotFile.append("	bind " + alphabet + ".a <= a{a}\n");
				}
			}

			cypriotFile.append("}");

			new File(outDir).mkdirs();
			String cypriotFilePath = outDir + fileId;
			File cypriotGetFile = new File(cypriotFilePath);
			Helpers.writeStringOnFile(cypriotFilePath, cypriotFile.toString());
			File outputDir = new File(outDir + i);

			long startTime = System.nanoTime();
			for (int n = 1; n <= NumberOfTimes; n++) {
				TransformationHelper transformationHelper = new TransformationHelper();
				transformationHelper.transform(cypriotGetFile, outputDir, false, false);
			}
			long endTime = System.nanoTime();
			long durationInNano = (endTime - startTime);
			long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);
			double executionTime = (durationInMillis / 1000.0) / 5.0;
			executionTimes.add(String.format("%.2f", executionTime));
			String removedSpace = removeSpace(cypriotFile.toString());
			int addedCharactersToThingML = 0;
			for (int j = charStart; j < alphabets; j++) {
				String alphabet = String.valueOf((char) j);
				if(j>122) alphabet = String.valueOf((char) (j-26)).concat(String.valueOf(j-122));
				if ((j & 1) == 0) {
					int getCountSendFile = removeSpace(Helpers.getContentFromFile(new File(outDir + "s.thingml")))
							.length();
					int getCountOutSendFile = removeSpace(Helpers.getContentFromFile(
							new File(outputDir.getPath() + File.separator + "transformed_" + alphabet + ".thingml")))
									.length();
					addedCharactersToThingML = addedCharactersToThingML + (getCountOutSendFile - getCountSendFile);
				} else {
					int getCountReceiveFile = removeSpace(Helpers.getContentFromFile(new File(outDir + "r.thingml")))
							.length();
					int getCountOutReceiveFile = removeSpace(Helpers.getContentFromFile(
							new File(outputDir.getPath() + File.separator + "transformed_" + alphabet + ".thingml")))
									.length();
					addedCharactersToThingML = addedCharactersToThingML
							+ (getCountOutReceiveFile - getCountReceiveFile);
				}

			}

			CyprIoTModel model = Helpers.loadModelFromFile(cypriotGetFile, CyprIoTModel.class);
			PluginLoader pluginLoader = new PluginLoader();
			pluginLoader.setConfigFile(new File(CONFIG_FILE));
			pluginLoader.setModel(model);
			pluginLoader.setOutputDirectory(outputDir);
			pluginLoader.load();
			if (isMosquitto) {
				int getMosquittoACLCount = removeSpace(Helpers.getContentFromFile(new File(
						outputDir.getPath() + File.separator + "external-gen" + File.separator + "mosquitto.acl")))
								.length();
				thingMLAddedCharactersMosquitto.add(addedCharactersToThingML + getMosquittoACLCount);
				
			}
			if (isRabbit) {
				int getRabbitCount = removeSpace(Helpers.getContentFromFile(new File(
						outputDir.getPath() + File.separator + "external-gen" + File.separator + "rabbit.acl")))
								.length();
				thingMLAddedCharactersRabbit.add(addedCharactersToThingML + getRabbitCount);
			}
			nodesNumber.add(i);
			cypriotCharacters.add(removedSpace.length());
			thingMLAddedCharacters.add(addedCharactersToThingML);

		}
		StringBuilder results = new StringBuilder();

		results.append(listToString(nodesNumber, "nodeNumber"));
		results.append(listToString(cypriotCharacters, "cypriotCharacters"));
		results.append(listToString(thingMLAddedCharacters, "thingMLAddedCharacters"));
		results.append(listToString(thingMLAddedCharactersMosquitto, "thingMLAddedCharactersMosquitto"));
		results.append(listToString(thingMLAddedCharactersRabbit, "thingMLAddedCharactersRabbit"));
		results.append(listToString(executionTimes, "executionTimes"));
		log.info("Results : \n"+results);
		Helpers.writeStringOnFile(outDir + "results.txt", results.toString());
	}

	public static String removeSpace(String str) {
		return str.replaceAll("\\s+", "");
	}

	public static void copyFileToDirectory(String src, String destDir) {
		File fileSrc = new File(src);
		File dirDest = new File(destDir);
		try {
			FileUtils.copyFileToDirectory(fileSrc, dirDest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String listToString(List<?> list, String name) {
		String result = name + "<- c(";
		for (int i = 0; i < list.size(); i++) {
			if (i != 0)
				result += ",";
			result += list.get(i);
		}
		result += ")\n";
		return result;
	}
}
