


public class Item
{
    /* Declarations */
    private String name;
    private String item_type;
    private double modifier;

    /* Accessor Methods */
    public String getName()
    {
        return this.name;
    }
    public String getItem_type()
    {
        return this.item_type;
    }
    public double getModifier()
    {
        return this.modifier;
    }

    /* Mutator Methods */
    public void setName(String name)
    {
        this.name = name;
    }
    public void setItem_type(String d)
    {
        this.item_type = d;
    }
    public void setModifier(double m)
    {
        this.modifier = m;
    }

    /* Constructors */
    public Item()
    {
        //default
        this.name = null;
        this.item_type = null;
        this.modifier = 0.0;
    }
    public Item(String name, String item_type, double modifier)
    {
        //main constructor
        this.name = name;
        this.item_type = item_type;
        this.modifier = modifier;
    }

    /* Methods */

}
