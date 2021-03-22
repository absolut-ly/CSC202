package Apply.Apply4;

import java.io.*;
import java.util.*;

public class apgarMerge {
    public static void main(String[] args) throws Exception {
        BufferedReader best = new BufferedReader(new FileReader("Unit07/Apply/ApgarBest.txt"));
        BufferedReader cushing = new BufferedReader(new FileReader("Unit07/Apply/ApgarCushing.txt"));
        ArrayList<String> list = new ArrayList<>();

        //read from files into list
        String line;
        while ((line=best.readLine())!=null) {
            list.add(line);
        }
        while ((line=cushing.readLine())!=null) {
            list.add(line);
        }
        best.close();
        cushing.close();

        //rearrange list by year to sort
        ArrayList<String> cSorted = new ArrayList<>();
        for (String s: list) {
            String[] p1 = s.split(", ");
            String cYearFirst = p1[2] + ", " + p1[0] + ", " + p1[1];
            cSorted.add(cYearFirst);
        }
        Collections.sort(cSorted);

        //rearrange list to match original format, add years to list for counting
        ArrayList<Integer> years = new ArrayList<>();
        for (String s: cSorted) {
            String[] p2 = s.split(", ");
            String cByYear = p2[1] + ", " + p2[2] + ", " + p2[0];
            years.add(Integer.parseInt(p2[0]));
            System.out.println(cByYear);
        }

        //count patients per year
        int count = 1;
        int prevYear = 0;
        for (int i = 0; i < years.size(); i++) {
            if (years.get(i) != prevYear) {
                int year = years.get(i);
                int quantity = Collections.frequency(years, year);
                System.out.println(quantity + " patients born in " + year);
                prevYear = years.get(i);
            }
        }

        System.exit(0);
    }//end main
}//end class
