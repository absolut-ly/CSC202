package OverloadingMethodsInJava;

// Cornwall.java - This program computes hotel guest rates.
// Input:  Days in stay and meals included
// Output:  Hotel guest rate
import java.util.Scanner;

public class Cornwall {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int days;
        String mealPlan;
        String question;
        double rate = 0.00;

        System.out.println("How many days do you plan to stay? ");
        days = Integer.parseInt(s.nextLine());
        System.out.println(" Do you want a meal plan? Y or N: ");
        question  = s.nextLine().toUpperCase();
        // Figure out which arguments to pass to the computeRate() method and
        // then call the computeRate() method
        if (question.equals("Y")) {
            System.out.println("Enter A for 3 meals, C for breakfast only: ");
            mealPlan = s.nextLine().toUpperCase();
            rate = computeRate(days, mealPlan);
        }
        else {
            rate = computeRate(days);
        }

        System.out.println("The rate for your stay is: " + rate);
        System.exit(0);
    } // End of main() method.

    // Write computeRate methods here.
    public static double computeRate(int days) {
        System.out.println("Days only");
        double sum = days * (99.99);
        return sum;
    } //end computeRate days only

    public static double computeRate(int days, String meals) {
        double sum = 0;
        if (meals.equals("A")) {
            sum = days * (169);
        }
        else {
            sum = days * (112);
        }
        return sum;
    } //end computeRate with meals
} // End of Cornwall class.