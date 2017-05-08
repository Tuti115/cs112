/*
Filename: TornadoException.java
Programmer(s): Group 2
Professor Porto
CS112

Code Objective: create a class that to make our own exceptions for TornadoTest class

 */


public class TornadoException extends Exception {
    
    public TornadoException() {
    	super("Torando: Take cover immediately!");
    }
    
    public TornadoException(int m) {
    	super("Tornado Exception thrown!");
    	System.out.println("Tornado "
    	 + m + " miles away and approaching fast!");
    	
    }
    
    
}
