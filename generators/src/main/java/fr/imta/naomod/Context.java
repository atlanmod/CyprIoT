package fr.imta.naomod;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.thingml.compilers.ThingMLCompiler;

import framework.IoTCompiler;
import lang.iotlang.Configuration;


public class Context {
	
	private File outputDirectory = null;
	private Configuration currentConfiguration;
	protected Map<String, StringBuilder> generatedCode = new HashMap<String, StringBuilder>();
	protected Map<String, File> filesToCopy = new HashMap<String, File>();
	private IoTCompiler compiler;
	public  IoTCompiler getCompiler() {
        return compiler;
    }
	public void setCurrentConfiguration(Configuration currentConfiguration) {
        this.currentConfiguration = currentConfiguration;
    }
	public File openOutputFile(String path) {
        try {
            File file = new File(getOutputDirectory(), path);
            if (!file.getParentFile().exists())
                file.getParentFile().mkdirs();
            return file;
        } catch (Exception ex) {
            System.err.println("Problem while creating output file (" + getOutputDirectory() + "/" + path + ").");
            ex.printStackTrace();
            return null;
        }
    }
	public void writeTextFile(String path, String content) {
        try {
            File file = openOutputFile(path);
            PrintWriter w = new PrintWriter(file);
            w.print(content);
            w.close();
        } catch (Exception ex) {
            System.err.println("Problem while dumping the code");
            ex.printStackTrace();
        }
    }
	
	public void setOutputDirectory(File outDir) {
        outDir.mkdirs();
        if (!outDir.exists())
            throw new Error("ERROR: The output directory does not exist (" + outDir.getAbsolutePath() + ").");
        if (!outDir.isDirectory())
            throw new Error("ERROR: The output directory has to be a directory (" + outDir.getAbsolutePath() + ").");
        if (!outDir.canWrite())
            throw new Error("ERROR: The output directory is not writable (" + outDir.getAbsolutePath() + ").");
        outputDirectory = outDir.getAbsoluteFile();        
    }
	
	public File getOutputDirectory() {
        return outputDirectory;
    }
	public void writeGeneratedCodeToFiles() {
        for (Map.Entry<String, StringBuilder> e : generatedCode.entrySet()) {
            writeTextFile(e.getKey(), e.getValue().toString());
        }
    }
	
	/**
     * Copies files in the filesystem to the output directory
     */
    public void copyFilesToOutput() {
        for (Map.Entry<String, File> e : filesToCopy.entrySet()) {
            File source = e.getValue();
            File destination = openOutputFile(e.getKey());
            if (destination.exists()) {
                System.err.println("[WARNING] The output file to copy to already exists, overwriting. (" + destination.getAbsolutePath() + ").");
            } else if (!source.exists()) {
                System.err.println("[WARNING] The output file to copy from doesn't exists, skipping. (" + source.getAbsolutePath() + ").");
            } else {
                try {
                    FileUtils.copyFile(source, destination);
                } catch (Exception ex) {
                    System.err.println("Problem while copying file");
                    ex.printStackTrace();
                }
                
            }
        }
    }
}
