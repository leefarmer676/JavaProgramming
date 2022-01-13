package Day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        ///123Enter
        System.out.println("Enter your full name: ");
        Scanner scan = new Scanner(System.in);

        String fullName = scan.nextLine();

        System.out.println("enter your programming language: ");
        String programmingLanguage = scan.nextLine(); //stops reading it once you press enter

        System.out.println("Enter your age: ");
        int age = scan.nextInt(); //24Enter - will not be able to read Enter
        //take the Enter key outof the scanner and I will be able to put in school name
        //nextLine is the only one that can take the Enter key out

        scan.nextLine(); //by default takes the enter key out of the scanner, so now we can enter school
        //this captures the Enter key, so now scanner is empty

        System.out.println("Enter your school name: ");//scanner is not empty, bc enter key is in there so I can't add any new data
        String school = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("school = " + school);
        scan.close();

    }
}
