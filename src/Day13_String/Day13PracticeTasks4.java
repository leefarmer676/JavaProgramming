package Day13_String;

import java.util.Scanner;

public class Day13PracticeTasks4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        scan.close();

        char initial = firstName.toUpperCase().charAt(0);
        char initial2 = lastName.toUpperCase().charAt(0);

        System.out.println(initial + " " + initial2);

    }
}
