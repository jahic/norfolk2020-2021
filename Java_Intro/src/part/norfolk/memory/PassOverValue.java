package part.norfolk.memory;

/**
 * Demonstrate return type.
 * Demonstrate passing over value.
 * @author Baa_a
 *
 */

public class PassOverValue
{

	static int incrementNumber(int number)
	{
		number = number + 1;
		return number;
	}
	
	public static void main(String[] args)
	{
		int a = 10;
		
		int returnValue = incrementNumber(a);
		
		System.out.println("a="+a+"; returnValue = "+returnValue+".");
	}

}
