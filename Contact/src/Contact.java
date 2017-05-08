
public class Contact
{


   /* Declarations */

   private String firstName;
   private String lastName;
   private String address;

   private String email;
   private String phoneNumber;


   /* Accessor Methods */
   public String getFirstName()
   {
       return this.firstName;
   }
   public String getLastName()
   {
       return this.lastName;
   }
   public String getAddress()
   {
       return this.address;
   }

   public String getEmail()
   {
       return this.email;
   }
   public String getPhonenumber()
   {
       return this.phoneNumber;
   }

   /* Mutator Methods */
   public void setFirstName(String firstname)
   {
       this.firstName = firstname;
   }
   public void setLastName(String lastname)
   {
       this.lastName = lastname;
   }
   public void setAddress(String address)
   {
       this.address = address;
   }

   public void setEmail(String email)
   {
       this.email = email;
   }
   public void setPhonenumber(String number)
   {
       this.phoneNumber = number;
   }

   /* Constructors */
   public Contact()
   {
       //default constructor

       this.firstName = null;
       this.lastName = null;
       this.address = null;

       this.email = null;
       this.phoneNumber = null;
   }

   public Contact(String firstname, String lastname, String address, String email, String phonenumber)
   {
       //main constructor

       this.firstName = firstname;
       this.lastName = lastname;
       this.address = address;

       this.email = email;
       this.phoneNumber = phonenumber;
   }


}

