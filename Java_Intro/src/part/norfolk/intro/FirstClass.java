package part.norfolk.intro;

/**
 * Demonstrates the use of a method from a different class.
 * @author jahic
 *
 */

public class FirstClass
{
	public static void main(String[] args)
	{
		// Declaration, instantiation, and initialisation: 
		SecondClass printingClass = new SecondClass();
		
		// Calling methods from the object:
		printingClass.pleasePrintThis("Some text");
		printingClass.pleasePrintThis(3.14);
	}
}
