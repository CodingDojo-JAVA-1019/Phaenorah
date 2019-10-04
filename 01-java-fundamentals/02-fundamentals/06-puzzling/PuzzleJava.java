import java.util.*;

public class PuzzleJava {

    //Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
    //Print the sum of all numbers in the array. 
    //Also have the function return an array that only includes numbers 
    //that are greater than 10 (e.g. when you pass the array above, 
    //it should return an array with the values of 13,25,32)

    public ArrayList<Integer> printSum(int[] numbers) {
        ArrayList<Integer> overTen = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            System.out.println("value is " + numbers[i] + " sum is " + sum);

            if(numbers[i] > 10) {
            overTen.add(numbers[i]);       
        }
    }
        return overTen;
   }   

   //Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
   //Shuffle the array and print the name of each person. 
   //Have the method also return an array with names that are longer than 5 characters.

    public ArrayList<String> shuffleNames(ArrayList<String> names) {
        ArrayList<String> greaterThanFive = new ArrayList<String>();
        //shuffle
        Collections.shuffle(names);

        for (int i = 0; i<names.size(); i++) {   //can also: if(String name: names){ if (name.length() > 5) {greaterThanFive.add(name);}}
            String name = names.get(i);

            if(name.length() > 5) {    
                greaterThanFive.add(name);
            }
        }
        return greaterThanFive;
    }

    //Create an array that contains all 26 letters of the alphabet 
    //(this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. 
    //Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
    //To shuffle a collection, you can use the shuffle method of the Collections class. Collections Class documentation

    public void alpha() {
        String [] characters = "abcdefghijklmnopqrstuvwxyz".split("");
        System.out.println(Arrays.asList(characters));

        String[] vowels = { "a", "e", "i", "o", "u"};
        Collections.shuffle(Arrays.asList(characters));

        System.out.println(Arrays.asList(characters));

        String firstChar = characters[0];
        System.out.println("The first character is " + firstChar);
        System.out.println("The last character is " + characters[characters.length - 1]);

        boolean isVowel = false;

        for(int i = 0; i < vowels.length; i++) {
            String current = vowels[i];
            System.out.println("Current value is " + current);
            System.out.println("Is equal " + current.equals(firstChar));

            if (current.equals(firstChar)) {
                isVowel = true;
                break;
            }
        }
            if (isVowel) {
                System.out.println("The first char was vowel" + firstChar);
            }
        }

        // Generate and return an array with 10 random numbers between 55-100 and have
        // it be sorted (showing the smallest number in the beginning). Display all the
        // numbers in the array. Next, display the minimum value in the array as well as
        // the maximum value.

        public int[] tenRandom() {
            int[] tenRand = new int[10];

            final int min = 55;
            final int max = 100;

            for(int i = 0; i < tenRand.length; i++) {
                int randNumber = rand(min, max);

                System.out.println("Random value generated" + randNumber);
            }
            return tenRand;
        }
        private int rand(int min, int max) {
           Random rand = new Random();
           return rand.nextInt(max-min) + min;
       }
       
       public ArrayList<Integer> sortedTen() {
           int[] ten = tenRandom();
           ArrayList<Integer> list = new ArrayList<Integer>(ten.length);

           for (int number : ten) {
               list.add(number);
           }
           Collections.sort(list);

           return list;
       }
}