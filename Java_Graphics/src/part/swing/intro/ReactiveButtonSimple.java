package part.swing.intro;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Action listener and JButton.
 * @author jahic
 *
 */

public class ReactiveButtonSimple
{

	public static void main(String[] args)
	{
    	// Create a frame.
        JFrame applicationWindowFrame = new JFrame("Reactive button app");
        applicationWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crate a button.
        JButton button=new JButton("Start");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(button.getBackground()==Color.YELLOW)
            		button.setBackground(Color.GREEN);
            	else
            		button.setBackground(Color.YELLOW);
            	System.out.println("Hello Norfolk!!!");
            }
         });

        // Add the label to the frame.
        applicationWindowFrame.getContentPane().add(button);

        //Display the window.
        applicationWindowFrame.pack();
        applicationWindowFrame.setVisible(true);
	}
}
