package WritingMethodsThatRequireASingleParameter;

// SumAndProduct.java - This program computes sums and products.
// Input:  Interactive.
// Output:  Computed sum and product.

import java.util.Scanner;

public class SumAndProduct{
    public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       int number;              	
       String numberString;	
                         
       System.out.println("Enter a positive integer or 0 to quit: ");	
       number = Integer.parseInt(s.nextLine()); 
         
       while(number != 0) {
          // call sums() method here 
          sums(number);
         // call products() method here
         products(number);
       System.out.println("Enter a positive integer or 0 to quit: ");	
       number = Integer.parseInt(s.nextLine()); 
       }
     
       System.exit(0);
    } // End of main() method.
     
    // Write sums() method here.
    public static void sums(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    } //end sums()
 
    // Write products() method here.
    public static void products(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product = product * i;
        }
        System.out.println(product);
    } //end products()
 
 } // End of SumAndProduct class.