package Day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt(); //valid age between 1~120

        while(age<0 || age>120){ //or !(age >=1 && age <= 120)
            System.err.println("Invalid entry; please re-enter age");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");
        String citizen = scan.next().toLowerCase();

        while( !(citizen.equals("yes") || citizen.equals("no"))){ //while loop is a repeated if statement
            System.err.println("Invalid entry please re-enter");
            System.err.println("are you a US citizen? yes/no");
            citizen = scan.next().toLowerCase();

        }
        if(age >= 18 && citizen.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
