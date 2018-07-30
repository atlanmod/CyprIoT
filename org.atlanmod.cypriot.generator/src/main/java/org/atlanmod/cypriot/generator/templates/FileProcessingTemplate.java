package org.atlanmod.cypriot.generator.templates;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessingTemplate {
	
	public String process(File file){
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
			if (reader != null) { // Always check if a reference is not null inside a try block
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return content;
    }
}
