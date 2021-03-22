package WritingMethodsThatRequireASingleParameter;

// SumAndProduct.java - This program computes sums and products.
// Input:  Interactive.
// Output:  Computed sum and product.

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int number;
        String numberString;

        System.out.println("Enter a positive integer or 0 to quit: ");

        numberString  = s.nextLine();
        number = Integer.parseInt(numberString);

        while(number != 0) {
            // call sums() method here

            // call products() method here

            System.out.println("Enter a positive integer or 0 to quit: ");

            numberString  = s.nextLine();
            number = Integer.parseInt(numberString);
        }

        System.exit(0);

    } // End of main() method.


    // Write sums() method here.


    // Write products() method here.



} // End of SumAndProduct class.