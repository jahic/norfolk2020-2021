package part.norfolk.intro;

/**
 * Simple example demonstrating arithmetic operations in Java.
 * Uses primitive data types.
 * @author jahic
 *
 */

public class ArithmeticOperations {

	public static void main(String[] args)
	{
		int a=10;
		double b= 3.14;
		
		int c = (a+a)*2;
		double d =  (a-b)/a;
		
		int e = (int) (a/b); // What is stored in this case?
		
		System.out.println("c="+c+"; d="+d+"; e="+e);
	}

}
