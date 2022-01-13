package Day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();


        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = "" + f + l; //to convert to String, just add an empty quotes at beginning
        //i didn't use this one - i put it all in the print statement

        scan.close();

        System.out.println(f + ". " + l + ".");
    }
}
