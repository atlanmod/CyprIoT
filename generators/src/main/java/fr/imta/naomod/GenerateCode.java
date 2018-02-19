package fr.imta.naomod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateCode {
	
	public void replaceInFile(String fileName, String before, String after) {
		String oldContent = "";
		File generated = null;
		FileWriter writer = null;
		File outputFile = new File(fileName);
		BufferedWriter generatedBuffer=null;
		BufferedReader reader = null;
                
		try {
			reader = new BufferedReader(new FileReader(outputFile));
			String line = reader.readLine();
			
			while (line != null) 
			{
				oldContent = oldContent + line + System.lineSeparator();
				
				line = reader.readLine();
			}
			String newContent = oldContent.replaceAll(before, after);
			
			writer = new FileWriter(outputFile);
			writer.write(newContent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try 
			{
				//Closing the resources
				
				reader.close();
				
				writer.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
