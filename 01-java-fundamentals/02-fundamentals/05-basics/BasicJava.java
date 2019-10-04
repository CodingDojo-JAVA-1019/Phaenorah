import java.util.*;

public class BasicJava {
    public ArrayList<Integer> print255() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i= 1; i<256; i++) {
            myArray.add(i);
        }
        return myArray;
    }
    public void printOddNum255() {
        for(int i= 1; i<256; i+=2) {
            System.out.println(i);
        }
    }
    public int printSum255() {
        int sum = 0;
        for(int i=1; i<256; i++) {
            sum+= i;
            System.out.println("New Number:" +i+ " Sum:" +sum);   
        }
        return sum;
    }
    public void iterateArray() {
        int[] arr = {1, 3, 5, 7, 9, 13};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public Integer findMax(ArrayList<Integer> array) {
        int max = 0;
        for(int i=0; i<array.size(); i++) {
            if(array.get(i) > max) {
                max = array.get(i);
            }
        }
        return max;
    }
    public Integer findAverage(ArrayList<Integer> array) {
        int sum = 0;
        for(int i=0; i<array.size(); i++) {
            sum = sum + array.get(i);
        }
        return sum/array.size();
    }
    public void arrayOdd() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i= 1; i<256; i+=2) {
            arr.add(i);
        }
            System.out.println(arr);
    }
    public Integer greaterThanY(ArrayList<Integer>arr, int Y) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > Y) {
                count++;
            }
        }
        return count;
    }
    public Integer squareValues(ArrayList<Integer> list) {
        // int list = list.get(i);
        for(int i = 0; i < list.size(); i++) {
            list.get(i) = list.get(i)* list.get(i);
        }
        return list;
    }
    public Integer eliminateNegatives(ArrayList<Integer> neg) {
        int temp = 0;
        for(int i = 0; i < neg.size(); i++) {
            if(neg.get(i) < 0) {
                temp = 0;
            }
        }
        return temp;
    }
    public void maxMinAvg() {
        int[] arr = {1,5,10,-2};
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = sum / arr.length;
        newArr.add(max);
        newArr.add(min);
        newArr.add(avg);    
        System.out.println(newArr);
    }
    public void shiftingArrays() {
        int[] arr  = {1,5,10,7,-2};
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}