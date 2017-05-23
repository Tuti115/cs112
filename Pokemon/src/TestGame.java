import java.util.Random;

/*

Project: Pokemon
Programmer: Jose A Huerta
Professor: June Porto
Course: CS112 TTH 1:30-3:20

Objective: Design a game to emulate the classic pokemon battle from the third generation

Algorithm:

CREATE ALL CLASSES TO HOLD NECESSARY INFO
 * Create Pokemon class to hold individual stats as well as arraylists
    will have:
        * name
        * type
        * type2
        * baseHP
        * currenthp
        * arraylist of moves
        * will be part of a player object
        * speed stat
        * attackstat
        * special_attackstat
        * defense
        * special defensestat
        * will need to hold all these values

 * move class with damage and pp stats to keep track of each move
    each move will have:
        * name
        * type
        * type2
        * pp
        * power
        * modifier
        * etc
 *
 * Player class to hold a team of 6 pokemon and keep track of various arraylists for pokemon, items, and their moves.
    will have:
        * player name
        * arraylist of pokemon
        * arraylist of moves in pokemon
        * arraylist of items in bag

 * Battle class where all the game mechanic methods will be held. Such as attacking and calculating the damage each move
        will cause towards one another

        will have:
            * fighting mechanics
            * dealing with damage
            * facing other pokemon

 * Item class with hold descriptions and values of each item -- currently unavailable.
 *
    will have:
    //not finished
    * Name
    * modifier
    * type of product
    * fair use of aid


 * Audio class that will hold file and playback method to be played in the background of the game
    will have:
    * method to do playback

    GUI class will hold majority of code seen to work with it
        will need:
            * various panel building
            * tons of buttons and labels,etc
            * various methods to hel pin out plan.
            * take in many different types of files and placing them into the portrait above

 * Overall things that need to be done:
 * must take into accout several factors and methods running at same time
 * how damage is calculated and doing the math
 * damage given
 * transitions of  screen
 * etc.
 *
 The point of this project is to make the most similar as possible portion of a game from pokemon. The game will consist
  of several pokemon vs a Mewtwo. Mewtwo is a very strong pokemon and many are pokemon are needed Red steps in with to fight against mewtwo
   will be needing to check health and pp. Will be constant fighting until it will go back in to the fahsbag

 */
public class TestGame
{
    public static void main(String[] args)
    {

        Gui event = new Gui();



    }

}
