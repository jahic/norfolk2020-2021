package part.swing.intro;

/**
 * Handles actions on Zoom in button.
 * Extends action listener from ExternalActionListener.
 * @author jahic
 */

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExternalActionListenerZoomIn  extends ExternalActionListener
{
	private JFrame applicationWindowFrame;
	
	public ExternalActionListenerZoomIn(JButton button, JFrame windowFrame)
	{
		super(button);
		applicationWindowFrame = windowFrame;
	}

	// Increase the dimension for 1.2.
	@Override
	public void buttonAction(ActionEvent e)
	{
		int newWidth = (int) (applicationWindowFrame.getWidth()/1.2);
		int newHeight = (int) (applicationWindowFrame.getHeight()/1.2);
		
		applicationWindowFrame.setSize(newWidth, newHeight);
	}
}
