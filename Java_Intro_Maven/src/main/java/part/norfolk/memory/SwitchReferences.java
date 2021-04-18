package part.norfolk.memory;

/**
 * Test local reference variable to memory reference idea.
 * @author jahic
 *
 */

public class SwitchReferences {
	
	static void switchReferences(TestClass o1, TestClass o2)
	{
		TestClass oTemp = o1;
		o1=o2;
		o2=oTemp;
	}

	public static void main(String[] args)
	{
		TestClass obj1 = new TestClass(1,2);
		TestClass obj2 = new TestClass(3,4);
		System.out.println("OBJ1: value1="+obj1.getValue1()+"; value2="+obj1.getValue2()+".");
		System.out.println("OBJ2: value1="+obj2.getValue1()+"; value2="+obj2.getValue2()+".");
		switchReferences(obj1, obj2);
		System.out.println("OBJ1: value1="+obj1.getValue1()+"; value2="+obj1.getValue2()+".");
		System.out.println("OBJ2: value1="+obj2.getValue1()+"; value2="+obj2.getValue2()+".");
		TestClass oTemp = obj1;
		obj1=obj2;
		obj2=oTemp;
		System.out.println("OBJ1: value1="+obj1.getValue1()+"; value2="+obj1.getValue2()+".");
		System.out.println("OBJ2: value1="+obj2.getValue1()+"; value2="+obj2.getValue2()+".");
	}

}
