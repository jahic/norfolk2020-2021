package part.norfolk.intro;

/**
 * Handling input arguments of a program.
 * While loop.
 * @author jahic
 *
 */

public class HandlingInputArgumentsWhileLoop {
	public static void main(String[] args)
	{
		int numberOfInputs = args.length;
		
		while(numberOfInputs>0) 
		{
			System.out.println("args["+(numberOfInputs-1)+"] = "+args[numberOfInputs-1]);
			numberOfInputs--;
		}
	}
}
