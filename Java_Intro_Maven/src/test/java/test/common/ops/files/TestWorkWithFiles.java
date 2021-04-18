package test.common.ops.files;

import java.util.Vector;
import part.common.ops.files.WorkWithFiles;

/**
 * Tests WorkWithFiles class and its methods.
 * From part.common.ops.files.
 * @author jahic
 *
 */

public class TestWorkWithFiles {

	public static void main(String[] args)
	{
		// Method that reads a file and returns a vector of strings.
		String fileName = "src/test/resources/testWorkWitFiles1.txt";
		WorkWithFiles myFilesHandler = new WorkWithFiles();
		Vector<String> fileLines = myFilesHandler.readFile(fileName);
		
		// ----------------------------------------------------------------------------- //
		// Test if several reads of file will return the same results.
		// ----------------------------------------------------------------------------- //
		Vector<String> fileLines1 = myFilesHandler.readFile(fileName);
		// Feel free to add more reads...
		
		if(areEqual(fileLines, fileLines1))
			System.out.println("Test 1: on readFile - SUCCESFULL");
		else
			System.out.println("Test 1: on readFile - FAIL");
		// You can also hard code it.
		Vector<String> fileLinesHardCoded = new Vector<String>();
		fileLinesHardCoded.add("42 - 3"); fileLinesHardCoded.add("1 4"); fileLinesHardCoded.add("Norfolk");
		if(areEqual(fileLines, fileLinesHardCoded))
			System.out.println("Test 2: on readFile compare with hardcoded values - SUCCESFULL");
		else
			System.out.println("Test 2: on readFile compare with hardcoded values - FAIL");
		// ----------------------------------------------------------------------------- //
		
		fileName = "src/test/resources/temTestFileWorkWitFiles.txt";
		// Method that receives a vector of strings and writes it to a file.
		Vector<String> myVectorOfStrings = new Vector<String>();
		myVectorOfStrings.add("Norfolk"); myVectorOfStrings.add("1 4"); myVectorOfStrings.add("42 - 3");  
		myFilesHandler.writeToFile(fileName, myVectorOfStrings);
		
		// ----------------------------------------------------------------------------- //
		// Test if the data is properly written.
		// ----------------------------------------------------------------------------- //
		fileLines = myFilesHandler.readFile(fileName);
		if(areEqual(fileLines, myVectorOfStrings))
			System.out.println("Test 3: on writeFile - SUCCESFULL");
		else
			System.out.println("Test 3: on writeFile - FAIL");
		
		// Check if the files differ. They should. If they do, it is a successful test.
		if(!areEqual(fileLines, fileLinesHardCoded))
			System.out.println("Test 4: on writeFile - SUCCESFULL");
		else
			System.out.println("Test 4: on writeFile - FAIL");
		// ----------------------------------------------------------------------------- //

	}

	// Compare if two vectors have the same values.
	private static boolean areEqual(Vector<String> fileLines1, Vector<String> fileLines2)
	{
		// Check for nulls
		if((fileLines1 == null) && (fileLines2 == null))
			return true;
		else if(fileLines1 == null)
			return false;
		else if(fileLines2 == null)
			return false;

		//Compare vector size.
		if(fileLines1.size()!=fileLines2.size())
			return false;
		
		// Compare if lines of files are identical.
		for(int i=0; i< fileLines1.size(); i++)
		{
			// Check if the files differ at certain line.
			// Compare over value - not reference!
			if(!fileLines1.get(i).equals(fileLines2.get(i)))
				return false;
		}
		return true;
	}

}
