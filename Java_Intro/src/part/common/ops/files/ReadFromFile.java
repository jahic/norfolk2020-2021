package part.common.ops.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;

/**
 * Class to be used for reading files.
 * @author jahic
 *
 */

public class ReadFromFile extends FileOperation
{	
	// ---------------------------------------------------------------------- //
	// Constructors
	// ---------------------------------------------------------------------- //
	public ReadFromFile(String folder, String file)
	{
		super(folder, file);
	}
	
	public ReadFromFile(String file)
	{
		super(file);
	}
	
	public ReadFromFile()
	{
		super();
	}
	// ---------------------------------------------------------------------- //
	
	// Read already set file name.
	public LinkedList<String> readFile() throws IOException 
	{
		return readFile(0, -1);
	}
	
	// Read a certain number of lines from a file.
	// For -1, read all.
	public LinkedList<String> readFile(long startFromLine, int numberOfLines) throws IOException 
	{		
		if((numberOfLines<-1) || (numberOfLines==0))	
			return null;
		
		FileReader fileReader = new FileReader(this.getTextFolderName()+"/"+this.getTextFileName());

		BufferedReader bufferedReader = new BufferedReader(fileReader);
		LinkedList<String> lines = new LinkedList<String>();
		String line = null;
		
		long readLineCounter = 0;
		
		while ((line = bufferedReader.readLine()) != null)
		{
			// If it is required to start reading from a particular line.
			if(readLineCounter<startFromLine)
			{
				readLineCounter++;
				continue;
			}
			
			lines.add(line);
			numberOfLines--;
				
			if(numberOfLines==0)	
				break;
			
			// Handle the first read with this condition.
			if(startFromLine!=0)
				readLineCounter++;
		}
		bufferedReader.close();

		return lines;
	}

	// Static method, read file to a vector of strings, where each string represents a line in the vector.
	public static LinkedList<String> readFile(String path, Charset encoding) throws IOException 
	{
	  FileReader fileReader = new FileReader(path);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      LinkedList<String> lines = new LinkedList<String>();
      String line = null;
      while ((line = bufferedReader.readLine()) != null)
      {
          lines.add(line);
      }
      bufferedReader.close();

      return lines;
	}
	 
	 // Return the number of lines in a file
	 public long getNumberOfLines() throws IOException
	 {
		long lineCounter = 0;
		
		String delimiter;
		if(this.getTextFolderName().length()>0)
			delimiter = "/";
		else
			delimiter = "";
		FileReader fileReader = new FileReader(this.getTextFolderName()+delimiter+this.getTextFileName());
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while ((bufferedReader.readLine()) != null)
		{
			lineCounter++;
		}
		bufferedReader.close();

		return lineCounter;
	 }
}
