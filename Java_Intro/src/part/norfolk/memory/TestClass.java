package part.norfolk.memory;

/**
 * A test class, with getters and setters, and constructors.
 * @author Baa_a
 *
 */

public class TestClass
{
	private int value1;
	private int value2;
	
	// -------------------------------------------------- //
	// Constructors
	// -------------------------------------------------- //
	public TestClass()
	{
		value1 = 0;
		value2 = 0;
	}
	
	public TestClass(int v1)
	{
		value1 = v1;
		value2 = 0;
	}
	
	public TestClass(int v1, int v2)
	{
		value1 = v1;
		value2 = v2;
	}
	// -------------------------------------------------- //

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}	
}
