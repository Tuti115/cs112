// This class demonstrates how to use an ImageIcon and a JLabel
// to display an image.
 
import java.awt.*;
import java.awt.event.*;                   // Action Listener class
import javax.swing.*;

public class LeilaniImage extends JFrame
{
	private JPanel imagePanel;                // To hold the label
	private JPanel buttonPanel;               // To hold a button
	private JLabel imageLabel;                // Holds an image
	private JButton button;                   // Gets an image
	
	// Constructor
	public LeilaniImage()
	{
		super("Leilani - Heavenly Flower");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// Build the Image and Button panels.
		buildImagePanel();
		buildButtonPanel();
		
		// Add the panels to the content pane
		add(imagePanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	// The buildImagePanel method adds a label to a panel	
	private void buildImagePanel()
	{
		// Create panel to hold label
		imagePanel = new JPanel();
		
		// Create a label
		imageLabel = new JLabel("Click the button to see an " +
		                        "image of my collie.");
		
		// Add the label to the panel
		imagePanel.add(imageLabel);
	}
	
	// The buildButtonPanel method adds a button to a panel
	private void buildButtonPanel()
	{
		// Create a panel to hold the button
		buttonPanel = new JPanel();
		
		// Get SunFlirt image
		ImageIcon sunFlirt = new ImageIcon("SunFlirt.gif");
		
		// Create the button
		button = new JButton("Get Image");
		button.setIcon(sunFlirt);
		
		// Register an action listener with the button
		button.addActionListener(new ButtonListener());
		
		// Add button to the panel
		buttonPanel.add(button);
	}
	
	// Private inner class that handles the event when the user
	// clicks the "Get Image" button.	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Read the image file into an ImageIcon object
			ImageIcon leilani = new ImageIcon("Leilanibulbs2.jpg");
			
			// Display the image in the label
			imageLabel.setIcon(leilani);
			
			// Remove the text from the label
			imageLabel.setText(null);
			
			// Pack the frame again to accommodate the new size
			// of the label.
			   pack();
			setLocationRelativeTo(null);
		}
	}
		
	// The main method creates an instance of the class
	// which causes it to display its window.	
	public static void main(String[] args)
	{
		LeilaniImage lei = new LeilaniImage();
	}
}		
		
