package Day15_Loop;

import java.util.Locale;
import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        System.out.println("Enter your full name:");
        new Scanner(System.in).next();

        String firstName = "cyDEo";
        String lastName = "SCHOOL";

        //method to convert the char to string first:
        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
        //priortized by putting it in parentheses, so that it will convert it first and then let us
        //use .toUpperCase

        //firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();


        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("lastName = " + lastName);

        System.out.println("firstName = " + firstName);

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
    }
}
/*
input: firstName = "cyDEo"
lastName = "SCHOOL"
 */