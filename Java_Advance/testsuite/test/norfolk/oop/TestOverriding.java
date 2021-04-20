package test.norfolk.oop;

/**
 * Same method signature in both superclass and child class.
 * @author jahic
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import part.norfolk.oop.LessPreciseTimeMeasurementClass;
import part.norfolk.oop.TimeMeasurementClass;

class TestOverriding {

	@Test
	void testOverriding()
	{
		// Hours, minutes, seconds, miliseconds, nanoseconds
		TimeMeasurementClass timeMeasurementClass = new TimeMeasurementClass(0, 2, 10, 500, 0);
		assertEquals(timeMeasurementClass.getSeconds(), 130.5);
		
		// Hours, minutes, seconds
		LessPreciseTimeMeasurementClass lessPreciseTimeMeasurementClass = new LessPreciseTimeMeasurementClass(0, 2, 10);
		assertEquals(lessPreciseTimeMeasurementClass.getSeconds(), 130);
		
		// TimeMeasurementClass is a parent class of LessPreciseTimeMeasurementClass
		// LessPreciseTimeMeasurementClass -> TimeMeasurementClass works (everything that TimeMeasurementClass has, also LessPreciseTimeMeasurementClass has)
		// HOWEVER; TimeMeasurementClass cannot cast to LessPreciseTimeMeasurementClass (everything that LessPreciseTimeMeasurementClass has, TimeMeasurementClass does not necessarily have)
		TimeMeasurementClass timeMeasurementClassTemp1 = timeMeasurementClass;
		TimeMeasurementClass timeMeasurementClassTemp2 = lessPreciseTimeMeasurementClass;
		
		assertEquals(timeMeasurementClassTemp1.getSeconds(), 130.5);
		assertEquals(timeMeasurementClassTemp2.getSeconds(), 130);
	}

}
