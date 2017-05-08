/**
 
 Project: PizzaOrder
 Progammer: Jose A Huerta
 Course: cs112
 Professor: June Porto
 
 Objective: design program to be able to calculate the cost of a pizza order with 
 	different sizes and toppings.
 	
 Algrithom:
 
 Read over UML design of project
 Make Pizza, PizzaOrder and TestPizzaOrder classes
 Make variable char size to hold size of pizza
 Make multiple boolean variables of toppings to check if on pizza
 Write setters and getters for these variables.
 Make PizzaOrder object array that will hold pizza objects 
 Design constructors to be able to make pizza objects
 	the construtors will take in all booleans of the toppings and char size
 Design method to calculate final cost of pizza order
 	This will take in array order[] and loop thru checking each object
 	it will check the size and current toppings on the pizzas and the costs to 
 	final price.
 After it loops thru for loop, it will return the double amount of cost. 
 Set cost amount to a double variable
 Use toString method to use object as the parameter for the println and output
 	the calculate cost to the user. 
 
 END PROGRAM 
 
 */
public class TestPizzaOrder
{
    public static void main(String[] args)
    {

        PizzaOrder order1 = new PizzaOrder();

        order1.addPizzaToOrder('L', true, false, false);
        order1.addPizzaToOrder('L', true, true, false);
        order1.addPizzaToOrder('L', false, false, true);

        order1.calcCost();

        System.out.println(order1);




    }//end of main method

}//end of class
