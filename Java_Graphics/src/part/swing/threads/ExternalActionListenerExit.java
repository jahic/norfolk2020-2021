package part.swing.threads;

/**
 * Listener for exiting an application.
 * @author jahic
 */

import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class ExternalActionListenerExit extends ExternalActionListener
{
	private Thread_GUI parentThread;
	
	public ExternalActionListenerExit(JButton buttonRestart, Thread_GUI thread_GUI)
	{
		super(buttonRestart);
		parentThread = thread_GUI;
	}

	@Override
	public void buttonAction(ActionEvent e)
	{
		try {
			parentThread.addMessage(ThreadMessageID.APP_EXIT);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
