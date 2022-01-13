package Day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your gender");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong();

        scan.nextLine();

        System.out.println("Enter your zip code");
        int zip = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name:");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String state = scan.next();

        scan.nextLine();

        System.out.println("Enter your building number");
        int building = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name");
        String streetName = scan.nextLine();

        scan.close();

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phoneNumber);
        System.out.println(building + " " + streetName);
        System.out.println(cityName + ", " + state + " " + zip );

    }
}
