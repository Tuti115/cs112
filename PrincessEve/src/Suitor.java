/*

Filename: Suitor
Programmer: Jose A Huerta
Professor: June Porto
Course: CS112 TThu 1:30, 3:20

Objective: Make a program that will take in a number of suitors and calculate
    which position will marry the princess using linked lists

Algorithm:
* Make linked list that will hold objects of suitors
* ask user for suitor count
* fill linked list with amount user gave
* loop thru the linked list and remove each 3rd suitor. Continue until one suitor is left
* Print out the suitor's original position at the beginning of the calculation
* END OF PROGRAM.

 */
public class Suitor
{
    /* Declarations */
    private int position;

    /* Accessor Methods */
    public int getPosition()
    {
        return this.position;
    }

    /* Mutator Methods */
    public void setPosition(int p)
    {
        this.position = p;
    }

    /* Constructors */
    public Suitor()
    {
        //default constructor
        this.position = 0;
    }

    public Suitor(int position)
    {
        this.position = position;
    }

    /* Methods */

    public String toString()
    {
        return "Suitor Position: " + getPosition();
    }






}
