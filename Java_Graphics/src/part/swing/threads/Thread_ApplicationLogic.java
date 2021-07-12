package part.swing.threads;

/**
 * Application back end.
 * Check GUI for new messages.
 * @author jahic
 *
 */

public class Thread_ApplicationLogic extends Thread
{	
	private Thread_GUI guiThread;
	
 	private void startGui()
	{
		guiThread = new Thread_GUI();
		guiThread.start();
		guiThread.guiStart();
	}
 	
 	public synchronized ThreadMessageID getMessage() throws InterruptedException
    {
 		return guiThread.getMessage();
    }
 	
 	@Override
    public void run()
    {
 		System.out.println("Thread_ApplicationLogic --- START");
 		
 		startGui();
 		
		// Get messages from GUI and handle them.
		while(true)
		{
			ThreadMessageID messageID=null;
			
			try {
				System.out.println("Thread_ApplicationLogic --- Get message from GUI.");
				messageID = getMessage();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(messageID==ThreadMessageID.APP_EXIT)
			{
				guiThread.exitGUI();
				System.out.println("Thread_ApplicationLogic --- EXIT APP message");
				break;
			}
			// Handle message.
			else if(messageID==ThreadMessageID.APP_RESTART)
			{
				guiThread.exitGUI();
				startGui();
			}			
		}	
 		
		System.out.println("Thread_ApplicationLogic --- EXIT");
		return; // Exit thread.
    }
}