package part.tasks.bonus;

import java.util.Random;
import java.util.Vector;

/**
 * Method that populates a vector with random numbers.
 * Method that receives the vector and returns the number of negative numbers in the vector. 
 * 
 * @author jahic
 *
 */

public class WorkWithFilesLogicClassBonusTask
{
	private Vector<String> vectorWithRandomNumbers;
	private int negativeNumbersCounter;
	
	// Generate random numbers.
	public void populateVectorWithRandomNumbers(int lenght)
	{
		negativeNumbersCounter = 0;
		
		vectorWithRandomNumbers= new Vector<String>();
		
		// Object for generating random numbers.
		Random random = new Random();
		
		while(lenght>0)
		{
			int newRandomNumber = random.nextInt(30 + 20) - 20;
			lenght--;
			
			// Count negative numbers
			if(newRandomNumber>0)
				negativeNumbersCounter++;
			
			vectorWithRandomNumbers.add(""+newRandomNumber);
		}
	}

	public Vector<String> getRandomNumbersVector()
	{
		return vectorWithRandomNumbers;
	}

	// Count the number of negative numbers.
	public int getNumberOfNegatives(Vector<String> vectorRandomNumbers)
	{
		int negCounter = 0;
		
		for(String s:vectorRandomNumbers)
		{
			int number = Integer.parseInt(s);  
			
			// Count negative numbers
			if(number>0)
				negCounter++;
		}
		
		return negCounter;
	}

	public int getNegativeNumbersCounter() {
		return negativeNumbersCounter;
	}
}
