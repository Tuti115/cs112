

import java.util.ArrayList;

public class MyMathClass<T extends Number>
{
    /* Initializations */
    public ArrayList<T> list;
    private T mean;
    private T standard_deviation;

    /* Constructors */
    public MyMathClass()
    {
        this.list = new ArrayList<T>();
        this.mean = null;
        this.standard_deviation = null;
    }

    /* Accessor Methods */
    public T getMean()
    {
        return this.mean;
    }

    public T getStandard_deviation()
    {
        return this.standard_deviation;
    }

    public ArrayList<T> getList()
    {
        return this.list;
    }

    /* Mutator Methods */
    public void setMean(T mean)
    {
        this.mean = mean;
    }

    public void setStandard_deviation(T standard_deviation)
    {
        this.standard_deviation = standard_deviation;
    }

    /* Methods */
    public double calculateStandardDeviation(ArrayList<T> list)
    {
        double mean = calculateMean(list);
        double temp = 0;

        for(Number number: list)
        {
            temp += Math.pow(number.doubleValue() - mean, 2);
        }

        return Math.sqrt(temp/list.size());
    }

    public double calculateMean(ArrayList<T> list)
    {
        double mean = 0;

        for(Number number: list)
        {
            mean += number.doubleValue();
        }

        mean = mean/list.size();

        return mean;
    }

    public String toString()
    {
        return "Numbers in List: " + getList() + "\n\nMean: " + getMean() + "\nStandard Deviation: " + getStandard_deviation();
    }
}
