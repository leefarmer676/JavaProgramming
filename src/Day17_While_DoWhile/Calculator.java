package Day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char ch = scan.next().charAt(0); //if they enter not + or -, say re-enter operator

        while(!(ch == '+' || ch =='-')){
            System.out.println("INvalid operator; please re-enter");
            ch=scan.next().charAt(0);
        }
        System.out.println((ch=='+')? num1 + num2 : num1 - num2);

    }
}
