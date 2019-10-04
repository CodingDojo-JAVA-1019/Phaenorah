import java.util.*;
public class ListsOfExceptionsTest {
    public static void main(String[] args) {
        ListsOfExceptions results = new ListsOfExceptions();

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        results.tryCatch(myList);
            
    }
}