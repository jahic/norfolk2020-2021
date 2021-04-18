package part.norfolk.intro;

/**
 * Simple (not-nested) if-else example.
 * 
 * @author jahic
 *
 */

public class SimpleIfExample {

	public static void main(String[] args) {
		int a = 10;
		
		if(a<0)
			System.out.println("The number is negative.");
		else if(a>0)
		{
			System.out.println("a>0 "+(a>0));
			System.out.println("The number is positive.");
		}
		else
			System.out.println("Zero!!!");
	}

}
