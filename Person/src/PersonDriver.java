
/**
 * Created by Josie on 4/18/2017.
 */
public class PersonDriver
{
    public static void main(String[] args)
    {
        boolean cloneValid = true;

        Person person1 = new Person("Jose", 11, 5, 1998, 1, 20, 2070);
        Person person2 = new Person("Michael", 5, 12, 1998, 3, 4, 2039);


        Person person3 = (Person) person1.clone();
        Person person4 = (Person) person2.clone();

        if(person1 != person3)
        {
            cloneValid = false;
        }


        System.out.println("Person1 and Person2 are clones? t/f " + cloneValid);

        cloneValid = true;
        if(person2 != person4)
        {
            cloneValid = false;
        }

        System.out.println("Person2 and Person4 are clones? t/f " + cloneValid);


    }

}
