package part.norfolk.oop;

/**
 * Class for time and date, with very precise inputs.
 * Demonstrates overloading.
 * @author jahic
 *
 */

public class TimeMeasurementClass
{
	public int hour, minutes, seconds, miliseconds, nanoseconds;
	
	private String experimentsFolderPath;
	private String experimentsFileName;
	
	public TimeMeasurementClass(int h, int m, int s, int ms, int ns)
	{
		hour = h;
		minutes = m;
		seconds = s;
		miliseconds = ms;
		nanoseconds = ns;
	}

	// Get time converted to seconds.
	public Double getSeconds()
	{
		System.out.println("TimeMeasurementClass::getSeconds");
		double secondsInTotal = 60*60*hour + 60 * minutes + seconds + (double)miliseconds/1000 + (double)nanoseconds/100000;
		return secondsInTotal;
	}

	public String getExperimentsFolderPath() {
		return experimentsFolderPath;
	}

	public String getExperimentsFileName() {
		if(experimentsFolderPath.isEmpty())
			return experimentsFileName;
		else
			return experimentsFolderPath+"/"+experimentsFileName;
	}

	public void setExperimentsFileName(String experimentsFileName) {
		this.experimentsFolderPath="";
		this.experimentsFileName = experimentsFileName;
	}
	
	public void setExperimentsFileName(String folderName, String fileName) {
		this.experimentsFolderPath=folderName;
		this.experimentsFileName = fileName;
	}
	
}
