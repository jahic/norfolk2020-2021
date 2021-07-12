package part.swing.threads;

/**
 * Basics of GUI design.
 * All logic is in threads.
 * Demonstrates communication between threads.
 * @author jahic
 */


public class Thread_Main_MessagePassingBetweenGuiThreads
{
	public static void main(String[] args)
	{
		System.out.println("Thread_Main_MessagePassingBetweenGuiThreads --- START.");
		
		Thread_ApplicationLogic appLogic = new Thread_ApplicationLogic();
		
		appLogic.start();
			
		try 
		{
			// Wait until backend exits.
			appLogic.join();
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread_Main_MessagePassingBetweenGuiThreads --- EXIT.");
	}
}
