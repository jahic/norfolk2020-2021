package test.tasks.bonus;

/**
 * Issues with static analysis in Java.
 * @author jahic
 *
 */
public class TestPossibleUninitialisedVariables {

	public static void main(String[] args) {
		int x, a=10;
		
		if (a==10)
			x=123;
		
		// At this point, variable is definitely initisalised, but an IDE might report a bug.
		//System.out.println(x);

	}

}
