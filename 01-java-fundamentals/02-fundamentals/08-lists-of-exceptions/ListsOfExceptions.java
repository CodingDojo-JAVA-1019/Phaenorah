import java.util.*;

public class ListsOfExceptions {
    public void tryCatch(ArrayList<Object> myList) {

        for(int i = 0; i < myList.size(); i++) {
            Object castedValue = myList.get(i);
		}
		
		try {
			Integer castedValue = (Integer) myList.get(0);
		}
		catch (ClassCastException e) {
			System.out.println("ClassCastException: code has attempted to cast an object to a subclass of which it is not an instance.");
		}
    }
}
