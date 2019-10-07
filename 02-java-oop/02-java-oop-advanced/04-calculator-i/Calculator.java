import java.util.ArrayList;
public class Calculator {
    private ArrayList<String> operations = new ArrayList<String>();
    private double result;

    public void performOperation(String operand) {
        if(operand.equals("=")) {
            performOperation();
            
            return;
        }
        operations.add(operand);
    }
    public void performOperation(double value) {
        operations.add(Double.toString(value));
      }
    
    public double getResults() {
        if (result == 0.0) {
          performOperation();
        }
    
        operations.clear();
    
        return result;
    }
    public void performOperation() {
        int index = 0;
        double result = 0;

        System.out.println(operations);

        while (operations.contains("+") || operations.contains("-")) {
            if (isAddOrMinus(operations.get(index))) {
              // calculate
              result = calculate(index);
            } else {
              index++;
            }
        }     
      
        while (operations.size() > 1) {
            result = calculate(1);
        }      
        System.out.println("operations after add and mins");
        System.out.println(operations);
        System.out.println(result);
      
        this.result = result;
        }
    private double calculate(int index) {
           
        String second = operations.remove(index + 1);            
        String operand = operations.remove(index);           
        String first = operations.remove(index - 1);
        final double result = maths(operand, first, second);        
            
        operations.add(index - 1, Double.toString(result));
        
        System.out.println(operations);
        
            return result;
        }
    private double maths(String operand, String value1, String value2) {
        return maths(operand, Double.parseDouble(value1), Double.parseDouble(value2));
        }  
    private double maths(String operand, double value1, double value2) {
        switch (operand) {
            case "+":
              return value1 + value2;            
            case "-":
              return value1 - value2;
            }        
            System.out.println("Invalid input");
            return 0;
        }    
        
    private boolean isAddOrMinus(String operand) {
        return operand.equals("+") || operand.equals("-");
      }    

}