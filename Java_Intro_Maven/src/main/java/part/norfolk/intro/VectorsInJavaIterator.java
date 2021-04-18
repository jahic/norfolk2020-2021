package part.norfolk.intro;

import java.util.Vector;

/**
 * Simple vector in Java with a for loop and an iterator.
 * 
 * @author jahic
 *
 */

public class VectorsInJavaIterator {
	
	public static void main(String[] args)
	{
		// Create a vector of integers.
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(1);	vec.add(2); vec.add(3);	vec.add(4);
		
		// Iterate through the vector.
		for(Integer element:vec)
			System.out.println(element);
	}
}
