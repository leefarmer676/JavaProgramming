package Day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();

        if(age<0){
            //in order to create object from exception class, use new keyword
            throw new InputMismatchException("Age cannot be negative: " + age);//much more understandable
            //better to manually throw an exception instead of calling exit method yourself
            //System.err.println("Invalid age: " + age);
            //System.exit(1);
        }

        if(age > 21){
            System.out.println("You are eligible");
        }else{
            throw new RuntimeException("You must be at least 21 years old");
        }
    }
}
