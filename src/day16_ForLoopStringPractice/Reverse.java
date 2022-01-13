package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //index:      0123456789... find last index number = str.charAt(str.length()-1)
        String result = ""; //will contain the reversed version of the String
        //noopS nedooW

        for (int i = str.length()-1; i >=0 ; i--) {//i: index numbers of str (starting last index to index 0)
            result += str.charAt(i);

        }
        System.out.println(result);
        /*
        result += str.charAt(str.length()-1); //n = index 11
            //+= will add it back to the String
        result += str.charAt(10);
        //and so on until you have all in backwards order

         */
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

    }
}
