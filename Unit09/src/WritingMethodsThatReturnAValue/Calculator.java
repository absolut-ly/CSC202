package WritingMethodsThatReturnAValue;

// Calculator.java - This program performs arithmetic, ( +. -, *. /, % ) on two numbers
// Input:  Interactive.
// Output:  Result of arithmetic operation

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
      double numberOne, numberTwo;                
      String operation;
      double result;
      Scanner input = new Scanner(System.in);
              
      System.out.println("Enter the first number: ");
      numberOne = Double.parseDouble(input.nextLine());
      System.out.println("Enter the second number: ");
      numberTwo = Double.parseDouble(input.nextLine()); 
      System.out.println("Enter an operator (+.-.*,/,%): ");
      operation = input.nextLine();
      
      // Call performOperation method here    
      result = performOperation(numberOne, numberTwo, operation);
  
      System.out.format("%.2f",numberOne);
      System.out.print(" " + operation + " ");
      System.out.format("%.2f", numberTwo);
      System.out.print(" = ");
      System.out.format("%.2f", result);
    
      System.exit(0);
  
    } // End of main() method.
    
    // Write performOperation method here.
    public static double performOperation(double num1, double num2, String op) {
        double result;
        switch (op) {
            case "+":     result = num1 + num2;
                          break;
            case "-":     result = num1 - num2;
                          break;
            case "*":     result = num1 * num2;
                          break;
            case "/":     result = num1 / num2;
                          break;
            default:      result = num1 % num2;
                          break;
        } 
        return result;
    } //end performOperation()
  
  } // End of Calculator class.