package Day13_String;

import java.util.Scanner;

public class PracticeTasksForUnitTwoTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*String sentence = scan.nextLine();

        if(sentence.isEmpty()){
            System.out.println("String is empty");
        }else if(sentence.length()>3){
            System.out.println(sentence.substring(sentence.length()-3));
        }else{System.out.println(sentence);
            }

         */

        System.out.println("----------------------");
       /* System.out.println("Enter two words:");
        String word1 = scan.next();
        String word2 = scan.next();


        word1 = word1.replace("" + word1.charAt(0), "");
        word2 = word2.replace("" + word2.charAt(0), "");

        System.out.println(word1 + word2);

        */

        System.out.println("------------------------");

        String digits = "A1B2C3";
        int sum = 0;

        for (int i = 0; i < digits.length(); i++) {
            int ch = digits.charAt(i);

            if (ch >= '0' && ch <= '9') {
                sum += ch-'0';
            }


        }
        System.out.println(sum);
    }

        }


