
import java.util.Scanner;

public class ListTest
{
    public static void main(String[] args)
    {

        int amount, counter;
        boolean done = false;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter amount of suitors: ");
        amount = keyboard.nextInt();

        List<Integer> list = new List<>(1);
        for (int i = 2; i < amount + 1; i++)
        {
            System.out.println(i);
            list.add(i);
        }

        int something = list.size();
        System.out.println(something);




    }
}
