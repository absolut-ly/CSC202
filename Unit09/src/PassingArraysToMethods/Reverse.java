package PassingArraysToMethods;

// Reverse.java - This program reverses numbers stored in an array.
// Input:  Interactive.
// Output:  Original contents of array and the reversed contents of the array.

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int numbers[] = {9, 8, 7, 6, 5};
        int x;

        // Print contents of array
        System.out.println("Original contents of array: ");
        for (int i : numbers) {
            System.out.println(i);
        }

        // Call reverseArray method here
        numbers = reverseArray(numbers);

        // Print contents of reversed array
        System.out.println("Reversed contents of array: ");
        for (int i : numbers) {
            System.out.println(i);
        }

        System.exit(0);
    } // End of main() method.

    // Write reverseArray method here.
    public static int[] reverseArray(int[] num) {
        int numLen = num.length;
        int tempNum[] = new int[numLen];
        for (int i = 0; i < numLen; i++){
            tempNum[(numLen-1) - i] = num[i];
        }
        return tempNum;
    }

} // End of Reverse class.