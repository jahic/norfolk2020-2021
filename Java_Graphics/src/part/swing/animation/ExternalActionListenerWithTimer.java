package part.swing.animation;

/**
 * Action handler. Starts and stops a timer, for a defined number of miliseconds.
 * The timer is triggering actions in ExternalActionListener.
 * @author jahic
 */

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.Timer;

public class ExternalActionListenerWithTimer extends ExternalActionListener
{
	private Timer timer;
	
	private boolean start = false;
	
	public ExternalActionListenerWithTimer(JButton button, int timeMiliSec)
	{
		super(button);

		timer = new Timer(timeMiliSec, new ExternalActionListener(button));
	}
	
	@Override
	public void buttonAction(ActionEvent e)
	{
		timer.start();
		
		if(!start)
		{
			timer.start();
			start = true;
		}
		else
		{
			timer.stop();
			start = false;	
		}	
	}

}
