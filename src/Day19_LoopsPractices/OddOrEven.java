package Day19_LoopsPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number:");
            int num1 = scan.nextInt();

            if (num1 % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("odd number");
            }
            System.out.println("Would you like to enter another number?");
            String a = scan.next();

            if(!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry");
                System.exit(0);
            }
            if(a.equalsIgnoreCase("no")){
                System.out.println("Thank you for using calculator");
            break;
        }
        }

    }
}
