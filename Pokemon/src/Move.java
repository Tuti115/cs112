

public class Move
{
    /* Declarations */
    private String move_name;
    private String type;
    private int power;

    private boolean isSpecial;
    private double modifier;
    private int pp;

    private int move_number;

    /* Accessor Methods */
    public String getMove_name()
    {
        return this.move_name;
    }
    public String getType()
    {
        return this.type;
    }
    public int getPower()
    {
        return this.power;
    }

    public boolean getIsSpecial()
    {
        return this.isSpecial;
    }
    public double getModifier()
    {
        return this.modifier;
    }
    public int getPp()
    {
        return this.pp;
    }

    public int getMove_number()
    {
        return this.move_number;
    }

    /* Mutator Methods */
    public void setMove_name(String name)
    {
        this.move_name = name;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setPower(int power)
    {
        this.power = power;
    }

    public void setIsSpecial(boolean isSpecial)
    {
        this.isSpecial = isSpecial;
    }
    public void setModifier(double modifier)
    {
        this.modifier = modifier;
    }
    public void setPp(int pp)
    {
        this.pp = pp;
    }

    public void setMove_number(int move_number)
    {
        this.move_number = move_number;
    }

    /* Constructors */
    public Move()
    {
        this.move_name = null;
        this.type = null;
        this.power = 0;

        this.isSpecial = false;
        this.modifier = 0;
        this.pp = 1;

        this.move_number = -1;
    }
    public Move(String move_name, String type, int power,
                boolean isSpecial, double modifier, int pp, int move_number)
    {
        this.move_name = move_name;
        this.type = type;
        this.power = power;

        this.isSpecial = isSpecial;
        this.modifier = modifier;
        this.pp = pp;

        this.move_number = move_number;
    }

    /* Methods */

    public void decrementPP()
    {
        this.pp--;
    }
    public void incrementPP()
    {
        this.pp++;
    }

















}
