package day16_ForLoopStringPractice;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "AABBAACC";
        String result = ""; //output: ABC

        for (int i = 0; i <= str.length()-1 ; i++) {
            String ch = "" + str.charAt(i); //represents each character of str

            if (!result.contains(ch)) { //if char is not contained in the result
                result += ch; //this adds each character to the result if not contained
            }

            }
        System.out.println(result);

    }
}
