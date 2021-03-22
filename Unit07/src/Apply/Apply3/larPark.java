package Apply.Apply3;

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

public class larPark {
    public static void main(String[] args) throws Exception {
        //open files
        BufferedReader summer = new BufferedReader(new FileReader("Unit07/Apply/LPDSummer.txt"));
        BufferedReader winter = new BufferedReader(new FileReader("Unit07/Apply/LPDWinter.txt"));
        ArrayList<String> list = new ArrayList<>();

        //read from files into list
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

        int arrayCount = 0;
        int courseCount = 1;
        int[] courses = new int[list.size()]; //parallel array to keep number of courses
        ArrayList<String> studentAL = new ArrayList<>(); //list for just student info

        for (String s: list) {
            String[] parse = s.split(",");
            String studentInfo = parse[0] + "," + parse[1] + parse[2] + ",";

            if (studentAL.isEmpty()) {
                studentAL.add(studentInfo); //for first add
            }
            else if (studentAL.contains(studentInfo)) {
                courseCount++; // if student is already added, increase courses count by one
            }
            else {
                courseCount = 1;
                studentAL.add(studentInfo); //add new student
                arrayCount++; //increment array element
            }
            courses[arrayCount] = courseCount; //update on each pass to ensure correct count throughout
        }

        //print all
        for (int i = 0; i < studentAL.size(); i++) {
            System.out.println(studentAL.get(i) + " Total number of course: " + courses[i]);
        }

        System.exit(0);
    } //end main
} //end class larPark
