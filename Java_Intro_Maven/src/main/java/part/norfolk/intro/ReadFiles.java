package part.norfolk.intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * An example that demonstrates how to read from a file.
 * @author: jahic
 */

public class ReadFiles
{

	public static void main(String[] args)
	{
		String fileName = "test.txt";
		
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
					System.out.println(line);
			}   
			buffreader.close();
		}
		
		// If reading from a file fails, catch and handle the error.
		catch(IOException e)
		{
			System.out.println("Error : "+e.getMessage());  
		}
	}   
}
