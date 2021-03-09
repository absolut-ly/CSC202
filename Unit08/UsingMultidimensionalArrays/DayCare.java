package UsingMultidimensionalArrays;

import java.util.Scanner;

public class DayCare {
    public static void main(String args[]) {
        // Declare two-dimensional array here.
        double[][] array = {    {30, 60, 88, 115, 140},
                                {26, 52, 70, 96, 120},
                                {24, 46, 67, 89, 110},
                                {22, 40, 60, 75, 88},
                                {20, 35, 50, 66, 84} };

        // Declare other variables.
        int numDays;
        int age;
        String numDaysString;
        String ageString;
        int QUIT = 99;
        Scanner input = new Scanner(System.in);

        // This is the work done in the getReady() method
        // Perform a priming read to get the age of the child.
        System.out.println("Enter age or 99 to quit: ");
        ageString = input.nextLine();
        age = Integer.parseInt(ageString);


        while (age != QUIT) {
            // This is the work done in the determineRateCharge() method
            // Ask the user to enter the number of days
            System.out.println("Enter number of days: ");
            numDaysString = input.nextLine();
            numDays = Integer.parseInt(numDaysString);

            // Print the weekly rate
            System.out.println(array[age][numDays-1]);

            // Ask the user to enter the next child's age
            System.out.println("Enter next age or 99 to quit: ");
            ageString = input.nextLine();
            age = Integer.parseInt(ageString);
        }
        // This is the work done in the finish() method
        System.out.println("End of program");
        input.close();
        System.exit(0);
    } // End of main() method.
} // End of DayCare class.