package part.norfolk.intro;

import java.util.Vector;

/**
 * A simple increment function using for loop, conditions within the loop, and expression "continue" to control loop flow.
 * @author jahic
 *
 */

public class ForLoopContinue {
	public static void main(String[] args)
	{
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(1);	vec.add(2); vec.add(3);	vec.add(4);
		
		// Increment all numbers except 3.
		for(int i=0; i<vec.size(); i++)
		{
			if(vec.get(i) == 3)
				continue;
			int oldValue = vec.get(i);
			vec.set(i, (oldValue+1));
		}
		
		for(Integer element:vec)
		{
			System.out.println(element);
		}
	}
}
