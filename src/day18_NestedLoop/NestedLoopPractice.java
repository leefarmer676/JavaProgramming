package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (!(age <= 120 && age >= 0)) {
                System.err.println("invalid entry, re-enter");
                age = scan.nextInt();
            }

            System.out.println("Wpould you like to continue?");
            String a = scan.next().toLowerCase();

            while(!(a.equals("no")||a.equals("yes"))){
                System.err.println("Invalid answer, please re-enter");
                a=scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }
        }
        scan.close();
    }
}
