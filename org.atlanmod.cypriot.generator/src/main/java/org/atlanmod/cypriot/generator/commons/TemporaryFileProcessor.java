package org.atlanmod.cypriot.generator.commons;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TemporaryFileProcessor extends FileProcessor {
	
	private static final Logger log = LogManager.getLogger(TemporaryFileProcessor.class.getName());
	
	/**
	 * Write a given string into a temporary file
	 * 
	 * @param textToWrite
	 * @param fileName
	 * @param fileExtenstion
	 * @return
	 */
	@Override
	public File build() {
		if(!areFileConditionsMet()) {
			Exception e = new Exception();
			exceptionHandler.handle(e, "Unmet conditions, please set file fields");			
		}
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			log.debug("Creating a temporary file(" + fileName + fileExtension + ")");
			file = File.createTempFile(fileName, fileExtension);
			file.deleteOnExit();
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(textToWrite);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();
			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
		log.debug("Absolute Path : " + file.getAbsolutePath());
		return file;
	}
}
