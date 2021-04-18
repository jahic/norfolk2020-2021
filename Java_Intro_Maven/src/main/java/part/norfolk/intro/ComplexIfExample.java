package part.norfolk.intro;

/**
 * Nested if-else example.
 * 
 * @author jahic
 *
 */

public class ComplexIfExample {

	public static void main(String[] args) {
		int a = 10;
		
		if((a<0) || (a==0))
		{
			if(a==0)
				System.out.println("Zero!!!");
			else
				System.out.println("The number is negative.");
		}
		else
			System.out.println("The number is positive.");
	}

}
