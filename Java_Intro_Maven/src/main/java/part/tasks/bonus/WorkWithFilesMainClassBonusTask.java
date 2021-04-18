package part.tasks.bonus;

import java.util.Vector;

import part.common.ops.files.WorkWithFiles;

/**
 * Executes methods that:
 * - populate a vector with random numbers.
 * - receive the vector and returns the number of negative numbers in the vector. 
 * 
 * @author jahic
 *
 */

public class WorkWithFilesMainClassBonusTask
{
	public static void main(String[] args)
	{
		WorkWithFilesLogicClassBonusTask workWithFilesLogicClassBonusTask = new WorkWithFilesLogicClassBonusTask();
		
		workWithFilesLogicClassBonusTask.populateVectorWithRandomNumbers(50);
		
		Vector<String> randomNumbers = workWithFilesLogicClassBonusTask.getRandomNumbersVector();
		
		int numberOfNegatives = workWithFilesLogicClassBonusTask.getNumberOfNegatives(randomNumbers);
		
		System.out.println("Number of negatives = "+ numberOfNegatives +".");
		
		WorkWithFiles myFilesHandler = new WorkWithFiles();
		myFilesHandler.writeToFile("output.txt", randomNumbers);
	}


}
