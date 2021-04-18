package part.norfolk.memory;

/**
 * Demonstrates an example of passing objects over references.
 * Memory in java.
 * @author jahic
 *
 */

public class ModifyOverReference
{
	static void incrementValues(TestClass testClass)
	{
		testClass.setValue1(testClass.getValue1()+1);
		testClass.setValue2(testClass.getValue2()+1);
	}
	
	public static void main(String[] args)
	{
		TestClass testClass = new TestClass();
		System.out.println("value1="+testClass.getValue1()+"; value2="+testClass.getValue2()+".");
		incrementValues(testClass);
		System.out.println("value1="+testClass.getValue1()+"; value2="+testClass.getValue2()+".");
		// -------------------------------------------------- //
		testClass = new TestClass(2, 5);
		System.out.println("value1="+testClass.getValue1()+"; value2="+testClass.getValue2()+".");
		incrementValues(testClass);
		System.out.println("value1="+testClass.getValue1()+"; value2="+testClass.getValue2()+".");
		// -------------------------------------------------- //
		incrementValues(testClass);
		System.out.println("value1="+testClass.getValue1()+"; value2="+testClass.getValue2()+".");
	}
}
