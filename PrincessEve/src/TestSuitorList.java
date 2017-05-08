

import java.util.Scanner;

public class TestSuitorList
{
    public static void main(String[] args)
    {

        /* Initializations */
        SuitorLinkList list = new SuitorLinkList();
        Scanner keyboard = new Scanner(System.in);
        int totalSuitors;

        System.out.println("Enter a number of total suitors to calculate which position will marry Princess Eve: ");
        totalSuitors = keyboard.nextInt();

        for(int i = 0; i < totalSuitors; i++)
        {
            list.addSuitorNode(i);
        }





    }



}
