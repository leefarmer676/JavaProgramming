package Day13_String;

import java.util.Scanner;

public class Day13PracticeTasks2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = "";

        System.out.println("Enter first sentence: ");
        String a = scan.nextLine();

        System.out.println("Enter second sentence: ");
        String b = scan.nextLine();

        scan.close();

        if(a.length()>b.length()){
            System.out.println(a);
        }else if(a.length()<b.length()){
            System.out.println(b);
        }else{
            System.out.println("Both are same length");
        }

    }
}
