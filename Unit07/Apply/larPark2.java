package Apply;

/*
larPark.java.java
This app opens 2 local files, both containing formatted lists, with the intent to merge the two lists,
sort them, and return the list of students with total number of classes taken.
Input requires two csv-formatted files in directory: LPDSummer.txt and LPDWinter.txt.
Written by Sam Castle, CSC202
For Cengage/MindTap Unit07 Exercises 3
*/

import java.util.*;
import java.io.*;

public class larPark2 {
    public static void main(String[] args) throws Exception {
        BufferedReader summer = new BufferedReader(new FileReader("Unit07/Apply/LPDSummer.txt"));
        BufferedReader winter = new BufferedReader(new FileReader("Unit07/Apply/LPDWinter.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;

        while ((line=summer.readLine())!=null) {
            list.add(line);
        }
        while ((line=winter.readLine())!=null) {
            list.add(line);
        }
        summer.close();
        winter.close();

        Collections.sort(list);

        int idCheck = 0;
        int courses = 1;
        for (String s: list) {
            StringBuilder student;
            String[] parse = s.split(",");
            if (parse[0].equals(idCheck)) {
                courses++;
            }
            else {
                System.out.println(parse[0] + parse[1] + parse[2] + parse[3] + "# of courses: " + courses);
            }
        }

        System.exit(0);
    } //end main

} //end class larPark
