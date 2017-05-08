/*
Filename: TornadoTest.java
Programmer(s): Group 2
Professor Porto
CS112

Code Objective: Create class to test exceptions from TornadoException

 */


import java.util.Scanner;

public class TornadoTest {
	
	public static void main(String[] args) {


	    String inpStr;
	    Scanner keyboard = new Scanner(System.in);


	    //default constructor test
        try {
            System.out.println("Is there a tornado?");
            inpStr = keyboard.nextLine();

            if(inpStr.equals("No") || inpStr.equals("no") ||inpStr.equals("NO"))
                throw new TornadoException();
            System.out.print("Be careful! Tornadoes are very dangerous!");
        }

        catch (TornadoException e) {
            System.out.println(e.getMessage());
        }

        //creates space between both processes
        for(int i = 0; i < 3; i++) {
            System.out.println(" ");
        }

        // int parameter constructor
		try {
		    System.out.println("Is there a tornado?");
		    inpStr = keyboard.nextLine();

		    if(inpStr.equals("No") || inpStr.equals("no") ||inpStr.equals("NO"))
		        throw new TornadoException(5);

            System.out.print("Be careful! Tornadoes are very dangerous!");
		}

		catch (TornadoException e) {
		    System.out.println("There is a tornado! Be Careful!");
		}

	}
}