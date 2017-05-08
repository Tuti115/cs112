import java.util.LinkedList;
import java.util.Scanner;

public class SuitorList
{

    /* Initializations */
    private LinkedList<Suitor> list = new LinkedList<>();
    static Scanner keyboard = new Scanner(System.in);

    /* Accessor Methods */
    public LinkedList<Suitor> getList()
    {
        return this.list;
    }

    /* Mutator Methods */
    public void setList(LinkedList<Suitor> list)
    {
        this.list = list;
    }

    /* Constructors */
    public SuitorList()
    {
        //default constructor
        this.list = new LinkedList<>();
    }

    public SuitorList(LinkedList<Suitor> list)
    {
        this.list = list;
    }

    /* Methods */
    public String findLuckySuitor()
    {
        String answer;
        int counter, index, position, listsize,  totalAmount;
        boolean finished = false;

        System.out.println("Enter amount of total suitors: ");
        totalAmount = keyboard.nextInt();

        fillSuitorList(totalAmount);

        counter = 0;
        index = 0;

        while(!finished)
        {
            if(list.size() == 1)
                finished = true;

            if(index > 1 + list.size())
                index = 0;

            if(counter % 3 == 0)
                list.remove(index);

            System.out.println("List size: " + getList().size());
            System.out.println("Index: " + index);
            System.out.println("Counter: " + counter +"\n");

            index++;
            counter++;
        }

        answer = "Lucky Suitor Position: " + getList().get(0).getPosition();

        return answer;
    }

    public void fillSuitorList(int amount)
    {
        if(!getList().isEmpty())
        {
            System.out.println("List is not empty. All previous suitor objects will be deleted.");
            setList(new LinkedList<Suitor>());
        }


        for(int i = 0; i < amount; i++)
        {
            Suitor suitor = new Suitor(i);
            list.add(suitor);
        }
    }




}
