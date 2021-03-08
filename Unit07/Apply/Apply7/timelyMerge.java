package Apply.Apply7;

import java.io.*;
import java.util.*;

public class timelyMerge {
    public static void main(String[] args) throws Exception {
        BufferedReader master = new BufferedReader(new FileReader("Unit07/Apply/Apply7/timelyMaster.txt"));
        ArrayList<Integer> empID = new ArrayList<>();
        ArrayList<Double> payRate = new ArrayList<>();
        ArrayList<Integer> weeklyJobs = new ArrayList<>();
        ArrayList<Integer> weeklyHours = new ArrayList<>();
        ArrayList<Double> weeklyPay = new ArrayList<>();

        String line;
        while ((line=master.readLine())!=null) {
            String[] mP = line.split(", ");
            empID.add(Integer.parseInt(mP[0]));
            payRate.add(Double.parseDouble(mP[4]));
            weeklyJobs.add(0);
            weeklyHours.add(0);
            weeklyPay.add(0.0);
        }

        /*         UNCOMMENT EACH LINE TO VIEW ASSIGNMENT-SPECIFIC OUTPUTS
        ALTHOUGH YOU CAN RUN IT WITH ALL 4 OPEN AND NOT INCUR A HUGE HEAP (~15MB) */

        //open once-per-week file
//        outputA(empID, payRate);
//        outputB(empID, payRate);

        //open multi-per-week file
//        outputC(empID, payRate);
//        outputD(empID, payRate, weeklyJobs, weeklyHours, weeklyPay);

        System.exit(0);

    }//end main

    public static void outputA(ArrayList<Integer> empID, ArrayList<Double> rate) throws Exception {
        BufferedReader tOnce = new BufferedReader(new FileReader("Unit07/Apply/Apply7/timelyOnce.txt"));
        List<String> toPrint = new ArrayList<>();
        List<Integer> workers = new ArrayList<>(); //if an empID was present this week

        System.out.printf("%28s %n", "~Output version A~");
        System.out.printf("%7s %7s %7s %8s %8s %n", "EMPID", "JOBID", "HOURS", "RATE", "GROSS");
        String line;
        while ((line=tOnce.readLine())!=null) {
            String[] tP = line.split(", ");
            int tempJobID = Integer.parseInt(tP[0]);
            int tempEmpID = Integer.parseInt(tP[3]);
            int tempHours = Integer.parseInt(tP[4]);
            workers.add(tempEmpID);

            //add the transaction information to overall print cue
            int index = 0;
            if (empID.contains(tempEmpID)) {
                index = empID.indexOf(tempEmpID);
                double grossPay = (tempHours * rate.get(index));
                String combo = String.format("%7d %7s %7s %8.2f %8.2f", empID.get(index), tempJobID, tempHours,
                        rate.get(index), grossPay);
                toPrint.add(combo);
            }
        }

        //add the nonworkers to the print cue
        for (int i = 0; i < empID.size(); i++) {
            if (!workers.contains(empID.get(i))) {
                int index = empID.indexOf(i);
                String nonWorkers = String.format("%7d %7d %7d %8.2f %8d", empID.get(i), 0, 0, rate.get(i), 0);
                toPrint.add(nonWorkers);
            }
        }

        Collections.sort(toPrint);
        for (String s : toPrint) {
            System.out.println(s);
        }
        tOnce.close();
    }//end A

    public static void outputB(ArrayList<Integer> empID, ArrayList<Double> rate) throws Exception {
        BufferedReader tOnce = new BufferedReader(new FileReader("Unit07/Apply/Apply7/timelyOnce.txt"));
        List<String> toPrint = new ArrayList<>();

        System.out.println();
        System.out.printf("%28s %n", "~Output version B~");
        System.out.printf("%7s %7s %7s %8s %8s %n", "EMPID", "JOBID", "HOURS", "RATE", "GROSS");
        String line;
        while ((line=tOnce.readLine())!=null) {
            String[] tP = line.split(", ");
            int tempJobID = Integer.parseInt(tP[0]);
            int tempEmpID = Integer.parseInt(tP[3]);
            int tempHours = Integer.parseInt(tP[4]);

            //add the transaction information to overall print cue
            int index = empID.indexOf(tempEmpID);
            double grossPay = (tempHours * rate.get(index));
            String combo = String.format("%7d %7s %7s %8.2f %8.2f", empID.get(index), tempJobID, tempHours,
                    rate.get(index), grossPay);
            toPrint.add(combo);
        }

        for (String s : toPrint) {
            System.out.println(s);
        }
        tOnce.close();
    }//end B

