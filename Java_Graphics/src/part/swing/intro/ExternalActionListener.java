package part.swing.intro;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * A class for handling button clicks.
 * @author jahic
 *
 */

public class ExternalActionListener  implements ActionListener
{
	// Reference to the button object.
	private JButton buttonObject;
	
	public ExternalActionListener(JButton button)
	{
		buttonObject = button;
	}
	
	public void buttonAction(ActionEvent e)
	{
    	if(buttonObject.getBackground()==Color.YELLOW)
    		buttonObject.setBackground(Color.GREEN);
    	else
    		buttonObject.setBackground(Color.YELLOW);
    	
    	System.out.println("Buton ID = " + e.getID() + " --- " + e.getActionCommand()+ " --- " + e.getWhen());
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		buttonAction(e);
	}
}
