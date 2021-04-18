package test.norfolk.memory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import part.norfolk.memory.StringMutabilityTest;

/**
 * Test how immutable String, and mutable StringBuilder behave.
 * @author jahic
 *
 */

class TestMutableAndImmutableStringClass {

	@Test
	void testImmutableString()
	{
		String stringTest = "String 1";
		String newStringValue = "String 2";
		StringMutabilityTest stringMutabilityTest = new StringMutabilityTest();
		String returnValue = stringMutabilityTest.connectStrings(stringTest, newStringValue);
		
		// Values of the strings of the same variable should be the same
		assertEquals(stringTest, stringTest);
		assertEquals(newStringValue, newStringValue);
		
		// We assume that the return value is the value of the new string
		assertEquals(returnValue, "String 1String 2");
		
		// Since String is immutable object, it is expected that a new copy of it is created.
		assertNotEquals(stringTest, "String 1String 2");
		
		// We assume that the return value is the value of the new string
		assertEquals(returnValue, "String 1String 2");	
		assertNotEquals(stringTest, "String 1String 2");
	}
	
	@Test
	void testMutableStringBuilder()
	{
		StringBuilder stringTest = new StringBuilder("String 1");
		String newStringValue = "String 2";
		StringMutabilityTest stringMutabilityTest = new StringMutabilityTest();
		String returnValue = stringMutabilityTest.connectStrings(stringTest, newStringValue);
		
		// Values of the strings of the same variable should be the same
		assertEquals(stringTest, stringTest);
		assertEquals(newStringValue, newStringValue);
		
		// We assume that the return value is the value of the new string
		assertEquals(returnValue, "String 1String 2");
		
		// Since StringBuilder is mutable, it is expected that it is changed over a reference.
		assertEquals(stringTest.toString(), "String 1String 2");
		
		// We assume that the return value is the value of the new string
		assertEquals(returnValue, "String 1String 2");	
		assertEquals(stringTest.toString(), "String 1String 2");
	}

}
