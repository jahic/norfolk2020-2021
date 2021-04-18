package part.norfolk.intro;

import java.util.Vector;

/**
 * A simple search function using for loop.
 * @author jahic
 *
 */

public class ForLoopBreak {
	public static void main(String[] args)
	{
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(1);	vec.add(2); vec.add(3);	vec.add(4);
		
		// Is number 3 in the vector?
		for(int i=0; i<vec.size(); i++)
		{
			if(vec.get(i) == 3)
			{
				System.out.println("Number found!!!");
				break;
			}
		}
	}
}
