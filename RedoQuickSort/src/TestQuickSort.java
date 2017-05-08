
public class TestQuickSort
{

    public static void main(String[] args)
    {
        double[] array = {.9999 , 6, -2};

        //QuickSort.sort(array, 0, array.length - 1);

        double splitvalue = QuickSort.split(array, 0, array.length - 1);

        System.out.println(splitvalue);

    }


}
