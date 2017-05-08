

public class Pizza
{

    /* Initializations */
    private boolean pepperoni = false;
    private boolean sausage = false;
    private boolean mushrooms = false;

    private char size = 'S';

    /* Accessor Methods */
    public boolean isPepperoni()
    {
        return this.pepperoni;
    }
    public boolean isSausage()
    {
        return this.sausage;
    }
    public boolean isMushrooms()
    {
        return this.mushrooms;
    }

    public char getSize()
    {
        return this.size;
    }
    public int getNumToppings()
    {
        int toppings = 0;

        if(isPepperoni())
        {
            toppings++;
        }

        if(isSausage())
        {
            toppings++;
        }

        if(isMushrooms())
        {
            toppings++;
        }

        return toppings;
    }


    /* Mutator Methods */
    public void setPepperoni(boolean pepperoni)
    {
        this.pepperoni = pepperoni;
    }
    public void setSausage(boolean sausage)
    {
        this.sausage = sausage;
    }
    public void setMushrooms(boolean mushrooms)
    {
        this.mushrooms = mushrooms;
    }

    public void setSize(char size)
    {
        this.size = size;
    }

    /* Constructors */

    //default
    public Pizza()
    {
        this.size = 'a';
        this.pepperoni = false;
        this.sausage = false;
        this.mushrooms = false;
    }

    //main
    public Pizza(char size, boolean pepperoni, boolean sausage, boolean mushrooms)
    {
        this.size = size;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
    }

    /* Methods */





}
