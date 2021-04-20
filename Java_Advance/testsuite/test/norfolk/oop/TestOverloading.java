package test.norfolk.oop;

/**
 * Same method, but different parameters, in the same class.
 * @author jahic
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import part.norfolk.oop.TimeMeasurementClass;

class TestOverloading {

	@Test
	void test()
	{
		// Hours, minutes, seconds, miliseconds, nanoseconds
		TimeMeasurementClass timeMeasurementClass = new TimeMeasurementClass(0, 2, 10, 500, 0);
		timeMeasurementClass.setExperimentsFileName("umbrellaCorp.txt");
		assertEquals(timeMeasurementClass.getExperimentsFolderPath(), "");
		assertEquals(timeMeasurementClass.getExperimentsFileName(), "umbrellaCorp.txt");
		
		timeMeasurementClass.setExperimentsFileName("NEST", "umbrellaCorp.txt");
		assertEquals(timeMeasurementClass.getExperimentsFolderPath(), "NEST");
		assertEquals(timeMeasurementClass.getExperimentsFileName(), "NEST/umbrellaCorp.txt");
	}

}
