

public class QuickSort
{
    public static void sort(double[] a, int begin, int end)
    {

        if(end - begin == 1)
        {
            double temp;
            temp = a[1];

            if(a[0] < temp)
            {
                // do nothing
            }
            else
            {
                a[1] = a[0];
                a[0] = temp;
            }

            return;
        }


        if(end - begin > 1)
        {
            int splitpoint = split(a, begin, end);
            sort(a, begin, splitpoint);
            sort(a, splitpoint + 1, end);
        }

    }//end of method

    public static int split(double[] a, int begin, int end)
    {
        double[] temp;
        int size = (end - begin + 1);
        temp  = new double[size];

        double splitValue = a[begin];
        int up = 0;
        int down = size - 1;

        for(int i = begin + 1; i <= end; i++)
        {
            if(a[i] <= splitValue)
            {
                 temp[up] = a[i];
                 up++;
            }
            else
            {
                temp[down] = a[i];
                down--;
            }
        }
        temp[up] = a[begin];
        for(int i = 0; i < size; i++)
            a[begin + i]  = temp[i];
        return (begin + up);
    }


}