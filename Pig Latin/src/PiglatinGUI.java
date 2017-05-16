/*
Project: Piglatin
Programmer: Jose A Huerta
Professor: June Porto
Course: CS112 TTHU 1:30-3:20

Objective: Make program that will translate user input into pig latin while using a GUI

Algorithm:

* Make Piglatin Class
* This class will do all the work in regards to actually translating the input
* make User input method that will take a string
* use toLowerCase on String
* make an array from the string by using substring to parse by each " "
* write Method which will take one word and check the index for a vowel at the beginning of the word
* IF the char at the beginning of the word is equal to a vowel, add "way" to the end of the word, return word
* ELSE pass the word to method TranslateWConsonant()
* will have for loop that goes checking each index until it finds a vowel
* one vowel is found, split string into 2, put the 2nd part first, add 1st part then add "ay" to the end of the string
* return changed word
* have for loop feed all words in the array and set each array index to the translated word
* have for loop print out entire array with new translated words
* Make PiglatinGUI class
* make Jpanel panel, Jlabel label, Jtextfield textfield, Jbutton button
* write constructor to create object of the GUI
* write buildpanel method
* in buildpanel method: fill in values for panel, label, textfield, and button
* make action listener for button
* IF button is activated, translate String value in textfield
* RETURN message with translated output
* END OF PROGRAM

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PiglatinGUI extends JFrame
{
    /* FINAL STATIC VALUES */
    public static final int WINDOW_HEIGHT = 700;
    public static final int WINDOW_WIDTH= 700;

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
