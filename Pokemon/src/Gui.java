

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Gui extends JFrame
{

    /* FINAL VALUES */
    public static final int WINDOW_HEIGHT = 300;
    public static final int WINDOW_WIDTH = 400;

    /* Declarations */

    //panels
    private JPanel start_panel = new JPanel();
    private JPanel game_panel = new JPanel();
    private JPanel battle_panel= new JPanel();
    private JPanel wild_panel = new JPanel();
    private JPanel player_panel = new JPanel();

    private JPanel decision_panel = new JPanel();

    private JPanel bag_panel = new JPanel();
    private JPanel move_panel = new JPanel();
    private JPanel poke_panel = new JPanel();

    //labels
    private JLabel label;
    private JLabel player_Poke;
    private JLabel wild_Poke;

    private JLabel player_name;
    private JLabel wild_name;
    private JLabel player_health;
    private JLabel wild_health;

    //TextArea


    //Buttons
    private JButton start_button;

    private JButton fight;
    private JButton move1;
    private JButton move2;
    private JButton move3;
    private JButton move4;
    private JButton goBack;

    private JButton pokemon;
    private JButton poke1;
    private JButton poke2;
    private JButton poke3;
    private JButton poke4;
    private JButton poke5;
    private JButton poke6;

    private JButton bag;
    private JButton item1;
    private JButton item2;
    private JButton item3;
    private JButton cancel;
    private JButton run;

    //images
    private BufferedImage sprite;

    /* Initializations */
    private Pokemon wild = Pokemon.generateMewtwo();
    private Player player = Player.initializePlayerRed();
    private Pokemon current = (Pokemon) player.getPokemonList().get(0);

    private Audio audioplayer = new Audio();
    private boolean over = false;
    private Battle battle = new Battle();
    /* Constructor */
    public Gui()
    {
        super("Pokemon Battle");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildStartPanel();
        add(start_panel);


        setVisible(true);

    }

    /* Build Panel Methods */
    public void buildStartPanel()
    {

        label = new JLabel("Pokemon Battle");
        start_button = new JButton("Play");

        start_button.addActionListener(new startGameButton());
        start_panel = new JPanel();

        start_panel.add(label);
        start_panel.add(start_button);

        setPokemonIcons();
    }

    public void startGamePanel()
    {
        //used once to start game
        game_panel = new JPanel(new BorderLayout());

        decision_panel = buildDecisionPanel();
        player_panel = decision_panel;
        battle_panel = buildBattlePanel();

        game_panel.add(player_panel, BorderLayout.PAGE_END);
        game_panel.add(battle_panel, BorderLayout.CENTER);

    }

    public void buildGamePanel(JPanel panel)
    {
        game_panel = new JPanel(new BorderLayout());

        player_panel = panel;
        battle_panel = buildBattlePanel();

        game_panel.add(player_panel, BorderLayout.PAGE_END);
        game_panel.add(battle_panel, BorderLayout.CENTER);

    }
    public JPanel buildMovePanel()
    {

        String[] current_moveNames = current.getMoveNames();

        move1 = new JButton(current_moveNames[0]);
        move1.setMargin(new java.awt.Insets(1, 2, 1, 2));
        move2 = new JButton(current_moveNames[1]);
        move2.setMargin(new java.awt.Insets(1, 2, 1, 2));

        move3 = new JButton(current_moveNames[2]);
        move3.setMargin(new java.awt.Insets(1, 2, 1, 2));
        move4 = new JButton(current_moveNames[3]);
        move4.setMargin(new java.awt.Insets(1, 2, 1, 2));

        goBack = new JButton("Back");
        goBack.setMargin(new java.awt.Insets(1, 2, 1, 2));
        goBack.addActionListener(new goBack_button());


        move_panel = new JPanel(new GridLayout(3, 2, 2, 2));
        move_panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        move_panel.add(move1);
        move_panel.add(move2);
        move_panel.add(move3);
        move_panel.add(move4);
        move_panel.add(goBack);

        move_panel.setBackground(Color.BLACK);
        return move_panel;
    }

    public JPanel buildDecisionPanel()
    {
        fight = new JButton("Fight");
        bag = new JButton("Bag");
        pokemon = new JButton("Pokemon");
        run = new JButton("Run");

        fight.addActionListener(new fightButton());
        bag.addActionListener(new bagButton());
        pokemon.addActionListener(new switchPokemonButton());
        run.addActionListener(new runAwayButton());

        decision_panel = new JPanel(new GridLayout(2,2, 2,2));
        decision_panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        decision_panel.add(fight);
        decision_panel.add(bag);
        decision_panel.add(pokemon);
        decision_panel.add(run);

        decision_panel.setBackground(Color.BLACK);
        return decision_panel;
    }

    public JPanel buildBattlePanel()
    {
        battle_panel = new JPanel();
        battle_panel.setLayout(null);

        player_name = new JLabel(current.getName() + " LVL: " + current.getLevel());
        wild_name = new JLabel(wild.getName() + " LVL: " + wild.getLevel());
        player_health = new JLabel("Health: " + current.passCurrentHP());
        wild_health = new JLabel("Health: " + wild.passCurrentHP());

        player_name.setBounds(260, 150, 150, 40);
        player_health.setBounds(260, 174, 150, 20);

        wild_name.setBounds(70, 30, 150,40);
        wild_health.setBounds(70, 55, 150, 20);



        player_name.repaint();
        player_health.repaint();
        wild_name.repaint();
        wild_health.repaint();

        Dimension player = player_Poke.getPreferredSize();
        Dimension wild = wild_Poke.getPreferredSize();

        wild_Poke.setBounds(265, 50, wild.width, wild.height);
        player_Poke.setBounds(70, 140, player.width, player.height);

        battle_panel.add(player_name);
        battle_panel.add(player_health);

        battle_panel.add(wild_name);
        battle_panel.add(wild_health);

        battle_panel.add(player_Poke);
        battle_panel.add(wild_Poke);

        battle_panel.setBackground(Color.GREEN);
        return battle_panel;
    }


    public JPanel buildBagPanel()
    {
        bag_panel = new JPanel();
        bag_panel.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        item1 = new JButton("Item 1");
        item2 = new JButton("Item 2");
        item3 = new JButton("Item 3");
        goBack = new JButton("Back");

        bag_panel.add(item1);
        bag_panel.add(item2);
        bag_panel.add(item3);
        bag_panel.add(goBack);

        goBack.addActionListener(new goBack_button());
        pack();

        return bag_panel;
    }


    /*
    public static JPanel buildEndScreen()
    {
        return
    }
    */

    /* Misc. Methods */
    public void setPlayer_PokeIcon(int poke)
    {
        switch(poke)
        {

            case 0:
                try
                {
                    sprite = ImageIO.read(new File("Pokemon Files/Sprites/pikachu_back.png"));
                    player_Poke = new JLabel(new ImageIcon(sprite));
                    break;
                }
                catch (IOException e)
                {
                    System.out.println("IO EXCEPTION THROWN. EXITING.");
                    System.exit(0);
                }
            case 1:
                try
                {
                    sprite = ImageIO.read(new File("Pokemon Files/Sprites/charizard_back.png"));
                    player_Poke = new JLabel(new ImageIcon(sprite));
                    break;
                }
                catch (IOException e)
                {
                    System.out.println("IO EXCEPTION THROWN. EXITING.");
                    System.exit(0);
                }
            case 2:
                try
                {
                    sprite = ImageIO.read(new File("Pokemon Files/Sprites/blastoise_back.png"));
                    player_Poke = new JLabel(new ImageIcon(sprite));
                    break;
                }
                catch (IOException e)
                {
                    System.out.println("IO EXCEPTION THROWN. EXITING.");
                    System.exit(0);
                }
            case 3:
                try
                {
                    sprite = ImageIO.read(new File("Pokemon Files/Sprites/venusaur_back.png"));
                    player_Poke = new JLabel(new ImageIcon(sprite));
                    break;
                }
                catch (IOException e)
                {
                    System.out.println("IO EXCEPTION THROWN. EXITING.");
                    System.exit(0);
                }
            case 4:
                try
                {
                    sprite = ImageIO.read(new File("Pokemon Files/Sprites/dragonite_back.png"));
                    player_Poke = new JLabel(new ImageIcon(sprite));
                    break;
                }
                catch (IOException e)
                {
                    System.out.println("IO EXCEPTION THROWN. EXITING.");
                    System.exit(0);
                }
            default:
                try
                {
                    sprite = ImageIO.read(new File("Pokemon Files/Sprites/bulbasaur_back.png"));
                    player_Poke = new JLabel(new ImageIcon(sprite));
                    break;
                }
                catch (IOException e)
                {
                    System.out.println("IO EXCEPTION THROWN. EXITING.");
                    System.exit(0);;
                }
        }
    }

    /* Button Inner Classes */

    private class startGameButton implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            startGamePanel();
            setContentPane(game_panel);

            new AudioSwingHelper().execute();

            invalidate();
            validate();
        }
    }

    private class fightButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            buildGamePanel(buildMovePanel());
            setContentPane(game_panel);
            invalidate();
            validate();
        }
    }



    private class move1Button implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {


        }
    }




    private class bagButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            setContentPane(buildBagPanel());
            invalidate();
            validate();

        }
    }

    private class switchPokemonButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

        }
    }

    private class runAwayButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

        }
    }


    private class goBack_button implements  ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            buildGamePanel(buildDecisionPanel());
            setContentPane(game_panel);
            invalidate();
            validate();
        }
    }

    /* SwingWorker inner */
    private class AudioSwingHelper extends SwingWorker<String, String>
    {
        protected String doInBackground()
        {

            Audio.playBattleMusic();

            return null;
        }

        protected void done()
        {
            //placeholder
        }
    }

    /* Other methods */
    public void setPokemonIcons()
    {
        try
        {
            sprite = ImageIO.read(new File("Pokemon Files/Sprites/mewtwo_front.png"));
            wild_Poke= new JLabel(new ImageIcon(sprite));
        }
        catch(IOException e)
        {
            System.out.println("IO EXCEPTION THROWN. EXITING.");
            System.exit(0);
        }

        setPlayer_PokeIcon(0);
    }




}
