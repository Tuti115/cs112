/*

Project: Standard Deviation
Programmer: Jose A Huerta
Professsor: June Porto
Course: CS112 Tue-Thurs. 1:30-3:20

Objective: Design mymathclass class that will have a generic parameter <T> that will extend the Number class

Algorithm:
* Make 2 classes, Driver class to test , and MyMathClass that will have the generic paramter <T extends Number>
* Make: arraylist with parameter <T>, T mean , and T standard_deviation
* Write a constructor to initialize ArrayList when called in the main method
* Design CalculateStandardDeviation(ArrayList<T> list) Method
    * Method will only accept ArrayLists of parameter T which means they must extend from the Number class
    * Design CalculateMean() which will add all nums and divide by size of arraylist and return that value
    * call CalculateMean() in StandardDeviation() then set as mean inside the method
    * use foreach loop to set temp value as the sum of all numbers after being subtracted by the mean
    * return value = temp value / list.size()
* use setter to set mean to value from calculateMean()
* use setter to set standard_deviation from calculateStandardDeviation()
* write toString that will return the numbers in list, mean of numbers in list, and the standard_deviation.
* print results to screen with use of toString ex: System.out.println(MyMathClassObject);
* END OF PROGRAM

 */

public class TestMyMathClass
{
    public static void main(String[] args)
    {

        MyMathClass myMathClass = new MyMathClass();

        myMathClass.list.add(25.32);
        myMathClass.list.add(34.62);
        myMathClass.list.add(28.92);
        myMathClass.list.add(39.41);
        myMathClass.list.add(40.31);

        myMathClass.setMean(myMathClass.calculateMean(myMathClass.list));
        myMathClass.setStandard_deviation(myMathClass.calculateStandardDeviation(myMathClass.list));

        System.out.println(myMathClass);
    }

}
