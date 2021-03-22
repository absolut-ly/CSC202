package WritingMethodsThatRequireMultipleParameters;

// Computation.java - This program calculates sum, difference, and product of two values.
// Input:  Interactive.
// Output:  Sum, difference, and product of two values.

import java.util.Scanner;

public class Computation {
    public static void main(String args[]) {
        double value1;
        String value1String;
        double value2;
        String value2String;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first numeric value: ");
        value1String = input.nextLine();
        value1 = Double.parseDouble(value1String);
        System.out.println("Enter second numeric value: ");
        value2String = input.nextLine();
        value2 = Double.parseDouble(value2String);

        // Call calculateSum() here

        // Call calculateDifference() here

        // Call calculateProduct() here

        System.exit(0);

    } // End of main() method.


    // Write calculateSum() method here.


    // Write calculateDifference() method here.


    // Write calculateProduct() method here.



} // End of Computation class.