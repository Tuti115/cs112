


public class Piglatin
{
    public static String userInput(String userinput)
    {
        String temp = "";
        userinput = userinput.toLowerCase();

        String[] holder = userinput.split(" ");

        for(int i = 0; i < holder.length; i++)
        {
            holder[i] = translate(holder[i]);
        }


        for(int i = 0; i < holder.length; i++)
        {
            temp += holder[i] + " ";
        }

        userinput = temp;

        return userinput;

    }

    public static String translate(String word)
    {
        char temp = word.charAt(0);

        if(temp == 'a' || temp == 'e' || temp == 'i' ||
                temp == 'o' || temp == 'u')
        {
            word = word + "way";
            return word;
        }

        return translateWConsonat(word);
    }

    public static String translateWConsonat(String word)
    {
        for(int i = 1; i < word.length(); i++)
        {
            char temp = word.charAt(i);

            if(temp == 'a' || temp == 'e' || temp == 'i' ||
                    temp == 'o' || temp == 'u')
            {
                String firstpart = word.substring(0, i);
                String secondpart = word.substring(i);
                word = secondpart + firstpart + "ay";
                return word;
            }
        }

        return word;
    }

    public static void main(String[] args)
    {
        PiglatinGUI event = new PiglatinGUI();
    }

}