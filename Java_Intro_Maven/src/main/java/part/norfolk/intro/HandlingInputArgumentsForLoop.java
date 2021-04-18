package part.norfolk.intro;

/**
 * Handling input arguments of a program.
 * For loop.
 * @author jahic
 *
 */

public class HandlingInputArgumentsForLoop {
	public static void main(String[] args)
	{
		int numberOfInputs = args.length;
		
		for(int i =numberOfInputs; i>0; i--) 
			System.out.println("args["+(i-1)+"] = "+args[i-1]);
	}
}
