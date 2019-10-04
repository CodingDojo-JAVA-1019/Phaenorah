import java.util.*;
public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava results = new BasicJava();
        ArrayList<Integer> array = results.print255();
        System.out.println(array);

        results.printOddNum255();
        
        int sum = results.printSum255();
        System.out.println(sum);

        results.iterateArray();

        ArrayList<Integer> max = new ArrayList<Integer>();
        max.add(9);
        max.add(15);
        max.add(-4);
        System.out.println(results.findMax(max));

        ArrayList<Integer> avg = new ArrayList<Integer>();
        avg.add(9);
        avg.add(15);
        avg.add(-6);
        System.out.println(results.findAverage(avg));

        

        results.arrayOdd();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(8);
        arr.add(8);
        arr.add(5);
        arr.add(9);
        System.out.println(results.greaterThanY(arr, 5));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(-2);
        System.out.println(results.squareValues(list));

        ArrayList<Integer> neg = new ArrayList<Integer>();
        neg.add(-5);
        neg.add(1);
        neg.add(5);
        neg.add(10);
        neg.add(-2);
        System.out.println(results.eliminateNegatives(neg));

        results.maxMinAvg();

        results.shiftingArrays();

    }
}