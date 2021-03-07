package Apply.Apply6;

import java.io.*;
import java.util.*;

public class curlMerge {
    public static void main(String[] args) throws Exception {
        BufferedReader masterFile = new BufferedReader(new FileReader("Unit07/Apply/Apply6/curlMaster.txt"));
        BufferedReader transactFile = new BufferedReader(new FileReader("Unit07/Apply/Apply6/curlTransact.txt"));
        ArrayList<Integer> custID = new ArrayList<>();
        ArrayList<String> custName = new ArrayList<>();
        ArrayList<Double> balance = new ArrayList<>();
        List<String> errors = new ArrayList<>();
        double coupon = 1000.00;
        int numCoupons = 0;

        //open master file
        String line;
        while ((line = masterFile.readLine()) != null) {
            String[] mP = line.split(", ");
            custID.add(Integer.parseInt(mP[0]));
            custName.add(mP[1] + ", " + mP[2]);
            balance.add(Double.parseDouble(mP[3]));
        }

        //open transaction file
        while ((line = transactFile.readLine()) != null) {
            String[] tP = line.split(", ");
            int tempID = Integer.parseInt(tP[0]);
            String tempSale = tP[1];
            double tempPrice = Double.parseDouble(tP[2]);

            //if repeat customer
            if (custID.contains(tempID)) {
                int index = custID.indexOf(tempID);
                double tempOldBalance = balance.get(index);
                double tempNewBalance = (tempOldBalance + tempPrice);
                balance.set(index, tempNewBalance);

                //coupon check
                if (tempNewBalance > coupon) {
                    if ((tempNewBalance - tempPrice) < coupon) {
                        System.out.println("     Congratulations, " + custName.get(index) + "!");
                        System.out.println("     You have earned a coupon for a free haircut!");
                        numCoupons++;
                    }
                }
            }
            else {
                String error = tP[0] + ", " + tP[1] + ", " + tP[2];
                errors.add(error);
            }
        }//end read transaction file

        //print out updated master list
        System.out.println("     ~Master Balance List, " + new java.util.Date() +  " ~");
        for (int i = 0; i < custID.size(); i++) {
            System.out.println(custID.get(i) + ", " + custName.get(i) + ", " + balance.get(i));
        }
        if (numCoupons == 0) {
            System.out.println("     No coupons were issued today");
        }

        //conditions for errors
        if (errors.isEmpty()) {
            System.out.println();
            System.out.println("There were no erroneous transactions today");
        }
        else {
            System.out.println();
            System.out.println("The following transactions do not have a related client account: ");
            for (String s: errors) {
                System.out.println(s);
            }
        }

        System.exit(0);
    }//end main
}//end class
