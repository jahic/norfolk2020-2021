package part.swing.animation;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A simple GUI set, with two timers and two buttons.
 * @author jahic
 */

import javax.swing.SwingUtilities;

import part.swing.intro.ButtonActions;

public class ChangeColourComplexGUITest
{
	public static void main(String[] args)
	{
		// Create a new thread to handle the GUI.
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	            showTheGUI();
	        }
	    });  
	}
	
	private static void showTheGUI()
	{
    	// Create a frame.
        JFrame applicationWindowFrame = new JFrame("GUI design examples");
        applicationWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set main frame dimensions
        applicationWindowFrame.setSize(350, 400);
        
        // GUI panel
        JPanel appPanel = new JPanel();
        appPanel.setLayout(new FlowLayout());

        appPanel.setBackground(Color.CYAN);
        
        applicationWindowFrame.add(appPanel);

        // Crate buttons.
        JButton button1=new JButton("Fast");
        button1.addActionListener(new ExternalActionListenerWithTimer(button1, 300));
        // A nice add-on, but not essential:
        button1.setActionCommand(ButtonActions.BUTTON_ACTION_ZOOM_IN.getValue());
        
        JButton button2=new JButton("Slow");
        button2.addActionListener(new ExternalActionListenerWithTimer(button2, 3000));
        // A nice add-on, but not essential:
        button2.setActionCommand(ButtonActions.BUTTON_ACTION_ZOOM_OUT.getValue());

        // Add elements to the panel
        appPanel.add(button1);
        appPanel.add(button2);
        
        // Add panel to the frame
        applicationWindowFrame.add(appPanel);

        //Display the window.
        applicationWindowFrame.setVisible(true);
	}
}
