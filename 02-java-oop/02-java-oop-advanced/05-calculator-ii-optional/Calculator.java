import java.util.ArrayList;

public class Calculator {
  private ArrayList<String> operations = new ArrayList<String>();
  private double result;

  public void performOperation(String operand) {
    if (operand.equals("=")) {
      // perform operations
      performOperations();

      return;
    }

    operations.add(operand);
  }

  public void performOperation(double value) {
    operations.add(Double.toString(value));
  }

  public double getResults() {
    if (result == 0.0) {
      performOperations();
    }

    operations.clear();

    return result;
  }

  // [8, *, 5 + , 4]

  private void performOperations() {
    int index = 0;
    double result = 0;
    // handle * and /
    System.out.println(operations);

    while (operations.contains("*") || operations.contains("/")) {
      if (isMultOrDiv(operations.get(index))) {
        // calculate
        result = calculate(index);
      } else {
        index++;
      }
    }

    System.out.println("operations after mult and div");
    System.out.println(operations);
    System.out.println(result);

    while (operations.size() > 1) {
      result = calculate(1);
    }

    System.out.println("operations after add and sub");
    System.out.println(operations);
    System.out.println(result);

    this.result = result;
  }

  // [8, *, 5 + , 4]
  // this step removes the value after the operand first, then the operand, then
  // the left value
  // [40, + , 4]

  private double calculate(int index) {
    // removes value to right of operand (5)
    String second = operations.remove(index + 1);
    // removes operand (*)
    String operand = operations.remove(index);
    // removes value to left of operand (8)
    String first = operations.remove(index - 1);
    final double result = maths(operand, first, second);

    // insert result for next operation
    operations.add(index - 1, Double.toString(result));

    System.out.println(operations);

    return result;
  }

  private double maths(String operand, String value1, String value2) {
    return maths(operand, Double.parseDouble(value1), Double.parseDouble(value2));
  }

  private double maths(String operand, double value1, double value2) {
    // 10.5
    // 10

    // if (operand.equals("*")) {
    // // do mult
    // } else if (operand.equals("/")) {
    // // do div
    // } else if (operand.equals("+")) {
    // // do add
    // } else if (operand.equals("-")) {
    // // do sub
    // }

    switch (operand) {
    case "+":
      return value1 + value2;
    case "/":
      return value1 / value2;
    case "*":
      return value1 * value2;
    case "-":
      return value1 - value2;
    }

    // should probably throw an error
    return 0;
  }

  private boolean isMultOrDiv(String operand) {
    return operand.equals("*") || operand.equals("/");
  }
}