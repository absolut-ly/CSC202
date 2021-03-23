package WritingMethodsThatRequireMultipleParameters;

// Computation.java - This program calculates sum, difference, and product of two values.
// Input:  Interactive.
// Output:  Sum, difference, and product of two values.

import java.util.Scanner;

public class Computation {
    public static void main(String args[]) {
       double value1;
       double value2;                
       Scanner input = new Scanner(System.in);
          
       System.out.println("Enter the first numeric value: ");
       value1 = Double.parseDouble(input.nextLine());
       System.out.println("Enter second numeric value: ");
       value2 = Double.parseDouble(input.nextLine()); 
       
       // Call calculateSum() here
       calculateSum(value1, value2);
       // Call calculateDifference() here
       calculateDifference(value1, value2);
       // Call calculateProduct() here
       calculateProduct(value1, value2);
 
       System.exit(0);
    } // End of main() method.
    
    
    // Write calculateSum() method here.
    public static void calculateSum(double num1, double num2) {
        System.out.println("Sum " + (num1 + num2));
    }//end calculateSum()
 
    // Write calculateDifference() method here.
    public static void calculateDifference(double num1, double num2) {
        if (num1 > num2) {
            System.out.println("Difference " + (num1 - num2));
        }
        else {
            System.out.println("Product " + (num2 - num1));
        }
    } //end calculateDifference()
 
    // Write calculateProduct() method here.
    public static void calculateProduct(double num1, double num2) {
        System.out.println((num1 * num2));
    } //end calculateProduct()
 
 } // End of Computation class.