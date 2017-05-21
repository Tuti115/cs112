

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

        label = new JLabel("Pokemon Battle");
        playbutton = new JButton("Play");


        panel = new JPanel();

        panel.add(label);
        panel.add(playbutton);
    }

    private class startGameButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //Initializes player and computer opponent
            Player player = Player.initializePlayerRed();
            Pokemon mewtwo= Pokemon.generateMewtwo();

            Battle battle = new Battle();
            battle.wildBattle(player, mewtwo); //starts battle
        }
    }




}
