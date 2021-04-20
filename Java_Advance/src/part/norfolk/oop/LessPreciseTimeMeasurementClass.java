package part.norfolk.oop;

/**
 * Time measurement, but not so precise.
 * Demonstrates overriding.
 * @author jahic
 *
 */

public class LessPreciseTimeMeasurementClass extends TimeMeasurementClass
{

	public LessPreciseTimeMeasurementClass(int h, int m, int s) {
		super(h, m, s, 0, 0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Double getSeconds()
	{
		System.out.println("LessPreciseTimeMeasurementClass::getSeconds");
		double secondsInTotal = 60*60*hour + 60 * minutes + seconds;
		return secondsInTotal;
	}

}
