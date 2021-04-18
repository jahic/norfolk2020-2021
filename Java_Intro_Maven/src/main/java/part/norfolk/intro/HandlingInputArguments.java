package part.norfolk.intro;

/**
 * Handling input arguments of a program.
 * Brute force approach.
 * @author jahic
 *
 */

public class HandlingInputArguments {
	public static void main(String[] args)
	{
		int numberOfInputs = args.length;
		
		if(numberOfInputs==0)
			System.out.println("No input arguments.");
		else 		{
			if(numberOfInputs>0)
				System.out.println("args["+(numberOfInputs-1)+"] = "+args[numberOfInputs-1]);
			
			numberOfInputs--;
			
			if(numberOfInputs>0)
				System.out.println("args["+(numberOfInputs-1)+"] = "+args[numberOfInputs-1]);
			
			numberOfInputs--;
			
			if(numberOfInputs>0)
				System.out.println("args["+(numberOfInputs-1)+"] = "+args[numberOfInputs-1]);
			
			numberOfInputs--;
		}
	}
}
