package Unit07.Apply;

/*
larPark.java.java
This app opens 2 local files, both containing formatted lists, with the intent to merge the two lists, 
sort them, and return the list while truncating the exact contents to limit the number of times 
the identifying information is presented for each "student".
Input requires two csv-formatted files in directory: LPDSummer.txt and LPDWinter.txt.
Written by Sam Castle, CSC202
For Cengage/MindTap Unit07 Exercises 3
*/

import java.util.*;
import java.io.*;

public class larPark {
    private int idNum;
    private String firstName;
    private String lastName;
    private int age;
    private String course1;
    private String course2;
    private String course3;
    private String course4;
    private String course5;

    public static void main(String[] args) {

    } //end main

    //default constructor for student
    public larPark(int idNum, String firstName, String lastName, int age, String course1) {
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course1 = course1;
    } //end student constructor

    //setters for additional courses
    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    public void setCourse3(String course3) {
        this.course3 = course3;
    }

    public void setCourse4(String course4) {
        this.course4 = course4;
    }

    public void setCourse5(String course5) {
        this.course5 = course5;
    }

    //getters
    public int getIdNum() {
        return idNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCourse1() {
        return course1;
    }

    public String getCourse2() {
        return course2;
    }

    public String getCourse3() {
        return course3;
    }

    public String getCourse4() {
        return course4;
    }

    public String getCourse5() {
        return course5;
    }
} //end class larPark
