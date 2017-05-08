

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactList
{
   /* Initializations */

    ArrayList <Contact> list = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);
    private int counter = 0;

    /* Accessor Methods */

    public int getCounter()
    {
        return this.counter;
    }

    /* Mutator Methods */
    public void setCounter(int counter)
    {
        this.counter = counter;
    }
    public void resetCounter()
    {
        this.counter = 0;
    }
    /* Constructors */

    public ContactList()
    {
        //default constructor
        this.list = new ArrayList<Contact>();
    }

    /* Methods */
    public void incrementCounter()
    {
        this.counter++;
    }

    public void decrementCounter()
    {
        this.counter--;
    }

    public void menu()
    {
        int decision = 0;

        System.out.println("1) View Contact List");
        System.out.println("2) Add a Contact");
        System.out.println("3) Edit a Contact");
        System.out.println("4) Remove a Contact");
        System.out.println("5) Clear Contact List");
        System.out.println("6) Search Contact List by Keyword");
        System.out.println("7) Quit Program");

        try
        {
            decision = keyboard.nextInt();

        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input.");
            System.out.println("Returning to menu...");
            menu();

        }

        switch(decision)
        {
            case 1:
                viewContactList();
                break;
            case 2:
                addContact();
                break;
            case 3:
                editContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                clearContactList();
                break;
            case 6:
                findContact();
                break;
            case 7:
                System.out.println("Terminating Program...");
                System.exit(0);
                break;
            default:
                System.out.println("Should not have hit this case...");
                System.exit(0);
        }
    }

    public void viewContactList()
    {
        System.out.println();

        if(list.isEmpty())
        {

            System.out.println("Contact list does not have any contact information.\n");

            menu();

            return; //will break method
        }

        for (Contact contact: list)
        {
            System.out.println((list.indexOf(contact) + 1) + ". Contact Name: " + contact.getFirstName() +" " + contact.getLastName());
            System.out.println("   Contact Phone Number: " + contact.getPhonenumber());
            System.out.println("   Contact Email: " + contact.getEmail());
            System.out.println("   Contact Address: " +  contact.getAddress());
            System.out.println();
        }

        menu();

    }

    public void addContact()
    {
        String firstname, lastname, address, email, phonenumber;

        try
        {
            System.out.println("\nEnter first name of new contact: ");
            firstname = keyboard.next();
            keyboard.nextLine();


            System.out.println("Enter last name of new contact:  ");
            lastname = keyboard.nextLine();

            System.out.println("Enter the email address of new contact: ");
            email = keyboard.nextLine();

            System.out.println("Enter the address of the new contact: ");
            address = keyboard.nextLine();

            System.out.println("Enter the phone number of new contact: ");
            phonenumber = keyboard.nextLine();

            System.out.println("Contact has been added to list.");
            list.add(new Contact(firstname, lastname, address, email, phonenumber));
        }
        catch (InputMismatchException e)
        {
            if(getCounter() < 2)
            {
                System.out.println("Enter a valid input. Please try again.");
                System.out.println("Tries before program termination: " + getCounter());

                incrementCounter();
                addContact();
            }
            else
            {
                System.out.println("You have failed to enter a valid input 3 times");
                System.out.println("Ending Program....");
                System.exit(0);
            }

        } //END OF TRY CATCH BLOCK

        System.out.println();
        menu();
    }

    public void editContact()
    {
        int index = -1;

        if(list.isEmpty())
        {
            System.out.println("List contains no contacts to edit.");
            menu();
        }

        for (Contact contact: list)
        {
            System.out.println((list.indexOf(contact) + 1) + ". Contact Name: " + contact.getFirstName() +" " + contact.getLastName());
            System.out.println("   Contact Phone Number: " + contact.getPhonenumber());
            System.out.println("   Contact Email: " + contact.getEmail());
            System.out.println("   Contact Address: " +  contact.getAddress());
            System.out.println();
        }

        System.out.println("Enter the index of the contact you would like to edit: ");
        try
        {
            index = keyboard.nextInt() - 1;
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input. Enter an integer value.");
        }

        System.out.println();
        makeContactEdit(index);

    }

    public void makeContactEdit(int index) //only used when called by editContact
    {
        String name, phonenumber, email, address, answer;

        int decision = -1;

        System.out.println("1) Edit First Name");
        System.out.println("2) Edit Last Name");
        System.out.println("3) Edit Phone Number");
        System.out.println("4) Edit Email Address");
        System.out.println("5) Edit Address");
        System.out.println("6) Cancel and Return to Main Menu");

        try
        {
            decision = keyboard.nextInt();

            if(decision == 1)
            {

                System.out.println("Enter new first name: ");
                keyboard.nextLine();
                name = keyboard.nextLine();

                Contact contact = list.get(index);
                contact.setFirstName(name);
                System.out.println();

                list.set(index, contact);

            }
            else if(decision == 2)
            {
                System.out.println("Enter new last name: ");
                keyboard.nextLine();
                name = keyboard.nextLine();

                Contact contact = list.get(index);
                contact.setLastName(name);
                System.out.println();

                list.set(index, contact);
            }
            else if(decision == 3)
            {
                System.out.println("Enter new phone number:");
                keyboard.nextLine();
                phonenumber = keyboard.nextLine();

                Contact contact = list.get(index);
                contact.setPhonenumber(phonenumber);
                System.out.println();

                list.set(index, contact);
            }
            else if(decision == 4)
            {
                System.out.println("Enter new email address: ");
                keyboard.nextLine();
                email = keyboard.nextLine();

                Contact contact = list.get(index);
                contact.setEmail(email);
                System.out.println();

                list.set(index, contact);
            }
            else if(decision == 5)
            {
                System.out.println("Enter new address: ");
                keyboard.nextLine();
                address = keyboard.nextLine();

                Contact contact = list.get(index);
                contact.setAddress(address);
                System.out.println();

                list.set(index, contact);
            }
            else if(decision == 6)
            {
                System.out.println("\nReturing to main menu...");
                menu();
            }

            System.out.println("Would you like to make another edit to this contact? y/n");
            answer = keyboard.nextLine().toLowerCase();

            if(answer.equals("y") || answer.equals("yes"))
            {
                makeContactEdit(index);
            }
            else if(answer.equals("n") || answer.equals("no"))
            {
                System.out.println("Returning to main menu...\n");
                menu();
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input.");
            System.out.println("Please try again...");
            makeContactEdit(index);
        }

        return; //method should not hit this

    }

    public void removeContact()
    {
        int index;

        for (Contact contact: list)
        {
            System.out.println((list.indexOf(contact) + 1) + ". Contact Name: " + contact.getFirstName() +" " + contact.getLastName());
            System.out.println("   Contact Phone Number: " + contact.getPhonenumber());
            System.out.println("   Contact Email: " + contact.getEmail());
            System.out.println("   Contact Address: " +  contact.getAddress());
            System.out.println();
        }
        System.out.println("Enter index number of contact in the list you would like to remove:");

        index = keyboard.nextInt() - 1;

        System.out.println();
        list.remove(index);

        menu();

    }


    public void findContact()
    {

        String input = null;

        if(list.isEmpty())
        {
            System.out.println("\nList does not have any contacts to search through");
            System.out.println("Returning to menu...");
            menu();
        }
        System.out.println();
        System.out.println("Enter a name/number/phrase to search through contact list:");

        keyboard.nextLine();
        input = keyboard.nextLine();

        for(Contact contact: list)
        {

            if(contact.getFirstName().equals(input)
                    || contact.getLastName().equals(input) ||contact.getEmail().equals(input)
                    || contact.getAddress().equals(input)  ||contact.getPhonenumber().equals(input))
            {
                System.out.println();
                System.out.println((list.indexOf(contact) + 1) + ". Contact Name: " + contact.getFirstName() +" " + contact.getLastName());
                System.out.println("   Contact Phone Number: " + contact.getPhonenumber());
                System.out.println("   Contact Email: " + contact.getEmail());
                System.out.println("   Contact Address: " +  contact.getAddress());
                System.out.println();

                menu();

            }

        }

        menu();//should not hit this
    }

    public void clearContactList()
    {
        String decision;

        System.out.println("\nAre you sure you want to delete the contact list? y/n");

        keyboard.nextLine();
        decision = keyboard.nextLine().toLowerCase();

        if(decision.equals("y") || decision.equals("yes"))
        {
            list.clear();
            System.out.println("Contact List has been deleted.\n");
            menu();
        }
        else if(decision.equals("n") || decision.equals("no"))
        {
            System.out.println("Returning to menu...\n");
            menu();
        }
        else
        {
            System.out.println("Invalid Input.");
            System.out.println("Returning to menu...\n");
            menu();
        }

    }

}
