package OverloadingMethodsInJava;

// Cornwall.java - This program computes hotel guest rates.
// Input:  Days in stay and meals included
// Output:  Hotel guest rate
import java.util.Scanner;

public class Cornwall{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int days;
        String dayString;
        String mealPlan;
        String question;
        double rate = 0.00;

        System.out.println("How many days do you plan to stay? ");

        dayString  = s.nextLine();
        days = Integer.parseInt(dayString);
        System.out.println(" Do you want a meal plan? Y or N: ");
        question  = s.nextLine();
        // Figure out which arguments to pass to the computeRate() method and
        // then call the computeRate() method

        System.out.println("The rate for your stay is: " + rate);
        System.exit(0);

    } // End of main() method.


    // Write computeRate methods here.

} // End of Cornwall class.