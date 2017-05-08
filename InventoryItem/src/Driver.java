/*
 Filename: InventoryItem.java
 Programmer: Jose A Huerta
 Professor: June Porto
 Course: CS112 Tu-Thur 1:20-3:20

 Objective: Design program with method to take in array of Type Comparable and sort a unique itemID from least
 to greatest.

 Algorithm:

 1. Make variables String name and int uniqueItemID to hold information for InventoryItem objects
 2. Write getter and setters for variables
 3. Make default constructor and main constructor that will be used in the program.
 4. Make compareTo() method, will be used to compare between the uniqueIDs of the InventoryItem objects
 5. Choose a sorting method, will use sorting method provided by textbook
 6. Create 5 objects in tester program with a name and id number
 7. Make an InventoryItem[] and fill array with the objects previously made
 8. Print array to console to show unsorted array
 9. Pass array, and number of indexes used to compare
 10. Reprint array to console to show a sorted array by smallest to largest uniqueID
 11. End Of Program

 */
public class Driver
{
    public static void main(String[] args)
    {
        InventoryItem item1 = new InventoryItem("Apple", 1);
        InventoryItem item2 = new InventoryItem("Orange", 2);
        InventoryItem item3 = new InventoryItem("Watermelon", 3);
        InventoryItem item4 = new InventoryItem("Lemon", 4);
        InventoryItem item5 = new InventoryItem("Pear", 5);

        InventoryItem itemlist[] = {item5, item4, item3, item2, item1};
        int numused = 5;

        System.out.println("Before Sorting: ");
        for(int i = 0; i  < itemlist.length; i++)
        {
            System.out.println(itemlist[i]);
        }

        System.out.println();
        GeneralizedSortSelectionSort.sort(itemlist, numused);

        System.out.println("After Sorting: ");
        for(int i = 0; i < itemlist.length; i++)
        {
            System.out.println(itemlist[i]);
        }

        System.out.println("\nEnd Of Program...");

    }

}//end of class
