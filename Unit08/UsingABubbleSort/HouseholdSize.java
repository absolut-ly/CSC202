package UsingABubbleSort;

// HouseholdSize.java - This program uses a bubble sort to arrange up to 300 household sizes in
// descending order and then prints the mean and median household size.
// Input:  Interactive.
// Output:  Mean and median household size.

import java.util.Scanner;

public class HouseholdSize {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Declare variables.
        final int SIZE = 300;			// Maximum number of household sizes.
        int householdSizes[] = new int[SIZE];   // Array used to store up to 300 household sizes.
        int x;
        int limit = SIZE;
        int householdSize = 0;
        String householdSizeString;
        int pairsToCompare;
        boolean switchOccurred;
        int temp;
        double sum = 0;
        double mean = 0;
        double median = 0;

        // Input household size
        System.out.println("Enter household size or 999 to quit: ");
        householdSizeString  = s.nextLine();
        householdSize = Integer.parseInt(householdSizeString);
        sum += householdSize;
        pairsToCompare = 1;
        // This is the work done in the fillArray() method
        x = 0;
        while(x < limit && householdSize != 999) {
            // Place value in array.
            householdSizes[x] = householdSize;

            x++;    // Get ready for next input item.
            System.out.println("Enter household size or 999 to quit: ");
            householdSizeString  = s.nextLine();
            householdSize = Integer.parseInt(householdSizeString);
            if (householdSize < 999){
                sum += householdSize;
                pairsToCompare++;
            }
        }  // End of input loop.
        s.close();

        // Find the mean
        mean = sum/pairsToCompare;

        // This is the work done in the sortArray() method
        for (x = 0; x < pairsToCompare; x++) {
            for (int i =1; i < (pairsToCompare-x); i++) {
                if (householdSizes[i-1] > householdSizes[i]) {
                    temp = householdSizes[i-1];
                    householdSizes[i-1] = householdSizes[i];
                    householdSizes[i] = temp;
                }
            }
        }

        // This is the work done in the displayArray() method
        // Print the mean
        System.out.println("Mean: " + mean);

        // Calculate the median
        if ((pairsToCompare%2) == 1) {
            median = householdSizes[((pairsToCompare +1) / 2)];
        }
        else {
            median = householdSizes[(pairsToCompare / 2)];
        }

        // Print the median
        System.out.println("Median: " + median);
        System.exit(0);
    } // End of main() method.
} // End of HouseholdSize class.