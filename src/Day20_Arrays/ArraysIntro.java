package Day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        //create a variable that's capable enough to contain 5 names
        String[] myGroup = new String[5];
        myGroup[0] = "Guyra";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup [3] = "Hulya";
        myGroup [4] = "Mikael";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday", "Sunday"};
        //index             0           1           2           3           4           5           6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number <1 || number > 7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("-------------------------");

        String[] month = {"jan", "feb", "march", "april", "may", "june"};

        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);

        }

        System.out.println("-----------------------------");

        for (int i = month.length-1; i >= 0; i--) {//represents index #s of array starting from last index
            System.out.println(month[i]);

        }
        /*
        System.out.println(month[0]); //jan
        System.out.println(month [1]); //feb
         */
    }

}
