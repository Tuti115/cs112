
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PiglatinGUI extends JFrame
{
    /* FINAL STATIC VALUES */
    public static final int WINDOW_HEIGHT = 400;
    public static final int WINDOW_WIDTH= 400;

    /* Declarations */
    private JPanel panel;
    private JLabel messageLabel;
    private JTextField Latintext;
    private JButton translate_button;

    /* Constructors */
    public PiglatinGUI()
    {
        super("Pig Latin Translator");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);

    }

    public void buildPanel()
    {
        messageLabel = new JLabel("Enter sentence to translate");
        Latintext = new JTextField(15);
        translate_button = new JButton("Translate");

        translate_button.addActionListener(new Translate_Button_Listener());

        panel = new JPanel();

        panel.add(messageLabel);
        panel.add(Latintext);
        panel.add(translate_button);
    }

    private class Translate_Button_Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str = Latintext.getText();

            JOptionPane.showMessageDialog(null, Piglatin.userInput(str));
        }

    }

}
