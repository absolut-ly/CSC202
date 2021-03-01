/*
pendantPublishing.java
This app opens a local file, reads each line for three variables: author, title of work, and number of volumes.
The output is a list, each line is worth one volume in the series of works.
Written by Sam Castle, CSC202
For Cengage/MindTap Unit07 Exercises 1
 */

import java.io.*;
import java.util.ArrayList;

public class pendantPublishing {
    public static void main(String[] args) throws Exception {
        //requires that file PendantPublishing.txt be at explicit location in leu of user input
        BufferedReader buff = new BufferedReader(new FileReader("Unit07/Apply/PendantPublishing.txt"));
        ArrayList<String> author = new ArrayList<String>();
        ArrayList<String> title = new ArrayList<String>();
        ArrayList<Integer> volume = new ArrayList<Integer>();
        String line;

        while ((line=buff.readLine())!=null) {
            String[] strArray = line.split(","); //split the line by comma delimiter
            int volNum = Integer.parseInt(strArray[2].trim()); //get volume integer alone
            author.add(strArray[0]);
            title.add(strArray[1]);
            volume.add(volNum);
        }

        for (int i = 0; i < author.size(); i++) { //walk through by author
            for (int j = 1; j <= volume.get(i); j++) { //count for each volume
                System.out.println(author.get(i) + "," + title.get(i) + ", Volume " + j + " of " + volume.get(i));
            }
        }

        buff.close();
        System.exit(0);
    }
}
