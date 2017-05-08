
/*

Project: Contacts
Programmer: Jose A Huerta
Course: CS112 Tu-Thur 1:30-3:20

Objective: Design program to hold contact information for multiple people with a menu to do different actions.
    Must implement array lists.

Algorithm:

1. Make Contacts Class
2. Make private variables: String FirstName, String LastName,String address, String email, int phoneNum, etc.
    Will be used to hold information of the contact.
3. Make accessor and mutator methods of the variables since they are private
4. Make ArrayList that will take input of type Contacts
5. Design a menu using system.out.println that will ask for a number input for the user to make a decision.
6. depending on decision:
    * find contact with index
    * look for contact based by input to search by similarity
    * add new contact to list
    * edit contact
    * delete contact
    * clear contact list
    * continue until user uses quit option
7. End of Program

 */


public class TestMain
{
    public static void main(String[] args)
    {
        ContactList contactList = new ContactList();

        //used to test program, also able to add Contact objects to arraylist within the program
        contactList.list.add(new Contact("Jose", "Huerta", "1256 Caren rd", "josehuerta115@gmail.com", "7606857511"));
        contactList.list.add(new Contact("Monica", "Angeles", "214 Dancer Rd", "monyangeles@me.com", "7602244659"));
        contactList.list.add(new Contact("June", "Porto", "112 Array Dr", "jporto@miracosta.edu", "7607085031"));
        contactList.list.add(new Contact("Michael", "Flaherty", "202 Tamarack Dr", "mflaherty@me.com", "7602023212"));

        contactList.menu();

    }//END OF MAIN METHOD

}//END OF CLASS
