package Day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine(); //JavaProgrammingEnter

        System.out.println("Enter your building number: ");
        String building = scan.next();

        scan.nextLine();

        System.out.println("Enter your Street name: ");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name: ");
        String city = scan.nextLine();

        System.out.println("Enter your state: ");
        String state = scan.nextLine();

        System.out.println("Enter your zip code: ");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println(fullName);
        System.out.println(building + streetName);
        System.out.println(city + state + zipCode);



    }
}
/*
1. Full name
2. Bldg number
3. Street name
4. city name
5. state
6. zip code
 */