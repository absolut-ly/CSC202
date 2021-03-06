package Unit07.Apply;

/*
geraldsLandscaping.java
This app opens 2 local files, both containing formatted lists, with the intent to merge the two lists.
The output is a sorted list containing all of the records from both original files.
Written by Sam Castle, CSC202
For Cengage/MindTap Unit07 Exercises 2
 */

import java.io.*;
import java.util.*;

public class geraldsLandscaping {
    public static void main(String[] args) throws Exception {
        BufferedReader gerOne = new BufferedReader(new FileReader("Unit07/Apply/GeraldinesLandscaping.txt"));
        BufferedReader gerTwo = new BufferedReader(new FileReader("Unit07/Apply/GeraldsLandscaping.txt"));
        ArrayList<String> allCust = new ArrayList<String>();
        String line;

        while ((line= gerOne.readLine())!=null){
            allCust.add(line);
        }
        gerOne.close();

        while ((line = gerTwo.readLine())!=null){
            allCust.add(line);
        }
        gerTwo.close();

        Collections.sort(allCust);

        for (String s : allCust) {
            System.out.println(s);
        }
        System.exit(0);
    }
}