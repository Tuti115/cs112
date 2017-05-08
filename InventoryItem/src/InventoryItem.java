

import java.lang.Comparable;

public class InventoryItem implements Comparable
{

    /* Initializations */
    private String name;
    private int uniqueItemID;
    private int inventoryNumUsed;

    /* Accessor Methods */
    public String getName()
    {
        return this.name;
    }
    public int getUniqueItemID()
    {
        return this.uniqueItemID;
    }

    /* Mutator Methods */
    public void setName(String name)
    {
        this.name = name;
    }
    public void setUniqueItemID(int id)
    {
        this.uniqueItemID = id;
    }

    /* Constructor */
    public InventoryItem()
    {
        this.name = null;
        this.uniqueItemID = 0;
    }

    public InventoryItem(String name, int uniqueItemID)
    {
        this.name = name;
        this.uniqueItemID = uniqueItemID;
    }

    /* Methods */


    public int compareTo(Object other)
    {
        if(other == null || other.getClass() != this.getClass())
        {
            System.out.println("Error.");
            System.exit(0);
        }

        InventoryItem object = (InventoryItem) other;

        if(this.getUniqueItemID() < object.getUniqueItemID())
        {
            return -1;
        }

        if(this.getUniqueItemID() == object.getUniqueItemID())
        {
            return 0;
        }

        return 1;
    }

    public String toString()
    {
        return "Item: " + name + " ID: " + uniqueItemID;
    }

    public boolean equals(Object other)
    {
        if(other == null || other.getClass() != this.getClass())
        {
            return false;
        }

        InventoryItem item = (InventoryItem) other;

        return this.getName().equals(item.getName()) &&
                this.getUniqueItemID() == item.getUniqueItemID();
    }

} //end of class
