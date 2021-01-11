package part.swing.intro;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Reaction on a button.
 * Action listener as a separate method.
 * @author jahic
 *
 */

public class ReactiveButtonExternalActionListener
{
	public static void main(String[] args)
	{
    	// Create a frame.
        JFrame applicationWindowFrame = new JFrame("Reactive button external action listener");
        applicationWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crate a button.
        JButton button=new JButton("Start");
        
        button.addActionListener(new ExternalActionListener(button));

        // Add the label to the frame.
        applicationWindowFrame.getContentPane().add(button);

        //Display the window.
        applicationWindowFrame.pack();
        applicationWindowFrame.setVisible(true);

	}
}
