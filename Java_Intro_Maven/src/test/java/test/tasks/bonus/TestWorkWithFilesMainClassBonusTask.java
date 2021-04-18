package test.tasks.bonus;

import java.util.Vector;

import part.common.ops.files.WorkWithFiles;
import part.tasks.bonus.WorkWithFilesLogicClassBonusTask;

/**
 * Test WorkWithFilesMainClassBonusTask.
 * From part.tasks.bonus
 * @author jahic
 *
 */

public class TestWorkWithFilesMainClassBonusTask {

	public static void main(String[] args) {

		WorkWithFilesLogicClassBonusTask workWithFiles = new WorkWithFilesLogicClassBonusTask();
		
		int lenght = 10;
		workWithFiles.populateVectorWithRandomNumbers(lenght);
		Vector<String> vectorRandomNumbers = workWithFiles.getRandomNumbersVector();
		
		// ----------------------------------------------------------------------------- //
		// Test if the vector is populated with the same number of elements.
		// ----------------------------------------------------------------------------- //
		if(vectorRandomNumbers.size() == lenght)
			System.out.println("Test 1: on populateVectorWithRandomNumbers - SUCCESFULL");
		else
			System.out.println("Test 1: on populateVectorWithRandomNumbers - FAIL");
		// ----------------------------------------------------------------------------- //
		
		
		// ----------------------------------------------------------------------------- //
		// Test if the counting of the number of negatives works properly.
		// ----------------------------------------------------------------------------- //
		int numberOfNegatives = workWithFiles.getNumberOfNegatives(vectorRandomNumbers);
		
		if(numberOfNegatives == workWithFiles.getNegativeNumbersCounter())
			System.out.println("Test 2: on getNumberOfNegatives - SUCCESFULL");
		else
			System.out.println("Test 2: on getNumberOfNegatives - FAIL");
		// ----------------------------------------------------------------------------- //
		
		WorkWithFiles myFilesHandler = new WorkWithFiles();
		String fileName = "testsuite/test/common/ops/files/testWorkWithFilesMainClassBonusTask.txt";
		myFilesHandler.writeToFile(fileName, vectorRandomNumbers);
		
		Vector<String> fileLines = myFilesHandler.readFile(fileName);
		
		// ----------------------------------------------------------------------------- //
		// Test if writing to a file worked properly - are the number of lines the same.
		// ----------------------------------------------------------------------------- //
		if(fileLines.size() == lenght)
			System.out.println("Test 3: on writeToFile - SUCCESFULL");
		else
			System.out.println("Test 3: on writeToFile - FAIL");
		// ----------------------------------------------------------------------------- //
		
		
		// ----------------------------------------------------------------------------- //
		// Test if the counting of negatives from a file worked properly.
		// ----------------------------------------------------------------------------- //
		int numberOfNegativesFromFile = workWithFiles.getNumberOfNegatives(vectorRandomNumbers);
		
		if(numberOfNegativesFromFile == numberOfNegatives)
			System.out.println("Test 4: on getNumberOfNegatives from file - SUCCESFULL");
		else
			System.out.println("Test 4: on getNumberOfNegatives from file - FAIL");
		// ----------------------------------------------------------------------------- //
	}
}
