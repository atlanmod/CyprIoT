package org.atlanmod.cypriot.generator.commons.file;

import java.io.File;

public abstract class FileProcessor {

	String textToWrite = null;
	String fileName = null;
	String fileExtension = null;

	public FileProcessor() {

	}

	abstract public File build();

	/**
	 * @return the textToWrite
	 */
	public String getTextToWrite() {
		return textToWrite;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @return the fileExtenstion
	 */
	public String getFileExtenstion() {
		return fileExtension;
	}

	/**
	 * @param textToWrite the textToWrite to set
	 */
	public void setTextToWrite(String textToWrite) {
		this.textToWrite = textToWrite;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @param fileExtenstion the fileExtenstion to set
	 */
	public void setFileExtenstion(String fileExtenstion) {
		this.fileExtension = fileExtenstion;
	}

	public boolean isFileNameSet() {
		return this.fileName!=null;
	}

	public boolean isExtensionSet() {
		return this.fileExtension!=null;
	}

	public boolean isTextToWriteSet() {
		return this.textToWrite!=null;
	}
	
	public boolean areFileConditionsMet() {
		return (isFileNameSet() | isExtensionSet() | isTextToWriteSet());
	}
}