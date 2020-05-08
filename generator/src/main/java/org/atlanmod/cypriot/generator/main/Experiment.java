package org.atlanmod.cypriot.generator.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.atlanmod.cypriot.cyprIoT.CyprIoTModel;
import org.atlanmod.cypriot.cyutil.Helpers;
import org.atlanmod.cypriot.generator.plugins.PluginLoader;

public class Experiment {
	static final Logger log = LogManager.getLogger(Experiment.class.getName());
	
	// Parameters 
	public static int numberOfNodes = 1;
	public static int numberOfPaths = 1;
	public static int numberOfChannels = 1;
	public static int numberOfExecutionTimes = 1; // To experiment improve results
	
	// Plugins
	public static boolean isMosquitto = true;
	public static boolean isRabbit = true;
	public static boolean isDocumentation = true;
	
	// Switches
	public static boolean onlyMaxNodes=true;
	
	public static final String mainDir = "../generator/src/test/resources/Experiment/";
	public static String outDir = mainDir + "experiment1/";
	public static final String CONFIG_FILE = "../generator/config.cfg";
	public static final String sendThingml = mainDir + "s.thingml";
	public static final String receiveThingml = mainDir + "r.thingml";
	static List<Integer> nodesNumber = new ArrayList<Integer>();
	static List<Integer> cypriotCharacters = new ArrayList<Integer>();
	static List<Integer> thingMLAddedCharacters = new ArrayList<Integer>();
	static List<Integer> thingMLAddedCharactersMosquitto = new ArrayList<Integer>();
	static List<Integer> thingMLAddedCharactersRabbit = new ArrayList<Integer>();
	static List<String> executionTimes = new ArrayList<String>();
	static int charStart = 97;
	public static void make() {
		
		copyFileToDirectory(sendThingml, outDir);
		copyFileToDirectory(receiveThingml, outDir);
		for (int i = 1; i <= numberOfNodes; i++) {
			if(onlyMaxNodes) {
				i=numberOfNodes;
			}
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
			cypriotFile.append(getMultipleGroupElements(numberOfChannels,numberOfPaths,"(m:BINARY)"));
			cypriotFile.append("network n {\n" + "	domain a.a.a\n");
			for (int j = charStart; j < alphabets; j++) {
				String alphabet = String.valueOf((char) j);
				if(j>122) alphabet = String.valueOf((char) (j-26)).concat(String.valueOf(j-122));
				cypriotFile.append("	instance " + alphabet + ":" + alphabet + " platform POSIX owner  "+ alphabet + "\n");
			}
			cypriotFile.append("	instance a:a protocol MQTT(server=\"mqtt.eclipse.org:1883\")\n");

			for (int j = charStart; j < alphabets; j++) {
				String alphabet = String.valueOf((char) j);
				if(j>122) alphabet = String.valueOf((char) (j-26)).concat(String.valueOf(j-122));
				int alphabetsPath = charStart + numberOfPaths;
				for (int x = charStart; x < alphabetsPath; x++) {
					String alphabetPath = String.valueOf((char) x);
					if(j>122) alphabetPath = String.valueOf((char) (j-26)).concat(String.valueOf(j-122));
					if ((j & 1) == 0) {
						cypriotFile.append("	bind " + alphabet + ".a => a{"+alphabetPath+"}\n");
					} else {
						cypriotFile.append("	bind " + alphabet + ".a <= a{"+alphabetPath+"}\n");
					}
				}
			}

			cypriotFile.append("}");

			new File(outDir).mkdirs();
			String cypriotFilePath = outDir + fileId;
			File cypriotGetFile = new File(cypriotFilePath);
			Helpers.writeStringOnFile(cypriotFilePath, cypriotFile.toString());
			File outputDir = new File(outDir + i);

			long startTime = System.nanoTime();
			//CyprIoTModel cyprIoTmodel = Helpers.loadModelFromFile(cypriotGetFile, CyprIoTModel.class);
			for (int n = 1; n <= numberOfExecutionTimes; n++) {
				M2MHelper transformationHelper = new M2MHelper();
				transformationHelper.transform(cypriotGetFile, outputDir, false, false,false, true);
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
						outputDir.getPath() + File.separator + "externals" + File.separator + "mosquitto.acl")))
								.length();
				thingMLAddedCharactersMosquitto.add(addedCharactersToThingML + getMosquittoACLCount);
				
			}
			if (isRabbit) {
				int getRabbitCount = removeSpace(Helpers.getContentFromFile(new File(
						outputDir.getPath() + File.separator + "externals" + File.separator + "rabbit.acl")))
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
	private static String getMultipleElements(int numberOfPaths,String extra) {
		StringBuilder cypriotFile = new StringBuilder();;
			int alphabetsPath = charStart + numberOfPaths;
			for (int j = charStart; j < alphabetsPath; j++) {
				String alphabetPath = String.valueOf((char) j);
				if(j>122) alphabetPath = String.valueOf((char) (j-26)).concat(String.valueOf(j-122));
				cypriotFile.append("\n	path "+alphabetPath+extra);
		}
		return cypriotFile.toString();
	}
	
	private static String getMultipleGroupElements(int numberOfGroup,int numberInside,String extraInside) {
		StringBuilder cypriotFile = new StringBuilder();;
			int alphabetsPath = charStart + numberOfGroup;
			for (int j = charStart; j < alphabetsPath; j++) {
				String alphabetPath = String.valueOf((char) j);
				cypriotFile.append("channel "+alphabetPath+" {");
				cypriotFile.append(getMultipleElements(numberInside,extraInside));
				cypriotFile.append("\n}\n");
		}
		return cypriotFile.toString();
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
