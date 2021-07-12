package part.swing.threads;

/**
 * Contains message IDs passed between threads.
 * @author jahic
 *
 */

public enum ThreadMessageID 
{
	APP_RESTART(0), APP_EXIT(1);
	
	private final double threadMessageID;

	ThreadMessageID(int id) {
		threadMessageID = id;
	}

	public double getThreadMessageID() {
		return threadMessageID;
	}
}
