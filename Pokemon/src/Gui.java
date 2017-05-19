

import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame
{

    /* FINAL VALUES */
    public static final int WINDOW_HEIGHT = 400;
    public static final int WINDOW_WIDTH = 400;

    /* Declarations */
    private JPanel panel;
    private JLabel label;
    private JTextField text;
    private JButton playbutton;


    /* Constructor */
    public Gui()
    {
        super("Pokemon Battle");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();
        add(panel);

        setVisible(true);

    }

    /* Methods */
    public void buildPanel()
    {

        label = new JLabel("Pokemon audio player");
        playbutton = new JButton("Play");

        playbutton.addActionListener(new ButtonListener());

        panel = new JPanel();

        panel.add(label);
        panel.add(playbutton);
    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Audio audio = new Audio();

            audio.run();
        }
    }

}
