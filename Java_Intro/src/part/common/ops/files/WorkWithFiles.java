package part.common.ops.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 * Method that reads a file and returns a vector of strings.
 * Method that receives a vector of strings and writes it to a file.
 * @author jahic
 *
 */

public class WorkWithFiles {

	public Vector<String> readFile(String fileName)
	{
		Vector<String> fileLines = new Vector<String>();
		
		// Try to read from a file.
		try{
			FileReader reader = new FileReader(fileName);
			BufferedReader buffreader = new BufferedReader(reader);
			
			while(true)
			{
				String line = buffreader.readLine();
				if(line==null)
					break;
				else
					fileLines.add(line);
			}   
			buffreader.close();
		}
		
		// If reading from a file fails, catch and handle the error.
		catch(IOException e)
		{
			System.out.println("Error : "+e.getMessage());  
		}
		
		return fileLines;
	}

	public void writeToFile(String fileName, Vector<String> myVectorOfStrings)
	{		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// true - append content to the end of a file.
			// false - create new file.
			fw = new FileWriter(fileName, false);
			bw = new BufferedWriter(fw);
			
			// Write content to a buffer
			for (String line:myVectorOfStrings)
			{
				bw.write(line);
				bw.newLine();
			}
		} 
		catch (IOException e) 
		{
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
		
	}

}
