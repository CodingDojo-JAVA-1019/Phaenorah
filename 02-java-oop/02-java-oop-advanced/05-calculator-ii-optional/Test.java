public class Test {
    public static void main(String[] args) {
      Calculator calc = new Calculator();
  
      calc.performOperation(10.5);
      calc.performOperation("+");
      calc.performOperation(5.2);
      calc.performOperation("*");
      calc.performOperation(10);
      calc.performOperation("-");
      calc.performOperation(7.2);
      calc.performOperation("/");
      calc.performOperation(2);
      // calc.performOperation("=");
  
      double result = calc.getResults();
  
      System.out.println("The results of our operation are " + result);
    }
  }