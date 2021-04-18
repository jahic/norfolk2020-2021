package part.norfolk.memory;

/**
 * Simple class that tries to modify String and StringBuilder objects.
 * @author jahic
 *
 */

public class StringMutabilityTest {

	public String connectStrings(String stringTest, String newStringValue)
	{
		stringTest = stringTest+ newStringValue;		
		return stringTest;
	}

	public String connectStrings(StringBuilder stringTest, String newStringValue) {
		stringTest.append(newStringValue);
		
		return stringTest.toString();
	}

}
