package Apply.Apply5;

import java.io.*;
import java.util.*;

public class gimmeMerge {
    public static void main(String[] args) throws Exception {
        BufferedReader cPast = new BufferedReader(new FileReader("Unit07/Apply/gimmePast.txt"));
        BufferedReader cProp = new BufferedReader(new FileReader("Unit07/Apply/gimmeProposals.txt"));
        ArrayList<Integer> custNum = new ArrayList<>();
        ArrayList<String> custName = new ArrayList<>();
        ArrayList<String> custWork = new ArrayList<>();

        //read from old list and form basis of collections
        String line;
        while ((line = cPast.readLine()) != null) {
            String[] pastP = line.split(", ");
            int tempNum = Integer.parseInt(pastP[0]);
            String tempName = pastP[1] + ", " + pastP[2];
            String tempWork = pastP[3] + ", " + pastP[4];
            custNum.add(tempNum);
            custName.add(tempName);
            custWork.add(tempWork);
        }
        cPast.close();

        //read from new list
        while ((line = cProp.readLine()) != null) {
            String[] propP = line.split(", ");
            int tempNum = Integer.parseInt(propP[0]);
            String tempName = propP[1] + ", " + propP[2];
            String tempWork = propP[3] + ", " + propP[4];

            //If cust exists, update work to proposal else add new
            if (custNum.contains(tempNum)) {
                int index = custNum.indexOf(tempNum);
                custWork.set(index, tempWork);
            }
            else {
                custNum.add(tempNum);
                custName.add(tempName);
                custWork.add(tempWork);
            }
        }
        cProp.close();

        //make master list to sort
        ArrayList<String> comboList = new ArrayList<>();
        for (int i = 0; i < custNum.size(); i++) {
            comboList.add(custNum.get(i) + ", " + custName.get(i) + ", " + custWork.get(i));
        }
        Collections.sort(comboList);

        //print list
        for (int i = 0; i < comboList.size(); i++) {
            System.out.println(comboList.get(i));
        }

        System.exit(0);
    }//end main
}//end class