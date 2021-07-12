package part.swing.threads;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Application front end.
 * Save messages (clicks) and pass them on demand.
 * @author jahic
 *
 */

public class Thread_GUI extends Thread
{
	private Vector<ThreadMessageID> passedMessages;
	private JFrame applicationWindowFrame;
	// Control variable, should the thread exit.
	private boolean endThread;
	
	public Thread_GUI()
	{
		passedMessages = new Vector<ThreadMessageID>();
		endThread = false;
	}
	
	public void guiStart()
	{
		// Create a frame.
		applicationWindowFrame = new JFrame("GUI design examples");
		applicationWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set main frame dimensions
        applicationWindowFrame.setSize(350, 400);        
        
        // GUI panel
        JPanel appPanel = new JPanel();
        appPanel.setLayout(new FlowLayout());

        appPanel.setBackground(Color.CYAN);
        
        
        JPanel appPanelResExit = new JPanel();
        appPanelResExit.setLayout(new FlowLayout());

        appPanelResExit.setBackground(Color.CYAN);

        // Crate buttons.
        JButton button1=new JButton("Zoom in");
        button1.addActionListener(new ExternalActionListenerZoomIn(button1, applicationWindowFrame));
        // A nice add-on, but not essential:
        button1.setActionCommand(ButtonActions.BUTTON_ACTION_ZOOM_IN.getValue());
        
        JButton button2=new JButton("Zoom out");
        button2.addActionListener(new ExternalActionListenerZoomOut(button2, applicationWindowFrame));
        // A nice add-on, but not essential:
        button2.setActionCommand(ButtonActions.BUTTON_ACTION_ZOOM_OUT.getValue());
        
        // Restart and exit buttons.
        JButton buttonRestart=new JButton("Restart");
        buttonRestart.addActionListener(new ExternalActionListenerRestart(buttonRestart, this));
        
        JButton buttonExit=new JButton("Exit");
        buttonExit.addActionListener(new ExternalActionListenerExit(buttonExit, this));

        // Add elements to the panel
        appPanel.add(button1);
        appPanel.add(button2);
        appPanelResExit.add(buttonRestart);
        appPanelResExit.add(buttonExit);
        
        JPanel framePanel = new JPanel();
        framePanel.setLayout(new FlowLayout());
        framePanel.setBackground(Color.CYAN);
        
        framePanel.add(appPanel);
        framePanel.add(appPanelResExit);
        
        // Add panel to the frame
        applicationWindowFrame.add(framePanel);
        //applicationWindowFrame.add(appPanelResExit);

        //Display the window.
        applicationWindowFrame.setVisible(true);
	}
	
	@Override
    public void run()
    {
		System.out.println("Thread_GUI --- START");
		liveThreadLife();		
		System.out.println("Thread_GUI --- EXIT.");
    }
	
	private synchronized void liveThreadLife()
	{
		// Wait until the backend decides to exit.
		while(endThread!=true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void addMessage(ThreadMessageID threadMessageID) throws InterruptedException
	{
		//System.out.println("addMessage");
		passedMessages.add(threadMessageID);
		notifyAll();
	}

	// Get message by message from GUI.
	// First in first out.
	public synchronized ThreadMessageID getMessage() throws InterruptedException
	{
		System.out.println("Wait for GUI messages.");
		while(passedMessages.isEmpty())
			wait();
		
		//System.out.println("Return a GUI message.");
		ThreadMessageID guiMessage = passedMessages.firstElement();
		// Will not be a null pointer exception, because of the previous check and synchronized.
		passedMessages.remove(0);
		
		return guiMessage;
	}
	
	public synchronized void exitGUI()
	{
		applicationWindowFrame.dispose();
		endThread=true;
		notifyAll();
	}
}
