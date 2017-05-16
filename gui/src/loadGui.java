import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class loadGui extends JFrame
{
	
	private JPanel panel1 = new JPanel();  
	private JPanel panel2 = new JPanel(); 
	private JPanel panel3 = new JPanel();  
	             // A panel container
	private JLabel messageLabel;          // A message to display
	private JTextArea textStuff;  
	private JTextField textInput;         // To hold user input
	private JButton calcButton;
	private JCheckBox self; 
	private JCheckBox child; 
	private JCheckBox dog;
	private JCheckBox blind;  
	private JRadioButtonMenuItem staz;
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 300;
	double status[] = {.28, .32, .22};
	int stat;
	public loadGui()
	{
		super("Income tax calc");
 
		
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
		buildPanel();
		add(panel1, BorderLayout.WEST);
		add(panel2, BorderLayout.CENTER);
		add(panel3, BorderLayout.EAST);
		setVisible(true);
	}
	//private JLabel
	
		private void buildPanel()
	{
		
	//	BorderLayout.setVgap(10);
		// Create the label, text field, and button components
		messageLabel = new JLabel("Taxable Income");
		textStuff = new JTextArea("");  // Size of field
		calcButton = new JButton("Compute");
		self = new JCheckBox("self");
		child = new JCheckBox("Dependent Child");
		dog = new JCheckBox("Three-legged dog");
		blind = new JCheckBox("Blind Grandmother");
		
		staz = new JRadioButtonMenuItem("thing1");
		staz.add(new JRadioButtonMenuItem("thing2"));
		staz.add(new JRadioButtonMenuItem("thing1"));
		
		
		textInput = textField();
		// Add an action listener to the button
		calcButton.addActionListener(new CalcButtonListener());
		
		// Create a panel to hold the components
	
		panel1.add(staz);
	
		// Add the label, text field, and button to the panel
		panel2.add(new JLabel("Taxable Income"));
		
		panel2.add(textInput);
		panel2.add(calcButton);
		panel2.add(new JLabel("Income Tax"));
		panel2.add(textStuff);
		
		panel3.add(self);
		panel3.add(child);
		panel3.add(dog);
		panel3.add(blind);
		
	
		
		
		
		
		
		
		
	}
	
	private JTextField textField()
	{
		int width = 100;
		int height = 20;
		JTextField textField = new JTextField(1);
		textField.setMinimumSize(new Dimension(width, height));
		textField.setPreferredSize(new Dimension(width, height));
		textField.setMaximumSize(new Dimension(width, height));
		
		
		return(textField);
	}
	
	
		private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			
			
			
			
			String str;               // To hold text entered
			double income;             // To hold miles
			
			
			
			// Get number of kilometers from the user. Input entered 
			// in the text field is a string.
			str = textInput.getText();
			
			// Convert the kilometers to miles
			income = Double.parseDouble(str);
				if(self.isSelected())
			income -= 2000;
				if(child.isSelected())
			income -= 2000;
				if(dog.isSelected())
			income -= 2000;
				if(blind.isSelected())
			income -= 2000;
			
			textStuff.setText("" + income );
			// Display a message dialog showing the miles
			
		}
	 } 
}