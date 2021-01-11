package part.swing.intro;

/**
 * Listener for zooming out.
 * @author jahic
 */

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExternalActionListenerZoomOut extends ExternalActionListener
{

	private JFrame applicationWindowFrame;
	
	public ExternalActionListenerZoomOut(JButton button, JFrame windowFrame) {
		super(button);
		applicationWindowFrame = windowFrame;
	}
	
	@Override
	public void buttonAction(ActionEvent e)
	{
		int newWidth = (int) (applicationWindowFrame.getWidth()*1.2);
		int newHeight = (int) (applicationWindowFrame.getHeight()*1.2);
		
		applicationWindowFrame.setSize(newWidth, newHeight);
	}

}
