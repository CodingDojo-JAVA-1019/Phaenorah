import java.util.*;
public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzz = new PuzzleJava();
         
        int[] numbers = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        
        puzz.printSum(numbers);

        ArrayList<Integer> overTen = puzz.printSum(numbers);

        System.out.println("Values over 10");
        System.out.println(overTen);
       

        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");

        ArrayList<String> namesOverFiveChars = puzz.shuffleNames(names);

        System.out.println("Names greater than 5 characters");  
        System.out.println(namesOverFiveChars); 

        puzz.alpha();

        puzz.tenRandom();
        // int[] rand = puzz.tenRandom();
        // System.out.println(Arrays.asList(rand)); OR: 
        // for(int num: rand) {
        //   System.out.println("Randon number is " = num);
        // }

        ArrayList<Integer> numberList = puzz.sortedTen();
        System.out.println("Sorted 10"); 
        System.out.println(numberList); 
    }
}