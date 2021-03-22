package OpeningFilesAndPerformingFileInput;

// Flowers.java - This program reads names of flowers and whether they are grown in shade or sun from an input 
// file and prints the information to the user's screen. 
// Input:  flowers.dat.
// Output: Names of flowers and the words sun or shade.

import java.io.*;  // Import class for file input.

public class Flowers {
   public static void main(String args[]) throws Exception {

      BufferedReader buffFlowers = new BufferedReader(new FileReader("flowers.dat"));
      String flowerName, sunOrShade;
      while ((flowerName = buffFlowers.readLine())!=null) {
          sunOrShade = buffFlowers.readLine();
          System.out.println(flowerName + " is grown in the " + sunOrShade);
      }
      buffFlowers.close();    
      System.exit(0);
   } // End of main() method.
} // End of Flowers class. 