    public static void outputC(ArrayList<Integer> empID, ArrayList<Double> rate) throws Exception {
        BufferedReader tMulti = new BufferedReader(new FileReader("Unit07/Apply/Apply7/timelyMulti.txt"));
        List<String> toPrint = new ArrayList<>();

        System.out.println();
        System.out.printf("%28s %n", "~Output version C~");
        System.out.printf("%7s %7s %7s %8s %8s %n", "EMPID", "JOBID", "HOURS", "RATE", "GROSS");
        String line;
        while ((line=tMulti.readLine())!=null) {
            String[] tP = line.split(", ");
            int tempJobID = Integer.parseInt(tP[0]);
            int tempEmpID = Integer.parseInt(tP[3]);
            int tempHours = Integer.parseInt(tP[4]);

            //add the transaction information to overall print cue
            int index = empID.indexOf(tempEmpID);
            double grossPay = (tempHours * rate.get(index));
            String combo = String.format("%7d %7s %7s %8.2f %8.2f", empID.get(index), tempJobID, tempHours,
                    rate.get(index), grossPay);
            toPrint.add(combo);
        }

        for (String s : toPrint) {
            System.out.println(s);
        }
        tMulti.close();
    }//end C

    public static void outputD(ArrayList<Integer> empID, ArrayList<Double> rate,
                               ArrayList<Integer> weeklyJobs, ArrayList<Integer> weeklyHours,
                               ArrayList<Double> weeklyPay) throws Exception {
        BufferedReader tMulti = new BufferedReader(new FileReader("Unit07/Apply/Apply7/timelyMulti.txt"));
        List<Integer> empThisWeek = new ArrayList<>();

        System.out.println();
        System.out.printf("%28s %n", "~Output version D~");
        System.out.println("  Weekly Payroll for Employees of");
        System.out.println(" Timely Talent Temporary Help Agency");
        System.out.printf("%7s %7s %7s %8s %8s %n", "EMPID", "JOBS", "HOURS", "RATE", "GROSS");

        String line;
        int totalJobs = 0;
        int totalHours = 0;
        double grossPay;
        int index;

        while ((line=tMulti.readLine())!=null) {
            String[] tP = line.split(", ");
            int tempEmpID = Integer.parseInt(tP[3]);
            int tempHours = Integer.parseInt(tP[4]);
            index = empID.indexOf(tempEmpID);

            if (empThisWeek.contains(tempEmpID)) {
                totalJobs++;
                totalHours = tempHours + weeklyHours.get(index);
                grossPay = (tempHours * rate.get(index) + weeklyPay.get(index));
                weeklyJobs.set(index, totalJobs);
                weeklyHours.set(index, totalHours);
                weeklyPay.set(index, grossPay);
            }
            else {
                empThisWeek.add(tempEmpID);
                totalJobs = 1;
                totalHours = 0;
                grossPay = 0;
                weeklyJobs.set(index, totalJobs);
                weeklyHours.set(index, tempHours);
                weeklyPay.set(index, (tempHours * rate.get(index)));
            }
        }
        for (Integer i : empThisWeek) {
            index = empID.indexOf(i);
            String combo = String.format("%7d %7s %7s %8.2f %8.2f", empID.get(index), weeklyJobs.get(index),
                    weeklyHours.get(index), rate.get(index), weeklyPay.get(index));
            System.out.println(combo);
        }
        tMulti.close();

    }//end D
}//end class
