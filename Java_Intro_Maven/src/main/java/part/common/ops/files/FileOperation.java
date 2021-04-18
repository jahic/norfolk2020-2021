package part.common.ops.files;

import java.io.File;
import java.net.URISyntaxException;

/**
 * Standard set of operations on files.
 * @author jahic
 *
 */

public class FileOperation
{
	private String textFileName;
	private String textFolderName;
	
	// ---------------------------------------------------------------------- //
	// Constructors
	// ---------------------------------------------------------------------- //
	public FileOperation(String folder, String file)
	{
		textFolderName = folder;
		textFileName = file;
	}
	
	public FileOperation(String file)
	{
		textFolderName="";
		textFileName = file;
	}
	
	public FileOperation()
	{
	}
	// ---------------------------------------------------------------------- //

	public String getTextFileName() {
		return textFileName;
	}

	public String getTextFolderName() {
		return textFolderName;
	}
	
	public double getFileSizeMegaBytes()
	{
		return (getFileSizeBytes()/ (1024 * 1024));
	}
	
	public double getFileSizeKiloBytes() {
		return (getFileSizeBytes()/1024);
	}

	public double getFileSizeBytes() 
	{
		File file=null;
		
		
		if(textFolderName.isEmpty())
		{
			
				//file = new File(this.getClass().getResource(textFileName).toURI());
				file = new File(textFileName);
		}
		else
		{
			file = new File(textFolderName+"\\"+textFileName);
		}
		
		if (!file.exists() || !file.isFile())
		{
			System.out.println("The file "+ file.getAbsolutePath()+" does not exist!!!");
			return -1;
		}
		return file.length();
	}
}
