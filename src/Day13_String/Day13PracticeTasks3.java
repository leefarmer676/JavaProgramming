package Day13_String;

import java.util.Scanner;

public class Day13PracticeTasks3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1 = scan.next();

        scan.close();

        if(s1.charAt(0)==s1.charAt(s1.length()-1)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }

    }
}
