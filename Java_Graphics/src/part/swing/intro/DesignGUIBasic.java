package part.swing.intro;

/**
 * A set of examples demonstrating some of capabilities of Java Swing.
 * @author jahic
 */

import java.awt.Color;
import java.awt.FlowLayout;
/**
 * Basics of GUI design.
 * @author jahic
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DesignGUIBasic
{
	public static void main(String[] args)
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
        JButton button1=new JButton("Zoom in");
        button1.addActionListener(new ExternalActionListenerZoomIn(button1, applicationWindowFrame));
        // A nice add-on, but not essential:
        button1.setActionCommand(ButtonActions.BUTTON_ACTION_ZOOM_IN.getValue());
        
        JButton button2=new JButton("Zoom out");
        button2.addActionListener(new ExternalActionListenerZoomOut(button2, applicationWindowFrame));
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
