package part.swing.animation;

/**
 * Uses a timer to change colour of the button.
 * @author jahic
 *
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;



public class ChangeColourSimpleTest
{
	public static void main(String[] args)
	{
		// Create a new thread to handle the GUI.
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showTheButton();
            }
        });    	
	}
	
	private static void showTheButton()
	{
		// Create a frame.
        JFrame applicationWindowFrame = new JFrame("Reactive button app");
        applicationWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crate a button.
        JButton button=new JButton("Start");

        // Add the label to the frame.
        applicationWindowFrame.getContentPane().add(button);

        //Display the window.
        applicationWindowFrame.pack();
        applicationWindowFrame.setVisible(true);
        
        // Create a timer
        Timer timer = new Timer(1000, new ExternalActionListener(button));
        
        // If you want, you can create an additional external listener to start the timer.
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	timer.start();
            }
         });
	}
}
