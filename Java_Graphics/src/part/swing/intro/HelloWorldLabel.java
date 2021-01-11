package part.swing.intro;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Demonstrates how to create a frame in Java.
 * Adds a label to the frame.
 * @author jahic
 *
 */

public class HelloWorldLabel {    

    public static void main(String[] args)
    {
    	// Create a frame.
        JFrame applicationWindowFrame = new JFrame("My first Java window frame");
        applicationWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crate a label.
        JLabel label1 = new JLabel("Hello Norfolk!");
        
        // Add the label to the frame.
        applicationWindowFrame.getContentPane().add(label1);

        //Display the window.
        applicationWindowFrame.pack();
        applicationWindowFrame.setVisible(true);
    }
}
